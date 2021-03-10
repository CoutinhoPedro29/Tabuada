/*0050016979 Pedro Coutinho Duarte*/
import java.util.Scanner;
class Tabuada1 {
  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
    System.out.println("Entre com um número:");
    int resposta=input.nextInt( );
    for(int i=0;i<11;i++)
    {
      int res=resposta+i;
      System.out.println(res);

    }
  }
}
