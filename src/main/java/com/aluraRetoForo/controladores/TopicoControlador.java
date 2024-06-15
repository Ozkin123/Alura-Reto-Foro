package com.aluraRetoForo.controladores;


import com.aluraRetoForo.entidades.TopicoEntidad;
import com.aluraRetoForo.repositorios.TopicoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/topicos")
public class TopicoControlador {

    @Autowired
    private TopicoRepositorio topicoRepositorio;


    @GetMapping("/hola")
        public String holaMundo(){
            return "Hola MUndo";
    }



    @PostMapping
    public void subirTopico(@RequestBody TopicoEntidad entidad){
        topicoRepositorio.save(entidad);
    }


}