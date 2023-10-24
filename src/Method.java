public class Method {
    static void myMethod(){
        System.out.println("guys");
    }

    public void hello(){
        System.out.println("hello");
    }

    public Method() {
        j = 5;
    }

    public static void main(String[] args){
//        Method m = new Method();
//        m.j = 0;
//        System.out.println(m.j);
//        Main mm = new Main();
//        mm.j = 7;
//        System.out.println(mm.j);
//        m.x = 8;
        myMethod();

        Method my = new Method();
        my.hello();
        System.out.println(my.j);
    }

    int j;
    final int x = 0;
}
