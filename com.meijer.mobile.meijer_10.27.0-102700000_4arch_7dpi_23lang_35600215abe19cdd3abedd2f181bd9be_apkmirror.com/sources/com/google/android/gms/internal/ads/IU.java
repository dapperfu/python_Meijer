package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes6.dex */
final class IU extends AbstractBinderC9314rm {

    /* renamed from: a, reason: collision with root package name */
    private final C8642lT f67622a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ KU f67623b;

    /* synthetic */ IU(KU ku2, C8642lT c8642lT, JU ju2) {
        this.f67623b = ku2;
        this.f67622a = c8642lT;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9421sm
    public final void K6(InterfaceC7106Ql interfaceC7106Ql) throws RemoteException {
        this.f67623b.f68101c = interfaceC7106Ql;
        ((BinderC8003fU) this.f67622a.f75827c).zzo();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9421sm
    public final void a(String str) throws RemoteException {
        ((BinderC8003fU) this.f67622a.f75827c).n1(0, str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9421sm
    public final void b(Mc.W0 w02) throws RemoteException {
        ((BinderC8003fU) this.f67622a.f75827c).G1(w02);
    }
}
