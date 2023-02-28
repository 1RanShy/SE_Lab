public class CouplingExample {
    public static void main(String[] args) {
        ContentCoupling contentCoupling = new ContentCoupling();
        contentCoupling.setAge(20);
        System.out.println("age:"+contentCoupling.getAge());
    }
}
class ContentCoupling {
    private String ageLived;
    
    public int getAge() {
        return Integer.parseInt(ageLived);
    }
    public void setAge(int age) {
        this.ageLived = String.valueOf(age);
    }
}