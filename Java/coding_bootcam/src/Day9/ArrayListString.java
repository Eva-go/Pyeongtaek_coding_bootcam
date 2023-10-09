package Day9;

import java.util.ArrayList;

public class ArrayListString {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("빨강");
        colors.add("노랑");
        colors.add("파랑");
        colors.add("검정");
        colors.add("분홍");
        int size = colors.size();
        System.out.println("color 배열 갯수: "+size);
        System.out.println("ArrayList 요소 : "+colors);

        colors.remove("빨강");

        boolean cont = colors.contains("빨강");
        if(cont){
            System.out.println("빨강 ");
        }
        size = colors.size();
        System.out.println("color 배열의 갯수 : "+size);
    }
}
