package Day5;

public class StringExam2 {
    public static void main(String[] args) {
        //String 비교
        String str1 = "Hello";
        String str2 = "hello";
        boolean isEqual = str1.equals(str2);
        System.out.println(isEqual);

        //ignorecase = 대소문자 무시
        boolean isEqual2 = str1.equalsIgnoreCase(str2);
        System.out.println(isEqual2);

        String str3 = "Hello World!";
        //replaceAll = 글자 바꾸기
        String newStr = str3.replaceAll("World","Java");
        System.out.println(newStr);
        System.out.println(str3);

        //to LowerCase = 소문자로 바꾸기
        String str4 = "Hello WORLD";
        String lower = str4.toLowerCase();
        System.out.println(lower);

        //to UpperCase = 대문자로 바꾸기
        String upper = lower.toUpperCase();
        System.out.println(upper);

        //trim = String 의 공백 삭제
        String str5 = "                 Hello World!       ";
        String trimstr = str5.trim();
        System.out.println(str5);
        System.out.println(trimstr);
    }
}
