package com.aluraRetoForo.controladores;


import com.aluraRetoForo.dto.peticiones.TopicoPeticion;
import com.aluraRetoForo.entidades.TopicoEntidad;
import com.aluraRetoForo.mapper.MapperPeticionesRespuesta;
import com.aluraRetoForo.repositorios.TopicoRepositorio;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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



    @PostMapping
    public void subirTopico(@RequestBody @Valid TopicoPeticion topicoPeticion){
        TopicoEntidad entidad = MapperPeticionesRespuesta.peticionAEntidad(topicoPeticion);
        topicoRepositorio.save(entidad);
    }




}
