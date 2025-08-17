package Mc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C8758mb;
import com.google.android.gms.internal.ads.C8972ob;
import com.google.android.gms.internal.ads.InterfaceC6631Cl;

/* loaded from: classes4.dex */
public final class R0 extends C8758mb implements IInterface {
    R0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
    }

    public final Q0 N3(com.google.android.gms.dynamic.b bVar, InterfaceC6631Cl interfaceC6631Cl, int i10) throws RemoteException {
        Q0 o02;
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        C8972ob.f(parcelA1, interfaceC6631Cl);
        parcelA1.writeInt(244410000);
        Parcel parcelA2 = a2(1, parcelA1);
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
