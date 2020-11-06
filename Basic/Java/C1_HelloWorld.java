// package v1basic;

public class C1_HelloWorld{
    public static String fungsi(String a, String b){

        String c = a + b;
        System.out.println(a+b);
        //? c=a,b; <----- error
        return c;

    }ing 

    public static void main(String[] args) {
        // ! CETAK HELLO WORLD
        System.out.print(fungsi("Hello ","World"));
    }
}