import java.util.Scanner;

public class Ejercicio_07 {

    final static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int op;
        do {
            op = menu();

            switch (op){
                case 1 -> { //Multiplicar
                    System.out.println("Tabla de Multiplicar");
                    System.out.print("Introduce el numero a multiplicar: ");
                    int num = dameUnNumero();
                    tablaMultiplicar(num);
                }
                case 2 -> { //Saludar
                    System.out.println("Introduce un numero: ");
                    int rep = dameUnNumero();
                    String nombre = dameTexto();
                    saludar(nombre, rep);
                }
            }

        } while (op != 9);

    }


    /**
     * Esta funcion devuelve un menu en bucle
     * @return op
     */
    public static int menu() {
        //Inicializacion de Flujo de Trabajo

        //Declaracion de Variables
        int op;

        //Menu en bucle hasta salir con 9
        do {
            System.out.println("1. Tabla de multiplicar\n2. Saluda\n3. Numeros Primos\n4. Sumar n enteros\n" +
                    "5. Multiplicar n enteros\n6. Potencia\n7. Piramide\n8. Fibonacci\n9. Salir");
            op = scan.nextInt();

        } while ( op < 1 || op > 9);
        return op;
    }


    /**
     * Esta funcion devuelve un valor valido
     * @return numero
     */
    public static int dameUnNumero(){
        while (!scan.hasNextInt()){
            System.out.println("Entrada invalida. Porfavor ingresa un numero valido: ");
            scan.nextInt();
        }

        int numero = scan.nextInt();
        return numero;
    }


    /**
     * Esta funcion pide texto
     * @return nombre
     */
    public static String dameTexto(){
        System.out.println("Introduce el nombre: ");
        String nombre = scan.nextLine();
        return nombre;
    }


    /**
     * Esta funcion no devuelve nada, pero muestra una tabla de multiplicar
     * @param numero
     */
    public static void tablaMultiplicar(int numero){
        for (int i = 1; i <= 10; i++){
            System.out.println(i + " X " + numero + " = " + (i * numero));
        }
    }


    /**
     * Funcion para repetir saludos
     * @param nombre
     * @param repeteciones
     */
    public static void saludar(String nombre, int repeteciones){

        for (int i = 1; i <= repeteciones; i++){
            System.out.println("Hola " + nombre);
        }

    }
}