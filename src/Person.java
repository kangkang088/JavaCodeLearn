public class Person {
    public String name;
    private String secret;
    protected int age;
    public Person girlFriend;
    public Person[] boyFriend;
    public E_Sex sex = E_Sex.Man;

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public enum E_Sex{
        Man,WoMan
    }
    public Person(){

    }
    public Person(String name){
        this.name = name;
    }
}

