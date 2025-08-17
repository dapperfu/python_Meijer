package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;

/* loaded from: classes6.dex */
final class ST extends AbstractBinderC8673lm {

    /* renamed from: a, reason: collision with root package name */
    private final C8642lT f70110a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ UT f70111b;

    /* synthetic */ ST(UT ut2, C8642lT c8642lT, TT tt2) {
        this.f70111b = ut2;
        this.f70110a = c8642lT;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8780mm
    public final void H8(InterfaceC6937Ll interfaceC6937Ll) throws RemoteException {
        this.f70111b.f70619d = interfaceC6937Ll;
        ((BinderC8003fU) this.f70110a.f75827c).zzo();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8780mm
    public final void a(String str) throws RemoteException {
        ((BinderC8003fU) this.f70110a.f75827c).n1(0, str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8780mm
    public final void b(Mc.W0 w02) throws RemoteException {
        ((BinderC8003fU) this.f70110a.f75827c).G1(w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8780mm
    public final void y0(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        this.f70111b.f70618c = (View) com.google.android.gms.dynamic.d.b2(bVar);
        ((BinderC8003fU) this.f70110a.f75827c).zzo();
    }
}
