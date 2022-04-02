package TC001;

import java.util.ArrayList;

public class TC001 {
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
            System.out.println("Ferhat");
        }

        ArrayList<String> str=new ArrayList<>();
        str.add("Ferhat");
        str.add("Tongel");
        str.add(1,"007");
        System.out.println(str);

        for (int i = 0; i < str.size() ; i++) {
            str.remove(i);
        }
        System.out.println(str);
        System.out.println("Suan yedek uzerindeiym");

        String stra="Ferhat";
        System.out.println(stra);
        System.out.println("FERHAT TONG?EL");
        System.out.println(1);
    }

}
