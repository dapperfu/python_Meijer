package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.po, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9230po extends C8883mb implements IInterface {
    C9230po(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
    }

    public final void E4(Rc.C c10) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.d(parcelK1, c10);
        c2(2, parcelK1);
    }

    public final void Z3(String str, C8162fo c8162fo) throws RemoteException {
        Parcel parcelK1 = K1();
        parcelK1.writeString(str);
        C9097ob.d(parcelK1, c8162fo);
        c2(1, parcelK1);
    }
}
