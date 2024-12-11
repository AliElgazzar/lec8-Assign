import java.util.Comparator;

public class NameComparator implements Comparator<Marketing> {


    @Override
    public  int compare(Marketing o1, Marketing o2) {
        return o1.getEmployeename().compareTo(o2.getEmployeename());
    }
}


