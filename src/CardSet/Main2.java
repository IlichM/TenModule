package CardSet;

import java.util.HashSet;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        Set<Card> set = new HashSet<>();
        //черви
        set.add(new Card("6", "черви"));
        set.add(new Card("7", "черви"));
        set.add(new Card("8", "черви"));
        set.add(new Card("9", "черви"));
        set.add(new Card("10", "черви"));
        set.add(new Card("валет", "черви"));
        set.add(new Card("дама", "черви"));
        set.add(new Card("король", "черви"));
        set.add(new Card("туз", "черви"));
        //пики
        set.add(new Card("6", "пики"));
        set.add(new Card("7", "пики"));
        set.add(new Card("8", "пики"));
        set.add(new Card("9", "пики"));
        set.add(new Card("10", "пики"));
        set.add(new Card("валет", "пики"));
        set.add(new Card("дама", "пики"));
        set.add(new Card("король", "пики"));
        set.add(new Card("туз", "пики"));
        //буби
        set.add(new Card("6", "буби"));
        set.add(new Card("7", "буби"));
        set.add(new Card("8", "буби"));
        set.add(new Card("9", "буби"));
        set.add(new Card("10", "буби"));
        set.add(new Card("валет", "буби"));
        set.add(new Card("дама", "буби"));
        set.add(new Card("король", "буби"));
        set.add(new Card("туз", "буби"));
        //крести
        set.add(new Card("6", "крести"));
        set.add(new Card("7", "крести"));
        set.add(new Card("8", "крести"));
        set.add(new Card("9", "крести"));
        set.add(new Card("10", "крести"));
        set.add(new Card("валет", "крести"));
        set.add(new Card("дама", "крести"));
        set.add(new Card("король", "крести"));
        set.add(new Card("туз", "крести"));
        //дополнительные карты
        set.add(new Card("6", "буби"));
        set.add(new Card("9", "крести"));
        set.add(new Card("валет", "пики"));
        set.add(new Card("туз", "черви"));

        System.out.println(set.size());
    }
}
