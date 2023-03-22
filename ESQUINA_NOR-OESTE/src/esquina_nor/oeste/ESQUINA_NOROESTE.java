/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package esquina_nor.oeste;

/**
 *
 * @author Imanol
 */
public class ESQUINA_NOROESTE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matrizCostos[][] = new int[3][4];
        matrizCostos[0][0] = 3;
        matrizCostos[0][1] = 2;
        matrizCostos[0][2] = 7;
        matrizCostos[0][3] = 6;
        matrizCostos[1][0] = 7;
        matrizCostos[1][1] = 5;
        matrizCostos[1][2] = 2;
        matrizCostos[1][3] = 3;
        matrizCostos[2][0] = 2;
        matrizCostos[2][1] = 5;
        matrizCostos[2][2] = 4;
        matrizCostos[2][3] = 5;

        int oferta[] = new int[3];
        oferta[0] = 5000;
        oferta[1] = 6000;
        oferta[2] = 2500;
        
        int demanda[] = new int [4];
        demanda[0]=6000;
        demanda[1]=4000;
        demanda[2]=2000;
        demanda[3]=1500;
        
        /*
        MetodoEsquinaNoroeste es = new MetodoEsquinaNoroeste(matrizCostos, oferta, demanda);
        es.resolverProblema();
        System.out.println(es.calcularCostoTotal());
        */
        
        MetodoCostoMinimo min = new MetodoCostoMinimo(matrizCostos, oferta, demanda);
        min.resolverProblema();
        System.out.println(min.calcularCostoTotal());
        

    }

}
