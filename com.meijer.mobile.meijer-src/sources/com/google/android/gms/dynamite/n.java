package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;

/* loaded from: classes4.dex */
public final class n extends Ad.a implements IInterface {
    n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final com.google.android.gms.dynamic.b I2(com.google.android.gms.dynamic.b bVar, String str, int i10, com.google.android.gms.dynamic.b bVar2) throws RemoteException {
        Parcel parcelC2 = c2();
        Ad.d.d(parcelC2, bVar);
        parcelC2.writeString(str);
        parcelC2.writeInt(i10);
        Ad.d.d(parcelC2, bVar2);
        Parcel parcelK1 = K1(2, parcelC2);
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelK1.readStrongBinder());
        parcelK1.recycle();
        return bVarA2;
    }

    public final com.google.android.gms.dynamic.b Z3(com.google.android.gms.dynamic.b bVar, String str, int i10, com.google.android.gms.dynamic.b bVar2) throws RemoteException {
        Parcel parcelC2 = c2();
        Ad.d.d(parcelC2, bVar);
        parcelC2.writeString(str);
        parcelC2.writeInt(i10);
        Ad.d.d(parcelC2, bVar2);
        Parcel parcelK1 = K1(3, parcelC2);
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelK1.readStrongBinder());
        parcelK1.recycle();
        return bVarA2;
    }
}
