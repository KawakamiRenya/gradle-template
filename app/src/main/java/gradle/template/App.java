/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gradle.template;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }
    /**
     * 二つの整数の合計を返します
     * @param a 引数1
     * @param b 引数2
     * @return 引数の合計値
     */
    public int addNum(final int a, final int b) {
        return a-b;
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        System.out.println(new App().addNum(1, 2));
    }
}
