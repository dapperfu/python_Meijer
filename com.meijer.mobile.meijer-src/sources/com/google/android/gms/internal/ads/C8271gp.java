package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.gp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8271gp extends C8883mb implements IInterface {
    C8271gp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
    }

    public final IBinder Z3(com.google.android.gms.dynamic.b bVar, String str, InterfaceC6756Cl interfaceC6756Cl, int i10) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        parcelK1.writeString(str);
        C9097ob.f(parcelK1, interfaceC6756Cl);
        parcelK1.writeInt(244410000);
        Parcel parcelA2 = a2(1, parcelK1);
        IBinder strongBinder = parcelA2.readStrongBinder();
        parcelA2.recycle();
        return strongBinder;
    }
}
