import org.junit.jupiter.api.Test;
import org.morsecode.Translator;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MorseCodeTestSuite {
    private final Translator translator = new Translator();

    @Test
    void testTranslateToLatin() {
        //Given
        String morse = ".... . .-.. .-.. --- _ . ...- . .-. -.-- # -... --- -.. ...-- -.-- ";
        //When
        String latin = translator.translateToLatin(morse);
        //Then
        assertEquals("HELLO EVERY#BOD3Y", latin);

    }

    @Test
    void testTranslateToMorse() {
        //Given
        String latin = "HELLO EVERY#BOD3Y";
        //When
        String morse = translator.translateToMorse(latin);
        //Then
        assertEquals(".... . .-.. .-.. --- _ . ...- . .-. -.-- # -... --- -.. ...-- -.-- ", morse);
    }
}
