package chapter02;

public class AboutWrapper {

    public static void test(Integer num){
        System.out.println("Integer num");
    }
    public static void test(long num){
        System.out.println("long num");
    }

    public static void main(String[] args) {
        //JDK1.5开始实现自动装箱：
        //装箱指：将基本数据类型转换为对应的封装器类型
        //拆箱指：将封装器类型转换为对应的基本数据类型。

        //其中将基本数据类型转换为封装器类型需要调用封装类的静态方法T.valueOf();
        // T代表封装器类型的名称
        Integer a = 1;//装箱,底层实现：Integer a = Integer.valueOf(1);

        //将封装器类型转换为基本数据类型需要调用它的实例方法xValue();
        // x代表基础数据类型的名称；
        int b = a ;//拆箱,底层实现：int b = a.intValue()


        //为了提高封装器的效率，Java将常用的数据缓存起来放到封装器对象数组里面，装箱的时候判断如果数据在缓存的范围内则从缓存里面取出对象，否则将new一个出来。
        //该数组的范围默认为：-128~127
        Integer aa = 127;
        Integer bb = 127;
        System.out.println(aa == bb);
        Integer cc = 128;
        Integer dd = 128;
        System.out.println(cc == dd);
        Integer ee = -128;
        Integer ff = -128;
        System.out.println(ee == ff);
        Integer gg = -129;
        Integer hh = -129;
        System.out.println(gg == hh);
        //因为 == 比较的是引用 当超出范围就会new一个新的对象，引用不同！
        //可以通过-Djava.lang.Integer.IntegerCache.high=128 指定上限为128

        //Java为了向下兼容，保证程序的正确性，在方法重载时先不考虑自动装拆箱，而是遵循最精确匹配的原则，找最匹配的类型。
        test(1);

        Integer c = new Integer("23");
        System.out.println(c);
        //假如想让堆内一个非主要对象表示那个主类型，就要使用对应的封装器
        char d = 'x';
        Character e = new Character(d);
        System.out.println(e);
        System.out.println(d);
    }
}
