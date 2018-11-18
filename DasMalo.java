/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file,#######################   Solo DasuMalo       ################ choose Tools | Templates
 * and open the template in the editor. System.out.println("\n");
 */
package perreo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Daus Malo (Marmolejo Lopez Dario Usiel)
 */
public class DasMalo {/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
                
        int opcion = 5,i=0;
        String palabras[] = new String[21];
        String suport;
        String strong;
        String datab;
        int place=0;
        int ghost;
        
        while (!salir) {
            System.out.println("1.   Agregar");
            System.out.println("2.   buscar");
            System.out.println("3.   eliminar");
            System.out.println("4.   Listar");
            System.out.println("5.   Salir");

            try {

                System.out.println("Escribe alguna de las opciones");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("n");
                        System.out.println("has seleccionado la opcion 1");
                        System.out.println("\n");
                        
                        for ( i=0;i < 20;i++) {
                            System.out.println("\n");
                        
                            System.out.println((i + 1) + ". Escribe una palabra");
                            suport=sc.next();
                            if(i<20){
                            palabras[i] = suport;
                        }else{
                            System.out.println("No hay espacio.....");
                        }
                        }
                    break;

                case 2:
                    System.out.println("\n");
                    System.out.println(" buscar en el arreglo");
                    System.out.println("\n");
                    datab = sc.next();
                    place = 1;
                    while (place <= i && !datab.equalsIgnoreCase(palabras[place])) {
                        place= place + 1;
                    }
                    if (place> i) {
                        System.out.println("\n");
                        System.out.println("-El valor " + datab + " No esta en el arreglo -");
                        System.out.println("\n");
                    } else {
                        System.out.println("\n");
                        System.out.println("-El valor " + datab + " Esta la posición " + place);
                        System.out.println("\n");
                    }
                    break;
                case 3:
                    System.out.println("\n");
                    System.out.println("--Escribe un dato a eliminar del arreglo--");
                    System.out.println("\n");
                    strong = sc.next();
                    place = 1;
                    while (place <= i && !strong.equalsIgnoreCase(palabras[place])) {
                        place = place + 1;
                    }
                    if (place > i) {
                        System.out.println("\n");
                        System.out.println("-Lo siento el dato que ingresaste que es  " + strong + "  No existe en el arreglo-");
                        System.out.println("\n");
                    } else {
                        for (ghost= place; ghost< i; ghost++) {
                            palabras[ghost] = palabras[ghost + 1];
                        }
                        i = i - 1;
                    }
                    break;
                case 4:
                    System.out.println("\n");
                    System.out.println("--Haz enlistado tus Datos agregados--");
                    System.out.println("\n");
                    ghost = 1;
                    for (ghost = 1; ghost<= i; ghost++) {
                        System.out.println("\n");
                        System.out.println(palabras[ghost]);
                        System.out.println("\n");
                    }
                    break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("\n");
                        System.out.println("Solo numeros entre el 1 y el 5");
                        System.out.println("\n");

                }

            } catch (InputMismatchException e) {
                System.out.println("\n");
                System.out.println("Debes de insertar un numero");
                System.out.println("\n");
                sc.next();

            }
        }
    }

}

    

