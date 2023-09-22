package Day2;

public class ArrayTest {
    public static void main(String[] args) {
        int[] num={1,2,3,5,8,13,21,34,55,89,144,233};
        int sum=0;
        for (int i=0; i<num.length;i++)
        {
            System.out.println("Array의 요소: "+num[i]);
            sum+=num[i];
        }
        System.out.println("합계: "+sum);
    }
}
