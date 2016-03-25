
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Soru2
{
    public static Scanner oku = new Scanner(System.in);

    public static void main(String[] args)
    {
        ArrayList<Integer> tL = new ArrayList<>();
        ArrayList<Integer> cL = new ArrayList<>();
        
        while (true)
        {
            System.out.print("Sayı : ");
            int n = oku.nextInt();
            
            if (n == -1) break;
            
            if (n % 2 == 0)     cL.add(n);  // 2 4 6 8
            else                tL.add(n);  // 1 9 7 3
        }
        // ...
        
        Collections.sort(cL);
        Collections.sort(tL);
        
        cL.addAll(tL);
        System.out.println(cL);
    }
}
