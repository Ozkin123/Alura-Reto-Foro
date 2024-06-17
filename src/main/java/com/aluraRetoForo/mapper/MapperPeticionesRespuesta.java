package com.aluraRetoForo.mapper;

import com.aluraRetoForo.dto.peticiones.TopicoPeticion;
import com.aluraRetoForo.entidades.TopicoEntidad;

import java.time.LocalDate;

public class MapperPeticionesRespuesta {

    public static TopicoEntidad peticionAEntidad (TopicoPeticion peticion){
        TopicoEntidad entidad = new TopicoEntidad();
        entidad.setTitulo(peticion.titulo());
        entidad.setMensaje(peticion.mensaje());
        entidad.setFechaCreacion(LocalDate.now());
        entidad.setStatus(true);
        //entidad.setAutor(peticion.autor());
        entidad.setCurso(peticion.curso());
        return entidad;
    }


}
