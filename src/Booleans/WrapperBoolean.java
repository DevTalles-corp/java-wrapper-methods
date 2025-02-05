package Booleans;

public class WrapperBoolean {
    public static void main(String[] args) {

        boolean value = Boolean.parseBoolean("true"); // valor = true
        System.out.println("El valor de 'value' es: " + value);

        Boolean wrapper = Boolean.valueOf("true"); // wrapper = true (como Boolean)
        System.out.println("El valor de 'wrapper' es: " + wrapper);

        String text = Boolean.toString(true); // texto = "true"
        System.out.println("El valor de 'text' es: " + text);

        boolean result = Boolean.logicalAnd(true, false); // resultado = false
        System.out.println("El resultado de 'Boolean.logicalAnd(true, false)' es: " + result);

        boolean result2 = Boolean.logicalOr(true, false); // resultado = true
        System.out.println("El resultado de 'Boolean.logicalOr(true, false)' es: " + result2);

    }
}
