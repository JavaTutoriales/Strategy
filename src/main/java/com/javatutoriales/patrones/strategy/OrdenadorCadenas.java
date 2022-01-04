package com.javatutoriales.patrones.strategy;

import com.javatutoriales.patrones.strategy.sort.SortAlgorithm;
import com.javatutoriales.patrones.strategy.sort.factory.SortAlgorithmSimpleFactory;

public class OrdenadorCadenas {
    private SortAlgorithm sortAlgorithm;

    public String[] ordena(String[] arregloDesordenado) {

        sortAlgorithm = SortAlgorithmSimpleFactory.getSortingAlgorithm(arregloDesordenado.length);

        String[] arregloOrdenado = sortAlgorithm.sort(arregloDesordenado);

        return arregloOrdenado;
    }
}
