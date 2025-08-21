package com.google.android.gms.internal.ads;

import ad.InterfaceC5681a;
import android.os.RemoteException;

/* loaded from: classes6.dex */
final class O50 implements InterfaceC5681a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Oc.K0 f69846a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Q50 f69847b;

    O50(Q50 q50, Oc.K0 k02) {
        this.f69846a = k02;
        this.f69847b = q50;
    }

    @Override // ad.InterfaceC5681a
    public final void q() {
        if (this.f69847b.f70349i != null) {
            try {
                this.f69846a.zze();
            } catch (RemoteException e10) {
                Sc.p.i("#007 Could not call remote method.", e10);
            }
        }
    }
}
