import java.util.Enumeration;
import java.util.Scanner;

public class Actividad_2 {

    final static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int opc;
        int num;

        do {

            opc = menu();

            switch (opc){

                case 1 -> {
                    System.out.println("Ultima cifra: ");
                    num = Actividad_1.dameUnNumero();
                    int ultimaCifra = ultimaCifra(num);
                    System.out.println(ultimaCifra);
                }
                case 2 -> {
                    num = Actividad_1.dameUnNumero();
                    int quitarUltimo = quitarUltimo(num);
                    System.out.println(quitarUltimo);
                }

            }

        }while(opc != 10);


    }

    public static int menu(){

        int opc;

        do {

            System.out.println("MENU\n1. Dame ultimo\n2. Quita ultimo\n3. Voltea numero\n4. Es capicua\n5. Muestra los capicuas" +
                    "\n6. Quita por detras (sin implimentar)\n7. De binario a decimal\n8. De binario a octal\n9. De binario a Hexadecimal" +
                    "\n10. Salir");
            opc = scan.nextInt();

        } while (opc < 1 || opc > 10);
        return opc;
    }



    private static int quitarUltimo(int entero) {
        int numero;

        if (entero < 10){
            numero = -1;
        } else {
            numero = entero%10;
        }
        return numero;
    }

    public static int ultimaCifra(int entero) {
        int ultimo = entero%10;
        return ultimo;
    }

}
