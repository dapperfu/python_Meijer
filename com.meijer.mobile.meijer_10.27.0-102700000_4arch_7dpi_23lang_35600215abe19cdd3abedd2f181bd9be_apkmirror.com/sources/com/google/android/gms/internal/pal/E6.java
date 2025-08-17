package com.google.android.gms.internal.pal;

import java.util.List;

/* loaded from: classes6.dex */
final class E6 extends F6 {

    /* renamed from: c, reason: collision with root package name */
    final transient int f82576c;

    /* renamed from: d, reason: collision with root package name */
    final transient int f82577d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ F6 f82578e;

    @Override // com.google.android.gms.internal.pal.C6
    final Object[] h() {
        return this.f82578e.h();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f82577d;
    }

    E6(F6 f62, int i10, int i11) {
        this.f82578e = f62;
        this.f82576c = i10;
        this.f82577d = i11;
    }

    @Override // com.google.android.gms.internal.pal.C6
    final int e() {
        return this.f82578e.f() + this.f82576c + this.f82577d;
    }

    @Override // com.google.android.gms.internal.pal.C6
    final int f() {
        return this.f82578e.f() + this.f82576c;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C10934v6.a(i10, this.f82577d, "index");
        return this.f82578e.get(i10 + this.f82576c);
    }

    @Override // com.google.android.gms.internal.pal.F6
    /* renamed from: k */
    public final F6 subList(int i10, int i11) {
        C10934v6.c(i10, i11, this.f82577d);
        F6 f62 = this.f82578e;
        int i12 = this.f82576c;
        return f62.subList(i10 + i12, i11 + i12);
    }

    @Override // com.google.android.gms.internal.pal.F6, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
