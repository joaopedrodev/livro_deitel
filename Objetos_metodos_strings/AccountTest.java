package Objetos_metodos_strings;
//cria e manipula um objeto Account.
import java.util.Scanner;
public class AccountTest {
    public static void main(String[] args) {
        
        //cria um objeto Scanner para obter  entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        //cria um objeto Account  e o atribui a variável myAccount
        Account myAccount = new Account();

        //exibe o valor inicial do nome (null)
        System.out.printf("Initial name is: %s%n%n", myAccount.getName());

        //solicita e lê o nome
        System.out.println("Please enter the name: ");
        String theName = input.nextLine(); //lê uma linha de texto 
        myAccount.setName(theName); //insere theName em myAccount
        System.out.println(); //gera saida de uma linha em branco

        //exibe o nome armazenando no objeto myAccount
        System.out.printf("Name in object myAccount is %n%s%n", myAccount.getName());


    }
    
}//fim da classe AccountTest

/*
 * O método nextLine lê os caracteres (incluindo o de espaço em branco, como em
"Jane Green") até encontrar a nova linha, então retorna uma String contendo os caracteres até, mas não incluindo, a nova linha,
que é descartada.

 */
