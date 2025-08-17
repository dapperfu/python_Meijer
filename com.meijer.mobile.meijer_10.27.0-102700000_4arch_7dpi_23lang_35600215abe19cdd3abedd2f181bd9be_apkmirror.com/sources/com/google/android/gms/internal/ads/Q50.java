package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public final class Q50 extends AbstractBinderC7613bp {

    /* renamed from: a, reason: collision with root package name */
    private final M50 f69501a;

    /* renamed from: b, reason: collision with root package name */
    private final B50 f69502b;

    /* renamed from: c, reason: collision with root package name */
    private final String f69503c;

    /* renamed from: d, reason: collision with root package name */
    private final C8715m60 f69504d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f69505e;

    /* renamed from: f, reason: collision with root package name */
    private final Qc.a f69506f;

    /* renamed from: g, reason: collision with root package name */
    private final M9 f69507g;

    /* renamed from: h, reason: collision with root package name */
    private final C9812wN f69508h;

    /* renamed from: i, reason: collision with root package name */
    private C10024yL f69509i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f69510j = ((Boolean) Mc.A.c().a(C8659lf.f76083O0)).booleanValue();

    private final synchronized void F9(Mc.Y1 y12, InterfaceC8465jp interfaceC8465jp, int i10) throws RemoteException {
        try {
            if (!y12.T()) {
                boolean z10 = false;
                if (((Boolean) C8554kg.f75695k.e()).booleanValue()) {
                    if (((Boolean) Mc.A.c().a(C8659lf.f76275bb)).booleanValue()) {
                        z10 = true;
                    }
                }
                if (this.f69506f.f29931c < ((Integer) Mc.A.c().a(C8659lf.f76289cb)).intValue() || !z10) {
                    com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
                }
            }
            this.f69502b.J(interfaceC8465jp);
            Lc.v.t();
            if (Pc.D0.i(this.f69505e) && y12.f19185s == null) {
                Qc.p.d("Failed to load the ad because app ID is missing.");
                this.f69502b.g0(V60.d(4, null, null));
                return;
            }
            if (this.f69509i != null) {
                return;
            }
            D50 d50 = new D50(null);
            this.f69501a.i(i10);
            this.f69501a.a(y12, this.f69503c, d50, new P50(this));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7719cp
    public final synchronized void Q6(com.google.android.gms.dynamic.b bVar, boolean z10) throws RemoteException {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        if (this.f69509i == null) {
            Qc.p.g("Rewarded can not be shown before loaded");
            this.f69502b.j(V60.d(9, null, null));
            return;
        }
        if (((Boolean) Mc.A.c().a(C8659lf.f76155T2)).booleanValue()) {
            this.f69507g.c().c(new Throwable().getStackTrace());
        }
        this.f69509i.o(z10, (Activity) com.google.android.gms.dynamic.d.b2(bVar));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7719cp
    public final synchronized void Y7(Mc.Y1 y12, InterfaceC8465jp interfaceC8465jp) throws RemoteException {
        F9(y12, interfaceC8465jp, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7719cp
    public final synchronized void Z6(C9320rp c9320rp) {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        C8715m60 c8715m60 = this.f69504d;
        c8715m60.f76730a = c9320rp.f78066a;
        c8715m60.f76731b = c9320rp.f78067b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7719cp
    public final synchronized void t3(boolean z10) {
        com.google.android.gms.common.internal.r.e("setImmersiveMode must be called on the main UI thread.");
        this.f69510j = z10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7719cp
    public final synchronized void x9(Mc.Y1 y12, InterfaceC8465jp interfaceC8465jp) throws RemoteException {
        F9(y12, interfaceC8465jp, 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7719cp
    public final synchronized String zze() throws RemoteException {
        C10024yL c10024yL = this.f69509i;
        if (c10024yL == null || c10024yL.c() == null) {
            return null;
        }
        return c10024yL.c().zzg();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7719cp
    public final synchronized void zzm(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Q6(bVar, this.f69510j);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7719cp
    public final void P5(Mc.N0 n02) {
        com.google.android.gms.common.internal.r.e("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!n02.zzf()) {
                this.f69508h.e();
            }
        } catch (RemoteException e10) {
            Qc.p.c("Error in making CSI ping for reporting paid event callback", e10);
        }
        this.f69502b.v(n02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7719cp
    public final void b7(InterfaceC8039fp interfaceC8039fp) {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        this.f69502b.C(interfaceC8039fp);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7719cp
    public final void f8(Mc.K0 k02) {
        if (k02 == null) {
            this.f69502b.s(null);
        } else {
            this.f69502b.s(new O50(this, k02));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7719cp
    public final void v2(C8572kp c8572kp) {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        this.f69502b.b0(c8572kp);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7719cp
    public final Bundle zzb() {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        C10024yL c10024yL = this.f69509i;
        return c10024yL != null ? c10024yL.i() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7719cp
    public final Mc.U0 zzc() {
        C10024yL c10024yL;
        if (((Boolean) Mc.A.c().a(C8659lf.f75921C6)).booleanValue() && (c10024yL = this.f69509i) != null) {
            return c10024yL.c();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7719cp
    public final InterfaceC7409Zo zzd() {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        C10024yL c10024yL = this.f69509i;
        if (c10024yL != null) {
            return c10024yL.j();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7719cp
    public final boolean zzo() {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        C10024yL c10024yL = this.f69509i;
        return (c10024yL == null || c10024yL.m()) ? false : true;
    }

    public Q50(String str, M50 m50, Context context, B50 b50, C8715m60 c8715m60, Qc.a aVar, M9 m92, C9812wN c9812wN) {
        this.f69503c = str;
        this.f69501a = m50;
        this.f69502b = b50;
        this.f69504d = c8715m60;
        this.f69505e = context;
        this.f69506f = aVar;
        this.f69507g = m92;
        this.f69508h = c9812wN;
    }
}
