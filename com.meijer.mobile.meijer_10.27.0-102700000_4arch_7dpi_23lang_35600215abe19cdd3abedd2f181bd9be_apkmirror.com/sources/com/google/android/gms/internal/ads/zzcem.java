package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;

/* loaded from: classes6.dex */
public final class zzcem extends zzcay {

    /* renamed from: c, reason: collision with root package name */
    private final C6841Ir f80636c;

    /* renamed from: d, reason: collision with root package name */
    private C7833dt f80637d;

    /* renamed from: e, reason: collision with root package name */
    private Uri f80638e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC8897nr f80639f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f80640g;

    /* renamed from: h, reason: collision with root package name */
    private int f80641h;

    private final boolean A() {
        int i10 = this.f80641h;
        return (i10 == 1 || i10 == 2 || this.f80637d == null) ? false : true;
    }

    private final void G(int i10) {
        if (i10 == 4) {
            this.f80636c.c();
            this.f80600b.b();
        } else if (this.f80641h == 4) {
            this.f80636c.e();
            this.f80600b.c();
        }
        this.f80641h = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int e() {
        return A() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int f() {
        return A() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int g() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int h() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final long i() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final long j() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final long k() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final String l() {
        return "ImmersivePlayer";
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void p(InterfaceC8897nr interfaceC8897nr) {
        this.f80639f = interfaceC8897nr;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void s(float f10, float f11) {
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void m() {
        Pc.p0.k("AdImmersivePlayerView pause");
        if (A() && this.f80637d.d()) {
            this.f80637d.a();
            G(5);
            Pc.D0.f25081l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.ct
                @Override // java.lang.Runnable
                public final void run() {
                    this.f73268a.x();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void n() {
        Pc.p0.k("AdImmersivePlayerView play");
        if (A()) {
            this.f80637d.b();
            G(4);
            this.f80599a.b();
            Pc.D0.f25081l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.bt
                @Override // java.lang.Runnable
                public final void run() {
                    this.f72892a.y();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void o(int i10) {
        Pc.p0.k("AdImmersivePlayerView seek " + i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void q(String str) {
        if (str != null) {
            Uri uri = Uri.parse(str);
            this.f80638e = uri;
            this.f80637d = new C7833dt(uri.toString());
            G(3);
            Pc.D0.f25081l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.at
                @Override // java.lang.Runnable
                public final void run() {
                    this.f72557a.z();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void r() {
        Pc.p0.k("AdImmersivePlayerView stop");
        C7833dt c7833dt = this.f80637d;
        if (c7833dt != null) {
            c7833dt.c();
            this.f80637d = null;
            G(1);
        }
        this.f80636c.d();
    }

    @Override // android.view.View
    public final String toString() {
        return zzcem.class.getName() + "@" + Integer.toHexString(hashCode());
    }

    final /* synthetic */ void x() {
        InterfaceC8897nr interfaceC8897nr = this.f80639f;
        if (interfaceC8897nr != null) {
            interfaceC8897nr.zzd();
        }
    }

    final /* synthetic */ void y() {
        InterfaceC8897nr interfaceC8897nr = this.f80639f;
        if (interfaceC8897nr != null) {
            if (!this.f80640g) {
                interfaceC8897nr.zzg();
                this.f80640g = true;
            }
            this.f80639f.zze();
        }
    }

    final /* synthetic */ void z() {
        InterfaceC8897nr interfaceC8897nr = this.f80639f;
        if (interfaceC8897nr != null) {
            interfaceC8897nr.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay, com.google.android.gms.internal.ads.InterfaceC6909Kr
    public final void zzn() {
        if (this.f80637d != null) {
            this.f80600b.a();
        }
    }

    public zzcem(Context context, C6841Ir c6841Ir) {
        super(context);
        this.f80641h = 1;
        this.f80640g = false;
        this.f80636c = c6841Ir;
        c6841Ir.a(this);
    }
}
