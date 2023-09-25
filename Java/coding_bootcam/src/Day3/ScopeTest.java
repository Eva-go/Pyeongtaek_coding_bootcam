package Day3;

public class ScopeTest {
    int classvar1 =10;
    static int staticvar1= 13;

    public void scopeTest1(int var1)
    {
        int localvar1 =21;
        System.out.println(classvar1);
        System.out.println(staticvar1);
        System.out.println(localvar1);
    }
    public void scopTest2(int var2)
    {
        int localvar2 =21;
        System.out.println(classvar1);
        System.out.println(staticvar1);
        //System.out.println(localvar1);
        System.out.println(localvar2);
    }

    public static void main(String[] args)
    {  //System.out.println(classvar1);
        System.out.println(staticvar1);
       // System.out.println(localvar1);
       //System.out.println(localvar2);
    }
}
