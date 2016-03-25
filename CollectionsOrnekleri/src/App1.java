
import java.util.ArrayList;
import java.util.Scanner;

public class App1
{
    public static Scanner oku = new Scanner(System.in);

    public static void main(String[] args)
    {
        ArrayList<Integer> al = new ArrayList<>();
        
        while (true)
        {
            System.out.print("Sayı Girin : ");
            int s1 = oku.nextInt();
            
            if (s1 == -1) break;
            al.add(s1);
        }
        System.out.println(al);
    }
}
