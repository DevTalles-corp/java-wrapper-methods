package Integers;

public class WrapperInteger {

    public static void main(String[] args) {
        // Ejemplos con Integer
        int number = Integer.parseInt("123"); // número = 123
        System.out.println("El valor de 'number' es: " + number);

        Integer wrapper = Integer.valueOf("123"); // wrapper = 123 (como Integer)
        System.out.println("El valor de 'wrapper' es: " + wrapper);

        String text = Integer.toString(123); // texto = "123"
        System.out.println("El valor de 'text' es: " + text);

        int result = Integer.compare(10, 20); // resultado = -1 (porque 10 < 20)
        System.out.println("El resultado de 'Integer.compare(10, 20)' es: " + result);

        int max = Integer.max(10, 20); // max = 20
        System.out.println("El valor de 'max' es: " + max);

        int min = Integer.min(10, 20); // min = 10
        System.out.println("El valor de 'min' es: " + min);

        // Ejemplos con Byte
        byte number2 = Byte.parseByte("127"); // número = 127
        System.out.println("El valor de 'number2' es: " + number2);

        Byte wrapper2 = Byte.valueOf("127"); // wrapper = 127 (como Byte)
        System.out.println("El valor de 'wrapper2' es: " + wrapper2);

        String text2 = Byte.toString((byte) 127); // texto = "127"
        System.out.println("El valor de 'text2' es: " + text2);

        // Ejemplos con Short
        short number3 = Short.parseShort("32000"); // número = 32000
        System.out.println("El valor de 'number3' es: " + number3);

        Short wrapper3 = Short.valueOf("32000"); // wrapper = 32000 (como Short)
        System.out.println("El valor de 'wrapper3' es: " + wrapper3);

        String text3 = Short.toString((short) 32000); // texto = "32000"
        System.out.println("El valor de 'text3' es: " + text3);

        // Ejemplos con Long
        long number4 = Long.parseLong("123456789"); // número = 123456789
        System.out.println("El valor de 'number4' es: " + number4);

        Long wrapper4 = Long.valueOf("123456789"); // wrapper = 123456789 (como Long)
        System.out.println("El valor de 'wrapper4' es: " + wrapper4);

        String text4 = Long.toString(123456789L); // texto = "123456789"
        System.out.println("El valor de 'text4' es: " + text4);
    }

}
