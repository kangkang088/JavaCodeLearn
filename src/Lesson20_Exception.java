public class Lesson20_Exception {
    public static void main(String[] args) {
        try {
            throw new Lesson20_MyException("12112121");
        }
        catch (Lesson20_MyException ex){
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println();
        }
    }
}
