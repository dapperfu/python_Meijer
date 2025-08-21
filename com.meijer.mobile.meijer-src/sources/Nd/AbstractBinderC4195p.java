package Nd;

import Dd.AbstractBinderC3103d;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: Nd.p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC4195p extends Dd.r implements InterfaceC4196q {
    @Override // Dd.r
    protected final boolean K1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Dd.e eVarA2 = AbstractBinderC3103d.a2(parcel.readStrongBinder());
        Dd.s.b(parcel);
        f(eVarA2);
        parcel2.writeNoException();
        return true;
    }

    public AbstractBinderC4195p() {
        super("com.google.android.gms.maps.internal.IOnInfoWindowCloseListener");
    }
}
