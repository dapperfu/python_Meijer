package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* renamed from: com.google.android.gms.internal.ads.ci0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7831ci0 extends C7725bi0 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f66411a).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f66411a.iterator();
        it.getClass();
        InterfaceC6816Ef0 interfaceC6816Ef0 = this.f66412b;
        interfaceC6816Ef0.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (interfaceC6816Ef0.zza(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new C7831ci0(((SortedSet) this.f66411a).headSet(obj), this.f66412b);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f66411a;
        while (true) {
            InterfaceC6816Ef0 interfaceC6816Ef0 = this.f66412b;
            Object objLast = sortedSetHeadSet.last();
            if (interfaceC6816Ef0.zza(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new C7831ci0(((SortedSet) this.f66411a).subSet(obj, obj2), this.f66412b);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new C7831ci0(((SortedSet) this.f66411a).tailSet(obj), this.f66412b);
    }

    C7831ci0(SortedSet sortedSet, InterfaceC6816Ef0 interfaceC6816Ef0) {
        super(sortedSet, interfaceC6816Ef0);
    }
}
