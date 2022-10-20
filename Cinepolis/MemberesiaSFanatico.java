package Cinepolis;

import java.time.LocalDate;
import java.util.Scanner;

public class MemberesiaSFanatico extends MembresiaFanatico {
    private int cuponCinepolisKlic;

    public MemberesiaSFanatico(int precioMembresia, String nombreTitular, LocalDate fechaNacimientoT, long numTarjeta,
            int visitasAlCine, int puntos, float precioEspecialEntrada, float descuentoComboLunes,
            int cuponCinepolisKlic) {
        super(precioMembresia, nombreTitular, fechaNacimientoT, numTarjeta, visitasAlCine, puntos,
                precioEspecialEntrada, descuentoComboLunes);
        this.cuponCinepolisKlic = cuponCinepolisKlic;
    }

    public void descuentoPuntos() {
        Scanner pts = new Scanner(System.in);
        int num = 0;
        int puntos = 2;
        int res = 0;
        int puntosMenos = 0;
        System.out.println("\nUsted tiene " + this.getPuntos() + "\nPor cada punto que use se le descontara 2 pesos de su proxima compra\nCuantos desea usar:");
        num = pts.nextInt();
        res = puntos * num;
        puntosMenos = this.getPuntos() - num;
        System.out.println("Usted ha usado " + num + " y pagara " + res + " pesos menos en su siguiente compra y le quedan " + puntosMenos + " puntos" );
    }

    public void usarCuponCineKlic() {
        if (this.cuponCinepolisKlic > 0) {
            this.cuponCinepolisKlic--;
            System.out.println(
                    "Usted ha usado uno de sus cupones de Cinepolis Klic y tiene un descuento del 25% en lo que guste, le quedan "
                            + this.cuponCinepolisKlic + " cupones");
        }
    }

    public int getCuponCinepolisKlic() {
        return cuponCinepolisKlic;
    }

    public void setCuponCinepolisKlic(int cuponCinepolisKlic) {
        this.cuponCinepolisKlic = cuponCinepolisKlic;
    }

    @Override
    public String toString() {
        return "\nCuponCinepolisKlic: " + cuponCinepolisKlic;
    }
}