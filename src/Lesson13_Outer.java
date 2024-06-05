public class Lesson13_Outer {
    private int number = 1;
    public int i = 10;
    public class Inner{
        public int i = 20;
        public void test(){
            int i = 30;
            System.out.println(i);
            System.out.println(this.i);
            System.out.println(Lesson13_Outer.this.i);
            number = 5;
            System.out.println(number);
        }
    }
    public void eat(){}
    public void speak(){}
}
