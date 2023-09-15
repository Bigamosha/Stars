public class Stars {
    private String name;
    private int age;

    public void Brightly() {
        System.out.println("1,88 гига канделы ");
    }

    public void mass() {
        System.out.println("1,9891·10³⁰ кг");
    }

    public static void main(String[] args) {
        Stars sun = new Stars();
        sun.age = 5;
        sun.name = "Солнце";

        sun.Brightly();
        sun.mass();
    }
}
