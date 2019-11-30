public class Female extends People {
    private final Sex sex = Sex.FEMALE;

    public Female(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Female{" +
                "sex=" + sex +
                ", Name=" + super.getName() +
                ", Age=" + super.getAge() +
                '}';
    }

    @Override
    public People clone() {
        return new Female(this.getName(), this.getAge());
    }
}
