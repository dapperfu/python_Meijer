package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;
import yd.C18206a;

/* loaded from: classes4.dex */
public final class v0 extends C18206a implements S {
    @Override // com.google.android.gms.common.internal.S
    public final int zzc() throws RemoteException {
        Parcel parcelA1 = A1(2, b2());
        int i10 = parcelA1.readInt();
        parcelA1.recycle();
        return i10;
    }

    @Override // com.google.android.gms.common.internal.S
    public final com.google.android.gms.dynamic.b zzd() throws RemoteException {
        Parcel parcelA1 = A1(1, b2());
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelA1.readStrongBinder());
        parcelA1.recycle();
        return bVarA2;
    }

    v0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }
}
