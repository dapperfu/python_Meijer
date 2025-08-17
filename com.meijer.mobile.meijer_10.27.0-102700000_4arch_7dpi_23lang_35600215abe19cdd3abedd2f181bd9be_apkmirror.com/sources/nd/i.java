package nd;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import hd.InterfaceC14405f;
import wd.C17809a;
import wd.C17811c;

/* loaded from: classes4.dex */
public final class i extends C17809a implements IInterface {
    i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
    }

    public final void F2(h hVar, C15790a c15790a) throws RemoteException {
        Parcel parcelA1 = A1();
        C17811c.d(parcelA1, hVar);
        C17811c.c(parcelA1, c15790a);
        a2(1, parcelA1);
    }

    public final void N3(h hVar, C15790a c15790a, k kVar) throws RemoteException {
        Parcel parcelA1 = A1();
        C17811c.d(parcelA1, hVar);
        C17811c.c(parcelA1, c15790a);
        C17811c.d(parcelA1, kVar);
        a2(2, parcelA1);
    }

    public final void W5(InterfaceC14405f interfaceC14405f, k kVar) throws RemoteException {
        Parcel parcelA1 = A1();
        C17811c.d(parcelA1, interfaceC14405f);
        C17811c.d(parcelA1, kVar);
        a2(6, parcelA1);
    }
}
