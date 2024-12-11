
import java.util.*;

public class Statistics  {
    /**
     * Polymorphically computes and returns the sum
     * of all the salaries of all the staff/teachers in the list.
     */
    public static double computeSumOfSalaries(List<EmployeeData> aList) {

        if (aList.size() == 0 || aList == null) {
            return 0;
        }
        double TotalSum = 0;
        for (int index = 0; index < aList.size(); index++) {
            TotalSum += aList.get(index).getSalary();
        }
        return TotalSum;
    }
}
