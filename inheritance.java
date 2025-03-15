class sena{
    int age;
    String name;
}
class hi extends sena{

}

public class inheritance {
    public static void main(String args[]){
        hi s1=new hi();
        s1.age=12;
        s1.name="sri";
        System.out.println(s1.age);
        System.out.println(s1.name);
    }
}
