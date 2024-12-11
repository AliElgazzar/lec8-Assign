import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {


        List<Marketing> list =new ArrayList<Marketing>();
        Marketing M1= new Marketing("John","TV",1700);
        Marketing M2=new Marketing("Emily","Mobile",2000);
        Marketing M3=new Marketing("Bob","Laptop",3000);
        Marketing M4=new Marketing("Ali","TV",1000);
        Marketing M5=new Marketing("Mark","Laptop",2500);
        list.add(M1);
        list.add(M2);
        list.add(M3);
        list.add(M4);
        list.add(M5);

        System.out.println("Size before removing: " + list.size());
        System.out.println(list);
        list.remove(M2);
        System.out.println("Removed: " + M2 + "\n Size after removing:" + list.size());
        System.out.println(list);
        System.out.println("\nEmplyee at index 0: "+list.get(0));
        list.set (0,new Marketing("samy","Ipad",1900));

        //sorted by sales amount
         Comparator<Marketing> comparatorsales = new SalesAmountComparator();
        list.sort(comparatorsales);
        System.out.println("\nSorted by sales amount: " + list);

        
        //sorted by name which sales amount more than 1000
        System.out.println("\nSorted by name more than 1000 : " + listMoreThan1000(list));

    }
    public static List<Marketing> listMoreThan1000(List<Marketing> list){

        if (list == null) return list;
        List<Marketing> listMoreThan1000 = new ArrayList<Marketing>();
        for (Marketing m : list) {
            if (m.getSalesamount() > 1000){

                listMoreThan1000.add(m);
            }
        }
        Comparator<Marketing> comparatorname = new NameComparator();
        listMoreThan1000.sort(comparatorname);
        return listMoreThan1000;

    }


}
