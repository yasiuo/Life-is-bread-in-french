package com.company;

import java.io.Externalizable;
import java.io.Serializable;

public abstract class Osoba implements Externalizable {

    public String imie, nazwisko, pesel, plec;
    public int wiek;

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", pesel='" + pesel + '\'' +
                ", plec='" + plec + '\'' +
                ", wiek=" + wiek +
                '}';
    }

    public Osoba(String imie, String nazwisko, String pesel, String plec, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.plec = plec;
        this.wiek = wiek;
    }

    public Osoba() {
        this.imie = "";
        this.nazwisko = "";
        this.pesel = "";
        this.plec = "";
        this.wiek = 0;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getPlec() {
        return plec;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
}
