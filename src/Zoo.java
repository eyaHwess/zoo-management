import java.util.Arrays;

public class Zoo {
    Animal [] animals;
    String name;
    String city;
    int nbrCages;

    public Zoo(String city, String name, int nbrCages) {
        if (nbrCages>25){
            throw new IllegalArgumentException("nbr Cages can't be greater than 25");
        }
        this.animals = new Animal[nbrCages];
        this.city = city;
        this.name = name;
        this.nbrCages = nbrCages;
    }
    public Zoo(){};

    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + Arrays.toString(animals) +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }
}
