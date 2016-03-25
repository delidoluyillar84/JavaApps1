
import java.util.Arrays;
import java.util.Scanner;

public class SayisalLotoV1
{
    public static Scanner oku = new Scanner(System.in);

    public static void main(String[] args)
    {
        int cekilenToplar[] = new int[6];
        int cnt = 0;
        
        while (cnt != 6)
        {
            int r = (int)(1 + Math.random() * 49);
            
            // r, Arrayin Onceki Elemanlarında Var Mı
            boolean varMi = false;
            
            for (int i = 0; i < cnt; i++) 
            {
                if (cekilenToplar[i] == r)
                    varMi = true;
            }
            
            if (varMi == false)
            {
                cekilenToplar[cnt] = r;
                cnt++;
            }
        }
        
        
        
        System.out.println(Arrays.toString(cekilenToplar));
    }
}
