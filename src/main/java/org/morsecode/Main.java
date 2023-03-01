package org.morsecode;

public class Main {
    public static void main(String[] args) {
        Translator translator = new Translator();
        translator.translateToLatin(".... . .-.. .-.. --- _ . ...- . .-. -.-- # -... --- -.. ...-- -.-- ");
        translator.translateToMorse("HELLO EVERY#BOD3Y");
    }
}