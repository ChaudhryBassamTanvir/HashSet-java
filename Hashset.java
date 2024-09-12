import java.util.HashSet;
import java.util.Iterator;

class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        // insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(6);
        // print all elements
        System.out.println(set);
        // search
        if (set.contains(1)) {
            System.out.println("set has 1");
        }
        if (!set.contains(6)) {
            System.out.println("does not contain 6");
        }
        // detele
        set.remove(1);
        if (!set.contains(1))// jb remove ho jye ga tu false de ga tu mera not operator not ko true banai ga
        {
            System.out.println("we del 1");
        }
        System.out.println("set size " + set.size());
        // iterator
        @SuppressWarnings("rawtypes")
        Iterator it = set.iterator();// bht imp concept kyo k set ka koi index nahi hota traverse karne k liyay iss
                                     // liyay iterative it create kia ab jis ke type b ityerative he hai ab iss ke
                                     // madad se hum handle kre ge isse se iterate kre ge

        // hasNext
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}