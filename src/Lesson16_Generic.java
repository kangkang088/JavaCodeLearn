public class Lesson16_Generic {
    public static void main(String[] args) {
        //Lesson16_TestT<int>
        Lesson16_TestT<Lesson10_Son> obj = new Lesson16_TestT<>();

        obj.TestFun2(5);

        Lesson16_TestT<? extends Lesson11_IFly> obj2 = null;
        Lesson16_TestT<?> obj3 = null;
        obj2 = new Lesson16_TestT<Lesson10_Son>();
        obj2 = new Lesson16_TestT<Lesson10_Father>();
        obj3 = new Lesson16_TestT<Integer>();
    }
}
