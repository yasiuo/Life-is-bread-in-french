package com.company;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.*;

public class Student extends Osoba implements Externalizable {

    public String nmr_indeks;
    public List<Kurs> kursy;
    public boolean czyErazmus, czyPierwszyStopien, czyDrugiStopien, czyStacjonarny, czyNieStacjonarny;

    @Override
    public String toString() {
        return "Student{" +
                "nmr_indeks='" + nmr_indeks + '\'' +
                ", kursy=" + kursy +
                ", czyErazmus=" + czyErazmus +
                ", czyPierwszyStopien=" + czyPierwszyStopien +
                ", czyDrugiStopien=" + czyDrugiStopien +
                ", czyStacjonarny=" + czyStacjonarny +
                ", czyNieStacjonarny=" + czyNieStacjonarny +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", pesel='" + pesel + '\'' +
                ", plec='" + plec + '\'' +
                ", wiek=" + wiek +
                "} " + super.toString();
    }

    public Student(String imie, String nazwisko, String pesel, String plec, int wiek, String nmr_indeks, List<Kurs> kursy, boolean czyErazmus, boolean czyPierwszyStopien, boolean czyStacjonarny) {
        super(imie, nazwisko, pesel, plec, wiek);
        this.nmr_indeks = nmr_indeks;
        this.kursy = kursy;
        this.czyErazmus = czyErazmus;
        this.czyPierwszyStopien = czyPierwszyStopien;
        if (czyPierwszyStopien){
            this.czyDrugiStopien=false;
        }
        else {
            this.czyDrugiStopien=true;
        }
        this.czyStacjonarny = czyStacjonarny;
        if (czyStacjonarny){
            this.czyNieStacjonarny=false;
        }
        else {
            this.czyNieStacjonarny=true;
        }
    }


    public Student() {
        this.nmr_indeks="";
        this.kursy= new ArrayList<>();
    }

    public String getNmr_indeks() {
        return nmr_indeks;
    }

    public void setNmr_indeks(String nmr_indeks) {
        this.nmr_indeks = nmr_indeks;
    }

    public List<Kurs> getKursy() {
        return kursy;
    }

    public void setKursy(List<Kurs> kursy) {
        this.kursy = kursy;
    }

    public boolean isCzyErazmus() {
        return czyErazmus;
    }

    public void setCzyErazmus(boolean czyErazmus) {
        this.czyErazmus = czyErazmus;
    }

    public boolean isCzyPierwszyStopien() {
        return czyPierwszyStopien;
    }

    public void setCzyPierwszyStopien(boolean czyPierwszyStopien) {
        this.czyPierwszyStopien = czyPierwszyStopien;
    }

    public boolean isCzyDrugiStopien() {
        return czyDrugiStopien;
    }

    public void setCzyDrugiStopien(boolean czyDrugiStopien) {
        this.czyDrugiStopien = czyDrugiStopien;
    }

    public boolean isCzyStacjonarny() {
        return czyStacjonarny;
    }

    public void setCzyStacjonarny(boolean czyStacjonarny) {
        this.czyStacjonarny = czyStacjonarny;
    }

    public boolean isCzyNieStacjonarny() {
        return czyNieStacjonarny;
    }

    public void setCzyNieStacjonarny(boolean czyNieStacjonarny) {
        this.czyNieStacjonarny = czyNieStacjonarny;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

    }
}