package Rd;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import wd.C17809a;
import wd.C17811c;

/* loaded from: classes6.dex */
public final class g extends C17809a implements IInterface {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void F2(j jVar, f fVar) throws RemoteException {
        Parcel parcelA1 = A1();
        C17811c.c(parcelA1, jVar);
        C17811c.d(parcelA1, fVar);
        a2(12, parcelA1);
    }
}
