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


//匿名数组
// public class day3{
//     public static void main(String[] args){
//         System.out.println(new int[]{1,2,3,4,5,6,7,8}.length) ;
//     } 
// }

//静态初始化
// public class day3{
//     public static void main(String[] args){
//         int[] data = new int[]{1,2,3,4};
//         for(int i = 0; i < data.length; i++){
//             System.out.println(data[i]);
//         }
//     } 
// }

//二维数组
// public class day3{
//     public static void main(String[] args){
//         int[][]data = new int[][]{
//             {1,2,3},{4,5},{6,7,8,9}
//         };
//         for(int i = 0; i < data.length; i++){
//             for(int j =0; j < data[i].length; j++){
//                 System.out.print(data[i][j]+" ");
//             }
//             System.out.println("\t");
//         }
//     }
// }

//方法与数组的互相操作
// public class day3{
//     public static void main(String[] args){
//         // int[] date = new int[] {1, 2, 3, 4, 5};
//         // print(date);
//         int[] data = init();
//         print (data);
//         bigger(data);
//         print (data);
//     }
//     public static void print(int[] temp){
//         for(int i = 0; i < temp.length; i++){
//             System.out.print(temp[i] + " ");
//         }
//         System.out.println("\t");
//     }
//     public static int[] init(){
//         return new int[]{1, 2, 3, 4, 5};//匿名数组
//     }
//     public static void bigger(int[] temp){
//         for(int i = 0; i < temp.length; i++){
//             temp[i] *=5;
//         }
//     }
// }

// Java对数组的支持：数组排序
// public class day3{
//     public static void main(String[] args){
//         int[] data = new int[]{8,5,4,7,8,5,2,1};
//         char[] data2 = new char[]{'a','o','b','y'};
//         printArray(data);
//         printArray(data2);
//         java.util.Arrays.sort(data);
//         java.util.Arrays.sort(data2);
//         printArray(data);
//         printArray(data2);
//     }
//     public static void printArray(int[]temp){
//         for(int i = 0; i < temp.length; i++){
//             System.out.print(temp[i]+" ");
//         }
//         System.out.println("\t");
//     }
//     public static void printArray(char[]temp){
//         for(int i = 0; i < temp.length; i++){
//             System.out.print(temp[i]+" ");
//         }
//         System.out.println("\t");
//     }
// }

// 数组的拷贝(数字和字符都可以)
// public class day3{
//     public static void main(String[] args){
        // int[] data = new int[]{8,7,6,5,4,3,2,1};
        // int[] data2 = new int[]{1,2,3,4,5,6,7};
        // char[] data = new char[]{'c','c','d','d'};
        // char[] data2 = new char[]{'a','a','b','b'};
        // printArray(data);
        // printArray(data2);
        // System.arraycopy(data,2,data2,2,2); //将data2数组中的6 5 4换掉data2中的3 4 5
        // printArray(data);
        // printArray(data2);
    // }
    // public static void printArray(int[]temp){
    //     for(int i = 0; i < temp.length; i++){
    //         System.out.print(temp[i]+" ");
    //     }
    //     System.out.println("\t");
    // }
//     public static void printArray(char[]temp){
//         for(int i = 0; i < temp.length; i++){
//             System.out.print(temp[i]+" ");
//         }
//         System.out.println("\t");
//     }
//   }


//数组的全拷贝
// import java.util.Arrays;
// public class day3{
//     public static void main(String[] args){
//         int[] data = new int[]{1,2,3,4,5,6,7,8,9};
//         int[] data2 = Arrays.copyOf(data,10);
//         for(int temp : data2){
//             System.out.println(temp);
//         }
//         // printArray(data2);
//     }
//     // public static void printArray(int[]temp){
//     //     for(int i = 0; i < temp.length; i++){
//     //         System.out.print(temp[i]+" ");
//     //     }
//     //     System.out.println("\t");
//     // }
// }