import java.util.Scanner;
public class ContVC {
   public static void main(String args[]){
      int count = 0;
      int count2 = 0;
      System.out.println("inserisci la parola :");
      Scanner sc = new Scanner(System.in);
      String parola = sc.nextLine();

      for (int i=0 ; i<parola.length(); i++){
         char ch = parola.charAt(i);
         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == 'A' ||ch == 'E'|| ch == 'I' ||ch == 'O' ||ch == 'U'){
            count ++;
         }
      }
      System.out.println("il numero di vocali è "+count);


      for (int i=0 ; i<parola.length(); i++){
         char ch = parola.charAt(i);
         if(ch == 'b'|| ch == 'c'|| ch == 'd' ||ch == 'f' ||ch == 'g'|| ch == 'h'|| ch == 'j' ||ch == 'k' ||ch == 'l'
         || ch == 'm'|| ch == 'n' ||ch == 'p' ||ch == 'q' || ch == 'r'|| ch == 's' ||ch == 't' ||ch == 'v'
         || ch == 'w'|| ch == 'x' ||ch == 'y' ||ch == 'z' ||ch == 'B'|| ch == 'C'|| ch == 'D' ||ch == 'F' ||ch == 'G'|| ch == 'H'|| ch == 'J' ||ch == 'K' ||ch == 'L'
         || ch == 'M'|| ch == 'N' ||ch == 'P' ||ch == 'Q' || ch == 'R'|| ch == 'S' ||ch == 'T' ||ch == 'V'
         || ch == 'W'|| ch == 'X' ||ch == 'Y' ||ch == 'Z'){
            count2 ++;
         }
      }
      System.out.println("il numero di consonati è "+count2);
   }
}
