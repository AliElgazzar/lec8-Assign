import java.util.Comparator;

public class SalesAmountComparator implements Comparator<Marketing> {

        @Override
        public int compare(Marketing o1, Marketing o2) {
            if (o1 == null && o2 == null) return 0;
            if (o1 == null) return -1;
            if (o2 == null) return 1;
            int salesComparison = Double.compare(o1.getSalesamount(), o2.getSalesamount());
            if (salesComparison != 0) {
                return salesComparison;
            }

            return o1.getEmployeename().compareTo(o2.getEmployeename());
        }


    }
