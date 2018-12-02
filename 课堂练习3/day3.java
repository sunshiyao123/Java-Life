//java数组
// public class day3{
//     public static void main(String[] args){
        // int[] date = new int[5];
        // date [1] = 1;
        // date [2] = 1;
        // date [3] = 1;
        // date [4] = 1;
        // date [0] = 1;
        //         // for(int i = 0; i < date.length; i++){
        // //     System.out.println(date[i]);
        // //}
        // // int[] x = null;
        // // x = new int [5];
        // // System.out.print(x[4]);
        // int[] x = null;
        // x = date;
        // System.out.print(x[4]);
        //}

//         int[]date = new int[]{1, 2, 3, 4};
//         System.out.println(date[2]);
//         System.out.println(date.length);
//     }
// }

public class day3{
    public static void main(String[] args){
        // int[] date = new int[] {1, 2, 3, 4, 5};
        // print(date);
        int[] date = init();
        print (date);
    }
    public static void print(int[] temp){
        for(int i = 0; i < temp.length; i++){
            System.out.println(temp[i]);
        }
    }
    public static int[] init(){
        return new int[]{1, 2, 3, 4, 5};//匿名数组
    }
}