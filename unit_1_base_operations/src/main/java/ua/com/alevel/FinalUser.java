package ua.com.alevel;

public final class FinalUser {

    private final String name;

    public FinalUser(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
