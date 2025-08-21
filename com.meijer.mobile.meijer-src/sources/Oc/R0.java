package Oc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C8883mb;
import com.google.android.gms.internal.ads.C9097ob;
import com.google.android.gms.internal.ads.InterfaceC6756Cl;

/* loaded from: classes4.dex */
public final class R0 extends C8883mb implements IInterface {
    R0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
    }

    public final Q0 Z3(com.google.android.gms.dynamic.b bVar, InterfaceC6756Cl interfaceC6756Cl, int i10) throws RemoteException {
        Q0 o02;
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        C9097ob.f(parcelK1, interfaceC6756Cl);
        parcelK1.writeInt(244410000);
        Parcel parcelA2 = a2(1, parcelK1);
        IBinder strongBinder = parcelA2.readStrongBinder();
        if (strongBinder == null) {
            o02 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            if (iInterfaceQueryLocalInterface instanceof Q0) {
                o02 = (Q0) iInterfaceQueryLocalInterface;
            } else {
                o02 = new O0(strongBinder);
            }
        }
        parcelA2.recycle();
        return o02;
    }
}
