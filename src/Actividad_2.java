import java.util.Enumeration;
import java.util.Scanner;

public class Actividad_2 {

    final static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int opc;
        int num;

        do {

            opc = menu();

            switch (opc) {

                case 1 -> { //Ultima cifra
                    System.out.println("Ultima cifra: ");
                    num = Actividad_1.dameUnNumero();
                    int ultimaCifra = ultimaCifra(num);
                    System.out.println(ultimaCifra);
                }
                case 2 -> { //Quitar Ultimo numero
                    num = Actividad_1.dameUnNumero();
                    int quitarUltimo = quitarUltimo(num);
                    System.out.println(quitarUltimo);
                }
                case 3 -> { //Voltear Numeros
                    num = Actividad_1.dameUnNumero();
                    int voltearNum = voltearNum(num);
                    System.out.println(voltearNum);
                }
                case 4 -> {
                    num = Actividad_1.dameUnNumero();
                    boolean capicua = capicua(num);
                    if (capicua == true) {
                        System.out.println("tu numero es capicuo");
                    } else {
                        System.out.println("Tu numero no es capicuo");
                    }
                }
                case 5 -> {
                    num = Actividad_1.dameUnNumero();
                    listCapicua(num);
                }
                case 6 -> {
                    num = Actividad_1.dameUnNumero();

                }
                case 7 -> {
                    num = Actividad_1.dameUnNumero();
                    int binario = binarioToDecimal(num);
                    System.out.println(binario);

                }
                case 8 -> {
                    num = Actividad_1.dameUnNumero();

                }
                case 9 -> {
                    num = Actividad_1.dameUnNumero();

                }
                default -> System.out.println("Hasta Luego");

            }

        } while (opc != 10);


    }

    public static int menu() {

        int opc;

        do {

            System.out.println("MENU\n1. Dame ultimo\n2. Quita ultimo\n3. Voltea numero\n4. Es capicua\n5. Muestra los capicuas" +
                    "\n6. Quita por detras (sin implementar)\n7. De binario a Decimal\n8. De binario a Octal\n9. De binario a Hexadecimal" +
                    "\n10. Salir");
            opc = scan.nextInt();

        } while (opc < 1 || opc > 10);
        return opc;
    }

    public static int voltearNum(int entero) {
        int num;
        int invertido = 0;
        int resto;

        num = entero;

        while (num > 0) {
            resto = num % 10;
            invertido = invertido * 10 + resto;
            num /= 10;
        }

        return invertido;
    }


    public static boolean capicua(int entero) {
        boolean esCapicua = false;
        int num = entero;
        int volt = voltearNum(entero);

        if (num == volt) {
            esCapicua = true;
        }

        return esCapicua;
    }


    public static int quitarUltimo(int entero) {
        int numero;

        if (entero < 10) {
            numero = -1;
        } else {
            numero = entero / 10;
        }
        return numero;
    }


    public static int ultimaCifra(int entero) {
        int ultimo = entero % 10;
        return ultimo;
    }


    public static void listCapicua(int entero) {
        int capicuas = 10;
        int contador = 0;

        while (contador < entero) {
            if (capicua(capicuas)) {
                System.out.print(capicuas + " ");
                contador++;
            }
            capicuas++;
        }

        System.out.println();
    }


    public static int binarioToDecimal(int entero) {
        int rest = 0;
        int ultimo;
        int contExp = 0;

        do {
            ultimo = ultimaCifra(entero);
            entero = quitarUltimo(entero);

            if (ultimo == 1){
                rest += Actividad_1.potencia(2, contExp);
            }
            contExp++;
        } while(entero != -1);

        return rest;
    }


    public static void binarioToOctal (int entero){



    }

}
