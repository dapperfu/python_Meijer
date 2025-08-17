package com.google.android.gms.internal.atv_ads_framework;

import java.util.Iterator;

/* loaded from: classes6.dex */
final class P extends J {

    /* renamed from: c, reason: collision with root package name */
    private final transient I f80857c;

    /* renamed from: d, reason: collision with root package name */
    private final transient F f80858d;

    @Override // com.google.android.gms.internal.atv_ads_framework.J, com.google.android.gms.internal.atv_ads_framework.C
    public final F h() {
        return this.f80858d;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.C
    final int a(Object[] objArr, int i10) {
        return this.f80858d.a(objArr, 0);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.C, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f80857c.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.J, com.google.android.gms.internal.atv_ads_framework.C, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.f80858d.listIterator(0);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.J, com.google.android.gms.internal.atv_ads_framework.C
    /* renamed from: k */
    public final W iterator() {
        return this.f80858d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f80857c.size();
    }

    P(I i10, F f10) {
        this.f80857c = i10;
        this.f80858d = f10;
    }
}
