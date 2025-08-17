package Ld;

import Bd.InterfaceC2952b;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: Ld.l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC4059l extends Bd.r implements InterfaceC4060m {
    @Override // Bd.r
    protected final boolean A1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzb();
        } else {
            if (i10 != 2) {
                return false;
            }
            InterfaceC2952b interfaceC2952bA2 = Bd.D.a2(parcel.readStrongBinder());
            Bd.s.b(parcel);
            v9(interfaceC2952bA2);
        }
        parcel2.writeNoException();
        return true;
    }

    public AbstractBinderC4059l() {
        super("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
    }
}
