package Mc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.BinderC8865nb;
import com.google.android.gms.internal.ads.C8972ob;
import com.google.android.gms.internal.ads.InterfaceC6631Cl;

/* renamed from: Mc.r0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractBinderC4149r0 extends BinderC8865nb implements InterfaceC4152s0 {
    @Override // com.google.android.gms.internal.ads.BinderC8865nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            C4156t1 liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            C8972ob.e(parcel2, liteSdkVersion);
        } else {
            if (i10 != 2) {
                return false;
            }
            InterfaceC6631Cl adapterCreator = getAdapterCreator();
            parcel2.writeNoException();
            C8972ob.f(parcel2, adapterCreator);
        }
        return true;
    }

    public AbstractBinderC4149r0() {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public static InterfaceC4152s0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return iInterfaceQueryLocalInterface instanceof InterfaceC4152s0 ? (InterfaceC4152s0) iInterfaceQueryLocalInterface : new C4147q0(iBinder);
    }
}
