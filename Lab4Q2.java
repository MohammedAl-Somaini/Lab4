public class Lab4Q2 {
    public static void main(String[] args)
    {
        String str = "Mississippi";
         str = str.replaceAll("i", "ii");
        System.out.println("Aftre Replacing All i By ii The Length is " +str.length());
         str = str.replaceAll("ss", "s");
        System.out.println("Aftre Replacing All ss By s The Length is " +str.length());
    }
}
