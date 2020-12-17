package com.company;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Kurs implements Externalizable {

    public String nazwa_kursu, prowadzacy;
    public int punkty_ETC;

    @Override
    public String toString() {
        return "Kurs{" +
                "nazwa_kursu='" + nazwa_kursu + '\'' +
                ", prowadzacy='" + prowadzacy + '\'' +
                ", punkty_ETC=" + punkty_ETC +
                '}';
    }

    public Kurs(String nazwa_kursu, String prowadzacy, int punkty_ETC) {
        this.nazwa_kursu = nazwa_kursu;
        this.prowadzacy = prowadzacy;
        this.punkty_ETC = punkty_ETC;
    }

    public Kurs() {
        this.nazwa_kursu = "";
        this.prowadzacy = "";
        this.punkty_ETC = 0;
    }

    public String getNazwa_kursu() {
        return nazwa_kursu;
    }

    public void setNazwa_kursu(String nazwa_kursu) {
        this.nazwa_kursu = nazwa_kursu;
    }

    public String getProwadzacy() {
        return prowadzacy;
    }

    public void setProwadzacy(String prowadzacy) {
        this.prowadzacy = prowadzacy;
    }

    public int getPunkty_ETC() {
        return punkty_ETC;
    }

    public void setPunkty_ETC(int punkty_ETC) {
        this.punkty_ETC = punkty_ETC;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

    }
}
