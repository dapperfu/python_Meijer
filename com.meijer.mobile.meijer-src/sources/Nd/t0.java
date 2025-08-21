package Nd;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public abstract class t0 extends Dd.r implements InterfaceC4176c {
    @Override // Dd.r
    protected final boolean K1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        InterfaceC4199u c4198t;
        if (i10 == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                c4198t = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
                c4198t = iInterfaceQueryLocalInterface instanceof InterfaceC4199u ? (InterfaceC4199u) iInterfaceQueryLocalInterface : new C4198t(strongBinder);
            }
            Dd.s.b(parcel);
            C2(c4198t);
        } else {
            if (i10 != 2) {
                return false;
            }
            deactivate();
        }
        parcel2.writeNoException();
        return true;
    }

    public t0() {
        super("com.google.android.gms.maps.internal.ILocationSourceDelegate");
    }
}
