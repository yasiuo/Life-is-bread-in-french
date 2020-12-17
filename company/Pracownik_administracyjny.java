package com.company;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Pracownik_administracyjny extends Pracownik_Uczelni implements Externalizable {

    public String stanowisko_pracy;
    public int liczba_nadgodzin;

    @Override
    public String toString() {
        return "Pracownik_administracyjny{" +
                "stanowisko_pracy='" + stanowisko_pracy + '\'' +
                ", pensja=" + pensja +
                ", staz_pracy=" + staz_pracy +
                ", liczba_nadgodzin=" + liczba_nadgodzin +
                ", stanowisko='" + stanowisko + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", pesel='" + pesel + '\'' +
                ", plec='" + plec + '\'' +
                ", wiek=" + wiek +
                "} " + super.toString();
    }

    public Pracownik_administracyjny(String imie, String nazwisko, String pesel, String plec, int wiek, String stanowisko, int staz_pracy, int pensja, String stanowisko_pracy, int liczba_nadgodzin) {
        super(imie, nazwisko, pesel, plec, wiek, stanowisko, staz_pracy, pensja);
        this.stanowisko_pracy = stanowisko_pracy;
        this.liczba_nadgodzin = liczba_nadgodzin;
    }


    public Pracownik_administracyjny() {
        this.stanowisko_pracy = "";
        this.liczba_nadgodzin = 0;
    }

    public String getStanowisko_pracy() {
        return stanowisko_pracy;
    }

    public void setStanowisko_pracy(String stanowisko_pracy) {
        this.stanowisko_pracy = stanowisko_pracy;
    }

    @Override
    public int getPensja() {
        return pensja;
    }

    @Override
    public void setPensja(int pensja) {
        this.pensja = pensja;
    }

    @Override
    public int getStaz_pracy() {
        return staz_pracy;
    }

    @Override
    public void setStaz_pracy(int staz_pracy) {
        this.staz_pracy = staz_pracy;
    }

    public int getLiczba_nadgodzin() {
        return liczba_nadgodzin;
    }

    public void setLiczba_nadgodzin(int liczba_nadgodzin) {
        this.liczba_nadgodzin = liczba_nadgodzin;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

    }
}
