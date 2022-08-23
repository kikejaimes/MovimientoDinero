import java.util.Scanner;

    public class MoviDinero {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            String usuario;
            double montoMovimiento;

            System.out.println("Ingrese el nombre de usuario");
            usuario = sc.nextLine();

            System.out.println("Ingrese saldo de cuenta");
            montoMovimiento = sc.nextDouble();


            System.out.println("el usuario " + usuario + "realizo un moviento de "+ montoMovimiento);
        }

    }





}
