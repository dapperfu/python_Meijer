package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes4.dex */
public abstract class w0 extends Ad.c implements S {
    @Override // Ad.c
    protected final boolean K1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            com.google.android.gms.dynamic.b bVarZzd = zzd();
            parcel2.writeNoException();
            Ad.d.d(parcel2, bVarZzd);
        } else {
            if (i10 != 2) {
                return false;
            }
            int iZzc = zzc();
            parcel2.writeNoException();
            parcel2.writeInt(iZzc);
        }
        return true;
    }

    public w0() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static S a2(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return iInterfaceQueryLocalInterface instanceof S ? (S) iInterfaceQueryLocalInterface : new v0(iBinder);
    }
}
