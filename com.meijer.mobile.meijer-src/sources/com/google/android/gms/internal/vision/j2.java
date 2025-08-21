package com.google.android.gms.internal.vision;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
public final class j2 extends AbstractList<String> implements InterfaceC11158g1, RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC11158g1 f85403a;

    @Override // com.google.android.gms.internal.vision.InterfaceC11158g1
    public final InterfaceC11158g1 zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC11158g1
    public final void g3(AbstractC11161h0 abstractC11161h0) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        return (String) this.f85403a.get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new m2(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i10) {
        return new C11167i2(this, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f85403a.size();
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC11158g1
    public final Object zzb(int i10) {
        return this.f85403a.zzb(i10);
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC11158g1
    public final List<?> zzd() {
        return this.f85403a.zzd();
    }

    public j2(InterfaceC11158g1 interfaceC11158g1) {
        this.f85403a = interfaceC11158g1;
    }
}
