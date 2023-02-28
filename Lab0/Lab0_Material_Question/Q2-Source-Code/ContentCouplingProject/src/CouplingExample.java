public class CouplingExample {
    public static void main(String[] args) {
        ContentCoupling contentCoupling = new ContentCoupling();
        contentCoupling.age = 20;
        System.out.println("age:"+contentCoupling.age);
    }
}
class ContentCoupling {
    public int age;
}