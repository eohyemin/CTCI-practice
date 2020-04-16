package Chap01_ArraysAndString;

/*
* 주어진 문자열이 회문순열인지 확인
* palindrome: 앞으로 읽으나 뒤로 읽으나 같은 단어 혹은 구절
* */
public class CheckPalindrome {
    /*
    * 개수가 홀수인 문자가 단 한개 존재하는지 확인
    * */
    public boolean isPermutationOfPalindrome(String phrase) {
        int[] table = buildCharFreqTable(phrase);
        return checkMaxOneOdd(table);
    }

    public boolean checkMaxOneOdd(int[] table) {
        boolean foundOdd = false;
        for(int count: table) {
            if(count%2 == 1) {
                if(foundOdd) {
                    return false;
                }
                foundOdd = true;
            }
        }
        return true;
    }

    public int[] buildCharFreqTable(String phrase) {
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for(char c: phrase.toCharArray()) {
            if(c >= 'a' && c <= 'z') {
                int x = c - 'a';
                if (x != -1) table[x]++;
            }
        }
        return table;
    }

    public static void main(String[] args) {
        CheckPalindrome checkPalindrome = new CheckPalindrome();

        System.out.println(checkPalindrome.isPermutationOfPalindrome("aabb"));
        System.out.println(checkPalindrome.isPermutationOfPalindrome("tact coa"));
        System.out.println(checkPalindrome.isPermutationOfPalindrome("tactcoapapa"));
        System.out.println(checkPalindrome.isPermutationOfPalindrome("abc"));
    }

}
