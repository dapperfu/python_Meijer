package Id;

import Xd.C5420d;
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

    public final void b2(C5420d c5420d, Bundle bundle, r rVar) throws RemoteException {
        Parcel parcelA1 = A1();
        d.c(parcelA1, c5420d);
        d.c(parcelA1, bundle);
        d.d(parcelA1, rVar);
        a2(6, parcelA1);
    }
}
