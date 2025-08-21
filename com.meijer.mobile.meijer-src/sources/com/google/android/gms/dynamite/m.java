package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;

/* loaded from: classes4.dex */
public final class m extends Ad.a implements IInterface {
    public final int zze() throws RemoteException {
        Parcel parcelK1 = K1(6, c2());
        int i10 = parcelK1.readInt();
        parcelK1.recycle();
        return i10;
    }

    m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final com.google.android.gms.dynamic.b A9(com.google.android.gms.dynamic.b bVar, String str, boolean z10, long j10) throws RemoteException {
        Parcel parcelC2 = c2();
        Ad.d.d(parcelC2, bVar);
        parcelC2.writeString(str);
        parcelC2.writeInt(z10 ? 1 : 0);
        parcelC2.writeLong(j10);
        Parcel parcelK1 = K1(7, parcelC2);
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelK1.readStrongBinder());
        parcelK1.recycle();
        return bVarA2;
    }

    public final int I2(com.google.android.gms.dynamic.b bVar, String str, boolean z10) throws RemoteException {
        Parcel parcelC2 = c2();
        Ad.d.d(parcelC2, bVar);
        parcelC2.writeString(str);
        parcelC2.writeInt(z10 ? 1 : 0);
        Parcel parcelK1 = K1(3, parcelC2);
        int i10 = parcelK1.readInt();
        parcelK1.recycle();
        return i10;
    }

    public final int Z3(com.google.android.gms.dynamic.b bVar, String str, boolean z10) throws RemoteException {
        Parcel parcelC2 = c2();
        Ad.d.d(parcelC2, bVar);
        parcelC2.writeString(str);
        parcelC2.writeInt(z10 ? 1 : 0);
        Parcel parcelK1 = K1(5, parcelC2);
        int i10 = parcelK1.readInt();
        parcelK1.recycle();
        return i10;
    }

    public final com.google.android.gms.dynamic.b m6(com.google.android.gms.dynamic.b bVar, String str, int i10) throws RemoteException {
        Parcel parcelC2 = c2();
        Ad.d.d(parcelC2, bVar);
        parcelC2.writeString(str);
        parcelC2.writeInt(i10);
        Parcel parcelK1 = K1(2, parcelC2);
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelK1.readStrongBinder());
        parcelK1.recycle();
        return bVarA2;
    }

    public final com.google.android.gms.dynamic.b o7(com.google.android.gms.dynamic.b bVar, String str, int i10) throws RemoteException {
        Parcel parcelC2 = c2();
        Ad.d.d(parcelC2, bVar);
        parcelC2.writeString(str);
        parcelC2.writeInt(i10);
        Parcel parcelK1 = K1(4, parcelC2);
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelK1.readStrongBinder());
        parcelK1.recycle();
        return bVarA2;
    }

    public final com.google.android.gms.dynamic.b t6(com.google.android.gms.dynamic.b bVar, String str, int i10, com.google.android.gms.dynamic.b bVar2) throws RemoteException {
        Parcel parcelC2 = c2();
        Ad.d.d(parcelC2, bVar);
        parcelC2.writeString(str);
        parcelC2.writeInt(i10);
        Ad.d.d(parcelC2, bVar2);
        Parcel parcelK1 = K1(8, parcelC2);
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelK1.readStrongBinder());
        parcelK1.recycle();
        return bVarA2;
    }
}
