package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
final class P6 extends F6 {

    /* renamed from: c, reason: collision with root package name */
    private final transient Object[] f83673c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f83674d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f83675e;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f83675e;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C11059v6.a(i10, this.f83675e, "index");
        Object obj = this.f83673c[i10 + i10 + this.f83674d];
        obj.getClass();
        return obj;
    }

    P6(Object[] objArr, int i10, int i11) {
        this.f83673c = objArr;
        this.f83674d = i10;
        this.f83675e = i11;
    }
}
