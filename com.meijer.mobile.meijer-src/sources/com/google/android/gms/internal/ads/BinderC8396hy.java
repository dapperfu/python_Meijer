package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.hy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC8396hy extends AbstractBinderC9419rc {

    /* renamed from: a, reason: collision with root package name */
    private final C8289gy f75686a;

    /* renamed from: b, reason: collision with root package name */
    private final Oc.V f75687b;

    /* renamed from: c, reason: collision with root package name */
    private final S30 f75688c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f75689d = ((Boolean) Oc.A.c().a(C8784lf.f76965R0)).booleanValue();

    /* renamed from: e, reason: collision with root package name */
    private final C9937wN f75690e;

    @Override // com.google.android.gms.internal.ads.InterfaceC9526sc
    public final void s0(boolean z10) {
        this.f75689d = z10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9526sc
    public final void Q8(Oc.N0 n02) {
        com.google.android.gms.common.internal.r.e("setOnPaidEventListener must be called on the main UI thread.");
        if (this.f75688c != null) {
            try {
                if (!n02.zzf()) {
                    this.f75690e.e();
                }
            } catch (RemoteException e10) {
                Sc.p.c("Error in making CSI ping for reporting paid event callback", e10);
            }
            this.f75688c.J(n02);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9526sc
    public final void j5(com.google.android.gms.dynamic.b bVar, InterfaceC10275zc interfaceC10275zc) {
        try {
            this.f75688c.N(interfaceC10275zc);
            this.f75686a.k((Activity) com.google.android.gms.dynamic.d.c2(bVar), interfaceC10275zc, this.f75689d);
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9526sc
    public final Oc.V zze() {
        return this.f75687b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9526sc
    public final Oc.U0 zzf() {
        if (((Boolean) Oc.A.c().a(C8784lf.f76761C6)).booleanValue()) {
            return this.f75686a.c();
        }
        return null;
    }

    public BinderC8396hy(C8289gy c8289gy, Oc.V v10, S30 s30, C9937wN c9937wN) {
        this.f75686a = c8289gy;
        this.f75687b = v10;
        this.f75688c = s30;
        this.f75690e = c9937wN;
    }
}
