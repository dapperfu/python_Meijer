package com.google.android.gms.internal.pal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public final class X4 extends O4 implements IInterface {
    X4(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
    }

    public final IBinder Z3(String str, com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelK1 = K1();
        parcelK1.writeString("h.3.2.2/n.android.3.2.2");
        Q4.e(parcelK1, bVar);
        Parcel parcelA2 = a2(2, parcelK1);
        IBinder strongBinder = parcelA2.readStrongBinder();
        parcelA2.recycle();
        return strongBinder;
    }
}
