package com.google.android.gms.internal.atv_ads_framework;

/* loaded from: classes6.dex */
final class Q extends F {

    /* renamed from: d, reason: collision with root package name */
    private final transient Object[] f80859d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f80860e;

    /* renamed from: f, reason: collision with root package name */
    private final transient int f80861f;

    @Override // com.google.android.gms.internal.atv_ads_framework.C
    final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f80861f;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        r.a(i10, this.f80861f, "index");
        Object obj = this.f80859d[i10 + i10 + this.f80860e];
        obj.getClass();
        return obj;
    }

    Q(Object[] objArr, int i10, int i11) {
        this.f80859d = objArr;
        this.f80860e = i10;
        this.f80861f = i11;
    }
}
