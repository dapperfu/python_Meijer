package com.google.android.gms.internal.ads;

import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
final class CH0 implements J {

    /* renamed from: a, reason: collision with root package name */
    private final C8933n f66592a;

    /* renamed from: b, reason: collision with root package name */
    private final C9467s f66593b;

    /* renamed from: c, reason: collision with root package name */
    private C f66594c = new C9717uH0().H();

    @Override // com.google.android.gms.internal.ads.J
    public final void g(C c10) {
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void zzl() {
    }

    @Override // com.google.android.gms.internal.ads.J
    public final boolean zzw() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.J
    public final boolean I(boolean z10) {
        return this.f66592a.o(z10);
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void M(float f10) {
        this.f66592a.n(f10);
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void b(int i10) {
        this.f66592a.j(i10);
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void c(boolean z10) {
        if (z10) {
            this.f66592a.i();
        }
        this.f66593b.a();
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void d(long j10, long j11, long j12, long j13) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void e(InterfaceC8612k interfaceC8612k) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void f(Surface surface, C8232gR c8232gR) {
        this.f66592a.m(surface);
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void h(boolean z10) {
        this.f66592a.e(z10);
    }

    @Override // com.google.android.gms.internal.ads.J
    public final boolean i(long j10, boolean z10, long j11, long j12, I i10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void j(int i10, C c10) {
        C c11 = this.f66594c;
        int i11 = c11.f66511v;
        int i12 = c10.f66511v;
        if (i12 != i11 || c10.f66512w != c11.f66512w) {
            this.f66593b.b(i12, c10.f66512w);
        }
        float f10 = c10.f66513x;
        if (f10 != this.f66594c.f66513x) {
            this.f66592a.l(f10);
        }
        this.f66594c = c10;
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void j0(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void k(long j10, long j11) throws zzabg {
        try {
            this.f66593b.c(j10, j11);
        } catch (zzib e10) {
            throw new zzabg(e10, this.f66594c);
        }
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void m(H h10, Executor executor) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void n0(boolean z10) {
        this.f66592a.c(z10);
    }

    @Override // com.google.android.gms.internal.ads.J
    public final Surface zza() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void zzb() {
        this.f66592a.m(null);
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void zzc() {
        this.f66592a.b();
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void zzh() {
        this.f66592a.d();
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void zzj() {
        this.f66592a.g();
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void zzk() {
        this.f66592a.h();
    }

    @Override // com.google.android.gms.internal.ads.J
    public final boolean zzv() {
        throw new UnsupportedOperationException();
    }

    public CH0(C8933n c8933n, C9467s c9467s) {
        this.f66592a = c8933n;
        this.f66593b = c9467s;
    }
}
