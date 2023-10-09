package Day9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExam {
    public static void main(String[] args) {
        Map<String,Integer> m = new HashMap<>();
        m.put("h",11);
        m.put("e",21);
        m.put("l",31);
        m.put("l",41);
        m.put("o",51);

        Iterator<String> iterator = m.keySet().iterator();

        while (iterator.hasNext()){
            String key = iterator.next();
            Integer num = m.get(key);
            System.out.println(key+":"+ num);
        }
    }
}
