package Fd;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes6.dex */
public final class F0 {
    static boolean b(Set set, Object obj) {
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

    static boolean d(Set set, Iterator it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    static int a(Set set) {
        int iHashCode;
        int i10 = 0;
        for (Object obj : set) {
            if (obj != null) {
                iHashCode = obj.hashCode();
            } else {
                iHashCode = 0;
            }
            i10 += iHashCode;
        }
        return i10;
    }

    static boolean c(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof InterfaceC3547w0) {
            collection = ((InterfaceC3547w0) collection).zza();
        }
        if ((collection instanceof Set) && collection.size() > set.size()) {
            Iterator it = set.iterator();
            collection.getClass();
            boolean z10 = false;
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }
        return d(set, collection.iterator());
    }
}
