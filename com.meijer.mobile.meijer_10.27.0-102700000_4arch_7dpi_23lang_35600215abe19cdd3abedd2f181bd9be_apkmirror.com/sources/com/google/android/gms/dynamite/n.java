package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;
import yd.C18206a;

/* loaded from: classes4.dex */
public final class n extends C18206a implements IInterface {
    n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final com.google.android.gms.dynamic.b F2(com.google.android.gms.dynamic.b bVar, String str, int i10, com.google.android.gms.dynamic.b bVar2) throws RemoteException {
        Parcel parcelB2 = b2();
        yd.d.d(parcelB2, bVar);
        parcelB2.writeString(str);
        parcelB2.writeInt(i10);
        yd.d.d(parcelB2, bVar2);
        Parcel parcelA1 = A1(2, parcelB2);
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelA1.readStrongBinder());
        parcelA1.recycle();
        return bVarA2;
    }

    public final com.google.android.gms.dynamic.b N3(com.google.android.gms.dynamic.b bVar, String str, int i10, com.google.android.gms.dynamic.b bVar2) throws RemoteException {
        Parcel parcelB2 = b2();
        yd.d.d(parcelB2, bVar);
        parcelB2.writeString(str);
        parcelB2.writeInt(i10);
        yd.d.d(parcelB2, bVar2);
        Parcel parcelA1 = A1(3, parcelB2);
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelA1.readStrongBinder());
        parcelA1.recycle();
        return bVarA2;
    }
}
