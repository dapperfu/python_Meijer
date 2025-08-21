package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.ai0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7618ai0 extends AbstractC8044ei0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Set f73315a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Set f73316b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7618ai0(Set set, Set set2) {
        super(null);
        this.f73315a = set;
        this.f73316b = set2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final AbstractC8684ki0 iterator() {
        return new Zh0(this, this.f73315a, this.f73316b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f73315a.contains(obj) && this.f73316b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f73315a.containsAll(collection) && this.f73316b.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.f73316b, this.f73315a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f73315a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (this.f73316b.contains(it.next())) {
                i10++;
            }
        }
        return i10;
    }
}
