import java.util.*;

public class EjercicioA {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese un numero a evaluar: ");

            try{
                long x = sc.nextLong();
                System.out.println(x + " puede ser almacenado en: ");

                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
                    System.out.println("(*) byte");
                }
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
                    System.out.println("(*) short");
                }
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
                    System.out.println("(*) int");
                }
                System.out.println("(*) long");
            }
            catch(Exception e) {
                System.out.println(sc.next() + " no puede ser almacenado en ningun lado");
            }

    }
}
