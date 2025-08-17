package vd;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import bd.C6225d;

/* renamed from: vd.g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C17551g extends C17545a implements IInterface {
    C17551g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appset.internal.IAppSetService");
    }

    public final void b2(C6225d c6225d, InterfaceC17550f interfaceC17550f) throws RemoteException {
        Parcel parcelA1 = A1();
        C17547c.b(parcelA1, c6225d);
        C17547c.c(parcelA1, interfaceC17550f);
        a2(1, parcelA1);
    }
}
