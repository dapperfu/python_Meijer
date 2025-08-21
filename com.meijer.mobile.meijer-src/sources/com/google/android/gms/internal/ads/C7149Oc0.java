package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Oc0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7149Oc0 extends C8883mb implements IInterface {
    C7149Oc0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final C7081Mc0 Z3(C7014Kc0 c7014Kc0) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.d(parcelK1, c7014Kc0);
        Parcel parcelA2 = a2(1, parcelK1);
        C7081Mc0 c7081Mc0 = (C7081Mc0) C9097ob.a(parcelA2, C7081Mc0.CREATOR);
        parcelA2.recycle();
        return c7081Mc0;
    }

    public final C7386Vc0 m6(C7319Tc0 c7319Tc0) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.d(parcelK1, c7319Tc0);
        Parcel parcelA2 = a2(3, parcelK1);
        C7386Vc0 c7386Vc0 = (C7386Vc0) C9097ob.a(parcelA2, C7386Vc0.CREATOR);
        parcelA2.recycle();
        return c7386Vc0;
    }

    public final void t6(C6912Hc0 c6912Hc0) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.d(parcelK1, c6912Hc0);
        c2(2, parcelK1);
    }
}
