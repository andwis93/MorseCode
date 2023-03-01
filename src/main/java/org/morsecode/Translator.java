package org.morsecode;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public class Translator {
    Dictionary dictionary = new Dictionary();

    public void translateToLatin(String morseCode) {
        String[] theMorse = morseCode.split(" ");
        AtomicReference<String> word = new AtomicReference<>("");
        Arrays.stream(theMorse).forEach(morse ->
                word.updateAndGet(letter -> letter + returnLetter(morse))
        );
        System.out.println(word.get());
    }

    public void translateToMorse(String latinWords) {
        String[] theLatin = latinWords.split("");
        AtomicReference<String> word = new AtomicReference<>("");
        Arrays.stream(theLatin).forEach(latin ->
                word.updateAndGet(letter -> letter + returnMorse(latin))
        );
        System.out.println(word.get());
    }

    private String returnLetter(String morse) {
        dictionary.createForLatin();
        if (dictionary.getDictionary().containsKey(morse)) {
            return dictionary.getDictionary().get(morse);
        } else {
            if(morse.equals("_")) {
                return " ";
            } else {
                return morse;
            }
        }
    }

    private String returnMorse(String latin) {
        dictionary.createForMorse();
        latin = latin.toUpperCase();
        if (dictionary.getDictionary().containsValue(latin)) {
            return dictionary.getDictionary().get(latin) + " ";
        } else {
            if(latin.equals(" ")) {
                return "_ ";
            } else {
                return latin + " ";
            }
        }
    }
}
