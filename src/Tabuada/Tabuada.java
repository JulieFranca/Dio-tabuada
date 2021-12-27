package Tabuada;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        int entrada, resultant;
        int limite = 10;
        int contador = 0;


        System.out.println("Digite o Primeiro Valor");
        entrada = scan.nextInt();


    do{
        resultant = entrada * contador;
        System.out.println(entrada + "*" + contador + "=" + resultant + "\n");
        System.out.println();
        contador++;
    }while(contador <= limite);
    }
}