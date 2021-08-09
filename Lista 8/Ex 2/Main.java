import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Thomaz");
        al.add("Monteiro");
        al.add("Falcão");
        System.out.println(al);

        Set<String> hs = new HashSet<>(al);
        System.out.println(hs);

        PriorityQueue<String> pq = new PriorityQueue<>(hs);
        System.out.println(pq);

        TreeSet<String> ts = new TreeSet<>(pq);
        System.out.println(ts);
    }
}

//Visto que no hashset os elementos não são ordenados, contudo sua busca é mais eficiente em comparação às outras, com a complexidade O(1).
