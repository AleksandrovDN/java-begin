package Course3;

public class Operation {

    Integer a = 5, b=7, c;
    String str1 = "$___$", str2 = "^_O_^", result;

    public void foo(){
        c = a + b * a;

        a-=b;

        result = str1 + str2;

        System.out.println(c);
        System.out.println(result);
    }

}
