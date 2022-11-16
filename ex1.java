import java.util.Scanner;
 class ex1{
public static void main(String[] args){
/*Implemente um programa em Java que a partir de dois números informados pelo
usuário, calcule sua soma e apresente ao usuário. */

Scanner ler = new Scanner(System.in);
int valor1=0;
int valor2=0;
int soma=0;

   System.out.println("Digite o primeiro valor:");
      valor1 = ler.nextInt();
   System.out.println("Digite o segundo valor:");
      valor2 = ler.nextInt();
      soma = valor1 + valor2;
 System.out.println("A soma de "+valor1+ " + " +valor2+ " é  = " +soma);
}
}
