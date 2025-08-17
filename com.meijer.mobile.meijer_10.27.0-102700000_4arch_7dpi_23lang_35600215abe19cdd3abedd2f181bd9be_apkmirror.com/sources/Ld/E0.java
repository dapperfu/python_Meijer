package Ld;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public abstract class E0 extends Bd.r implements F0 {
    @Override // Bd.r
    protected final boolean A1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Bd.y yVarA2 = Bd.x.a2(parcel.readStrongBinder());
        Bd.s.b(parcel);
        b6(yVarA2);
        parcel2.writeNoException();
        return true;
    }

    public E0() {
        super("com.google.android.gms.maps.internal.IOnCircleClickListener");
    }
}
