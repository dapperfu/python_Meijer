package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;
import yd.C18206a;

/* loaded from: classes4.dex */
public final class m extends C18206a implements IInterface {
    public final int zze() throws RemoteException {
        Parcel parcelA1 = A1(6, b2());
        int i10 = parcelA1.readInt();
        parcelA1.recycle();
        return i10;
    }

    m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final com.google.android.gms.dynamic.b A9(com.google.android.gms.dynamic.b bVar, String str, boolean z10, long j10) throws RemoteException {
        Parcel parcelB2 = b2();
        yd.d.d(parcelB2, bVar);
        parcelB2.writeString(str);
        parcelB2.writeInt(z10 ? 1 : 0);
        parcelB2.writeLong(j10);
        Parcel parcelA1 = A1(7, parcelB2);
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelA1.readStrongBinder());
        parcelA1.recycle();
        return bVarA2;
    }

    public final int F2(com.google.android.gms.dynamic.b bVar, String str, boolean z10) throws RemoteException {
        Parcel parcelB2 = b2();
        yd.d.d(parcelB2, bVar);
        parcelB2.writeString(str);
        parcelB2.writeInt(z10 ? 1 : 0);
        Parcel parcelA1 = A1(3, parcelB2);
        int i10 = parcelA1.readInt();
        parcelA1.recycle();
        return i10;
    }

    public final int N3(com.google.android.gms.dynamic.b bVar, String str, boolean z10) throws RemoteException {
        Parcel parcelB2 = b2();
        yd.d.d(parcelB2, bVar);
        parcelB2.writeString(str);
        parcelB2.writeInt(z10 ? 1 : 0);
        Parcel parcelA1 = A1(5, parcelB2);
        int i10 = parcelA1.readInt();
        parcelA1.recycle();
        return i10;
    }

    public final com.google.android.gms.dynamic.b W5(com.google.android.gms.dynamic.b bVar, String str, int i10) throws RemoteException {
        Parcel parcelB2 = b2();
        yd.d.d(parcelB2, bVar);
        parcelB2.writeString(str);
        parcelB2.writeInt(i10);
        Parcel parcelA1 = A1(2, parcelB2);
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelA1.readStrongBinder());
        parcelA1.recycle();
        return bVarA2;
    }

    public final com.google.android.gms.dynamic.b d7(com.google.android.gms.dynamic.b bVar, String str, int i10) throws RemoteException {
        Parcel parcelB2 = b2();
        yd.d.d(parcelB2, bVar);
        parcelB2.writeString(str);
        parcelB2.writeInt(i10);
        Parcel parcelA1 = A1(4, parcelB2);
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelA1.readStrongBinder());
        parcelA1.recycle();
        return bVarA2;
    }

    public final com.google.android.gms.dynamic.b f6(com.google.android.gms.dynamic.b bVar, String str, int i10, com.google.android.gms.dynamic.b bVar2) throws RemoteException {
        Parcel parcelB2 = b2();
        yd.d.d(parcelB2, bVar);
        parcelB2.writeString(str);
        parcelB2.writeInt(i10);
        yd.d.d(parcelB2, bVar2);
        Parcel parcelA1 = A1(8, parcelB2);
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelA1.readStrongBinder());
        parcelA1.recycle();
        return bVarA2;
    }
}
