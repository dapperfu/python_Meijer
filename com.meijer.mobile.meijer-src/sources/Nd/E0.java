package Nd;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public abstract class E0 extends Dd.r implements F0 {
    @Override // Dd.r
    protected final boolean K1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Dd.y yVarA2 = Dd.x.a2(parcel.readStrongBinder());
        Dd.s.b(parcel);
        d6(yVarA2);
        parcel2.writeNoException();
        return true;
    }

    public E0() {
        super("com.google.android.gms.maps.internal.IOnCircleClickListener");
    }
}
