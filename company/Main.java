package com.company;

import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    //PracownikAdministracyjny: Stanowisko pracy {Referent, Specjalista, Starszy Specjalista, ...}
    // Pracownik Badawczo-Dydaktyczny: Stanowisko pracy {Asystent,Adiunkt, Profesor Nadzwyczajny, Profesor Zwyczajny, Wykładowca }

    public static List<Object> podstawowe_kursy = new ArrayList<>();
    public static int ZDD;

    public static void main(String[] args) {
        List<Object> lista_osob = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        podstawowe_kursy.add(new Kurs("Analiza Matematyczna", "Patryk Taki", 2));
        podstawowe_kursy.add(new Kurs("Algebra", "Henryk Inny", 4));

        boolean zasilanie = true;
        while (zasilanie){
            System.out.println("\n"+"wybierz 1, aby dodac osobe do listy");
            System.out.println("wybierz 2, aby sprawdzic liste osob");
            System.out.println("wybierz 3, aby sprawdzic liste podstawowe kursy");
            System.out.println("wybierz 4, aby przeszukac liste");
            System.out.println("wybierz 5, aby dodac kurs do listy");
            System.out.println("wybierz 6, aby zapisac liste osob do pliku .txt");
            System.out.println("wybierz 8, aby skonczyc program" + "\n");
            int opcja = scan.nextInt();
            switch (opcja){
                case 1:
                    ZDD=0;
                    Dodaj(lista_osob);
                    break;
                case 2:
                    pokaz(lista_osob);
                    break;
                case 3:
                    pokaz(podstawowe_kursy);
                    break;
                case 4:
                    System.out.println("Podaj kryteria: ");
                    String x = scan.next();
                    System.out.println("Podaj szukana wartosc: ");
                    Object yx = scan.next();
                    pokaz(znajdz(lista_osob,x,yx));
                    break;
                case 5:
                    ZDD=1;
                    Dodaj(podstawowe_kursy);
                    break;
                case 6:
                    try
                    {
                        FileOutputStream fos = new FileOutputStream("plikZLista");
                        ObjectOutputStream oos = new ObjectOutputStream(fos);
                        oos.writeObject(lista_osob);
                        oos.close();
                        fos.close();
                    }
                    catch (IOException ioe)
                    {
                        ioe.printStackTrace();
                    }
                    break;
                case 7:
                    try
                    {
                        FileInputStream fis = new FileInputStream("plikZLista");
                        ObjectInputStream ois = new ObjectInputStream(fis);
                        lista_osob = (ArrayList <Object>) ois.readObject();
                        ois.close();
                        fis.close();
                    }catch(IOException ioe){
                        ioe.printStackTrace();
                        return;
                    }catch(ClassNotFoundException c){
                        System.out.println("Class not found");
                        c.printStackTrace();
                        return;
                    }
                    break;
                case 8:
                    zasilanie = false;
            }
        }
    }


    public static  List<Object> znajdz(List<Object> wejscie, String zmienna, Object wartosc) {
        List<Object> wynik = new ArrayList<>();
        for (Object poKolei : wejscie) {
            Field[] fields = poKolei.getClass().getFields();
            for (Field f : fields) {
                try {
                    if (f.getName().equals(zmienna) && wartosc instanceof String &&(f.get(poKolei).toString()).equals(wartosc)) {
                        wynik.add(poKolei);
                    }
                    else if (f.getName().equals(zmienna) && f.get(poKolei).equals(wartosc)){
                        wynik.add(poKolei);
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return wynik;
    }


    public static void pokaz(List <Object> lista){
        if (lista.size()==0){
            System.out.println("Brak wynikow");
        }
        else {
            for (Object x : lista) {
                System.out.println(x.toString());
            }
        }
    }


    public static void Dodaj(List<Object> lista){

        Scanner scan = new Scanner(System.in);
        int opcja;

        if (ZDD==0){
            System.out.println("| kogo dodac? |"+ "\n" +"| 1-pracownik badawczo-dydaktyczny 2-pracownik administracyjny 3-student |");
            opcja = scan.nextInt();

            switch (opcja){
                case 1:
                    lista.add(new Pracownik_BadawczoDydaktyczny());
                    break;
                case 2:
                    lista.add(new Pracownik_administracyjny());
                    break;
                case 3:
                    lista.add(new Student());
                    break;
            }
        }
        else {
            lista.add(new Kurs());
        }

        Object postac = lista.get(lista.size() - 1);
        Field[] ffields = postac.getClass().getFields();

        for (Field f : ffields){
            System.out.println(f.getName() +" | " + (f.getType().getSimpleName()));
            try {
                if (f.get(postac) instanceof String) {
                    f.set(postac, scan.next());
                }
                else if(f.get(postac) instanceof Integer){
                    f.setInt(postac, scan.nextInt());
                }
                else if(f.get(postac) instanceof Boolean){
                    f.setBoolean(postac, scan.nextBoolean());
                }
                else if (f.get(postac) instanceof ArrayList){
                    f.set(postac,podstawowe_kursy);
                }
            }catch (IllegalAccessException e){
                e.printStackTrace();
            }
        }
    }


}