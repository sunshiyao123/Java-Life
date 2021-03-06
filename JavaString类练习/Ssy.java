//String类扩展功能实现
// public class Ssy {
//      /**
//      * 例如： 
//      * 'a' 5   => "aaaaa"  
//      * 'a' -1  => ""
//      * 
//      * @param c     被重复的字符
//      * @param count 重复的数目，如果小于等于0则返回""
//      * @return 重复字符字符串
//      */
//     public static String repeat(char c, int count) {
//         StringBuffer str = new StringBuffer();
//         for(int i = 1; i <= count; i++) {
//             str = str.append(c);
//         }
//         return str.toString();
//     }
//     public static void main(String[] args) {
//         String str1 = repeat('a', 5);
//         System.out.println(str1);
//     }
// }
    
     /**
     * 将已有字符串填充为规定长度，如果已有字符串大于等于这个长度则返回这个字符串
     * 字符填充于字符串前
     *
     * 例如： 
     * "abc" 'A' 5  => "AAabc"
     * "abc" 'A' 2  => "abc"
     *
     * @param str        被填充的字符串
     * @param filledChar 填充的字符
     * @param len        填充长度
     * @return 填充后的字符串
     */
public class Ssy {
    public static String fillBefore(String str, char filledChar, int len) {
        if(str.length() >= len) {
            return str;
        } else {
            for(int i = 0; i <= (len - str.length()); i++){
                str = filledChar + str;
            }
            return str;
        }
    }
    public static void main(String[] args) {
        String str1 = "aaa";
        System.out.println(fillBefore(str1,'A',6));
    }
}
//     /**
//      * 将已有字符串填充为规定长度，如果已有字符串大于等于这个长度则返回这个字符串<br>
//      * 字符填充于字符串后
//      * 例如： 
//      * "abc" 'A' 5  => "abcAA"
//      * "abc" 'A' 3  => "abc"
//      *
//      * @param str        被填充的字符串
//      * @param filledChar 填充的字符
//      * @param len        填充长度
//      * @return 填充后的字符串
//      */
//     public static String fillAfter(String str, char filledChar, int len) {
//         //TODO
//         return "";
//     }

//     /**
//      * 移除字符串中所有给定字符串
//      * 例：removeAll("aa-bb-cc-dd", "-") => aabbccdd
//      *
//      * @param str         字符串
//      * @param strToRemove 被移除的字符串
//      * @return 移除后的字符串
//      */
//     public static String removeAll(String str, String strToRemove) {
//         //TODO
//         return null;
//     }
    
//     /**
//      * 反转字符串
//      * 例如：abcd => dcba
//      *
//      * @param str 被反转的字符串
//      * @return 反转后的字符串
//      */
//     public static String reverse(String str) {
//         //TODO
//         return null;
//     }
   
// }