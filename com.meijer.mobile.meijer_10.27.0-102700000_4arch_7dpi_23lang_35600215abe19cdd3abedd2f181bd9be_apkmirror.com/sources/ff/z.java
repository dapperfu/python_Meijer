package ff;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes7.dex */
public final class z {
    static boolean a(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <E> HashSet<E> c(int i10) {
        return new HashSet<>(t.a(i10));
    }

    static int b(Set<?> set) {
        int iHashCode;
        int i10 = 0;
        for (Object obj : set) {
            if (obj != null) {
                iHashCode = obj.hashCode();
            } else {
                iHashCode = 0;
            }
            i10 = ~(~(i10 + iHashCode));
        }
        return i10;
    }
}
