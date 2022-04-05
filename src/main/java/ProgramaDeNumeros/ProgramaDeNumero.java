/*

Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
muestre por pantalla separados por espacios. El programa pedirá entonces por
teclado dos valores y a continuación cambiará todas las ocurrencias del primer
valor por el segundo en la lista generada anteriormente.

*/
package ProgramaDeNumeros;

import java.util.Scanner;

/**
 *
 * @author SebasTati
 */

public class ProgramaDeNumero {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
       
        int[] numero = new int[100];
        int i, seguir = 0;
        
        do {
            
            System.out.print("\n TAMAÑO DEL ARREGLO: ");
            int tamaño = teclado.nextInt();

            for (i = 0; i < numero.length; i++) {

                numero[i] = (int) (Math.random() * 20);
                System.out.print(numero[i] + " ");

            }

            System.out.println("\nIntroduzca un numero de los que se ha mostrado: ");
            int valor1 = teclado.nextInt();

            System.out.println("\nIntroduzca un valor que reemplazara: ");
            int valor2 = teclado.nextInt();

            System.out.println();

            for (i = 0; i < numero.length; i++) {
                if (numero[i] == valor1) {
                    numero[i] = valor2;

                    System.out.print("\"" + numero[i] + "\" ");
                } else {
                    System.out.print(+numero[i] + " ");
                }
            }

            System.out.println("");
            System.out.println("Si quiere continuar preione: 1 , si desea salir presione: caulquier digito");
            seguir = sc.nextInt();

        }while (seguir == 1);
    }

}
