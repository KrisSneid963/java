class Member {
    private final int id;
    private final String name;
    private final int age;

    public Member(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return id + ": " + name + ", Age: " + age;
    }
}
