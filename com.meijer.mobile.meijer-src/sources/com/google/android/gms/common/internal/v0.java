package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;

/* loaded from: classes4.dex */
public final class v0 extends Ad.a implements S {
    @Override // com.google.android.gms.common.internal.S
    public final int zzc() throws RemoteException {
        Parcel parcelK1 = K1(2, c2());
        int i10 = parcelK1.readInt();
        parcelK1.recycle();
        return i10;
    }

    @Override // com.google.android.gms.common.internal.S
    public final com.google.android.gms.dynamic.b zzd() throws RemoteException {
        Parcel parcelK1 = K1(1, c2());
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelK1.readStrongBinder());
        parcelK1.recycle();
        return bVarA2;
    }

    v0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }
}
