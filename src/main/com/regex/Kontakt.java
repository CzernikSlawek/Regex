package main.com.regex;

public class Kontakt {
    private String imie;
    private String nazwisko;
    private String adres;
    private String telefon;

    public Kontakt(String imie, String nazwisko, String adres, String telefon) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.telefon = telefon;
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

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;

    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return "Kontakt{" +
                "imie='" + imie + "\'" +
                ", nazwisko='" + nazwisko + "\'" +
                ", adres='" + adres + "\'" +
                ", telefon='" + telefon + "\'" +
                '}';
    }
}
