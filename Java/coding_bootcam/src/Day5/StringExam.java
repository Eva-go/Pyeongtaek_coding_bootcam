package Day5;

public class StringExam {
    public static void main(String[] args) {
        String a = "자장면은 맛있엉";
        String b = "짬뽕도 맛있엉";
        String d = new String("자장면은 맛있엉");
        String c =  a+b;

        char chr = a.charAt(7);
        System.out.println(chr);

        String substr1 = a.substring(5);
        System.out.println(substr1);
        String substr2 = a.substring(0,6);
        System.out.println(substr2);
        int i =a.indexOf("맛있엉");
        System.out.println(i);

        boolean isEqual = a.equals(b);
        System.out.println(isEqual);
        boolean is = a==d;
        System.out.println(is);
    }
}
