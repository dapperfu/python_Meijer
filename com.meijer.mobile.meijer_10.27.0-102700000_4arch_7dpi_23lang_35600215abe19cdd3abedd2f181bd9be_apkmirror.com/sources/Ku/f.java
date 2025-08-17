package Ku;

import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes7.dex */
public abstract class f {
    protected abstract Iterator<e> a();

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        Iterator<e> itA = a();
        Iterator<e> itA2 = ((f) obj).a();
        HashMap map = new HashMap();
        while (itA != null && itA.hasNext()) {
            e next = itA.next();
            if (map.containsKey(next)) {
                map.put(next, Integer.valueOf(((Integer) map.get(next)).intValue() + 1));
            } else {
                map.put(next, 1);
            }
        }
        while (itA2 != null && itA2.hasNext()) {
            e next2 = itA2.next();
            if (!map.containsKey(next2)) {
                return false;
            }
            int iIntValue = ((Integer) map.get(next2)).intValue();
            if (iIntValue > 1) {
                map.put(next2, Integer.valueOf(iIntValue - 1));
            } else {
                map.remove(next2);
            }
        }
        return map.isEmpty();
    }

    public String toString() {
        return "TagContext";
    }

    public final int hashCode() {
        Iterator<e> itA = a();
        int iHashCode = 0;
        if (itA == null) {
            return 0;
        }
        while (itA.hasNext()) {
            e next = itA.next();
            if (next != null) {
                iHashCode += next.hashCode();
            }
        }
        return iHashCode;
    }
}
