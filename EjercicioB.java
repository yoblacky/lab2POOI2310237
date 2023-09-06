import java.util.*;

public class EjercicioB {
    public static void main(String[] args) {

        System.out.println("Ingrese un numero a evaluar: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if(n % 2 != 0){
            System.out.println("Luna");

        }else{
            if(2 <= n && n <= 5){
                System.out.println("Sol");
            }else if(6 <= n && n <= 20){
                System.out.println("Tierra");
            }else if(20 < n){
                System.out.println("Galaxia");
            }
        }

        sc.close();

    }
}
