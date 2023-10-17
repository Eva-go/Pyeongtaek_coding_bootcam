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
        while(true)
        {
            String x = in.next();
            int y = in.nextInt();
            x = in.next();
            switch (x){
                case "push": push(y);
                    break;
                case "pop": pop();
                    break;
                case "size": size();
                    break;
                case "empty": empty();
                    break;
                case "top" : top();
                    break;
            }
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
    public static int empty(){
        if(stack[stack.length-1]!=0)
            return 1;
        else
            return 0;
    }
    public static int top()
    {
        if(stack[stack.length-1]!=0)
        {
            return stack[stack.length-1];
        }
        else
            return -1;
    }

}


