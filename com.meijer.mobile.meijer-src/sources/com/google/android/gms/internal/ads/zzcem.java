package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;

/* loaded from: classes6.dex */
public final class zzcem extends zzcay {

    /* renamed from: c, reason: collision with root package name */
    private final C6966Ir f81476c;

    /* renamed from: d, reason: collision with root package name */
    private C7958dt f81477d;

    /* renamed from: e, reason: collision with root package name */
    private Uri f81478e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC9022nr f81479f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f81480g;

    /* renamed from: h, reason: collision with root package name */
    private int f81481h;

    private final boolean A() {
        int i10 = this.f81481h;
        return (i10 == 1 || i10 == 2 || this.f81477d == null) ? false : true;
    }

    private final void G(int i10) {
        if (i10 == 4) {
            this.f81476c.c();
            this.f81440b.b();
        } else if (this.f81481h == 4) {
            this.f81476c.e();
            this.f81440b.c();
        }
        this.f81481h = i10;
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
    public final void p(InterfaceC9022nr interfaceC9022nr) {
        this.f81479f = interfaceC9022nr;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void s(float f10, float f11) {
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void m() {
        Rc.p0.k("AdImmersivePlayerView pause");
        if (A() && this.f81477d.d()) {
            this.f81477d.a();
            G(5);
            Rc.D0.f32295l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.ct
                @Override // java.lang.Runnable
                public final void run() {
                    this.f74108a.x();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void n() {
        Rc.p0.k("AdImmersivePlayerView play");
        if (A()) {
            this.f81477d.b();
            G(4);
            this.f81439a.b();
            Rc.D0.f32295l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.bt
                @Override // java.lang.Runnable
                public final void run() {
                    this.f73732a.y();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void o(int i10) {
        Rc.p0.k("AdImmersivePlayerView seek " + i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void q(String str) {
        if (str != null) {
            Uri uri = Uri.parse(str);
            this.f81478e = uri;
            this.f81477d = new C7958dt(uri.toString());
            G(3);
            Rc.D0.f32295l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.at
                @Override // java.lang.Runnable
                public final void run() {
                    this.f73397a.z();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void r() {
        Rc.p0.k("AdImmersivePlayerView stop");
        C7958dt c7958dt = this.f81477d;
        if (c7958dt != null) {
            c7958dt.c();
            this.f81477d = null;
            G(1);
        }
        this.f81476c.d();
    }

    @Override // android.view.View
    public final String toString() {
        return zzcem.class.getName() + "@" + Integer.toHexString(hashCode());
    }

    final /* synthetic */ void x() {
        InterfaceC9022nr interfaceC9022nr = this.f81479f;
        if (interfaceC9022nr != null) {
            interfaceC9022nr.zzd();
        }
    }

    final /* synthetic */ void y() {
        InterfaceC9022nr interfaceC9022nr = this.f81479f;
        if (interfaceC9022nr != null) {
            if (!this.f81480g) {
                interfaceC9022nr.zzg();
                this.f81480g = true;
            }
            this.f81479f.zze();
        }
    }

    final /* synthetic */ void z() {
        InterfaceC9022nr interfaceC9022nr = this.f81479f;
        if (interfaceC9022nr != null) {
            interfaceC9022nr.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay, com.google.android.gms.internal.ads.InterfaceC7034Kr
    public final void zzn() {
        if (this.f81477d != null) {
            this.f81440b.a();
        }
    }

    public zzcem(Context context, C6966Ir c6966Ir) {
        super(context);
        this.f81481h = 1;
        this.f81480g = false;
        this.f81476c = c6966Ir;
        c6966Ir.a(this);
    }
}
