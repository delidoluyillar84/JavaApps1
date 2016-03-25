
import java.util.Scanner;

public class App1
{
    public static Scanner oku = new Scanner(System.in);

    public static void main(String[] args)
    {
        String[] adlar = { "Emir","Ali","Murat","Efe" };
        
        for (int i = 0; i<adlar.length; i++)
        {
            String ad = adlar[i];
            System.out.println("Kişi Adı : "+ad);
        }
        // adlar Arrayingdeki Her Bir String Elemanını
        // Döndüge ad adıyla kullan
        for (String ad : adlar)
            System.out.println("Kişi Adı : "+ad);
        
        String pass = "DelidoluYillar84";
        char[] arr = pass.toCharArray();
        
        int upCnt = 0;
        for (char c : arr)
        {
            if (Character.isUpperCase(c))
                upCnt++;
        }
        System.out.println(upCnt);
        
        // http://pastie.org/10771191
    }
}
