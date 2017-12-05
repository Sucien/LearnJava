package chapter03;

class Number {
    int i;
}
/********************************************/
class Letter {
    char c;
}
/********************************************/
class Value {
    int i;
}

public class AboutOperator {
    static int X = 1;
    static int Y = 2;
    static int Z = 3;

    static void f(Letter y) {
        y.c = 'z';
    }

    static void prt(String s) {
        System.out.println(s);
    }

    static boolean test1(int val) {
        System.out.println("test1(" + val + ")");
        System.out.println("result: " + (val < 1));
        return val < 1;
    }
    static boolean test2(int val) {
        System.out.println("test2(" + val + ")");
        System.out.println("result: " + (val < 2));
        return val < 2;
    }
    static boolean test3(int val) {
        System.out.println("test3(" + val + ")");
        System.out.println("result: " + (val < 3));
        return val < 3;
    }
    public static void main(String[] args) {
        int a = X + Y - 2/2 + Z;
        int b = X + (Y-2)/(2+Z);
        //5
        System.out.println(a);
        //1
        System.out.println(b);
        prt("*********************************");
        //对一个对象进行操作时，我们真正操作的是它的句柄。
        //所以倘若“从一个对象到另一个对象”赋值，实际就是将句柄从一个地方复制到另一个地方。
        Number n1 = new Number();
        Number n2 = new Number();
        n1.i = 9;
        n2.i = 47;
        //9 47
        System.out.println("1: n1.i: " + n1.i + ", n2.i: " + n2.i);
        //47 47
        n1 = n2;
        //此时n1对象会被垃圾收集器自动清除：这种现象通常叫做“别名”12章将会详细说明
        System.out.println("2: n1.i: " + n1.i + ", n2.i: " + n2.i);
        //27 27
        n1.i = 27;
        System.out.println("3: n1.i: " + n1.i + ", n2.i: " + n2.i);
        prt("*********************************");
        Letter x = new Letter();
        x.c = 'a';
        System.out.println("1: x.c: " + x.c);
        //在调用f()的时候讲道理是应该通过一个对象副本发生对象传递，但是并没！
        f(x);
        System.out.println("2: x.c: " + x.c);
        prt("*********************************");
        int i = 1;
        prt("i : " + i);
        prt("++i : " + ++i); // 先加再显示
        prt("i++ : " + i++); // 先显示再加
        prt("i : " + i);
        prt("--i : " + --i); // Pre-decrement
        prt("i-- : " + i--); // Post-decrement
        prt("i : " + i);
        prt("*********************************");
        Integer n3 = new Integer(47);
        Integer n4 = new Integer(47);
        System.out.println(n3);
        System.out.println(n4);
        //但尽管对象的内容相同，句柄却是不同的，而==和!=比较的正好就是对象句柄。
        System.out.println(n3 == n4);
        System.out.println(n3 != n4);
        //使用所有对象都适用的特殊方法equals()
        System.out.println(n3.equals(n4));
        prt("*********************************");
        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 100;
        //这是由于equals()的默认行为是比较句柄 在第七章详细学习
        System.out.println(v1.i);
        System.out.println(v2.i);
        System.out.print("比较结果：");
        System.out.println(v1.equals(v2));
        System.out.println("新一代比较结果："+(v1.equals(v2)));
        prt("***************短路***************");
        //并没有运行test3()
        if(test1(0) && test2(2) && test3(2))
            System.out.println("expression is true");
        else
            System.out.println("expression is false");
        prt("***************强制类型转换***************");
        long c = 300;
        //“缩小转换”（Narrowing Conversion）的操作,必用强制类型转换
        int c1 = (int) c;
        int c2 = 200;
        System.out.println(c1);
        System.out.println(c2);
        //通常，表达式中最大的数据类型是决定了表达式最终结果大小的那个类型。
        //若将一个float值与一个double值相乘，结果就是double；如将一个int和一个long值相加，则结果为long。


    }
}
