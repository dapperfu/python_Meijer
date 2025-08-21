package com.google.android.gms.internal.ads;

import Oc.InterfaceC4377a0;
import ad.InterfaceC5681a;
import android.os.RemoteException;

/* loaded from: classes6.dex */
final class V50 implements InterfaceC5681a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC4377a0 f71633a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ W50 f71634b;

    V50(W50 w50, InterfaceC4377a0 interfaceC4377a0) {
        this.f71633a = interfaceC4377a0;
        this.f71634b = w50;
    }

    @Override // ad.InterfaceC5681a
    public final void q() {
        if (this.f71634b.f71848d != null) {
            try {
                this.f71633a.zze();
            } catch (RemoteException e10) {
                Sc.p.i("#007 Could not call remote method.", e10);
            }
        }
    }
}
