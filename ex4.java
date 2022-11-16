import java.util.Scanner;
class ex4{
public static void main(String[] args) {
      /*Implemente um programa em Java que a partir de um número informado pelo
usuário, calcule sua metade e apresente ao usuário. */

Scanner ler = new Scanner (System.in);
double valor = 0;
double metade = 0;

   System.out.println("Esse programa recebe um valor e divide pela metade.");
   System.out.println("Digite um valor:");
      valor = ler.nextDouble();
      metade = valor / 2;
  System.out.println("A metade de "+valor+ " é " +metade);  
}
}