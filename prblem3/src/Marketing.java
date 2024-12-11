
import java.util.ArrayList;
import java.util.List;

public class Marketing {
    private String employeename;
    private String productname;
    private double salesamount;

    public Marketing(String employeename, String productname, double salesamount) {
        this.employeename = employeename;
        this.productname = productname;
        this.salesamount = salesamount;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public double getSalesamount() {
        return salesamount;
    }

    public void setSalesamount(double salesamount) {
        this.salesamount = salesamount;
    }


    @Override
    public String toString() {
        return employeename + " " + productname + " " + salesamount;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Marketing ob = (Marketing) obj;
        return employeename.equals(ob.employeename) &&
               productname.equals(ob.productname) &&
               Double.compare(salesamount, ob.salesamount) == 0;
    }
}