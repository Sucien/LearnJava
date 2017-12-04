package chapter02;

class StaticTest{
    static int i = 47;
}

class StaticFun{
    static void incr(){
        StaticTest.i++;
    }
}


public class AboutStatic {
    public static void main(String[] args) {

        //静态的作用：可以在不用创建那个对象的时候使用那个变量或者方法


        //有两个方法可以引用一个static变量
        //1.可以通过一个对象命名它
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();

        System.out.println("通过一个对象访问："+st1.i);
        System.out.println("通过一个对象访问："+st2.i);
        //2.可以直接用它的类名引用 最好用这个办法引用static变量，因为它强调了“静态”
        StaticTest.i++;
        System.out.println("通过静态类名访问："+StaticTest.i);

        //静态变量的访问也适用于静态方法：
        //对方法来说，static一项重要的用途就是帮助我们在不必创建对象的前提下调用那个方法。
       /* StaticFun sf = new StaticFun();
          sf.incr();*/
       //或者通过它的类来调用：
        StaticFun.incr();
        System.out.println("使用过静态方法后的静态变量："+StaticTest.i);
    }
}
