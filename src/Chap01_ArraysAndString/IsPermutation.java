package Chap01_ArraysAndString;

import java.util.Arrays;

/*
* 문자열 두 개가 주어졌을 때 둘이 서로 순열 관계에 있는지 확인
* */
public class IsPermutation {

    /*
    * 문자열 정렬 뒤 두 문자열이 같은지 비교
    * strSort(String s): String 사용
    * */
    public boolean isPermutation1(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        return strSort(s1).equals(strSort(s2));
    }

    public String strSort(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    /*
    * 각 문자열 내의 문자 출현 횟수 기록한 후 비교
    * 문자 집합으로 ASCII 사용한다고 가정
    * */
    public boolean isPermutation2(String s1, String s2) {
         if(s1.length() != s2.length()) return false;

         int[] chars = new int[128];

         char[] s_array = s1.toCharArray();
         for(char c: s_array) {
             chars[c]++;
         }

         for(int i=0; i<s2.length(); i++) {
             int c = (int) s2.charAt(i);
             chars[c]--;
             if(chars[c] < 0) {
                 return false;
             }
         }
         return true;
    }

    public static void main(String[] args) {
        IsPermutation isPermutation = new IsPermutation();

        System.out.println(isPermutation.isPermutation1("abc", "abcd"));
        System.out.println(isPermutation.isPermutation2("abc", "abce"));
    }
}
