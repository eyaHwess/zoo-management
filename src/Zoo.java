public class Zoo {
    Animal [] animals;
    String name;
    String city;
    int nbrCages;

    public Zoo(String city, String name, int nbrCages) {
        this.animals = new Animal[25];
        this.city = city;
        this.name = name;
        this.nbrCages = nbrCages;
    }
    public Zoo(){};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public void setNbrCages(int nbrCages) {
        this.nbrCages = nbrCages;
    }
}
