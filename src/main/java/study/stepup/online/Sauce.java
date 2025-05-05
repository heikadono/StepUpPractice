package study.stepup.online;

public enum Sauce {
    VERY_SPICY("Соус 1", "Очень острый"),
    SPICY("Соус 2","Острый"),
    NOT_SPICY("Соус 3","Не острый");
    private String taste;
    private String name;

    private Sauce(String name, String taste) {
        this.name = name;
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Соус " + name + ": " + taste ;
    }
}
