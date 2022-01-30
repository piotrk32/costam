import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args)
    {
        List<String> names = new ArrayList<>();
        names.add("asdasd");
        names.add("a");
        names.add("ac");
        names.add("ds3");
        names.add("asfsd");
        names.sort((o1, o2) -> Integer.compare(o1.length(), o2.length()));
        System.out.println(names);
        names.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });
        List<String> modifiedList = new ArrayList<>();
        Random random = new Random();
        for (String name : names) {
            String modifiedName = name + " " + random.nextInt(11);
            modifiedList.add(modifiedName);


        }
        System.out.println(modifiedList);

    }
}
