package Lektion9;

public abstract class Personer {
    String name;

    public Personer(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " Navn= " + name;
    }
}
