
package Aula1;

import java.util. Scanner;


public class Exercicio2 {
    
      
public int ano;

public void leitura () {
    
    Scanner leitor = new Scanner (System.in);
    
    System.out.println("\n Digite o ano:");
    ano = leitor.nextInt(); }

public void executar () {
   
    
    if(ano % 4 == 0) {
        String mensagem = ("\n " + ano +" é um ano bissexto"); 
        System.out.println (mensagem); }
                
    else {
        System.out.println("\n " + ano +" não é um ano bissexto");}
 
}
public static void main (String args []) {
    
    Scanner leitor = new Scanner (System.in);
    Exercicio2 ex2 = new Exercicio2 ();
    
    System.out.println ("\n Digite o ano:");
    ex2.ano = leitor.nextInt();
    ex2.executar();
    
    System.exit(0); }}
    
       


   
   
    

  
