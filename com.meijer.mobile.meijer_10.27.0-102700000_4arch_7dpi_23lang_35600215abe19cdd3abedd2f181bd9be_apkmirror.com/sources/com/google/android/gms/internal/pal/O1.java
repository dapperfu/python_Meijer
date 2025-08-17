package com.google.android.gms.internal.pal;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
public final class O1 extends AbstractList implements RandomAccess, N0 {

    /* renamed from: a, reason: collision with root package name */
    private final N0 f82799a;

    @Override // com.google.android.gms.internal.pal.N0
    public final N0 zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.pal.N0
    public final void Y0(AbstractC10605b0 abstractC10605b0) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return ((M0) this.f82799a).get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new N1(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new M1(this, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f82799a.size();
    }

    @Override // com.google.android.gms.internal.pal.N0
    public final Object zzf(int i10) {
        return this.f82799a.zzf(i10);
    }

    @Override // com.google.android.gms.internal.pal.N0
    public final List zzh() {
        return this.f82799a.zzh();
    }

    public O1(N0 n02) {
        this.f82799a = n02;
    }
}
