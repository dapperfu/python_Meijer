package com.google.android.gms.maps;

import Md.C4119l;
import Md.InterfaceC4116i;
import Nd.AbstractBinderC4175b0;
import Nd.InterfaceC4184g;
import android.os.RemoteException;

/* loaded from: classes6.dex */
final class r extends AbstractBinderC4175b0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC4116i f85685a;

    r(s sVar, InterfaceC4116i interfaceC4116i) {
        this.f85685a = interfaceC4116i;
    }

    @Override // Nd.InterfaceC4177c0
    public final void C7(InterfaceC4184g interfaceC4184g) throws RemoteException {
        this.f85685a.onStreetViewPanoramaReady(new C4119l(interfaceC4184g));
    }
}
