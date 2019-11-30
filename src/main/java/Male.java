public class Male extends People {
    private final Sex sex = Sex.MALE;

    public Male(String name, int age) {
        super(name, age);

    }

    @Override
    public String toString() {
        return "Male{" +
                "sex=" + sex +
                ", Name=" + super.getName() +
                ", Age=" + super.getAge() +
                '}';
    }

    @Override
    public People clone() {
        return new Male(this.getName(), this.getAge());
    }
}
