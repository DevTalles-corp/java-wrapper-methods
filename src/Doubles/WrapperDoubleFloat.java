package Doubles;

public class WrapperDoubleFloat {
    public static void main(String[] args) {
        // Ejemplos con Double
        double number = Double.parseDouble("3.14"); // número = 3.14
        System.out.println("El valor de 'number' es: " + number);

        Double wrapper = Double.valueOf("3.14"); // wrapper = 3.14 (como Double)
        System.out.println("El valor de 'wrapper' es: " + wrapper);

        int result = Double.compare(3.14, 2.71); // resultado = 1 (porque 3.14 > 2.71)
        System.out.println("El resultado de 'Double.compare(3.14, 2.71)' es: " + result);

        String text = Double.toString(3.24f); // texto = "3.24"
        System.out.println("El valor de 'text' es: " + text);



        // Ejemplos con Float
        float number2 = Float.parseFloat("3.14"); // número = 3.14
        System.out.println("El valor de 'number2' es: " + number2);

        Float wrapper3 = Float.valueOf("3.14"); // wrapper = 3.14 (como Float)
        System.out.println("El valor de 'wrapper3' es: " + wrapper3);

        String text2 = Float.toString(3.14f); // texto = "3.14"
        System.out.println("El valor de 'text2' es: " + text2);
    }

}
