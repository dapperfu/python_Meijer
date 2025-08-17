package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.ap, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7506ap extends C8758mb implements InterfaceC7719cp {
    C7506ap(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7719cp
    public final Mc.U0 zzc() throws RemoteException {
        Parcel parcelA2 = a2(12, A1());
        Mc.U0 u0B9 = Mc.T0.B9(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return u0B9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7719cp
    public final void Y7(Mc.Y1 y12, InterfaceC8465jp interfaceC8465jp) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.d(parcelA1, y12);
        C8972ob.f(parcelA1, interfaceC8465jp);
        b2(14, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7719cp
    public final void b7(InterfaceC8039fp interfaceC8039fp) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, interfaceC8039fp);
        b2(2, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7719cp
    public final void x9(Mc.Y1 y12, InterfaceC8465jp interfaceC8465jp) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.d(parcelA1, y12);
        C8972ob.f(parcelA1, interfaceC8465jp);
        b2(1, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7719cp
    public final void zzm(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        b2(5, parcelA1);
    }
}
