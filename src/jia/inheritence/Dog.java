package jia.inheritence;

public class Dog extends Animal{
    private boolean isBark;

    public boolean isBark() {
        return isBark;
    }

    public void setBark(boolean bark) {
        isBark = bark;
    }

    @Override
    public String toString() {
        return "Cost: "+getCost()+", Color: "+getColor()+ ", isBark: "+isBark();
    }
}
