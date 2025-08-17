package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* renamed from: com.google.android.gms.internal.ads.ci0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7706ci0 extends C7600bi0 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f65571a).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f65571a.iterator();
        it.getClass();
        InterfaceC6691Ef0 interfaceC6691Ef0 = this.f65572b;
        interfaceC6691Ef0.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (interfaceC6691Ef0.zza(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new C7706ci0(((SortedSet) this.f65571a).headSet(obj), this.f65572b);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f65571a;
        while (true) {
            InterfaceC6691Ef0 interfaceC6691Ef0 = this.f65572b;
            Object objLast = sortedSetHeadSet.last();
            if (interfaceC6691Ef0.zza(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new C7706ci0(((SortedSet) this.f65571a).subSet(obj, obj2), this.f65572b);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new C7706ci0(((SortedSet) this.f65571a).tailSet(obj), this.f65572b);
    }

    C7706ci0(SortedSet sortedSet, InterfaceC6691Ef0 interfaceC6691Ef0) {
        super(sortedSet, interfaceC6691Ef0);
    }
}
