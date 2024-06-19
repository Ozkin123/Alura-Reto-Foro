package com.aluraRetoForo.infra.seguridad;


import com.aluraRetoForo.entidades.UsuarioEntidad;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.stereotype.Service;

import java.time.Instant;

import java.time.LocalDateTime;
import java.time.ZoneOffset;


@Service
public class ServicioToken {

    public String generarToken(UsuarioEntidad usuario){
        try {
            Algorithm algorithm = Algorithm.HMAC256("abc123"); // SE QUE TOCA USAR VARIABLE De ENTORNO ES SOLO PARA PRACTICAR
           return JWT.create()
                    .withIssuer("foroOscar")
                   .withSubject(usuario.getNombre())
                   .withClaim("id", usuario.getId())
                   .withExpiresAt(generarExperiacion())
                    .sign(algorithm);
        } catch (JWTCreationException exception){
            throw new RuntimeException();
        }
    }

    public String getSubject(String token) {
        if (token == null) {
            throw new RuntimeException();
        }
        DecodedJWT verifier = null;
        try {
            Algorithm algorithm = Algorithm.HMAC256("abc123");
            verifier = JWT.require(algorithm)
                    .withIssuer("foroOscar")
                    .build()
                    .verify(token);
            verifier.getSubject();
        } catch (JWTVerificationException exception) {
            System.out.println(exception.toString());
        }
        if (verifier.getSubject() == null) {
            throw new RuntimeException("Verifier invalido");
        }
        return verifier.getSubject();
    }

    private Instant generarExperiacion() {
        return LocalDateTime.now().plusHours(2).toInstant(ZoneOffset.of("-05:00"));
    }

}
