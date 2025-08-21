package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* loaded from: classes6.dex */
final class Gz0 implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, F, FC0, InterfaceC8113fG0, InterfaceC10139yE0, Jy0, Ey0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Kz0 f68156a;

    /* synthetic */ Gz0(Kz0 kz0, Jz0 jz0) {
        this.f68156a = kz0;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // com.google.android.gms.internal.ads.FC0
    public final void a(Exception exc) {
        this.f68156a.f69072p.y(exc);
    }

    @Override // com.google.android.gms.internal.ads.FC0
    public final void b(GC0 gc0) {
        this.f68156a.f69072p.A(gc0);
    }

    @Override // com.google.android.gms.internal.ads.FC0
    public final void c(GC0 gc0) {
        this.f68156a.f69072p.m(gc0);
    }

    @Override // com.google.android.gms.internal.ads.FC0
    public final void d(int i10, long j10, long j11) {
        this.f68156a.f69072p.S(i10, j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.FC0
    public final void e(Exception exc) {
        this.f68156a.f69072p.x(exc);
    }

    @Override // com.google.android.gms.internal.ads.FC0
    public final void f(My0 my0) {
        this.f68156a.f69072p.j(my0);
    }

    @Override // com.google.android.gms.internal.ads.FC0
    public final void g(My0 my0) {
        this.f68156a.f69072p.b(my0);
    }

    @Override // com.google.android.gms.internal.ads.FC0
    public final void h(String str, long j10, long j11) {
        this.f68156a.f69072p.o(str, j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.FC0
    public final void i(C c10, Ny0 ny0) {
        this.f68156a.f69072p.C(c10, ny0);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        Kz0.o(this.f68156a, surfaceTexture);
        this.f68156a.E(i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f68156a.H(null);
        this.f68156a.E(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f68156a.E(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.FC0
    public final void p(String str) {
        this.f68156a.f69072p.N(str);
    }

    @Override // com.google.android.gms.internal.ads.FC0
    public final void q(final boolean z10) {
        Kz0 kz0 = this.f68156a;
        if (kz0.f69048L == z10) {
            return;
        }
        kz0.f69048L = z10;
        WK wk2 = this.f68156a.f69067k;
        wk2.d(23, new InterfaceC9612tJ() { // from class: com.google.android.gms.internal.ads.Dz0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj) {
                ((InterfaceC6683Ah) obj).q(z10);
            }
        });
        wk2.c();
    }

    @Override // com.google.android.gms.internal.ads.F
    public final void q0(String str) {
        this.f68156a.f69072p.i(str);
    }

    @Override // com.google.android.gms.internal.ads.F
    public final void r0(int i10, long j10) {
        this.f68156a.f69072p.J(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.F
    public final void s0(My0 my0) {
        this.f68156a.f69072p.B(my0);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        this.f68156a.E(i11, i12);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f68156a.E(0, 0);
    }

    @Override // com.google.android.gms.internal.ads.F
    public final void t0(long j10, int i10) {
        this.f68156a.f69072p.k(j10, i10);
    }

    @Override // com.google.android.gms.internal.ads.F
    public final void u0(final C9238ps c9238ps) {
        WK wk2 = this.f68156a.f69067k;
        wk2.d(25, new InterfaceC9612tJ() { // from class: com.google.android.gms.internal.ads.Ez0
            @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
            public final void zza(Object obj) {
                ((InterfaceC6683Ah) obj).G(c9238ps);
            }
        });
        wk2.c();
    }

    @Override // com.google.android.gms.internal.ads.F
    public final void v0(My0 my0) {
        this.f68156a.f69072p.E(my0);
    }

    @Override // com.google.android.gms.internal.ads.F
    public final void w0(String str, long j10, long j11) {
        this.f68156a.f69072p.e(str, j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.F
    public final void x0(Object obj, long j10) {
        this.f68156a.f69072p.f(obj, j10);
        Kz0 kz0 = this.f68156a;
        if (kz0.f69041E == obj) {
            WK wk2 = kz0.f69067k;
            wk2.d(26, new InterfaceC9612tJ() { // from class: com.google.android.gms.internal.ads.Fz0
                @Override // com.google.android.gms.internal.ads.InterfaceC9612tJ
                public final void zza(Object obj2) {
                }
            });
            wk2.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.F
    public final void y0(Exception exc) {
        this.f68156a.f69072p.c(exc);
    }

    @Override // com.google.android.gms.internal.ads.F
    public final void z0(C c10, Ny0 ny0) {
        this.f68156a.f69072p.H(c10, ny0);
    }

    @Override // com.google.android.gms.internal.ads.FC0
    public final void zzg(long j10) {
        this.f68156a.f69072p.a(j10);
    }
}
