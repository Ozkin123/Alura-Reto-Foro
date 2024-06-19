package com.aluraRetoForo.controladores;


import com.aluraRetoForo.dto.Autenticacion.DatosAutenticacionUsuario;
import com.aluraRetoForo.entidades.UsuarioEntidad;
import com.aluraRetoForo.infra.seguridad.DatoJWT;
import com.aluraRetoForo.infra.seguridad.ServicioToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AutenticacionController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private ServicioToken servicioToken;



    @PostMapping
    ResponseEntity autenticarUsuario(@RequestBody DatosAutenticacionUsuario datosAutenticacionUsuario){
        Authentication authToken = new UsernamePasswordAuthenticationToken(
                datosAutenticacionUsuario.nombre(),datosAutenticacionUsuario.clave());
        var usuarioAutenticado= authenticationManager.authenticate(authToken);
        var JWToken = servicioToken.generarToken((UsuarioEntidad) usuarioAutenticado.getPrincipal());
        return ResponseEntity.ok(new DatoJWT(JWToken));

    }


}
