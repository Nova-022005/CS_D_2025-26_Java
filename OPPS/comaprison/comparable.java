package OPPS.comaprison;
// in java.lang package there is an interface called comparable
// it is used to compare the objects of the same class
// it has a method called compareTo()
// it returns an integer value
// if the value is 0 then the two objects are equal
// if the value is positive then the first object is greater than the second object
// if the value is negative then the first object is less than the second object
// it is used to sort the objects of the same class
// it is used in collections framework
// it is used in sorting algorithms
// it is used in searching algorithms
// it is used in data structures
// it is used in algorithms
// it is used in java.util package
// follow natural order


class comparable implements Comparable<comparable> {
    int id;
    String name;
    comparable(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return id + "-" + name;
    }

    @Override
    public int compareTo(comparable other) {
        return this.id-other.id;
        // return this.name.compareTo(other.name);
    }
}

public class A13 {
    public static void main(String[] args) {
        List<comparable> list = new ArrayList<>();
        list.add(new comparable(20, "AJ"));
        list.add(new comparable(10, "ZJ"));
        list.add(new comparable(30, "CJ"));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }

}