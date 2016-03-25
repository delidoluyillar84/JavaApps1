
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SayisalLotoV2
{
    public static Scanner oku = new Scanner(System.in);

    public static void main(String[] args)
    {
        ArrayList<Integer> toplar = new ArrayList<>();
        for (int i = 1; i<50; i++)
            toplar.add(i);
        
        Collections.shuffle(toplar);
        
        // a[i];        a.get(i);
        /*
        for (int i = 0; i < 6; i++) 
            System.out.print(toplar.get(i)+" ");
        */
        
        System.out.println(toplar.subList(0, 6));
    }
}
