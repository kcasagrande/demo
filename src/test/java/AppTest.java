import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void testRomanOne() {
        int input = 1; // Étape 1 : initialisation
        String roman = App.toRoman(input); // Étape 2 : exécution
        assert(roman.equals("I")); // Étape 3 : vérification
    }
}
