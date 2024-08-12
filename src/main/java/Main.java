import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    System.out.println("Insira um valor para coordenada X:");
    int x = sc.nextInt();

    System.out.println("Insira um valor agora para coordenada Y:");
    int y = sc.nextInt();

    
   while (x > 0 && y > 0) {
     
System.out.println("Pertence ao primeiro quadrante");  
System.out.println("");
     x = sc.nextInt();
   }
      
   while (x < 0 && y > 0) {
                    System.out.println("Pertence ao segundo quadrante");
System.out.println("");
     x = sc.nextInt();
                }

    while (x < 0 && y < 0) {
                    System.out.println("Pertence ao terceiro quadrante");
System.out.println("");
       x = sc.nextInt();
                }

    while (x > 0 && y < 0) {
                    System.out.println("Pertence ao quarto quadrante");
System.out.println("");
       x = sc.nextInt();
                }

   while ( x == 0) {
System.out.println("Programa encerrado");
System.out.println("");
      x = sc.nextInt();
   }

    sc.close();
  }
}