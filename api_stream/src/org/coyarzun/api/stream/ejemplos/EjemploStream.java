package org.coyarzun.api.stream.ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStream {
    public static void main(String[] args) {
        Stream<String> nombres = Stream.of("Pato","Pepe","Paco","Pepa");
        nombres.forEach(System.out::println);

        String[] arr = {"Pato","Pepe","Paco","Pepa"};
        nombres = Arrays.stream(arr);
        nombres.forEach(System.out::println);

        Stream<String> nombres2 = Stream.<String>builder().add("Pato").add("Paco").add("Pepa").add("Pepe").build();
        nombres2.forEach(System.out::println);

        List<String> lista = new ArrayList<>();
        lista.add("Pato");
        lista.add("Pepe");
        lista.add("Paco");
        lista.add("Pepa");
        //Stream<String> nombres3 = lista.stream();
        //nombres3.forEach(System.out::println);
        lista.stream().forEach(System.out::println);
    }
}
