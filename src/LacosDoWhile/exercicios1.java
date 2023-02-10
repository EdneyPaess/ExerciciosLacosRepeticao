package LacosDoWhile;

import java.util.Scanner;

public class exercicios1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numero, resultado = 0;

    do{
      System.out.print("Digite um número: ");
      numero = scanner.nextInt();
      if (numero > 0) {
        resultado += numero;
      }
    }while(numero !=0);
    System.out.println("A soma dos números positivos digitados é: " + resultado);
  
  }
}
