import java.util.Scanner;
public class Lab4Q3 {
        public static void main (String[] args)
        {
            Scanner input=new Scanner(System.in);
            String Str ;
               System.out.println("Enter A Word That Has i And s Letters For Instance This Mississippi");
            Str=input.next();
            String  Str1 = Str.replace("i", "!");
            Str1 = Str1.replace("s", "$");
               System.out.println ("The Actul String is "+Str);
               System.out.println ("The Expected Result is (M!$$!$$!pp!) If It was This (Mississippi)" );
               System.out.println ("After Replacing: " + Str1);
        }
    }
