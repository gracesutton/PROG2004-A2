import java.util.Comparator;

public class VisitorComparator implements Comparator<Visitor> {
    /** Comparator interface method that sorts visitors using two instance variables: name and age */
    @Override
    public int compare(Visitor v1, Visitor v2) {
        int nameComparison = v1.getName().compareTo(v2.getName()); // compare by name first

        if (nameComparison == 0) { // if names are the same, then compare by age
            return Integer.compare(v1.getAge(), v2.getAge());
        }
        
        return nameComparison;
    }
}