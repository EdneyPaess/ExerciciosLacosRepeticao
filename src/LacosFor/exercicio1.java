package LacosFor;

import java.util.Scanner;

public class exercicio1 {
  public static void main(String[] args) {
    int numero1, numero2;
    Scanner entrada= new Scanner(System.in);

    System.out.println("Digite um mumero: ");
    numero1 = entrada.nextInt();
    System.out.println("Digite um mumero maior que o numero anterior: ");
    numero2 = entrada.nextInt();

    if(numero1 >= numero2){
      System.out.println("Intervalo invalido");
    } 

    for(int i = numero1; i < numero2 ; i++ ){
      if( i % 3 == 0 && i % 5==0){
        System.out.println("\n" +i+": Multiplo de 3 e 5");

      }
      
    }
  }
}

