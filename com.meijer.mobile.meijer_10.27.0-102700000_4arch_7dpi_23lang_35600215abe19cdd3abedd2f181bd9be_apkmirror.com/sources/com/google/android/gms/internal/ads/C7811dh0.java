package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.dh0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7811dh0 extends AbstractC7917eh0 {

    /* renamed from: d, reason: collision with root package name */
    final transient int f73458d;

    /* renamed from: e, reason: collision with root package name */
    final transient int f73459e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC7917eh0 f73460f;

    @Override // com.google.android.gms.internal.ads.AbstractC7401Zg0
    final boolean l() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7401Zg0
    final Object[] m() {
        return this.f73460f.m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f73459e;
    }

    C7811dh0(AbstractC7917eh0 abstractC7917eh0, int i10, int i11) {
        this.f73460f = abstractC7917eh0;
        this.f73458d = i10;
        this.f73459e = i11;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7401Zg0
    final int e() {
        return this.f73460f.f() + this.f73458d + this.f73459e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7401Zg0
    final int f() {
        return this.f73460f.f() + this.f73458d;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C6657Df0.a(i10, this.f73459e, "index");
        return this.f73460f.get(i10 + this.f73458d);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7917eh0
    /* renamed from: n */
    public final AbstractC7917eh0 subList(int i10, int i11) {
        C6657Df0.k(i10, i11, this.f73459e);
        int i12 = this.f73458d;
        return this.f73460f.subList(i10 + i12, i11 + i12);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7917eh0, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
