package com.aluraRetoForo.infra.seguridad;


import com.aluraRetoForo.entidades.UsuarioEntidad;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import org.springframework.stereotype.Service;

@Service
public class ServicioToken {

    public String generarToken(UsuarioEntidad usuario){
        try {
            Algorithm algorithm = Algorithm.HMAC256("abc123"); // SE QUE TOCA USAR VARIABLE De ENTORNO ES SOLO PARA PRACTICAR
           return JWT.create()
                    .withIssuer("foroOscar")
                   .withSubject(usuario.getNombre())
                   .withClaim("id", usuario.getId())
                    .sign(algorithm);
        } catch (JWTCreationException exception){
            throw new RuntimeException();
        }
    }

}
