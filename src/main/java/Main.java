public class Main {

    public static void main(String[] args) {
        Person p1 = new Person(1.72, 14);
        Person p2 = new Person();



        System.out.println(p1.getHøjde());
        p1.setHøjde(1.79);
        System.out.println("ny højde" + p1.getHøjde());
        p1.harFødselsdag();
        System.out.println(p1.getAlder());
    }
}
