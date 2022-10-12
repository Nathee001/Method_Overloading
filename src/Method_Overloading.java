public class Method_Overloading {
    void show(){
        int a=12345;
        System.out.println(a);
    }
    void show(int b ,String c){
        b=123;
        c="abc";
        System.out.println(b+" and "+c);
    }
    void show( String d){
        d="54abcd";
        System.out.println(d);
    }
    void show(double x){
        x=8.89;
        System.out.println(x);
    }
    public static void main(String[] args) {
        Method_Overloading over=new Method_Overloading();
        over.show();
        over.show(123,"abc");
        over.show("54abcd");
        over.show(8.89);



    }
}
