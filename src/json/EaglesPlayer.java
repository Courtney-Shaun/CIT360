package json;

public class EaglesPlayer {


    private String name;
    private int number;
    private String position;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    public String toString() {
        return "Player Name: " + name + "  " + "Number: " + number + "  " + "Position: " + position;
    }
}
