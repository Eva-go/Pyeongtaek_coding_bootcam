package Test;

import java.util.Scanner;

public class Stack {
    static int[] stack;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        if(i>=1&&i<100000){
            stack  = new int[i];
        }
        //System.out.println(stack[1]);
        String x = in.next();
        int y = in.nextInt();
        if(x.equals("push")){
            push(y);
        }
        x = in.next();
        if(x.equals("size")){
            System.out.println(size());
        }



    }
    public static void push(int i)
    {
        for(int j=0; j<stack.length; j++){
            if(stack[j] == 0)
            {
                stack[j] = i;
            }
        }
        System.out.println(stack[i]);
    }
    public static int pop()
    {
        int p =stack[stack.length-1];
        stack[stack.length-1] = 0;
        return p;
    }
    public static int size()
    {
        return stack.length;
    }

}


