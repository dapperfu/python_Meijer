package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.ads.uh0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9751uh0 extends AbstractSequentialList implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final List f79731a;

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC9533sf0 f79732b;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f79731a.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new C9644th0(this, this.f79731a.listIterator(i10));
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        this.f79731a.subList(i10, i11).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f79731a.size();
    }

    C9751uh0(List list, InterfaceC9533sf0 interfaceC9533sf0) {
        list.getClass();
        this.f79731a = list;
        this.f79732b = interfaceC9533sf0;
    }
}
