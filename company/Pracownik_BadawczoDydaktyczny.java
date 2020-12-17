package com.company;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Pracownik_BadawczoDydaktyczny extends Pracownik_Uczelni implements Externalizable {

    public String Stanowisko_pracy;
    public int punktacja_z_dorobku_naukowego;

    @Override
    public String toString() {
        return "Pracownik_BadawczoDydaktyczny{" +
                "Stanowisko_pracy='" + Stanowisko_pracy + '\'' +
                ", pensja=" + pensja +
                ", staz_pracy=" + staz_pracy +
                ", punktacja_z_dorobku_naukowego=" + punktacja_z_dorobku_naukowego +
                ", stanowisko='" + stanowisko + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", pesel='" + pesel + '\'' +
                ", plec='" + plec + '\'' +
                ", wiek=" + wiek +
                "} " + super.toString();
    }

    public Pracownik_BadawczoDydaktyczny(String imie, String nazwisko, String pesel, String plec, int wiek, String stanowisko, int staz_pracy, int pensja, String stanowisko_pracy, int punktacja_z_dorobku_naukowego) {
        super(imie, nazwisko, pesel, plec, wiek, stanowisko, staz_pracy, pensja);
        this.Stanowisko_pracy = stanowisko_pracy;
        this.punktacja_z_dorobku_naukowego = punktacja_z_dorobku_naukowego;
    }

    public Pracownik_BadawczoDydaktyczny() {
        this.Stanowisko_pracy = "";
        this.punktacja_z_dorobku_naukowego = 0;
    }

    public String getStanowisko_pracy() {
        return Stanowisko_pracy;
    }

    public void setStanowisko_pracy(String stanowisko_pracy) {
        Stanowisko_pracy = stanowisko_pracy;
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

    public int getPunktacja_z_dorobku_naukowego() {
        return punktacja_z_dorobku_naukowego;
    }

    public void setPunktacja_z_dorobku_naukowego(int punktacja_z_dorobku_naukowego) {
        this.punktacja_z_dorobku_naukowego = punktacja_z_dorobku_naukowego;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

    }
}
