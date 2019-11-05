/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan50;

/**
 *
 * @author Zaenal PC
 */
public class EnergiKinetik {
    private int massa;
    private int kecepatan;

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }
    
    public double energiKinetik(){
        return (0.5 * massa * (Math.pow(kecepatan, 2)));
    }
    
    public void tampilHasil(){
        setMassa(145);
        setKecepatan(25);
        System.out.println("Diketahui :");
        System.out.println("Massa : " + getMassa() + " gram");
        System.out.println("Kecepatan : " + getKecepatan() + " m/s");
        System.out.println("Ditanya : ");
        System.out.println("1. Energi kinetik?");
        System.out.println("2. Usaha dimulai dari keadaan diam?");
        System.out.println("\nJawab : ");
        System.out.println("1. Energi Kinetik (1/2 * Massa * Kecepatan^2) =  " + energiKinetik() + " Newton");
        System.out.println("2. Usaha = (1/2 * Massa * (Kecepatan^2 - 0^2) = " + energiKinetik() + " Newton ");
    }
}