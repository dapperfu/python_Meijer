package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Mc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6955Mc extends C8758mb implements IInterface {
    C6955Mc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final long N3(C6888Kc c6888Kc) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.d(parcelA1, c6888Kc);
        Parcel parcelA2 = a2(3, parcelA1);
        long j10 = parcelA2.readLong();
        parcelA2.recycle();
        return j10;
    }

    public final C6786Hc W5(C6888Kc c6888Kc) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.d(parcelA1, c6888Kc);
        Parcel parcelA2 = a2(1, parcelA1);
        C6786Hc c6786Hc = (C6786Hc) C8972ob.a(parcelA2, C6786Hc.CREATOR);
        parcelA2.recycle();
        return c6786Hc;
    }

    public final C6786Hc f6(C6888Kc c6888Kc) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.d(parcelA1, c6888Kc);
        Parcel parcelA2 = a2(2, parcelA1);
        C6786Hc c6786Hc = (C6786Hc) C8972ob.a(parcelA2, C6786Hc.CREATOR);
        parcelA2.recycle();
        return c6786Hc;
    }
}
