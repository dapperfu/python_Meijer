package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.gp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8146gp extends C8758mb implements IInterface {
    C8146gp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
    }

    public final IBinder N3(com.google.android.gms.dynamic.b bVar, String str, InterfaceC6631Cl interfaceC6631Cl, int i10) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        parcelA1.writeString(str);
        C8972ob.f(parcelA1, interfaceC6631Cl);
        parcelA1.writeInt(244410000);
        Parcel parcelA2 = a2(1, parcelA1);
        IBinder strongBinder = parcelA2.readStrongBinder();
        parcelA2.recycle();
        return strongBinder;
    }
}
