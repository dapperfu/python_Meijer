package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public abstract class A0 extends P implements B0 {
    @Override // com.google.android.gms.internal.measurement.P
    protected final boolean A1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 2) {
            return false;
        }
        zze();
        return true;
    }

    public A0() {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
    }
}
