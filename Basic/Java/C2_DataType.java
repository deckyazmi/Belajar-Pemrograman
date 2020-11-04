// package C1_Basic;
import java.util.*;

public class C2_DataType{
    public static void main(String[] args) {
        // ! PRIMITIVE DATA TYPE
        //? Data Type Numerik
        byte a = 5; //? dari -128 s/d 127
        short b = 55; //? dari -32.768 to 32.767
        int c = 555; //? dari -2.147.483.648 to 2.147.483.647
        long d = 5555; //? dari -9.223.372.036.854.775.808 to 9.223.372.036.854.775.807
        float e = 0.5f; //? bilangan desimal 6-7 digit
        double f = 55.5; //? bilangan desimal 15 digit
        //? Data Type logic
        boolean g = true; //? TRUE
        boolean g1 = false; //? FALSE
        //? Data Type karakter
        char h = 'A'; //? menampung 1 karakter
        char h1 = 55; //? menampung karakter ASCII 26 (7)

        // ! NON-PRIMITIVE DATA TYPE
        String i = "Hello World!!"; //? menampung kumpulan karakter
        String[] j = {"decky", "azmi", "pratama"}; //? int [Array]-> menampung kumpulan data bertipe string
        char[][] k = {{'D', 'Q'}, {'A', 'P'}}; //? String [2D] [Array]-> menampung kumpulan data bertipe char
        Ext_Player l = new Ext_Player(); //? menampung object student di file Ext_Student
        l.nama = "Decky Azmi"; //? set nama pada object Student di variabel l
        System.out.print(l.nama);
        Map m = new HashMap();
        m.put(1,"Decky Azmi");
        Map<Integer,String> m1 = new HashMap<Integer,String>();
        m1.put(5,"Dq");
        //..etc
    }
}