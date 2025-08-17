package com.google.android.gms.maps;

import Kd.C3954l;
import Kd.InterfaceC3951i;
import Ld.AbstractBinderC4043b0;
import Ld.InterfaceC4052g;
import android.os.RemoteException;

/* loaded from: classes6.dex */
final class r extends AbstractBinderC4043b0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC3951i f84845a;

    r(s sVar, InterfaceC3951i interfaceC3951i) {
        this.f84845a = interfaceC3951i;
    }

    @Override // Ld.InterfaceC4045c0
    public final void h5(InterfaceC4052g interfaceC4052g) throws RemoteException {
        this.f84845a.onStreetViewPanoramaReady(new C3954l(interfaceC4052g));
    }
}
