package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Mc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7080Mc extends C8883mb implements IInterface {
    C7080Mc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final long Z3(C7013Kc c7013Kc) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.d(parcelK1, c7013Kc);
        Parcel parcelA2 = a2(3, parcelK1);
        long j10 = parcelA2.readLong();
        parcelA2.recycle();
        return j10;
    }

    public final C6911Hc m6(C7013Kc c7013Kc) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.d(parcelK1, c7013Kc);
        Parcel parcelA2 = a2(1, parcelK1);
        C6911Hc c6911Hc = (C6911Hc) C9097ob.a(parcelA2, C6911Hc.CREATOR);
        parcelA2.recycle();
        return c6911Hc;
    }

    public final C6911Hc t6(C7013Kc c7013Kc) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.d(parcelK1, c7013Kc);
        Parcel parcelA2 = a2(2, parcelK1);
        C6911Hc c6911Hc = (C6911Hc) C9097ob.a(parcelA2, C6911Hc.CREATOR);
        parcelA2.recycle();
        return c6911Hc;
    }
}
