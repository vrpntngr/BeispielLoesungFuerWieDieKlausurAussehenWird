package org.example.testen;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PunkteZaehlerTest {
    // TODO schreiben Sie die fehlenden Tests

    private PunkteZaehler p = new PunkteZaehler();

    @Test
    public void leereListeSindNullPunkte() {
        int punkte = p.getSummePunkte(new ArrayList<>());
        assertEquals(0, punkte);
    }

    @Test
    public void listeMitEinerKarte() {
        List<Spielkarte> input = Arrays.asList(
                new Spielkarte(KartenWert.ASS, KartenFarbe.HERZ)
        );
        int punkte = p.getSummePunkte(input);
        assertEquals(11, punkte);
    }

    @Test
    public void listeMitMehrerenKarten() {
        List<Spielkarte> input = Arrays.asList(
                new Spielkarte(KartenWert.ASS, KartenFarbe.HERZ),
                new Spielkarte(KartenWert.BUBE, KartenFarbe.PIK),
                new Spielkarte(KartenWert.ACHT, KartenFarbe.KARO)
        );
        int punkte = p.getSummePunkte(input);
        assertEquals(13, punkte);
    }

    @Test
    public void listeMitGleichenKarten() {
        List<Spielkarte> input = Arrays.asList(
                new Spielkarte(KartenWert.ASS, KartenFarbe.HERZ),
                new Spielkarte(KartenWert.ASS, KartenFarbe.HERZ),
                new Spielkarte(KartenWert.ACHT, KartenFarbe.KARO)
        );
        int punkte = p.getSummePunkte(input);
        assertEquals(22, punkte);
    }

    @Test
    public void leereListeSindNullPunkteEineFarbe() {
        int punkte = p.getSummePunkteFuerFarbe(KartenFarbe.HERZ, new ArrayList<>());
        assertEquals(0, punkte);
    }

    @Test
    public void listeMitEinerKarteRichtigeFarbe() {
        List<Spielkarte> input = Arrays.asList(
                new Spielkarte(KartenWert.ASS, KartenFarbe.HERZ)
        );
        int punkte = p.getSummePunkteFuerFarbe(KartenFarbe.HERZ, input);
        assertEquals(11, punkte);
    }

    @Test
    public void listeMitEinerKarteAndereFarbe() {
        List<Spielkarte> input = Arrays.asList(
                new Spielkarte(KartenWert.ASS, KartenFarbe.PIK)
        );
        int punkte = p.getSummePunkteFuerFarbe(KartenFarbe.HERZ, input);
        assertEquals(0, punkte);
    }

    @Test
    public void listeMitMehrerenKartenMitVerschiedenenFarben() {
        List<Spielkarte> input = Arrays.asList(
                new Spielkarte(KartenWert.ASS, KartenFarbe.HERZ),
                new Spielkarte(KartenWert.BUBE, KartenFarbe.PIK),
                new Spielkarte(KartenWert.ACHT, KartenFarbe.KARO)
        );
        int punkte = p.getSummePunkteFuerFarbe(KartenFarbe.PIK, input);
        assertEquals(2, punkte);
    }

    @Test
    public void listeMitGleichenKartenInRichtigerFarbe() {
        List<Spielkarte> input = Arrays.asList(
                new Spielkarte(KartenWert.ASS, KartenFarbe.HERZ),
                new Spielkarte(KartenWert.ASS, KartenFarbe.HERZ),
                new Spielkarte(KartenWert.ASS, KartenFarbe.KARO)
        );
        int punkte = p.getSummePunkteFuerFarbe(KartenFarbe.HERZ, input);
        assertEquals(22, punkte);
    }

}