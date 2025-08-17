package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.ai0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7493ai0 extends AbstractC7919ei0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Set f72475a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Set f72476b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7493ai0(Set set, Set set2) {
        super(null);
        this.f72475a = set;
        this.f72476b = set2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final AbstractC8559ki0 iterator() {
        return new Zh0(this, this.f72475a, this.f72476b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f72475a.contains(obj) && this.f72476b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f72475a.containsAll(collection) && this.f72476b.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.f72476b, this.f72475a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f72475a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (this.f72476b.contains(it.next())) {
                i10++;
            }
        }
        return i10;
    }
}
