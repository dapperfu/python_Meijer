package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes6.dex */
final class IU extends AbstractBinderC9439rm {

    /* renamed from: a, reason: collision with root package name */
    private final C8767lT f68462a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ KU f68463b;

    /* synthetic */ IU(KU ku2, C8767lT c8767lT, JU ju2) {
        this.f68463b = ku2;
        this.f68462a = c8767lT;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9546sm
    public final void X6(InterfaceC7231Ql interfaceC7231Ql) throws RemoteException {
        this.f68463b.f68941c = interfaceC7231Ql;
        ((BinderC8128fU) this.f68462a.f76667c).zzo();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9546sm
    public final void a(String str) throws RemoteException {
        ((BinderC8128fU) this.f68462a.f76667c).t1(0, str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9546sm
    public final void b(Oc.W0 w02) throws RemoteException {
        ((BinderC8128fU) this.f68462a.f76667c).z8(w02);
    }
}
