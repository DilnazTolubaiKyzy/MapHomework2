import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<City> cities = new ArrayList<>();
        cities.add(new City(16,"Moscow"));
        cities.add(new City(15,"Bishkek"));
        cities.add(new City(13,"New-York"));

        for (City city : cities) {
            if (city.getCode() != 0){
                TreeSet<City> cityTreeSet = new TreeSet<City>(new Comparator<City>() {
                    @Override
                    public int compare(City o1, City o2) {
                        return o1.getCode() - o2.getCode();
                    }
                });
                cityTreeSet.addAll(cityTreeSet);
                System.out.println(city);
            }
        }


}
}