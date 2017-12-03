package chapter02;

class ATypeName{
    int i;
    float f;
    boolean b;

}
class OnlyType{
    ATypeName aa = new ATypeName();
}

public class AboutType {
    public static void main(String[] args) {
        //局部变量不会被初始化
        //int hello;
        //可将值赋给数据成员
        ATypeName a = new ATypeName();
        a.i = 100;
        a.f = 11.11f;
        a.b = true;
        System.out.println(a.i);
        System.out.println(a.f);
        System.out.println(a.b);

        //一个对象也可能包含了另一个对象，而另一个对象里则包含了我们想修改的数据。
        OnlyType o = new OnlyType();
        o.aa.i = 111;
        System.out.println(o.aa.i);
    }
}
