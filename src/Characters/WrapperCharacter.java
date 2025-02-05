package Characters;

public class WrapperCharacter {
    public static void main(String[] args) {
        boolean isLetter = Character.isLetter('A'); // esLetra = true
        boolean isDigit = Character.isDigit('5'); // esDigito = true
        boolean isWhiteSpace = Character.isWhitespace(' '); // esEspacio = true
        char upperText = Character.toUpperCase('a'); // mayuscula = 'A'
        char lowerText = Character.toLowerCase('A'); // minuscula = 'a'

        System.out.println("Es letra: " + isLetter);
        System.out.println("Es dígito: " + isDigit);
        System.out.println("Es espacio: " + isWhiteSpace);
        System.out.println("Mayúscula: " + upperText);
        System.out.println("Minúscula: " + lowerText);
    }
}
