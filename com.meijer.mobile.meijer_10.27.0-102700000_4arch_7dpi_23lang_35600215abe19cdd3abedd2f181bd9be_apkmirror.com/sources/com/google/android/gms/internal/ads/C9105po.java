package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.po, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9105po extends C8758mb implements IInterface {
    C9105po(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
    }

    public final void N3(String str, C8037fo c8037fo) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeString(str);
        C8972ob.d(parcelA1, c8037fo);
        b2(1, parcelA1);
    }

    public final void k4(Pc.C c10) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.d(parcelA1, c10);
        b2(2, parcelA1);
    }
}
