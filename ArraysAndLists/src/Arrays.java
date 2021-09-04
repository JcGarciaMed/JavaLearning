public class Arrays {
    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        myIntArray[5]=50;
        myIntArray[9]=125;
        myIntArray[1]=5526;
        System.out.println(myIntArray[5]);
        System.out.println(myIntArray[1]);

        int[] myIntArray2 = {1,2,3,4,5,9,8,10,12};
        System.out.println(myIntArray2[8]);

        int[] myIntArray3= new int[10];
        for (int i = 0; i < myIntArray3.length; i++) {
            myIntArray3[i]= i*10;
            System.out.println("Element: " + i + " , value: " +  myIntArray3[i]);
        }




        double[] myDobuleArray = new double[198];



    }
}
