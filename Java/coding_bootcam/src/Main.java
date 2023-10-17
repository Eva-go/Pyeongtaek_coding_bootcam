import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static int[] stack;
    public static int size =0;
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int k = Integer.parseInt(br.readLine());
        stack  = new int[k];
        while(k-- > 0)
        {
            st = new StringTokenizer(br.readLine(), " ");
            switch (st.nextToken()){
                case "push": push(Integer.parseInt(st.nextToken));
                break;
                case "pop": sb.append(pop()).append('\n');
                break;
                case "size": sb.append(size()).append('\n');
                break;
                case "empty": sb.append(empty()).append('\n');
                break;
                case "top" : sb.append(top()).append('\n');
                break;
            }
        }
    }
    public static void push(int i)
    {
        stack[size] = i;
        size++;
    }
    public static int pop()
    {
        if(size ==0){
            return -1;
        }
        else{
            int r = stack[size-1];
            stack[size-1] =0;
            size--;
            return r;
        }
    }
    public static int size()
    {
        return size;
    }
    public static int empty(){
        if(size !=0)
            return 1;
        else
            return 0;
    }
    public static int top()
    {
        if(size !=0)
        {
            return stack[size-1];
        }
        else
            return -1;
    }
}