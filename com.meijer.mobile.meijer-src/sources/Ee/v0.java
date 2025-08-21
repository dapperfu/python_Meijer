package Ee;

import java.util.Comparator;
import java.util.SortedSet;

/* loaded from: classes6.dex */
final class v0 {
    public static <E> Comparator<? super E> a(SortedSet<E> sortedSet) {
        Comparator<? super E> comparator = sortedSet.comparator();
        if (comparator == null) {
            return g0.d();
        }
        return comparator;
    }

    public static boolean b(Comparator<?> comparator, Iterable<?> iterable) {
        Comparator comparator2;
        De.p.q(comparator);
        De.p.q(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = a((SortedSet) iterable);
        } else if (iterable instanceof u0) {
            comparator2 = ((u0) iterable).comparator();
        } else {
            return false;
        }
        return comparator.equals(comparator2);
    }
}
