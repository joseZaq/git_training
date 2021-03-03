package M05;

public class Equip {
    int id;
    String name;
    String abr;
    //contructor
    public Equip(int id, String name, String abr) {
        this.id = id;
        this.name = name;
        this.abr = abr;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAbr() {
        return abr;
    }
}
