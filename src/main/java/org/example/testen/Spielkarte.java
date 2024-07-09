package org.example.testen;

public class Spielkarte {
    private final KartenWert wert;
    private final KartenFarbe farbe ;

    public Spielkarte(KartenWert wert, KartenFarbe farbe) {
        this.wert = wert;
        this.farbe = farbe;
    }

    public int getPunkte() {
        return wert.getWert();
    }

    public KartenFarbe getFarbe() {
        return farbe;
    }
}
