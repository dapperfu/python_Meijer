package com.google.android.gms.internal.pal;

import java.util.List;

/* loaded from: classes6.dex */
final class E6 extends F6 {

    /* renamed from: c, reason: collision with root package name */
    final transient int f83416c;

    /* renamed from: d, reason: collision with root package name */
    final transient int f83417d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ F6 f83418e;

    @Override // com.google.android.gms.internal.pal.C6
    final Object[] h() {
        return this.f83418e.h();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f83417d;
    }

    E6(F6 f62, int i10, int i11) {
        this.f83418e = f62;
        this.f83416c = i10;
        this.f83417d = i11;
    }

    @Override // com.google.android.gms.internal.pal.C6
    final int e() {
        return this.f83418e.f() + this.f83416c + this.f83417d;
    }

    @Override // com.google.android.gms.internal.pal.C6
    final int f() {
        return this.f83418e.f() + this.f83416c;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C11059v6.a(i10, this.f83417d, "index");
        return this.f83418e.get(i10 + this.f83416c);
    }

    @Override // com.google.android.gms.internal.pal.F6
    /* renamed from: k */
    public final F6 subList(int i10, int i11) {
        C11059v6.c(i10, i11, this.f83417d);
        F6 f62 = this.f83418e;
        int i12 = this.f83416c;
        return f62.subList(i10 + i12, i11 + i12);
    }

    @Override // com.google.android.gms.internal.pal.F6, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
