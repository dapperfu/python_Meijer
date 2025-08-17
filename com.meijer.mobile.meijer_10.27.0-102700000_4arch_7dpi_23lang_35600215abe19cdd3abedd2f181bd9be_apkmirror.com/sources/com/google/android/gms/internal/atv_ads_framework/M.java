package com.google.android.gms.internal.atv_ads_framework;

/* loaded from: classes6.dex */
final class M extends F {

    /* renamed from: f, reason: collision with root package name */
    static final F f80844f = new M(new Object[0], 0);

    /* renamed from: d, reason: collision with root package name */
    final transient Object[] f80845d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f80846e;

    @Override // com.google.android.gms.internal.atv_ads_framework.C
    final int e() {
        return this.f80846e;
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
        return this.f80845d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f80846e;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.F, com.google.android.gms.internal.atv_ads_framework.C
    final int a(Object[] objArr, int i10) {
        System.arraycopy(this.f80845d, 0, objArr, 0, this.f80846e);
        return this.f80846e;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        r.a(i10, this.f80846e, "index");
        Object obj = this.f80845d[i10];
        obj.getClass();
        return obj;
    }

    M(Object[] objArr, int i10) {
        this.f80845d = objArr;
        this.f80846e = i10;
    }
}
