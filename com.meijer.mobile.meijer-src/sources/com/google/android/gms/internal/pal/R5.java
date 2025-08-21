package com.google.android.gms.internal.pal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public final class R5 extends O4 implements IInterface {
    R5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final P5 Z3(N5 n52) throws RemoteException {
        Parcel parcelK1 = K1();
        Q4.d(parcelK1, n52);
        Parcel parcelA2 = a2(1, parcelK1);
        P5 p52 = (P5) Q4.a(parcelA2, P5.CREATOR);
        parcelA2.recycle();
        return p52;
    }
}
