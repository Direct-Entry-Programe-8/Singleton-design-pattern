public class Abc {

   private static Abc instance;


    private Abc(){
    }

    public static Abc getInstance(){
       return  (instance == null)? instance = new Abc() : instance;

    }

}
