package Day9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorExam {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("사과");
        list.add("바나나");
        list.add("딸기");
        list.add("체리");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String fruit = iterator.next();
            System.out.println(fruit);
        }
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);

        Iterator<Integer> iterator1 = set.iterator();

        while(iterator1.hasNext()){
            int num = iterator1.next();
            System.out.println(num);
        }
    }
}
