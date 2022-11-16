import java.util.Scanner;
class ex3{
public static void main(String[] args) {
   /*Implemente um programa em Java que a partir de um número informado pelo
usuário, calcule seu triplo e apresente ao usuário */

Scanner ler = new Scanner(System.in);
int valor = 0;
int triplo = 0;

    System.out.println("Este programa triplica o valor que você inserir.");
    System.out.println("Digite o valor:");
      valor = ler.nextInt();
      triplo = valor * 3;
    System.out.println("O triplo de "+valor+ " é "+triplo);
    
}
}