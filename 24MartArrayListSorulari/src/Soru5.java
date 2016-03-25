
import java.util.ArrayList;
import java.util.Scanner;

public class Soru5
{
    public static Scanner oku = new Scanner(System.in);
    public static ArrayList<Integer> al = new ArrayList<>();
    public static ArrayList<Integer> res = new ArrayList<>();
    public static boolean isPrime(int s)
    {
        for (Integer sayi : al)
            if ( s % sayi == 0)
                return false;
        return true;
    }
    
    public static void main(String[] args)
    {
        int n = 16384;
        int toplam = 0;
        for (int i = 2; i<=n; i++)
        {
            if (isPrime(i))
            {
                al.add(i);
                String s = ""+i;
                if (s.charAt(0) == s.charAt(s.length() - 1))
                {
                    res.add(i);
                    toplam += i;
                }
            }
        }
        
        System.out.println(res.toString().replace(", ","\n"));
        System.out.println(toplam);
    }
}
