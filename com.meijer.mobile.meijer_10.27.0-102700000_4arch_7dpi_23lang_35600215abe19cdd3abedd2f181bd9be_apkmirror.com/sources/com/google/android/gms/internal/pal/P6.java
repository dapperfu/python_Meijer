package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
final class P6 extends F6 {

    /* renamed from: c, reason: collision with root package name */
    private final transient Object[] f82833c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f82834d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f82835e;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f82835e;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C10934v6.a(i10, this.f82835e, "index");
        Object obj = this.f82833c[i10 + i10 + this.f82834d];
        obj.getClass();
        return obj;
    }

    P6(Object[] objArr, int i10, int i11) {
        this.f82833c = objArr;
        this.f82834d = i10;
        this.f82835e = i11;
    }
}
