package Dd;

import java.util.Iterator;
import java.util.Map;

/* renamed from: Dd.r0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C3270r0 extends E0 {

    /* renamed from: a, reason: collision with root package name */
    final Map f6232a;

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f6232a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f6232a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f6232a.size();
    }

    C3270r0(Map map) {
        this.f6232a = map;
    }
}
