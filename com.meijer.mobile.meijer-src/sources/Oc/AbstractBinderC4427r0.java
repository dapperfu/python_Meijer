package Oc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.BinderC8990nb;
import com.google.android.gms.internal.ads.C9097ob;
import com.google.android.gms.internal.ads.InterfaceC6756Cl;

/* renamed from: Oc.r0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractBinderC4427r0 extends BinderC8990nb implements InterfaceC4430s0 {
    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            C4434t1 liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            C9097ob.e(parcel2, liteSdkVersion);
        } else {
            if (i10 != 2) {
                return false;
            }
            InterfaceC6756Cl adapterCreator = getAdapterCreator();
            parcel2.writeNoException();
            C9097ob.f(parcel2, adapterCreator);
        }
        return true;
    }

    public AbstractBinderC4427r0() {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public static InterfaceC4430s0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return iInterfaceQueryLocalInterface instanceof InterfaceC4430s0 ? (InterfaceC4430s0) iInterfaceQueryLocalInterface : new C4425q0(iBinder);
    }
}
