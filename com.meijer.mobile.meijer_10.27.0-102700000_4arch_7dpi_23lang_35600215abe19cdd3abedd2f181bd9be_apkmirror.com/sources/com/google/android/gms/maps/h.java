package com.google.android.gms.maps;

import Kd.C3954l;
import Kd.InterfaceC3951i;
import Ld.AbstractBinderC4043b0;
import Ld.InterfaceC4052g;
import android.os.RemoteException;

/* loaded from: classes6.dex */
final class h extends AbstractBinderC4043b0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC3951i f84795a;

    h(i iVar, InterfaceC3951i interfaceC3951i) {
        this.f84795a = interfaceC3951i;
    }

    @Override // Ld.InterfaceC4045c0
    public final void h5(InterfaceC4052g interfaceC4052g) throws RemoteException {
        this.f84795a.onStreetViewPanoramaReady(new C3954l(interfaceC4052g));
    }
}
