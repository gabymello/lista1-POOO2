
package capturadestring;

import java.util.Scanner;


public class Saudacao {
  private String nome;   
 
 public void lerNome(){
     Scanner sc = new Scanner(System.in);
     System.out.println("Digite seu nome:");
     this.nome = sc.nextLine();
     sc.close();  
 } 
  public void exibirSaudacao(){
      System.out.println("Olá, " + nome + "! Bem-vindo ao programa.");
  }
}


