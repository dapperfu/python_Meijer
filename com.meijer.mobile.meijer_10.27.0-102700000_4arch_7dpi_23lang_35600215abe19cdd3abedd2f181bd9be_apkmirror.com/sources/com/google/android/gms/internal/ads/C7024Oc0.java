package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Oc0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7024Oc0 extends C8758mb implements IInterface {
    C7024Oc0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final C6956Mc0 N3(C6889Kc0 c6889Kc0) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.d(parcelA1, c6889Kc0);
        Parcel parcelA2 = a2(1, parcelA1);
        C6956Mc0 c6956Mc0 = (C6956Mc0) C8972ob.a(parcelA2, C6956Mc0.CREATOR);
        parcelA2.recycle();
        return c6956Mc0;
    }

    public final C7261Vc0 W5(C7194Tc0 c7194Tc0) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.d(parcelA1, c7194Tc0);
        Parcel parcelA2 = a2(3, parcelA1);
        C7261Vc0 c7261Vc0 = (C7261Vc0) C8972ob.a(parcelA2, C7261Vc0.CREATOR);
        parcelA2.recycle();
        return c7261Vc0;
    }

    public final void f6(C6787Hc0 c6787Hc0) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.d(parcelA1, c6787Hc0);
        b2(2, parcelA1);
    }
}
