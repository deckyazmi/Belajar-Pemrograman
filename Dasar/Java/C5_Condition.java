// package v1basic;

public class C3_Condition{
    public static void main(String[] args) {
        byte a=1; byte b=2;
        System.out.println("apakah "+a+" > "+b+" ?");
        //! IF
        //? if ternary operation
        System.out.println((a>b)?"Ya, 1 Lebih Besar dari 2":"Tidak, 1 Tidak Lebih Besar dari 2");

        //? if
        if(a>b){
            System.out.println("Ya, 1 Lebih Besar dari 2");
        }else{
            System.out.println("Tidak, 1 Tidak Lebih Besar dari 2");
        }

        //! Switch case
        switch (a) {
            case 1:
                System.out.println("nilai variable == 1");
                break;
        
            default:
                System.out.println("nilai variable != 1");
                break;
        }
    }
}