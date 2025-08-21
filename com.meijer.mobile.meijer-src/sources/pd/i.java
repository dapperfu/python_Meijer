package pd;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import jd.InterfaceC14983f;
import yd.C18302a;
import yd.C18304c;

/* loaded from: classes4.dex */
public final class i extends C18302a implements IInterface {
    i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
    }

    public final void I2(h hVar, C16418a c16418a) throws RemoteException {
        Parcel parcelK1 = K1();
        C18304c.d(parcelK1, hVar);
        C18304c.c(parcelK1, c16418a);
        a2(1, parcelK1);
    }

    public final void Z3(h hVar, C16418a c16418a, k kVar) throws RemoteException {
        Parcel parcelK1 = K1();
        C18304c.d(parcelK1, hVar);
        C18304c.c(parcelK1, c16418a);
        C18304c.d(parcelK1, kVar);
        a2(2, parcelK1);
    }

    public final void m6(InterfaceC14983f interfaceC14983f, k kVar) throws RemoteException {
        Parcel parcelK1 = K1();
        C18304c.d(parcelK1, interfaceC14983f);
        C18304c.d(parcelK1, kVar);
        a2(6, parcelK1);
    }
}
