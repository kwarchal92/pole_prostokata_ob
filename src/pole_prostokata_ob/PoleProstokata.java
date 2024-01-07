package pole_prostokata_ob;

import java.io.*;

public class PoleProstokata {

    double pole, a, b;

    public void czytajDane()
            throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Program oblicza pole prostobata");
        System.out.println("podaj bok a :");
        a = Double.parseDouble(br.readLine());
        System.out.println("podaj bok b :");
        b = Double.parseDouble(br.readLine());
    }

    public void przetworzDane() {
        pole = a * b;
    }

    public void wyswietlWynik() {
        System.out.print("Pole prostokata o boku a = ");
        System.out.printf("2.2f", a);
        System.out.print("i boku b = ");
        System.out.printf("2.2f", b);
        System.out.print(" wynosi ");
        System.out.printf("2.2f.\n" + pole);
    }
}

public class Main
{
    public static void main(String[] args)
            throws IOException {
        poleProstokata pole1 = new poleProstokata(); //deklaracja zmiennej, utworzenie obiektu i przypisanie go do zmiennej

        pole1.czytajDane(); //wywolanie metody czytajDane()
        pole1.przetworzDane(); //wywolanie metody przetworzDane()
        pole1.wyswietlWynik(); //wywolanie metody wyswietlWynik()
    }
}


