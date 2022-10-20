package Cinepolis;

import java.time.LocalDate;
import java.util.Scanner;

public class MembresiaFan {
    private int precioMembresia;
    private String nombreTitular;
    private LocalDate fechaNacimientoT;
    private long numTarjeta;
    private int visitasAlCine;
    private int puntos;

    public MembresiaFan(int precioMembresia, String nombreTitular, LocalDate fechaNacimientoT, long numTarjeta,
            int visitasAlCine, int puntos) {
        this.precioMembresia = precioMembresia;
        this.nombreTitular = nombreTitular;
        this.fechaNacimientoT = fechaNacimientoT;
        this.numTarjeta = numTarjeta;
        this.visitasAlCine = visitasAlCine;
        this.puntos = puntos;
    }

    // Metodos

    public void conocerBeneficios() {
        System.out.println(
                "\nDos frappes grandes por $89, celebrar cumpleaños, martes 2x1, acumula puntos, combo lunes por $174, +QueCine");
    }

    public void irAlCine() {
        this.visitasAlCine++;
        this.puntos += 10;
        System.out.println("\nUsted ha ido al cine, ha aumentado su contador de visitas a: " + this.visitasAlCine
                + ", y tiene acumulado " + this.puntos + " puntos");
    }

    public String comprobarAscenso() {
        String ascenso = null;
        Scanner s1 = new Scanner(System.in);
        if (this.visitasAlCine > 12 && this.visitasAlCine <= 24) {
            ascenso = "Fanatico";
        } else if (this.visitasAlCine > 24) {
            ascenso = "Super fanatico";
        } else
            System.out.println("Desea comprobar su numero de visitas:");
            char op = s1.next().charAt(0);
        return ascenso;
    }

    public void celebrarCumpleaños() {
        int dia = LocalDate.now().getDayOfMonth();
        int mes = LocalDate.now().getMonthValue();
        int diaC = this.fechaNacimientoT.getDayOfMonth();
        int mesC = this.fechaNacimientoT.getMonthValue();
        if (diaC == dia & mesC == mes) {
            System.out.println("\nFeliz cumpleaños!\nLe regalamos un ICEE de cereza!");
        }
    }

    public int getPrecioMembresia() {
        return precioMembresia;
    }

    public void setPrecioMembresia(int precioMembresia) {
        this.precioMembresia = precioMembresia;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public LocalDate getFechaNacimientoT() {
        return fechaNacimientoT;
    }

    public void setFechaNacimientoT(LocalDate fechaNacimientoT) {
        this.fechaNacimientoT = fechaNacimientoT;
    }

    public long getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(long numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public int getVisitasAlCine() {
        return visitasAlCine;
    }

    public void setVisitasAlCine(int visitasAlCine) {
        this.visitasAlCine = visitasAlCine;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "PrecioMembresia: " + precioMembresia + "\nNombreTitular: " + nombreTitular
                + "\nFechaNacimientoT: " + fechaNacimientoT.getDayOfMonth() + "-" + fechaNacimientoT.getMonth() + "-"
                + fechaNacimientoT.getYear() + "\nNumTarjeta: " + numTarjeta
                + "\nVisitasAlCine: " + visitasAlCine;
    }
}