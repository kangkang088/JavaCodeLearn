public class Lesson13_InternalClass {
    public static void main(String[] args) {
        Lesson13_Outer externalClass = new Lesson13_Outer();
        Lesson13_Outer.Inner internalClass = externalClass.new Inner();
        internalClass.test();
        Lesson13_Outer externalClass_s = new Lesson13_Outer(){
            public void eat(){
                System.out.println("匿名内部类吃东西");
            }
            public void speak(){
                System.out.println("匿名内部类说话");
            }
            final int test = 5;
            public void Test(){
                System.out.println(i);
            }
        };
        externalClass_s.eat();
        externalClass_s.speak();
    }

}
