package com.google.android.gms.internal.atv_ads_framework;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
/* loaded from: classes6.dex */
public final class V1 extends AbstractList implements RandomAccess, W0 {

    /* renamed from: a, reason: collision with root package name */
    private final W0 f80911a;

    @Override // com.google.android.gms.internal.atv_ads_framework.W0
    public final W0 zzd() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return ((V0) this.f80911a).get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new U1(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new T1(this, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f80911a.size();
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.W0
    public final Object zze(int i10) {
        return this.f80911a.zze(i10);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.W0
    public final List zzh() {
        return this.f80911a.zzh();
    }

    public V1(W0 w02) {
        this.f80911a = w02;
    }
}
