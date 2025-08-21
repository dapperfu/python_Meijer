package Td;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import yd.C18302a;
import yd.C18304c;

/* loaded from: classes6.dex */
public final class g extends C18302a implements IInterface {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void I2(j jVar, f fVar) throws RemoteException {
        Parcel parcelK1 = K1();
        C18304c.c(parcelK1, jVar);
        C18304c.d(parcelK1, fVar);
        a2(12, parcelK1);
    }
}
