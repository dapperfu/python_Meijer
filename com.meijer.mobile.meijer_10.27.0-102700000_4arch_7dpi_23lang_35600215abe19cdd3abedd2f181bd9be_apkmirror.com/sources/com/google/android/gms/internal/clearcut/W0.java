package com.google.android.gms.internal.clearcut;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
final class W0<E> extends AbstractC10333t<E> {

    /* renamed from: c, reason: collision with root package name */
    private static final W0<Object> f81222c;

    /* renamed from: b, reason: collision with root package name */
    private final List<E> f81223b;

    static {
        W0<Object> w02 = new W0<>();
        f81222c = w02;
        w02.zzv();
    }

    W0() {
        this(new ArrayList(10));
    }

    public static <E> W0<E> e() {
        return (W0<E>) f81222c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, E e10) {
        a();
        this.f81223b.add(i10, e10);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i10) {
        return this.f81223b.get(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final E remove(int i10) {
        a();
        E eRemove = this.f81223b.remove(i10);
        ((AbstractList) this).modCount++;
        return eRemove;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i10, E e10) {
        a();
        E e11 = this.f81223b.set(i10, e10);
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f81223b.size();
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC10308k0
    public final /* synthetic */ InterfaceC10308k0 zzi(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.f81223b);
        return new W0(arrayList);
    }

    private W0(List<E> list) {
        this.f81223b = list;
    }
}
