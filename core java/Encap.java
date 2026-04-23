class InnerEncap {

    private int age;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Encap {
    public static void main(String[] args) {
        InnerEncap sc = new InnerEncap();
        sc.setName("ashish");
        sc.setAge(34);
        System.out.println(sc.getName() + ":" + sc.getAge());
    }
}
