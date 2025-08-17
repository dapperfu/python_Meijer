package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes6.dex */
final class O50 implements Yc.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Mc.K0 f69006a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Q50 f69007b;

    O50(Q50 q50, Mc.K0 k02) {
        this.f69006a = k02;
        this.f69007b = q50;
    }

    @Override // Yc.a
    public final void q() {
        if (this.f69007b.f69509i != null) {
            try {
                this.f69006a.zze();
            } catch (RemoteException e10) {
                Qc.p.i("#007 Could not call remote method.", e10);
            }
        }
    }
}
