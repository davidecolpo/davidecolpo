
import java.io.*;
class java
{
    public static void main(String args[]) throws IOException
    {
    InputStreamReader input = new InputStreamReader(System.in);
    BufferedReader tastiera = new BufferedReader(input);
    
    int numeroVocali = 0;
    int numeroLettere;
    int contantore = 0;
    int numeroConsonti = 0;
    {

    System.out.println("Scrivi una frase e ti dirò quante vocali e consonanti ci sono:");
    String parola=tastiera.readLine(); 
    
    numeroLettere = parola.length();
    for (int contatore = 0; contatore < numeroLettere; contatore++) {
    if ((parola.charAt(contatore) == 'a') || (parola.charAt(contatore) == 'e') ||
    (parola.charAt(contatore) == 'i') || (parola.charAt(contatore) == 'o') ||
    (parola.charAt(contatore) == 'u') || (parola.charAt(contatore) == 'A') ||
    (parola.charAt(contatore) == 'E') || (parola.charAt(contatore) == 'I') ||
    (parola.charAt(contatore) == 'O') || (parola.charAt(contatore) == 'U')) {
    numeroVocali++;}
    }
    System.out.println("Nella parola ci sono presenti "+numeroVocali+" vocali");}    
    }
    

}
