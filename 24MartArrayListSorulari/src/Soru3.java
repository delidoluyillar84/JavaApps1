
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Soru3
{
    public static Scanner oku = new Scanner(System.in);

    public static void main(String[] args)
    {
        String s1 = "99";
        String s2 = "99";
        
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        ArrayList<Integer> res= new ArrayList<>();
        
        
        
        for (int i = 0; i < s1.length(); i++) 
        {
            int r = (int) s1.charAt(i) - 48;
            a1.add(r);
        }
        
        for (int i = 0; i < s2.length(); i++) 
        {
            int r = new Integer(""+s2.charAt(i));
            a2.add(r);
        }
        System.out.println(a1);
        System.out.println(a2);
        
        int eldeVar = 0;
        
        for (int i = a1.size() -1;  i >= 0; i--) 
        {
            int toplam = a1.get(i) + a2.get(i) + eldeVar;
            
            eldeVar = toplam / 10;
            toplam %= 10;
            
            res.add(toplam);
        }
        
        if (eldeVar == 1)
            res.add(eldeVar);
        
        Collections.reverse(res);
        
        System.out.println(res);
    }
}
