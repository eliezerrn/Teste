/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiraaplicacao;
import java.util.Scanner;
/**
 *
 * @author Eliezer
 */
public class PrimeiraAplicacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Olá mundo Java, eu sou a Manuela");
        System.out.println("==========================================" + "\n");
        Scanner teclado = new Scanner(System.in);
        String nome;
        int idade;
        int qtd = 0;
        
        System.out.println("Qual seu nome ?");
        nome = teclado.next();
        
        if(nome .equals("Eliezer")){
            System.out.println("Bem vindo " + nome + " qual é sua idade ?");
            idade = teclado.nextInt();
        
        
            while(true){
            
                if (qtd > 0)
                {
                    System.out.println("Vamos tentar novamente, Qual sua idade ?");
                    idade = teclado.nextInt();
                }

                if (idade == 30){
                    System.out.println("Legal, você já tem " +idade+" e pelo que me falaram,");
                    System.out.println("você é marido da Jéssica e pai do Henrique. Parabéns.");
                    break;
                }else
                {
                    if (qtd == 0)
                    {
                        System.out.println(nome + ", por favor, não tente me enganar.");
                    }
                    if (qtd == 1)
                    {
                        System.out.println(nome + ", quem você pensa que é ? estou ficando brava.");
                    }
                     if (qtd == 2)
                    {
                        System.out.println(nome + ", estou chateada com você. só vou valar contigo novamente");
                        System.out.println("depois que me falar a verdade.");
                    }
                }
                qtd += 1;
            }
        }
        else
        {
            System.out.println("Me desculpe "+nome+" eu só falo com o Eliezer. \n");
            System.out.println("Se você quiser falar comigo peça permição a ele.");
        }
    }
    
}
