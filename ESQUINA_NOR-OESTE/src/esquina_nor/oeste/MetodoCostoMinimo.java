/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esquina_nor.oeste;

/**
 *
 * @author Imanol
 */
public class MetodoCostoMinimo {

    private int[][] matrizCostos;
    private int[][] matrizSolucion;
    private int[] oferta;
    private int[] demanda;

    public MetodoCostoMinimo(int[][] matrizCostos, int[] oferta, int[] demanda) {
        this.matrizCostos = matrizCostos;
        this.oferta = oferta;
        this.demanda = demanda;
        this.matrizSolucion = new int[oferta.length][demanda.length];
    }

    public void resolverProblema() {
        while (true) {
            int fila = -1;
            int columna = -1;
            int costo = Integer.MAX_VALUE;
            for (int i = 0; i < oferta.length; i++) {
                for (int j = 0; j < demanda.length; j++) {
                    if (oferta[i] > 0 && demanda[j] > 0 && matrizCostos[i][j] < costo) {
                        fila = i;
                        columna = j;
                        costo = matrizCostos[i][j];
                    }
                }
            }
            if (fila == -1 || columna == -1) {
                break;
            }
            int cantidad = Math.min(oferta[fila], demanda[columna]);
            matrizSolucion[fila][columna] = cantidad;
            oferta[fila] -= cantidad;
            demanda[columna] -= cantidad;
        }
    }

    public int calcularCostoTotal() {
        int costoTotal = 0;
        for (int i = 0; i < oferta.length; i++) {
            for (int j = 0; j < demanda.length; j++) {
                costoTotal += matrizCostos[i][j] * matrizSolucion[i][j];
            }
        }
        return costoTotal;
    }
}

