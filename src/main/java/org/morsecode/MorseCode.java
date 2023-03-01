package org.morsecode;

public class MorseCode {
    public static void main(String[] args) {
        Translator translator = new Translator();
        translator.translateToLatin(".... . .-.. .-.. --- _ . ...- . .-. -.-- # -... --- -.. ...-- -.-- ");
        translator.translateToMorse("HELLO EVERY#BOD3Y");
    }
}