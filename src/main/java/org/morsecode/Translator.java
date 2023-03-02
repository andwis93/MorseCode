package org.morsecode;

public class Translator {

    Dictionary dictionary = new Dictionary();

    public String translateToLatin(String morseCode) {
        String[] theMorse = morseCode.split(" ");
        StringBuilder translation= new StringBuilder();
        for(String morse: theMorse){
            translation.append(returnLatin(morse));
        }
        return translation.toString();
    }

    public String translateToMorse(String latinWords) {
        String[] theLatin = latinWords.split("");
        StringBuilder translation= new StringBuilder();
        for(String letter: theLatin){
            translation.append(returnMorse(letter));
        }
        return translation.toString();
    }

    private String returnLatin(String morse) {
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
        latin = latin.toUpperCase();
        if (dictionary.getDictionary().containsKey(latin)) {
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
