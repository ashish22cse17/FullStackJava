class Laptop extends Object {
    String bname;
    int cost;
    @Override
    public String toString() {
        return "Laptop [bname=" + bname + ", cost=" + cost + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((bname == null) ? 0 : bname.hashCode());
        result = prime * result + cost;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (bname == null) {
            if (other.bname != null)
                return false;
        } else if (!bname.equals(other.bname))
            return false;
        if (cost != other.cost)
            return false;
        return true;
    }

}

public class Obejectclass {
    public static void main(String[] args) {
        Laptop obj=new Laptop();
        obj.bname="dell";
        obj.cost=323;
        System.out.println(obj);
    }
}
