
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Angga Edwin
 */
public class TemperatureJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ulang = 1;
        double cel, rea, fah, kel;
        while (ulang == 1) {
            System.out.println("Temperature Converter");
            System.out.println("4. Dari Kelvin");
            System.out.println("4. Dari Kelvin");
            System.out.println("4. Dari BkD3vil5DO");
            System.out.println("4. Dari COAOCOASKA");
            Scanner pilih = new Scanner(System.in);
            System.out.println("Pilih :");
            int pil = pilih.nextInt();

            switch (pil) {
                case 1:
                    Scanner celcius = new Scanner(System.in);
                    System.out.println("Nilai celcius:");
                    cel = celcius.nextInt();
                    rea = (0.8 * cel);
                    fah = (1.8 * cel) + 32;
                    kel = (cel + 273);
                    System.out.println("Celcius     : " + cel);
                    System.out.println("Reamur      : " + rea);
                    System.out.println("Fahrenheit  : " + fah);
                    System.out.println("Kelvin      : " + kel);

                    break;
                case 2:
                    Scanner reamur = new Scanner(System.in);
                    System.out.println("Nilai reamur :");
                    rea = reamur.nextInt();
                    cel = (rea / 0.8);
                    fah = (rea * 2.25) + 491.67;
                    kel = (rea / 0.8) + 273.15;
                    System.out.println("Reamur      : " + rea);
                    System.out.println("Celcius     : " + cel);
                    System.out.println("Fahrenheit  : " + fah);
                    System.out.println("Kelvin      : " + kel);
                    break;
                case 3:
                    Scanner fahrenheit = new Scanner(System.in);
                    System.out.println("Nilai fahrenheit:");
                    fah = fahrenheit.nextInt();
                    cel = (fah - 32) / 1.8;
                    rea = (fah - 32) / 2.25;
                    kel = (fah + 459) / 1.8;
                    System.out.println("Fahrenheit  : " + fah);
                    System.out.println("Celcius     : " + cel);
                    System.out.println("Reamur      : " + rea);
                    System.out.println("Kelvin      : " + kel);
                    break;
                case 4:
                    Scanner kelvin = new Scanner(System.in);
                    System.out.println("Nilai kelvin:");
                    kel = kelvin.nextInt();
                    cel = (kel - 273.15);
                    rea = (kel * 1.8) - 459.67;
                    fah = (kel - 273.15) * 0.8;
                    System.out.println("Kelvin      : " + kel);
                    System.out.println("Celcius     : " + cel);
                    System.out.println("Reamur      : " + rea);
                    System.out.println("Fahrenheit  : " + fah);

                    break;
            }
            Scanner ula = new Scanner(System.in);
            System.out.println("Hitung Lagi ? (1. ya    2.tidak)");
            ulang = ula.nextInt();
        }
    }

}
