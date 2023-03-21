//Compara inteiros utilizando instruções if, operadores relacionais 
//e operadores de igualdade 
import java.util.Scanner; //programa utiliza a classe Scanner

public class Comparison {
    //método main inicia a execução do aplicativo Java
    public static void main(String[] args) {
        
        //cria Scanner para obter entrada a partir da linha de comando
        Scanner input = new Scanner(System.in);

        int number1; //primeiro número a comprar
        int number2; //segundo número a comprar

        System.out.println("Enter first integer: "); //prompt
        number1 = input.nextInt(); //lê o primeiro número fornecido pelo usuário

        System.out.println("Enter second integer"); //prompt
        number2 = input.nextInt(); //lê o segundo fornecido pelo usuário

        if (number1 == number2)
        System.out.printf("%d == %d%n", number1, number2);

        if(number1 != number2)
        System.out.printf("%d != %d%n", number1, number2);

        if(number1 < number2)
        System.out.printf("%d < %d%n", number1, number2);

        if(number1 > number2)
        System.out.printf("%d > %d%n", number1, number2);

        if(number1 <= number2)
        System.out.printf("%d <= %d%n", number1, number2);

        if(number1 >= number2)
        System.out.printf("%d >= %d%n", number1, number2);
    } //fim do método main
    
}//fim da classe Comparison


/*
 * Operadores                  Associatividade                 Tipo
 *   * / %                     da esquerda para a direita      Multiplicativo
 *   +   -                     da esquerda para a direita      Aditivo
 *   <   <=  > >=              da esquerda para a direita      Relacional
 *   ==  !=                    da esquerda para a direita      Igualdade
 *    =                        da direita para a esquerda      Atribuição
 */



 /*
  *                             Aritmética                          
  * Os operadores aritméticos são + (adição), - (subtração), *(multiplicação), /(divisão) e % (resto.)
  *A divisão de inteiros produz um quociente com inteiros.
  * O Operador de resto % fornece o resto depois da divisão.
  *As expressões aritméticas devem ser escritas em forma de linha reta.
  *As expressões aritméticas devem ser escritas em forma de linha reta.
  *Se uma expressão contém parênteses aninhados, o conjunto mais interno é avaliado primeiro.
  *O Java aplica os operadores a expressões aritméticas em uma sequência precisa determinada pelas regras de precedência de operador.
  *Quando dizemos que operadores são aplicados da esquerda para a direita, estamos nos referindo à sua associatividade. Alguns operadores
      associam da direita para a esquerda.
   *Parênteses redundantes podem tornar uma expressão mais clara.
  */