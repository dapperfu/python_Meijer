package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public final class Q50 extends AbstractBinderC7738bp {

    /* renamed from: a, reason: collision with root package name */
    private final M50 f70341a;

    /* renamed from: b, reason: collision with root package name */
    private final B50 f70342b;

    /* renamed from: c, reason: collision with root package name */
    private final String f70343c;

    /* renamed from: d, reason: collision with root package name */
    private final C8840m60 f70344d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f70345e;

    /* renamed from: f, reason: collision with root package name */
    private final Sc.a f70346f;

    /* renamed from: g, reason: collision with root package name */
    private final M9 f70347g;

    /* renamed from: h, reason: collision with root package name */
    private final C9937wN f70348h;

    /* renamed from: i, reason: collision with root package name */
    private C10149yL f70349i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f70350j = ((Boolean) Oc.A.c().a(C8784lf.f76923O0)).booleanValue();

    private final synchronized void F9(Oc.Y1 y12, InterfaceC8590jp interfaceC8590jp, int i10) throws RemoteException {
        try {
            if (!y12.T()) {
                boolean z10 = false;
                if (((Boolean) C8679kg.f76535k.e()).booleanValue()) {
                    if (((Boolean) Oc.A.c().a(C8784lf.f77115bb)).booleanValue()) {
                        z10 = true;
                    }
                }
                if (this.f70346f.f34481c < ((Integer) Oc.A.c().a(C8784lf.f77129cb)).intValue() || !z10) {
                    com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
                }
            }
            this.f70342b.L(interfaceC8590jp);
            Nc.v.t();
            if (Rc.D0.i(this.f70345e) && y12.f23372s == null) {
                Sc.p.d("Failed to load the ad because app ID is missing.");
                this.f70342b.C(V60.d(4, null, null));
                return;
            }
            if (this.f70349i != null) {
                return;
            }
            D50 d50 = new D50(null);
            this.f70341a.i(i10);
            this.f70341a.a(y12, this.f70343c, d50, new P50(this));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7844cp
    public final synchronized void E3(boolean z10) {
        com.google.android.gms.common.internal.r.e("setImmersiveMode must be called on the main UI thread.");
        this.f70350j = z10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7844cp
    public final synchronized void R6(Oc.Y1 y12, InterfaceC8590jp interfaceC8590jp) throws RemoteException {
        F9(y12, interfaceC8590jp, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7844cp
    public final synchronized void a7(com.google.android.gms.dynamic.b bVar, boolean z10) throws RemoteException {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        if (this.f70349i == null) {
            Sc.p.g("Rewarded can not be shown before loaded");
            this.f70342b.j(V60.d(9, null, null));
            return;
        }
        if (((Boolean) Oc.A.c().a(C8784lf.f76995T2)).booleanValue()) {
            this.f70347g.c().c(new Throwable().getStackTrace());
        }
        this.f70349i.o(z10, (Activity) com.google.android.gms.dynamic.d.c2(bVar));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7844cp
    public final synchronized void j6(Oc.Y1 y12, InterfaceC8590jp interfaceC8590jp) throws RemoteException {
        F9(y12, interfaceC8590jp, 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7844cp
    public final synchronized void k7(C9445rp c9445rp) {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        C8840m60 c8840m60 = this.f70344d;
        c8840m60.f77570a = c9445rp.f78906a;
        c8840m60.f77571b = c9445rp.f78907b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7844cp
    public final synchronized String zze() throws RemoteException {
        C10149yL c10149yL = this.f70349i;
        if (c10149yL == null || c10149yL.c() == null) {
            return null;
        }
        return c10149yL.c().zzg();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7844cp
    public final synchronized void zzm(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        a7(bVar, this.f70350j);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7844cp
    public final void Z7(Oc.N0 n02) {
        com.google.android.gms.common.internal.r.e("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!n02.zzf()) {
                this.f70348h.e();
            }
        } catch (RemoteException e10) {
            Sc.p.c("Error in making CSI ping for reporting paid event callback", e10);
        }
        this.f70342b.v(n02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7844cp
    public final void l1(Oc.K0 k02) {
        if (k02 == null) {
            this.f70342b.s(null);
        } else {
            this.f70342b.s(new O50(this, k02));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7844cp
    public final void n7(InterfaceC8164fp interfaceC8164fp) {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        this.f70342b.J(interfaceC8164fp);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7844cp
    public final void x2(C8697kp c8697kp) {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        this.f70342b.g0(c8697kp);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7844cp
    public final Bundle zzb() {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        C10149yL c10149yL = this.f70349i;
        return c10149yL != null ? c10149yL.i() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7844cp
    public final Oc.U0 zzc() {
        C10149yL c10149yL;
        if (((Boolean) Oc.A.c().a(C8784lf.f76761C6)).booleanValue() && (c10149yL = this.f70349i) != null) {
            return c10149yL.c();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7844cp
    public final InterfaceC7534Zo zzd() {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        C10149yL c10149yL = this.f70349i;
        if (c10149yL != null) {
            return c10149yL.j();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7844cp
    public final boolean zzo() {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        C10149yL c10149yL = this.f70349i;
        return (c10149yL == null || c10149yL.m()) ? false : true;
    }

    public Q50(String str, M50 m50, Context context, B50 b50, C8840m60 c8840m60, Sc.a aVar, M9 m92, C9937wN c9937wN) {
        this.f70343c = str;
        this.f70341a = m50;
        this.f70342b = b50;
        this.f70344d = c8840m60;
        this.f70345e = context;
        this.f70346f = aVar;
        this.f70347g = m92;
        this.f70348h = c9937wN;
    }
}
