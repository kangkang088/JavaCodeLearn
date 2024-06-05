import java.util.function.Function;

public class Lesson22_MethodReference_FunctionInterface {
    public static void test(){
        System.out.println("method invoke!");
    }
    public void test2(){
        System.out.println("method2 invoke!");
    }
    public static void main(String[] args) {
        ITest01 t = Lesson22_MethodReference_FunctionInterface::test;
        t.func();

        Lesson22_MethodReference_FunctionInterface obj = new Lesson22_MethodReference_FunctionInterface();
        t = obj::test2;
        t.func();

        Function<Integer,String> function = (a)->{
            return a.toString();
        };
        function.apply(6);
    }
}
interface ITest01{
    void func();
}
