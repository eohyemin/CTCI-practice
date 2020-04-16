package Chap01_ArraysAndString;

/*
* 문자열에 들어 있는 모든 공백을 %20으로 변환
* 모든 문자를 다 담을 수 있는 공간이 확보되었다고 가정
* */
public class URLify {

    /*
    * 공백 문자 체크해서 추가 공간 계산
    * 역방향으로 문자열 편집
    * */
    void replaceSpaces(char[] str, int len) {
        int spaceCount = 0;
        for(int i=0; i<str.length; i++) {
            if(i == len) break;
            if(str[i] == ' ') spaceCount++;
        }

        int index = len + spaceCount * 2;
        if(len < str.length) str[len] = '\0';
        for(int i = len-1; i>=0; i--) {
            if(str[i] == ' ') {
                str[index-1] = '0';
                str[index-2] = '2';
                str[index-3] = '%';
                index -= 3;
            }
            else {
                str[index-1] = str[i];
                index--;
            }
        }

    }

    public static void main(String[] args) {

        String str = "Mr John Smith      ";
        int len = 13;
        char[] str_chars = str.toCharArray();

        URLify urLify = new URLify();
        urLify.replaceSpaces(str_chars, len);
        System.out.println(str_chars);

    }
}
