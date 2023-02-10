package LacosWhile;

import java.util.Scanner;

public class Exercicio1 {
  public static void main(String[] args) {
    Scanner leia =  new Scanner(System.in);
    int idade,idadeMenor=0,idadeMaior=0;

    System.out.println("Digite sua idade: ");
    idade = leia.nextInt();

    while(idade >= 0 ){
      if(idade < 21){
      idadeMenor++;

      } if(idade > 50){
        idadeMaior++;
        
      }
      System.out.println("Digite sua idade: ");
      idade = leia.nextInt();
    }
    System.out.println("Total de pessoas maiores de 50 anos: "+idadeMenor);
    System.out.println("Total de pessoas maiores de 50 anos: "+idadeMaior);
  }
}
