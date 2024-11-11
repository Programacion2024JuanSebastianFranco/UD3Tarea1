import java.util.Scanner;

public class Actividad_1 {

    static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int op;
        do {
            op = menu();

            switch (op) {
                case 1 -> { //Multiplicar
                    System.out.println("Tabla de Multiplicar");
                    int num = dameUnNumero();
                    tablaMultiplicar(num);
                }
                case 2 -> { //Saludar
                    int rep = dameUnNumero();
                    String nombre = dameTexto();
                    saludar(nombre, rep);
                }
                case 3 -> { //Numero Primo

                    int num = dameUnNumero();
                    mostarPrimos(num);

                }
                case 4 -> { //Sumar numeros
                    System.out.println("Suma de Enteros");
                    int num = dameUnNumero();
                    int suma = sumar(num);
                    System.out.println("La suma total de " + num + " numeros enteros son: " + suma);

                }
                case 5 -> { //Multiplicar Enteros

                    System.out.println("Multiplicacion de Enteros");
                    int num = dameUnNumero();
                    int multi = multiplicar(num);
                    System.out.println("La multiplicacion total de " + num + " numeros enteros son: " + multi);

                }
                case 6 -> { //Potencia numeros
                    int num1 = dameUnNumero();
                    int num2 = dameUnNumero();
                    potencia(num1, num2);

                }
                case 7 -> { // Piramide

                    int num = dameUnNumero();
                    String simbolo = simbolo();
                    piramide(num,simbolo);
                }
                case 8 -> { // Seri Fibonnacci

                    int num = dameUnNumero();
                    fibonacci(num);
                }
            }

        } while (op != 9);

    }


    /**
     * Esta funcion devuelve un menu en bucle
     *
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

        } while (op < 1 || op > 9);
        return op;
    }


    /**
     * Esta funcion devuelve un valor valido
     *
     * @return numero
     */
    public static int dameUnNumero() {
        System.out.println("Introduce un numero: ");
        while (!scan.hasNextInt()) {
            System.out.println("Entrada invalida. Porfavor ingresa un numero valido: ");
            scan.next();
        }

        int numero = scan.nextInt();
        return numero;
    }


    /**
     * Esta funcion pide texto (La funcion no funciona, no tengo idea porque)
     *
     * @return nombre
     */
    public static String dameTexto() {
        System.out.println("Introduce el nombre: ");
        String nombre = scan.nextLine();
        return nombre;
    }


    /**
     * Aqui se pide un simbolo para hacer la piramide (EL string no sirve por lo tanto la piramide tampoco)
     * @return simbolo
     */
    public static String simbolo() {
        System.out.println("Introduce el simbolo: ");
        String simbolo = scan.nextLine();
        return simbolo;
    }


    /**
     * Esta funcion no devuelve nada, pero muestra una tabla de multiplicar
     *
     * @param numero
     */
    public static void tablaMultiplicar(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " X " + numero + " = " + (i * numero));
        }
    }


    /**
     * Funcion para repetir saludos
     *
     * @param nombre
     * @param repeteciones
     */
    public static void saludar(String nombre, int repeteciones) {

        for (int i = 1; i <= repeteciones; i++) {
            System.out.println("Hola " + nombre);
        }

    }


    /**
     * Aqui revisa si un numero es primo o no
     * @param numero
     */
    public static boolean numeroPrimo(int numero) {
        boolean esPrimo = true;

        if (numero < 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                }
            }
        }
        return esPrimo;
    }


    /**
     * Aqui nos devuelve los numeros primos hasta donde el usuario pide
     * @param cantidad
     */
    public static void mostarPrimos(int cantidad) {
        int contador = 0;
        int numero = 2;

        System.out.println("Primeros " + cantidad + " numeros primos: ");

        while (contador < cantidad) {
            if (numeroPrimo(numero)) {
                System.out.print(numero + " ");
                contador++;
            }
            numero++;
        }
        System.out.println(" ");
    }


    /**
     * En este suma y devuelve el total
     * @param primero
     * @return suma
     */
    public static int sumar(int primero) {
        int suma = 0;

        for (int i = 1; i <= primero; i++){
            suma+= i;
        }
        return suma;
    }


    /**
     * En este multiplica y devuelve el valor
     * @param primero
     * @return multiplicar
     */
    public static int multiplicar(int primero) {
        int multiplicar = 1;

        for (int i = 1; i <= primero; i++){
            multiplicar*= i;
        }
        return multiplicar;
    }


    /**
     * Aqui potenciamos el numero hasta la potencia deseadq
     * @param primero
     * @param segundo
     */
    public static void potencia(int primero, int segundo){

        int resultado = 1;

        for (int i = 0; i < segundo; i++){
            resultado*=primero;
        }
        System.out.println("El resultado de " + primero + " elevado a " + segundo + " da como resultado: " + resultado);
    }


    /**
     * En este bloque hacemos la piramide y la imprimimos
     * @param numero
     * @param simbolo
     */
    public static void piramide(int numero,String simbolo){

        for (int i = 1; i <= numero; i++){
            for (int j = 1; j <= i; j++){
                System.out.println(simbolo);
            }
            System.out.println();
        }
    }


    /**
     * Por ultimo, aqui generamos e imprimimos la serie de fibonacci
     * @param numero
     */
    public static void fibonacci(int numero){

        int num = 0;
        int num2 = 1;
        int num3 = 0;

        System.out.print("0" + " 1 ");

        for (int i = 2; i < numero; i++){

            num3 = num + num2;
            num = num2;
            num2 = num3;
            System.out.print(num3 + " ");
        }
        System.out.println();
    }
}