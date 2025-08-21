package Nd;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public abstract class B extends Dd.r implements C {
    @Override // Dd.r
    protected final boolean K1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        InterfaceC4174b q0Var;
        if (i10 != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            q0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            q0Var = iInterfaceQueryLocalInterface instanceof InterfaceC4174b ? (InterfaceC4174b) iInterfaceQueryLocalInterface : new q0(strongBinder);
        }
        Dd.s.b(parcel);
        m8(q0Var);
        parcel2.writeNoException();
        return true;
    }

    public B() {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback");
    }
}
