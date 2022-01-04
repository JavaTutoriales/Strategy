package com.javatutoriales.patrones.strategy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.Index.atIndex;

class OrdenadorCadenasTest {

    private OrdenadorCadenas ordenadorCadenas = new OrdenadorCadenas();

    @Test
    public void testCadenasOrdenadas_cuandoArregloConTresCadenas() {
        String[] arregloDesordenado = {"Hola", "Estoy", "Desordenado"};

        String[] arregloOrdenado = ordenadorCadenas.ordena(arregloDesordenado);

        assertThat(arregloOrdenado).contains("Desordenado", atIndex(0));
        assertThat(arregloOrdenado).contains("Estoy", atIndex(1));
        assertThat(arregloOrdenado).contains("Hola", atIndex(2));
    }

    @Test
    public void testCadenasOrdenadas_cuandoArregloConSeisCadenas() {
        String[] arregloDesordenado = {"Ahora", "Tenemos", "Mas", "Elementos", "Para", "Ordenar"};

        String[] arregloOrdenado = ordenadorCadenas.ordena(arregloDesordenado);

        assertThat(arregloOrdenado).containsExactly("Ahora", "Elementos", "Mas", "Ordenar", "Para", "Tenemos");
    }

    @Test
    public void testCadenasOrdenadas_cuandoArregloCon15Cadenas() {
        String[] arregloDesordenado = {"Ahora", "Si", "Tenemos", "Muchas", "Cadenas", "Para", "Validar", "El", "Algoritmo", "De", "Ordenamiento", "Seleccionado", "En", "Nuestra", "Aplicacion"};

        String[] arregloOrdenado = ordenadorCadenas.ordena(arregloDesordenado);

        String[] arregloEsperado = {"Ahora", "Algoritmo", "Aplicacion", "Cadenas", "De", "El", "En", "Muchas", "Nuestra", "Ordenamiento", "Para", "Seleccionado", "Si",  "Tenemos", "Validar"};

        assertThat(arregloOrdenado).isEqualTo(arregloEsperado);
    }
}