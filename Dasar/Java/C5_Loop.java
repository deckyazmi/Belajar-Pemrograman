// package v1basic;

public class C4_Loop{
    public static void main(String[] args) {
        int tinggi=2;
        char symbol='*';
        //! for
        for(int i = 1; i <= tinggi; i++){
            for (int j = tinggi-1; j >= i; j--){
                System.out.print(" ");
            }
            for (int k = 1; k <=i; k++){
                if(i != 1 && k==i){
                    for (int l = 1; l <=i; l++){
                        System.out.print(symbol);
                    }
                }else{
                    System.out.print(symbol);
                }
            }
            System.out.println("");
        }

        //!while
        if (tinggi>=2){
            int whl=1;
            int whl2;
            while(whl<=tinggi){
                whl2=1;
                while(whl2++<=tinggi-whl){
                    System.out.print(" ");
                }
                whl2=1;
                while(whl2++<=whl*2-1){
                    System.out.print(symbol);
                }
                System.out.println();
                whl++;
            } 
            whl=tinggi-1;
            while(whl>0){
                whl2=1;
                while(whl2++<=tinggi-whl){
                    System.out.print(" ");
                }
                whl2=1;
                while(whl2++<=whl*2-1){
                    System.out.print(symbol);
                }
                System.out.println();
                whl--;
            }
        }else{
            System.out.print("Tidak bisa membuat Belah ketupat");
        }
        

        //!do while
        char dd='A';
        do{
            System.out.print(dd+", ");
            dd++;
        }while(dd!='E');
    }
}