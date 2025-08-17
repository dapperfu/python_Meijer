package com.google.android.gms.maps;

import Kd.C3945c;
import Kd.InterfaceC3949g;
import Ld.B;
import Ld.InterfaceC4042b;
import android.os.RemoteException;

/* loaded from: classes6.dex */
final class b extends B {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC3949g f84779a;

    b(c cVar, InterfaceC3949g interfaceC3949g) {
        this.f84779a = interfaceC3949g;
    }

    @Override // Ld.C
    public final void y7(InterfaceC4042b interfaceC4042b) throws RemoteException {
        this.f84779a.onMapReady(new C3945c(interfaceC4042b));
    }
}
