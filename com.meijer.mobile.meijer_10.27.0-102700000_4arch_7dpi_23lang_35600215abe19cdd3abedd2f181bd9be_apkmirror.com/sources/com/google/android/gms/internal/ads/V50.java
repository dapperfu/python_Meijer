package com.google.android.gms.internal.ads;

import Mc.InterfaceC4099a0;
import android.os.RemoteException;

/* loaded from: classes6.dex */
final class V50 implements Yc.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC4099a0 f70793a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ W50 f70794b;

    V50(W50 w50, InterfaceC4099a0 interfaceC4099a0) {
        this.f70793a = interfaceC4099a0;
        this.f70794b = w50;
    }

    @Override // Yc.a
    public final void q() {
        if (this.f70794b.f71008d != null) {
            try {
                this.f70793a.zze();
            } catch (RemoteException e10) {
                Qc.p.i("#007 Could not call remote method.", e10);
            }
        }
    }
}
