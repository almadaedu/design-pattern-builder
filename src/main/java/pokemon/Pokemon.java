package pokemon;

public class Pokemon {

    private int number;
    private String name;
    private String type;
    private int generation;
    private String weakness;
    private String hability;

    public Pokemon(){
        this.number = 0;
        this.name = "";
        this.type = "";
        this.generation = 1;
        this.weakness = "";
        this.hability = "";
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    public String getWeakness() {
        return weakness;
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }

    public String getHability() {
        return hability;
    }

    public void setHability(String hability) {
        this.hability = hability;
    }

}
