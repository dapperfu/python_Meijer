package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public final class S extends O implements U {
    S(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.measurement.U
    public final Bundle x6(Bundle bundle) throws RemoteException {
        Parcel parcelA2 = a2();
        Q.c(parcelA2, bundle);
        Parcel parcelA1 = A1(1, parcelA2);
        Bundle bundle2 = (Bundle) Q.b(parcelA1, Bundle.CREATOR);
        parcelA1.recycle();
        return bundle2;
    }
}
