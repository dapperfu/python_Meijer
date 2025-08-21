package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
final class L6 extends F6 {

    /* renamed from: e, reason: collision with root package name */
    static final F6 f83587e = new L6(new Object[0], 0);

    /* renamed from: c, reason: collision with root package name */
    final transient Object[] f83588c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f83589d;

    @Override // com.google.android.gms.internal.pal.C6
    final int e() {
        return this.f83589d;
    }

    @Override // com.google.android.gms.internal.pal.C6
    final int f() {
        return 0;
    }

    @Override // com.google.android.gms.internal.pal.C6
    final Object[] h() {
        return this.f83588c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f83589d;
    }

    @Override // com.google.android.gms.internal.pal.F6, com.google.android.gms.internal.pal.C6
    final int a(Object[] objArr, int i10) {
        System.arraycopy(this.f83588c, 0, objArr, 0, this.f83589d);
        return this.f83589d;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C11059v6.a(i10, this.f83589d, "index");
        Object obj = this.f83588c[i10];
        obj.getClass();
        return obj;
    }

    L6(Object[] objArr, int i10) {
        this.f83588c = objArr;
        this.f83589d = i10;
    }
}
