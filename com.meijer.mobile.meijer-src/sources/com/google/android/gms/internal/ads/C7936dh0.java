package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.dh0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7936dh0 extends AbstractC8042eh0 {

    /* renamed from: d, reason: collision with root package name */
    final transient int f74298d;

    /* renamed from: e, reason: collision with root package name */
    final transient int f74299e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC8042eh0 f74300f;

    @Override // com.google.android.gms.internal.ads.AbstractC7526Zg0
    final boolean l() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7526Zg0
    final Object[] m() {
        return this.f74300f.m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f74299e;
    }

    C7936dh0(AbstractC8042eh0 abstractC8042eh0, int i10, int i11) {
        this.f74300f = abstractC8042eh0;
        this.f74298d = i10;
        this.f74299e = i11;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7526Zg0
    final int e() {
        return this.f74300f.f() + this.f74298d + this.f74299e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7526Zg0
    final int f() {
        return this.f74300f.f() + this.f74298d;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C6782Df0.a(i10, this.f74299e, "index");
        return this.f74300f.get(i10 + this.f74298d);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8042eh0
    /* renamed from: n */
    public final AbstractC8042eh0 subList(int i10, int i11) {
        C6782Df0.k(i10, i11, this.f74299e);
        int i12 = this.f74298d;
        return this.f74300f.subList(i10 + i12, i11 + i12);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8042eh0, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
