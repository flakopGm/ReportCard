package com.example.joni.reportcard;

import java.util.Arrays;

public class Report {

    // Nombre del Alumno.
    private final String NOMBRE_ALUMNO = "NOMBRE_DEL_ALUMNO";
    // Asignaturas de ejemplo.
    private final String[] ASIGNATURAS = {"Física", "Matemáticas", "Programación", "Diseno",
            "Historia"};
    // Variable para las notas de las diferentes asignaturas.
    private int notaFisica;
    private int notaMatematicas;
    private int notaProgramacion;
    private int notadiseno;
    private int notaHistoria;
    // Variable para guardar el total de la suma resultando de todas las notas.
    private int totalNotas;
    // Dígito final de calificación.
    private char resultadoFinal;

    public Report(int notaFisica, int notaMatematicas,
                  int notaProgramacion, int notaDiseno, int notaHistoria) {
        this.notaFisica = notaFisica;
        this.notaMatematicas = notaMatematicas;
        this.notaProgramacion = notaProgramacion;
        this.notadiseno = notaDiseno;
        this.notaHistoria = notaHistoria;
    }

    public String getNOMBRE_ALUMNO() {
        return NOMBRE_ALUMNO;
    }

    public void setNotaFisica(int notaFisica) {
        this.notaFisica = notaFisica;
    }

    public int getNotaFisica() {
        return notaFisica;
    }

    public void setNotaMatematicas(int notaMatematicas) {
        this.notaMatematicas = notaMatematicas;
    }

    public int getNotaMatematicas() {
        return notaMatematicas;
    }

    public void setNotaProgramacion(int notaProgramacion) {
        this.notaProgramacion = notaProgramacion;
    }

    public int getNotaProgramacion() {
        return notaProgramacion;
    }

    public void setNotadiseno(int notadiseno) {
        this.notadiseno = notadiseno;
    }

    public int getNotadiseno() {
        return notadiseno;
    }

    public void setNotaHistoria(int notaHistoria) {
        this.notaHistoria = notaHistoria;
    }

    public int getNotaHistoria() {
        return notaHistoria;
    }

    // Realizamos la suma de todas las notas y activamos el método para dar valor al dígito final
    // de calificación.
    public void sumaDeNotas() {
        this.totalNotas = this.notadiseno + this.notaFisica
                + this.notaHistoria + this.notaMatematicas
                + this.notaProgramacion;
        digitoFinalCalificacion();
    }

    public int getTotalNotas() {
        return totalNotas;
    }

    public char getResultadoPruebas() {
        return resultadoFinal;
    }

    // Según el resultado obtendrá una calificación u otra.
    private void digitoFinalCalificacion() {
        int validacionNotas = getTotalNotas() / ASIGNATURAS.length;
        if (validacionNotas <= 40) {
            this.resultadoFinal = 'C';
        } else if (validacionNotas > 40 && validacionNotas <= 60) {
            this.resultadoFinal = 'B';
        } else {
            this.resultadoFinal = 'A';
        }
    }

    // Método @toString personalizado.
    @Override
    public String toString() {
        return "Resultado Pruebas:\n" +
                "NOMBRE ALUMNO = " + NOMBRE_ALUMNO + "\n" +
                "ASIGNATURAS EXAMINADAS = " + Arrays.toString(ASIGNATURAS) +
                "\n'[' NOTA FISICA = " + notaFisica +
                " * NOTA MATEMATICAS = " + notaMatematicas +
                " * NOTA PROGRAMACION = " + notaProgramacion +
                " * NOTA DISENO = " + notadiseno +
                " * NOTA HISTORIA = " + notaHistoria +
                " ']'\nTOTAL NOTAS = " + totalNotas +
                "\nRESULTADO FINAL = " + resultadoFinal +
                "\n\nINFO RESULTADOS: (A) APTO - (B) PRUEBAS COMPLEMENTARIAS - (C) NO APTO";
    }
}
