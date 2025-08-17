package Ld;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public abstract class t0 extends Bd.r implements InterfaceC4044c {
    @Override // Bd.r
    protected final boolean A1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        InterfaceC4067u c4066t;
        if (i10 == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                c4066t = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
                c4066t = iInterfaceQueryLocalInterface instanceof InterfaceC4067u ? (InterfaceC4067u) iInterfaceQueryLocalInterface : new C4066t(strongBinder);
            }
            Bd.s.b(parcel);
            i3(c4066t);
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
