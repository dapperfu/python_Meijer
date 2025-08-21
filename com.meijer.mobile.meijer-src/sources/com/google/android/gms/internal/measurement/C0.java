package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public final class C0 extends O implements E0 {
    @Override // com.google.android.gms.internal.measurement.E0
    public final int zzf() throws RemoteException {
        Parcel parcelK1 = K1(2, a2());
        int i10 = parcelK1.readInt();
        parcelK1.recycle();
        return i10;
    }

    C0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.E0
    public final void X0(String str, String str2, Bundle bundle, long j10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeString(str);
        parcelA2.writeString(str2);
        Q.c(parcelA2, bundle);
        parcelA2.writeLong(j10);
        c2(1, parcelA2);
    }
}
