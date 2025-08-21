package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* renamed from: com.google.android.gms.internal.ads.gi0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8258gi0 {
    static boolean d(Set set, Object obj) {
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

    static boolean f(Set set, Iterator it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    public static AbstractC8044ei0 b(Set set, Set set2) {
        C6782Df0.c(set, "set1");
        C6782Df0.c(set2, "set2");
        return new C7618ai0(set, set2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Set c(Set set, InterfaceC6816Ef0 interfaceC6816Ef0) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof C7725bi0)) {
                set.getClass();
                return new C7725bi0(set, interfaceC6816Ef0);
            }
            C7725bi0 c7725bi0 = (C7725bi0) set;
            return new C7725bi0((Set) c7725bi0.f66411a, C6918Hf0.a(c7725bi0.f66412b, interfaceC6816Ef0));
        }
        SortedSet sortedSet = (SortedSet) set;
        if (!(sortedSet instanceof C7725bi0)) {
            sortedSet.getClass();
            return new C7831ci0(sortedSet, interfaceC6816Ef0);
        }
        C7725bi0 c7725bi02 = (C7725bi0) sortedSet;
        return new C7831ci0((SortedSet) c7725bi02.f66411a, C6918Hf0.a(c7725bi02.f66412b, interfaceC6816Ef0));
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

    static boolean e(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof InterfaceC7091Mh0) {
            collection = ((InterfaceC7091Mh0) collection).zza();
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
        return f(set, collection.iterator());
    }
}
