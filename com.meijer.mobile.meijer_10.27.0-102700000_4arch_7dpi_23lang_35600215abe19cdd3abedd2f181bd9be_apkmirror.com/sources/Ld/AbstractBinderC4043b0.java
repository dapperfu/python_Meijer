package Ld;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: Ld.b0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC4043b0 extends Bd.r implements InterfaceC4045c0 {
    @Override // Bd.r
    protected final boolean A1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        InterfaceC4052g c4053g0;
        if (i10 != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            c4053g0 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            c4053g0 = iInterfaceQueryLocalInterface instanceof InterfaceC4052g ? (InterfaceC4052g) iInterfaceQueryLocalInterface : new C4053g0(strongBinder);
        }
        Bd.s.b(parcel);
        h5(c4053g0);
        parcel2.writeNoException();
        return true;
    }

    public AbstractBinderC4043b0() {
        super("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
    }
}
