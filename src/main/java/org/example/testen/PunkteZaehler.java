package org.example.testen;

import java.util.List;

public class PunkteZaehler {

    public int getSummePunkte (List<Spielkarte> skatkarten) {
        return skatkarten.stream().mapToInt(k -> k.getPunkte()).sum();
    }

    public int getSummePunkteFuerFarbe (KartenFarbe farbe, List<Spielkarte> skatkarten) {
        return skatkarten.stream().filter(k -> k.getFarbe() == farbe).mapToInt(k -> k.getPunkte()).sum();
    }

}
