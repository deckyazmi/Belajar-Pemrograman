// package C1_Basic;

public class C3_DataTypeCasting{
    public static void main(String[] args) {
        //! Widening Casting (automatically) - converting a smaller type to a larger type size
        byte awal = 55;
        byte a = awal;
        short b = awal;
        int c = awal;
        long d = awal;
        float e = awal;
        double f = awal;
        System.out.println("nilai awal\t:\t"+awal+
                        "\nnilai byte\t:\t"+a+
                        "\nnilai short\t:\t"+b+
                        "\nnilai int\t:\t"+c+
                        "\nnilai long\t:\t"+d+
                        "\nnilai float\t:\t"+e+
                        "\nnilai double\t:\t"+f);

        System.out.println("/------------------------------------/");
        //! (manually) - converting a larger type to a smaller size type
        double awal1 = 5555555555555.55;
        byte a1 = (byte) awal1;
        short b1 = (short) awal1;
        int c1 = (int) awal1;
        long d1 = (long) awal1;
        float e1 = (float) awal1;
        double f1 = (double) awal1;
        System.out.println("nilai awal\t:\t"+awal1+
                        "\nnilai double\t:\t"+f1+
                        "\nnilai float\t:\t"+e1+
                        "\nnilai long\t:\t"+d1+
                        "\nnilai int\t:\t"+c1+
                        "\nnilai short\t:\t"+b1+
                        "\nnilai byte\t:\t"+a1);
    }
}
