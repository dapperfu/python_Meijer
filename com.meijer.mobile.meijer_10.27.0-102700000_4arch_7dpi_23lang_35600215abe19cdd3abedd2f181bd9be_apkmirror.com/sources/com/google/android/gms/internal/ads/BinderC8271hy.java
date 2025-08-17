package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.hy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC8271hy extends AbstractBinderC9294rc {

    /* renamed from: a, reason: collision with root package name */
    private final C8164gy f74846a;

    /* renamed from: b, reason: collision with root package name */
    private final Mc.V f74847b;

    /* renamed from: c, reason: collision with root package name */
    private final S30 f74848c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f74849d = ((Boolean) Mc.A.c().a(C8659lf.f76125R0)).booleanValue();

    /* renamed from: e, reason: collision with root package name */
    private final C9812wN f74850e;

    @Override // com.google.android.gms.internal.ads.InterfaceC9401sc
    public final void r0(boolean z10) {
        this.f74849d = z10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9401sc
    public final void W4(com.google.android.gms.dynamic.b bVar, InterfaceC10150zc interfaceC10150zc) {
        try {
            this.f74848c.L(interfaceC10150zc);
            this.f74846a.k((Activity) com.google.android.gms.dynamic.d.b2(bVar), interfaceC10150zc, this.f74849d);
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9401sc
    public final void n9(Mc.N0 n02) {
        com.google.android.gms.common.internal.r.e("setOnPaidEventListener must be called on the main UI thread.");
        if (this.f74848c != null) {
            try {
                if (!n02.zzf()) {
                    this.f74850e.e();
                }
            } catch (RemoteException e10) {
                Qc.p.c("Error in making CSI ping for reporting paid event callback", e10);
            }
            this.f74848c.C(n02);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9401sc
    public final Mc.V zze() {
        return this.f74847b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9401sc
    public final Mc.U0 zzf() {
        if (((Boolean) Mc.A.c().a(C8659lf.f75921C6)).booleanValue()) {
            return this.f74846a.c();
        }
        return null;
    }

    public BinderC8271hy(C8164gy c8164gy, Mc.V v10, S30 s30, C9812wN c9812wN) {
        this.f74846a = c8164gy;
        this.f74847b = v10;
        this.f74848c = s30;
        this.f74850e = c9812wN;
    }
}
