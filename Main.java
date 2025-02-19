import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String input = "";

    ArrayList<String> word = new ArrayList<String>();
    
    System.out.println("Please enter words, enter STOP to stop the loop.");

    while (!input.equals("STOP"))
    {
      System.out.println("infinite loop! enter a word");
      input = sc.nextLine();
      word.add(input);

      System.out.println("Array list is now" + word);
    }
    System.out.println("Left the loop. List is now" + word);
    System.out.println("I will remove the last word");

    int lastIndex = word.size()-1;
    word.remove(lastIndex);

    System.out.println("removed the last word. List is now" + word);
  }
}
