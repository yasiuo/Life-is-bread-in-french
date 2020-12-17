package com.company;

import java.io.Externalizable;

public abstract class Pracownik_Uczelni extends Osoba implements Externalizable {

    public String stanowisko;
    public int  staz_pracy, pensja;


    public Pracownik_Uczelni(String imie, String nazwisko, String pesel, String plec, int wiek, String stanowisko, int staz_pracy, int pensja) {
        super(imie, nazwisko, pesel, plec, wiek);
        this.stanowisko = stanowisko;
        this.staz_pracy = staz_pracy;
        this.pensja = pensja;
    }

    public Pracownik_Uczelni() {
        this.stanowisko = "";
        this.staz_pracy = 0;
        this.pensja = 0;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    public int getStaz_pracy() {
        return staz_pracy;
    }

    public void setStaz_pracy(int staz_pracy) {
        this.staz_pracy = staz_pracy;
    }

    public int getPensja() {
        return pensja;
    }

    public void setPensja(int pensja) {
        this.pensja = pensja;
    }
}
