package com.google.android.gms.internal.atv_ads_framework;

/* loaded from: classes6.dex */
final class M extends F {

    /* renamed from: f, reason: collision with root package name */
    static final F f81684f = new M(new Object[0], 0);

    /* renamed from: d, reason: collision with root package name */
    final transient Object[] f81685d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f81686e;

    @Override // com.google.android.gms.internal.atv_ads_framework.C
    final int e() {
        return this.f81686e;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.C
    final int f() {
        return 0;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.C
    final boolean l() {
        return false;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.C
    final Object[] m() {
        return this.f81685d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f81686e;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.F, com.google.android.gms.internal.atv_ads_framework.C
    final int a(Object[] objArr, int i10) {
        System.arraycopy(this.f81685d, 0, objArr, 0, this.f81686e);
        return this.f81686e;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        r.a(i10, this.f81686e, "index");
        Object obj = this.f81685d[i10];
        obj.getClass();
        return obj;
    }

    M(Object[] objArr, int i10) {
        this.f81685d = objArr;
        this.f81686e = i10;
    }
}
