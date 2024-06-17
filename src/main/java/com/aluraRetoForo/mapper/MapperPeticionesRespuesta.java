package com.aluraRetoForo.mapper;

import com.aluraRetoForo.dto.peticiones.TopicoPeticion;
import com.aluraRetoForo.dto.respuesta.TopicoRespuesta;
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

    public static TopicoRespuesta entidadARespuesta(TopicoEntidad entidad){
        TopicoRespuesta respuesta = new TopicoRespuesta(
                entidad.getTitulo(), entidad.getMensaje(), entidad.getFechaCreacion(), entidad.isStatus(),entidad.getCurso()
        );
        return respuesta;
    }


}
