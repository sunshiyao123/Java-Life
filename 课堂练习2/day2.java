
//逻辑控制与方法定义
// public class day2{
//     public static void main(String[] args){
//         int line = 10;
//         for(int x = 0; x < line; x++){
//             for(int y = 0; y < line - x; y++){
//                 System.out.print(" ");
//             }
//             for(int z = 0; z < x;z++){
//                 System.out.print("* ");
//             }
//           System.out.print("\n");
//         }    
//     }
// }

//switch语句
public class day2{
    public static void main(String[] args){
        System.out.println("请输入字符：");
        char x = (char)System.in.read();
        switch(x){
            case 'a':{
                System.out.println("喜欢刘苗");
                break;
            }
            case 'b':{
                System.out.println("喜欢诗尧");
                break;
            }
            default:{
                System.out.println("诗尧喜欢刘苗");
                break;
            }
        }
    }
}