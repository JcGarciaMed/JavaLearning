package com.greymatter.se11.javaTypes;

public class JavaTypes {
    private int $int1;
    private long $lon1=3525;
    private byte $byt1 = '1';
    private short $sho1;
    private char $cha1= 12;
    private float $flo1;
    private double $dou1;
    private String $str1;

    public JavaTypes(){
        $int1 = 23;
    }
    public static void main(String[] args) {
        JavaTypes obj1 = new JavaTypes();
        System.out.println(obj1.$int1);
        System.out.println(obj1.$lon1);
        System.out.println(obj1.$byt1);
        System.out.println(obj1.$sho1);
        System.out.println(obj1.$cha1);
        System.out.println(obj1.$flo1);
        System.out.println(obj1.$dou1);
        System.out.println(obj1.$str1);

        String str1 = "hola";
        String str2 = str1;
        System.out.println(str1);
        System.out.println(str2);
        str1 = "hola2";
        System.out.println(str1);
        System.out.println(str2);


        System.out.println("Hello World");

        int n=20;int m=n=10;
        System.out.println(n);
        System.out.println(m);
        // int a=10, int b = 3; malote

        //int aa;
        //System.out.println(aa); malotee

        int n2 = 10_00_00;
        System.out.println(n2);
    }
}
