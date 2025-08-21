package com.google.android.gms.maps;

import Md.C4110c;
import Md.InterfaceC4114g;
import Nd.B;
import Nd.InterfaceC4174b;
import android.os.RemoteException;

/* loaded from: classes6.dex */
final class b extends B {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC4114g f85619a;

    b(c cVar, InterfaceC4114g interfaceC4114g) {
        this.f85619a = interfaceC4114g;
    }

    @Override // Nd.C
    public final void m8(InterfaceC4174b interfaceC4174b) throws RemoteException {
        this.f85619a.onMapReady(new C4110c(interfaceC4174b));
    }
}
