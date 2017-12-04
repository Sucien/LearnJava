package chapter02;

//在每个程序文件的开头，都必须放置一个import语句，导入那个文件的代码里要用到的所有额外的类。
//“额外“的意思是：java.lang默认进入每个Java代码文件，所以这些类在任何时候都可直接使用。除了这个就是额外的类。
//System和Runtime，我们在Property.java里用到了它们。java.lang里没有列出Date类，所以必须导入另一个类库才能使用它。
import java.util.*;

public class Property {
    public static void main(String[] args) {
        //创建Date对象唯一的目的就是将它的值发送给println()；
        //println:它的意思是“把我给你的东西打印到控制台，并用一个新行结束”。
        //https://docs.oracle.com/javase/7/docs/api/ 可以查看文档
        System.out.println(new Date());
        //调用getProperties()时，它会将系统属性作为Properties类的一个对象生成（注意Properties是“属性”的意思）
        //随后的的句柄保存在一个名为p的Properties句柄里。
        Properties p = System.getProperties();
        //Properties对象有一个名为list()的方法，它将自己的全部内容都发给一个我们作为自变量传递的PrintStream对象。
        p.list(System.out);

        //对于字串，+的意思是“连接这两个字串”。
        //新名词：“运算符过载”
        System.out.println("--- Memory Usage:");
        Runtime rt = Runtime.getRuntime();
        System.out.println("Total Memory = "
                + rt.totalMemory()
                + " Free Memory = "
                + rt.freeMemory());
    }
}
