import java.util.Scanner;

public class Idade{
    
public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Verificador de Maior-Idade");
   System.out.println();

   System.out.print("Insira sua Idade:");
  int idade = sc.nextInt();
  

 if(idade >= 18) {
 if(idade>=60) {

 System.out.println("Essa Pessoa é idosa.");
 } else {
    System.out.println( "A pessoa não é idosa, porém é maior de idade");
   }
   }else{
    System.out.println("a pessoa não é maior de idade!");
  } 
  sc.close();
  }
}