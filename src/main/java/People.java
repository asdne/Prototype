public abstract class People {
    private String Name;
    private int age;

    public People(String name, int age) {
        Name = name;
        this.age = age;
    }

    @Override
    public abstract People clone();

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
