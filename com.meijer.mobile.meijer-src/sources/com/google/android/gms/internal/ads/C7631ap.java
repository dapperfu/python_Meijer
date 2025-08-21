package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.ap, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7631ap extends C8883mb implements InterfaceC7844cp {
    C7631ap(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7844cp
    public final Oc.U0 zzc() throws RemoteException {
        Parcel parcelA2 = a2(12, K1());
        Oc.U0 u0B9 = Oc.T0.B9(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return u0B9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7844cp
    public final void R6(Oc.Y1 y12, InterfaceC8590jp interfaceC8590jp) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.d(parcelK1, y12);
        C9097ob.f(parcelK1, interfaceC8590jp);
        c2(14, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7844cp
    public final void j6(Oc.Y1 y12, InterfaceC8590jp interfaceC8590jp) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.d(parcelK1, y12);
        C9097ob.f(parcelK1, interfaceC8590jp);
        c2(1, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7844cp
    public final void n7(InterfaceC8164fp interfaceC8164fp) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, interfaceC8164fp);
        c2(2, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7844cp
    public final void zzm(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        c2(5, parcelK1);
    }
}
