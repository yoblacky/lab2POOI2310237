import java.util.*;

public class EjercicioC {
    public static void main(String[] args) {
        double currentSalary;
        double rating = 0;
        double raise = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print ("Ingrese el salario actual: ");
        currentSalary = sc.nextDouble();

        System.out.print ("Ingrese la calificación de desempeño: ");
        rating = sc.nextDouble();

        if(rating == 3){
            raise = currentSalary * (0.015);
        }else if (rating == 2){
            raise = currentSalary * (0.04);
        }else if (rating == 1){
            raise = currentSalary * (0.06);
        }

        double newSalary = currentSalary + raise;

        System.out.println ("Amount of your raise: $" + raise);
        System.out.println ("Your new salary: $" + newSalary);
    }
}
