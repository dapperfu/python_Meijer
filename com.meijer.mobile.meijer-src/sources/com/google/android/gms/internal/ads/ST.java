package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;

/* loaded from: classes6.dex */
final class ST extends AbstractBinderC8798lm {

    /* renamed from: a, reason: collision with root package name */
    private final C8767lT f70950a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ UT f70951b;

    /* synthetic */ ST(UT ut2, C8767lT c8767lT, TT tt2) {
        this.f70951b = ut2;
        this.f70950a = c8767lT;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8905mm
    public final void B8(InterfaceC7062Ll interfaceC7062Ll) throws RemoteException {
        this.f70951b.f71459d = interfaceC7062Ll;
        ((BinderC8128fU) this.f70950a.f76667c).zzo();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8905mm
    public final void a(String str) throws RemoteException {
        ((BinderC8128fU) this.f70950a.f76667c).t1(0, str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8905mm
    public final void b(Oc.W0 w02) throws RemoteException {
        ((BinderC8128fU) this.f70950a.f76667c).z8(w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8905mm
    public final void B0(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        this.f70951b.f71458c = (View) com.google.android.gms.dynamic.d.c2(bVar);
        ((BinderC8128fU) this.f70950a.f76667c).zzo();
    }
}
