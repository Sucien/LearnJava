package chapter02;

public class UseHandle {
    public static void main(String[] args) {
        //一种更安全的做法是：创建一个句柄时，记住无论如何都进行初始化：
        //未初始化将会影响其传值
        String s = "Hello World";
        //创建句柄时，我们希望它同一个新对象连接。通常用new关键字达到这一目的。new的意思是：“把我变成这些对象的一种新类型”。
        String t = new String("Hello World");



    }
}
