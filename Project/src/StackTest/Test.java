package StackTest;

public class Test {
    public static void main(String[] args) {
        String[] string = new String[]{"a","b","c"};
        String s = "abcde";
        Substr substr = new Substr(string,s);
        boolean[] result = substr.chkSubStr(string,3,s);
        for (boolean b : result) {
            System.out.println(b);
        }
    }
}

class Substr {
    private boolean[] result;
    private String[] strings;
    private String string;

    public Substr(String[] strings, String string) {
        this.strings = strings;
        this.string = string;
    }

    public boolean[] chkSubStr(String[] p, int n, String s) {
        //判断给定条件
        if(n>500 || s.length()<1000) {
            result = new boolean[]{false};
            return result;
        }
        result = new boolean[n];
        for(int i = 0;i < n;i++) {
            if(p[i].length() <= 8){
                result[i] = s.contains(p[i]);
            } else {
                result[i] = false;
            }
        }
        return result;
    }
}
