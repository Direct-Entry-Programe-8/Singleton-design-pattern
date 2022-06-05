public class SingletonDemo {

    public static void main(String[] args) {
        Abc instance1 = Abc.getInstance();
        Abc instance2 = Abc.getInstance();
        Abc instance3 = Abc.getInstance();
        Abc instance4 = Abc.getInstance();

        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance3);
        System.out.println(instance4);



    }


}
