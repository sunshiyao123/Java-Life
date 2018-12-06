//Java数组章节练习题
public class ssy{
    //1.计算数组中最大值
    // public static int arrayMaxElement(int[] data){
    //     int max = 0;
    //     int i = 0;
    //     for(i = 0; i < data.length; i++){
    //         if(max < data[i]){
    //             max = data[i];
    //         }
    //     }
    //     return max;
    // }


    // 2.计算数组中最小值
    // public static int arrayMinElement(int[] data){
    //     int min = data[0];
    //     int i = 0;
    //     for(i = 0; i < data.length; i++){
    //         if(min > data[i]){
    //             min = data[i];
    //         }
    //     }
    //     return min;
    // }


    //3.计算数组值之和
    // public static int arrayElementSum(int[] data){
    //     int num = 0;
    //     int i = 0;
    //     for(i = 0; i < data.length; i++){
    //         num += data[i];
    //     }
    //     return num;
    // }

    //4.数组拼接
    //A {1,3,5,7,9} B {2,4,6,8,10} -> {1,3,5,7,9,2,4,6,8,10}
    // public static int[] arrayJoin(int[] a, int[] b){
    //     int j = b.length;
    //     int i = a.length;
    //     int[] data = new int[i+j];
    //     for(i = 0; i< a.length; i++){
    //         data[i] = a[i];
    //     }
    //     for(j = 0; j< b.length; j++){
    //         data[a.length+j] = b[j];
    //     }
    //     return data;
    // }

    //5.数组截取
    //[start, end)
    //A {1,3,5,7,9} ->(A,1,3) > {3,5}
    // public static int[] arraySub(int[] data, int start , int end){
    //     int[] data1 = new int[end-start+1];
    //     int num = 0;
    //     for(int i = start; i <= end; i++){
    //             data1[num] = data[i];
    //             num++;
    //     }   
    //     return data1;
    // }

    //6.数组打印
    public static void printArray(int[]data){
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i]+" ");
        }
        System.out.println("\t");
    }

    //7.数组反转(两种：1.直接反着输出  2.数组里进行交换)
    // 比如：[1,2,3,4] => [4,3,2,1]
    // public static void printReversal(int[] data){
    //     int a = data.length;
    //     for(int i = data.length-1; i>= 0; i--){
    //         System.out.print(data[i]+" ");
    //     }
    // }

    // public static int[] printReversal(int[] data){
    //     int a = data.length;
    //     int[] result = new int[a];
    //     int j = 0;
    //     for(int i = a-1; i >= 0; i--){
    //         result[j] = data [i];
    //         j++;
    //     }
    //     return result;
    // }


    public static void main(String[] args){
        int[] data1 = new int[]{1,3,5,7,9};
        //1.求最大值
        // int max = arrayMaxElement(data1);
        // System.out.println(max);

        //2.求最小值
        // int min = arrayMinElement(data1);
        // System.out.println(min);

        //3.求数组的和
        // int Sum = arrayElementSum(data1);
        // System.out.println(Sum);

        //int[] data2 = new int[]{2,4,6,8,10};

        // 4.数组拼接
        // int[] data3 = arrayJoin(data1, data2);
        // printArray(data3);

        //5.数组截取
        // int[] data3 = arraySub(data1, 1, 2);
        // System.out.println("截取前：");
        // printArray(data1);
        // System.out.println("截取后：");
        // printArray(data3);
        
        //7.数组反转
        // System.out.println("反转前：");
        // printArray(data1);
        // System.out.println("反转后：");
        // printReversal(data1);

        // System.out.println("反转前：");
        // printArray(data1);
        // System.out.println("反转后：");
        // int[]temp = printReversal(data1);
        // printArray(temp);
    }
}