package Ld;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public abstract class C0 extends Bd.r implements D0 {
    @Override // Bd.r
    protected final boolean A1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        int i12 = parcel.readInt();
        Bd.s.b(parcel);
        zzb(i12);
        parcel2.writeNoException();
        return true;
    }

    public C0() {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener");
    }
}
