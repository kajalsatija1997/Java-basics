package kairav;

public class Animal {
    private String name;
    private String colour;
    public static String code="Code123";

    public Animal()
    {
        code="123";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "code= "+code+
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
