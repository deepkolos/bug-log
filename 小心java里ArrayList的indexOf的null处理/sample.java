
import java.util.ArrayList;
import java.util.Iterator;

public class IndexOf {
    public static void main(String[] args) {
        ArrayList<Item> list = new ArrayList<Item>();
        Item item = new Item("1asd", "1asd");
        Item item2 = new Item("1", "1");
        Item item3 = new Item("1asd", "1asd");
        Item item4 = new Item("2", null);

        list.add(new Item("1", "1"));
        list.add(new Item("1", "1"));
        list.add(new Item("1asd", "1asd"));
        list.add(new Item("2", null));

        System.out.println(list.indexOf(item));
        System.out.println(item.equals(item3));
        System.out.println(list.indexOf(item4));
        
        // System.out.println(item.hashCode());
        // System.out.println(item2.hashCode());
        // System.out.println(item3.hashCode());

        
    }
}

class Item {
    private String name;
    private String author;

    public Item (String name, String author) {
        // 注意null的避免, 需要在构建函数里面初始化值, 而非getter里面
        // this.name = name;
        // this.author = author;

        this.name = name == null ? "" : name;
        this.author = author == null ? "" : author;
    }

    public String getName () {
        // return name == null ? "" : name;
        return name;
    }

    public String getAuthor () {
        // return author == null ? "" : author;
        return author;
    }

    @Override
    public boolean equals(Object arg0) {
        if (arg0 instanceof Item) {
            Item other = (Item) arg0;
            return other.getName().equals(name) && other.getAuthor().equals(author);
        }
        return super.equals(arg0);
    }
}