package Day2;

public class DoWhileTest {
    public static void main(String[] args) {
        int num=1;
        int sum =0;
        while(num<=100)
        {
            sum=sum+num;
            num++;
            System.out.println("while의 sum의 값: "+sum);
        }
        System.out.println("while밖의 num의 값 : "+num);
    }
}
