package com.google.android.gms.internal.ads;

import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
final class CH0 implements J {

    /* renamed from: a, reason: collision with root package name */
    private final C8808n f65752a;

    /* renamed from: b, reason: collision with root package name */
    private final C9342s f65753b;

    /* renamed from: c, reason: collision with root package name */
    private C f65754c = new C9592uH0().H();

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
        return this.f65752a.o(z10);
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void M(float f10) {
        this.f65752a.n(f10);
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void b(int i10) {
        this.f65752a.j(i10);
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void c(boolean z10) {
        if (z10) {
            this.f65752a.i();
        }
        this.f65753b.a();
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void d(long j10, long j11, long j12, long j13) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void e(InterfaceC8487k interfaceC8487k) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void f(Surface surface, C8107gR c8107gR) {
        this.f65752a.m(surface);
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void h(boolean z10) {
        this.f65752a.e(z10);
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void h0(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.J
    public final boolean i(long j10, boolean z10, long j11, long j12, I i10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void j(int i10, C c10) {
        C c11 = this.f65754c;
        int i11 = c11.f65671v;
        int i12 = c10.f65671v;
        if (i12 != i11 || c10.f65672w != c11.f65672w) {
            this.f65753b.b(i12, c10.f65672w);
        }
        float f10 = c10.f65673x;
        if (f10 != this.f65754c.f65673x) {
            this.f65752a.l(f10);
        }
        this.f65754c = c10;
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void k(long j10, long j11) throws zzabg {
        try {
            this.f65753b.c(j10, j11);
        } catch (zzib e10) {
            throw new zzabg(e10, this.f65754c);
        }
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void k0(boolean z10) {
        this.f65752a.c(z10);
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void m(H h10, Executor executor) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.J
    public final Surface zza() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void zzb() {
        this.f65752a.m(null);
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void zzc() {
        this.f65752a.b();
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void zzh() {
        this.f65752a.d();
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void zzj() {
        this.f65752a.g();
    }

    @Override // com.google.android.gms.internal.ads.J
    public final void zzk() {
        this.f65752a.h();
    }

    @Override // com.google.android.gms.internal.ads.J
    public final boolean zzv() {
        throw new UnsupportedOperationException();
    }

    public CH0(C8808n c8808n, C9342s c9342s) {
        this.f65752a = c8808n;
        this.f65753b = c9342s;
    }
}
