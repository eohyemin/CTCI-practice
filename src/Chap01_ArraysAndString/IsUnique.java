package Chap01_ArraysAndString;

import java.util.Arrays;

/**
 * 문자열이 주어질 때 문자열에 같은 문자가 중복되는지 확인
 */
public class IsUnique {

    /*
    * 문자열의 i번째 문자가 배열 내에 존재하는지 확인
    * */
    public boolean isUnique1(String str) {
        if(str==null || str.length()>128) return false;

        boolean[] checkedChar = new boolean[128];
        for(int i=0; i<str.length(); i++) {
            int c = str.charAt(i);
            if(checkedChar[c]) return false;
            checkedChar[c] = true;
        }
        return true;
    }

    /*
    * 문자열 정렬 후 인접한 문자가 중복인지 확인
    * */
    public boolean isUnique2(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        for(int i=0; i<chars.length-1; i++) {
            if(chars[i] == chars[i+1]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        IsUnique isUnique = new IsUnique();
        String s = "abcdba";
        System.out.println(isUnique.isUnique1(s));
        System.out.println(isUnique.isUnique2(s));
    }

}
