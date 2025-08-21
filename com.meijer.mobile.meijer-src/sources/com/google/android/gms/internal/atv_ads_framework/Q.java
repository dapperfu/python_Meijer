package com.google.android.gms.internal.atv_ads_framework;

/* loaded from: classes6.dex */
final class Q extends F {

    /* renamed from: d, reason: collision with root package name */
    private final transient Object[] f81699d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f81700e;

    /* renamed from: f, reason: collision with root package name */
    private final transient int f81701f;

    @Override // com.google.android.gms.internal.atv_ads_framework.C
    final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f81701f;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        r.a(i10, this.f81701f, "index");
        Object obj = this.f81699d[i10 + i10 + this.f81700e];
        obj.getClass();
        return obj;
    }

    Q(Object[] objArr, int i10, int i11) {
        this.f81699d = objArr;
        this.f81700e = i10;
        this.f81701f = i11;
    }
}
