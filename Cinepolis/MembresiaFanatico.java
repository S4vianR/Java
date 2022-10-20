package Cinepolis;

import java.time.LocalDate;
import java.util.Scanner;

public class MembresiaFanatico extends MembresiaFan {
    private float precioEspecialEntrada;
    private float descuentoComboLunes;    

    

    public MembresiaFanatico(int precioMembresia, String nombreTitular, LocalDate fechaNacimientoT, long numTarjeta,
            int visitasAlCine, int puntos, float precioEspecialEntrada, float descuentoComboLunes) {
        super(precioMembresia, nombreTitular, fechaNacimientoT, numTarjeta, visitasAlCine, puntos);
        this.precioEspecialEntrada = precioEspecialEntrada;
        this.descuentoComboLunes = descuentoComboLunes;
    }

    public void refillFanatico(){
        Scanner s1 = new Scanner (System.in);
        int op = 0;
        System.out.println("\nSe ha ganado un refill gratis de palomitas o soda, escoja una de las dos, 1 para palomitas o 2 para soda:");
        op = s1.nextInt();
        if (op == 1)
            System.out.println("\nTenga su refill gratis de palomitas");
        else if (op == 2)
            System.out.println("\nTenga su refill gratis de soda");
    }

    public void descuentoComboLunes() {
        System.out.println("Usted tiene un descuento del combo lunes y serian 189 pesos");
    }

    public float getPrecioEspecialEntrada() {
        return precioEspecialEntrada;
    }

    public void setPrecioEspecialEntrada(float precioEspecialEntrada) {
        this.precioEspecialEntrada = precioEspecialEntrada;
    }

    public float getDescuentoComboLunes() {
        return descuentoComboLunes;
    }

    public void setDescuentoComboLunes(float descuentoComboLunes) {
        this.descuentoComboLunes = descuentoComboLunes;
    }

    @Override
    public String toString() {
        return "\nPrecioEspecialEntrada: " + precioEspecialEntrada + "\nDescuentoComboLunes: "
                + descuentoComboLunes;
    }

}