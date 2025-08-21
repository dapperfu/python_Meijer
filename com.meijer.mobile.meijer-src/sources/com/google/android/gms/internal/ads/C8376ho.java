package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.ho, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8376ho extends C8883mb implements InterfaceC8588jo {
    C8376ho(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8588jo
    public final void A7(C9978wo c9978wo, InterfaceC9123oo interfaceC9123oo) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.d(parcelK1, c9978wo);
        C9097ob.f(parcelK1, interfaceC9123oo);
        c2(5, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8588jo
    public final void B3(String str, InterfaceC9123oo interfaceC9123oo) throws RemoteException {
        Parcel parcelK1 = K1();
        parcelK1.writeString(str);
        C9097ob.f(parcelK1, interfaceC9123oo);
        c2(7, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8588jo
    public final void O5(C9978wo c9978wo, InterfaceC9123oo interfaceC9123oo) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.d(parcelK1, c9978wo);
        C9097ob.f(parcelK1, interfaceC9123oo);
        c2(6, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8588jo
    public final void Z6(C9978wo c9978wo, InterfaceC9123oo interfaceC9123oo) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.d(parcelK1, c9978wo);
        C9097ob.f(parcelK1, interfaceC9123oo);
        c2(4, parcelK1);
    }
}
