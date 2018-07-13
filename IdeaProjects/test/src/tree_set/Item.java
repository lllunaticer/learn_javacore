package tree_set;
import java.util.*;

public class Item implements Comparable<Item>{
    private String description;
    private int partNumber;

    public Item(String aDescription, int aPartNumber){
        description = aDescription;
        partNumber = aPartNumber;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "[description="+description+", partNumber="+partNumber+"]";
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this==otherObject) return true;
        if (otherObject==null) return false;
        if(getClass()!=otherObject.getClass()) return false;
        Item other = (Item) otherObject;
        return Objects.equals(description, ((Item) otherObject).description) && partNumber == other.partNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(description,partNumber);
    }

    @Override
    public int compareTo(Item other) {
        int diff = Integer.compare(partNumber, other.partNumber);
        return diff!=0?diff:description.compareTo(other.description);
        //主函数并未用到此方法
    }
}
