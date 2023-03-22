/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esquina_nor.oeste;

/**
 *
 * @author Imanol
 */
public class MetodoEsquinaNorOesteModificado {

    private int[][] matrizCostos;
    private int[][] matrizSolucion;
    private int[] oferta;
    private int[] demanda;

    public MetodoEsquinaNorOesteModificado(int[][] matrizCostos, int[] oferta, int[] demanda) {
        this.matrizCostos = matrizCostos;
        this.oferta = oferta;
        this.demanda = demanda;
        this.matrizSolucion = new int[oferta.length][demanda.length];
    }

    public void resolverProblema() {
        int fila = 0;
        int columna = 0;
        while (fila < oferta.length && columna < demanda.length) {
            int cantidad = Math.min(oferta[fila], demanda[columna]);
            matrizSolucion[fila][columna] = cantidad;
            oferta[fila] -= cantidad;
            demanda[columna] -= cantidad;
            if (oferta[fila] == 0) {
                fila++;
            } else {
                columna++;
            }
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
