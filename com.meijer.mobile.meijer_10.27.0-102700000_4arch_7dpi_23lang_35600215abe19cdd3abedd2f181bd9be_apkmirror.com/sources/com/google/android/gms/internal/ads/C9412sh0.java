package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.sh0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9412sh0 extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: a, reason: collision with root package name */
    final List f78290a;

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC9408sf0 f78291b;

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return this.f78291b.apply(this.f78290a.get(i10));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f78290a.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new C9199qh0(this, this.f78290a.listIterator(i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        return this.f78291b.apply(this.f78290a.remove(i10));
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        this.f78290a.subList(i10, i11).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f78290a.size();
    }

    C9412sh0(List list, InterfaceC9408sf0 interfaceC9408sf0) {
        list.getClass();
        this.f78290a = list;
        this.f78291b = interfaceC9408sf0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }
}
