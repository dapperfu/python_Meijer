package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.ads.uh0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9626uh0 extends AbstractSequentialList implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final List f78891a;

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC9408sf0 f78892b;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f78891a.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new C9519th0(this, this.f78891a.listIterator(i10));
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        this.f78891a.subList(i10, i11).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f78891a.size();
    }

    C9626uh0(List list, InterfaceC9408sf0 interfaceC9408sf0) {
        list.getClass();
        this.f78891a = list;
        this.f78892b = interfaceC9408sf0;
    }
}
