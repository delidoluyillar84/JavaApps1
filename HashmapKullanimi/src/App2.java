
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class App2
{
    public static Scanner oku = new Scanner(System.in);

    public static void main(String[] args)
    {
        int[] numbers = new int[1000];
        for (int i = 0; i < numbers.length; i++) 
            numbers[i] = (int)(1+ Math.random() * 500);
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        // 8 2 8
        for (int sayi : numbers)
        {
            if (hm.containsKey(sayi))
            {
                int old = hm.get(sayi);
                hm.put(sayi, old+1);
            }
            else
                hm.put(sayi, 0);
        }
        
        for (int sayi : numbers)
            if (hm.get(sayi) != 0)
                System.out.println(sayi+" : "+hm.get(sayi));
    }
}
