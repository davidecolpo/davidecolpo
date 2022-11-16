import java.util.Scanner;
public class ContVC {
   public static void main(String args[]){
      int count = 0;
      System.out.println("inserisci la parola :");
      Scanner sc = new Scanner(System.in);
      String parola = sc.nextLine();

      for (int i=0 ; i<parola.length(); i++){
         char ch = parola.charAt(i);
         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
            count ++;
         }
      }
      System.out.println("Number of vowels in the given sentence is "+count);
   }
}
