package com.aluraRetoForo.controladores;


import com.aluraRetoForo.dto.peticiones.TopicoModificaion;
import com.aluraRetoForo.dto.peticiones.TopicoPeticion;
import com.aluraRetoForo.dto.respuesta.TopicoRespuesta;
import com.aluraRetoForo.entidades.TopicoEntidad;
import com.aluraRetoForo.mapper.MapperPeticionesRespuesta;
import com.aluraRetoForo.repositorios.TopicoRepositorio;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping("/topicos")
public class TopicoControlador {

    @Autowired
    private TopicoRepositorio topicoRepositorio;


    @GetMapping("/hola")
        public String holaMundo(){
            return "Hola MUndo";
    }

    @GetMapping
    public List<TopicoEntidad> listarTopicos(){
       return topicoRepositorio.findAll();
    }

    @GetMapping("/{id}")
    public TopicoRespuesta obtenerPorId(@PathVariable long id){
        TopicoEntidad entidad = topicoRepositorio.getReferenceById(id);
        TopicoRespuesta respuesta = MapperPeticionesRespuesta.entidadARespuesta(entidad);
        return respuesta;
    }

    @PostMapping
    public void subirTopico(@RequestBody @Valid TopicoPeticion topicoPeticion){
        TopicoEntidad entidad = MapperPeticionesRespuesta.peticionAEntidad(topicoPeticion);
        topicoRepositorio.save(entidad);
    }

    @PutMapping("/{id}")
    public void actualizarTopico(@PathVariable long id, @RequestBody TopicoModificaion modificacion){
        Optional<TopicoEntidad> entidadOptional = Optional.of(topicoRepositorio.getReferenceById(id));
        if(entidadOptional.isPresent()){
            entidadOptional.get().setTitulo(modificacion.titulo());
            entidadOptional.get().setMensaje(modificacion.mensaje());
            TopicoEntidad entidad = entidadOptional.get();
            topicoRepositorio.save(entidad);
        }

    }

    @DeleteMapping("/{id}")
    public void borrarTopico(@PathVariable long id){
        topicoRepositorio.deleteById(id);
    }




}
