package org.coyarzun.api.stream.ejemplos;


import org.coyarzun.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamMap {
    public static void main(String[] args) {
        /*Stream.of("Pato","Pepe","Paco","Pepa")
                .peek(e->System.out.println(e))
                .map(nombre->{
            return nombre.toUpperCase();
        }).forEach(System.out::println);*/
        Stream<Usuario> nombres = Stream
                .of("Pato Guzman","Pepe Abarca","Paco Rabani","Pepa Pig")
                .map(nombre->new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(u->System.out.println(u))
                .map(usuario ->
                {
                    String nombre = usuario.getNombre().toLowerCase();
                    usuario.setNombre(nombre);
                    return usuario;
                });

        List<Usuario> lista = nombres.collect(Collectors.toList());
        lista.forEach(u-> System.out.println(u));

    }
}
