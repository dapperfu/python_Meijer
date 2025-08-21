package Kd;

import Zd.C5631d;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public final class p extends a implements IInterface {
    p(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wallet.internal.IOwService");
    }

    public final void c2(C5631d c5631d, Bundle bundle, r rVar) throws RemoteException {
        Parcel parcelK1 = K1();
        d.c(parcelK1, c5631d);
        d.c(parcelK1, bundle);
        d.d(parcelK1, rVar);
        a2(6, parcelK1);
    }
}
