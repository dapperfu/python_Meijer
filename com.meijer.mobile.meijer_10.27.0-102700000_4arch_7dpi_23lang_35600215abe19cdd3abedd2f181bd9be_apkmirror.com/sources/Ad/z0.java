package Ad;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public abstract class z0 extends BinderC2809d implements A0 {
    @Override // Ad.BinderC2809d
    protected final boolean A1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            w0 w0Var = (w0) r.a(parcel, w0.CREATOR);
            r.d(parcel);
            l4(w0Var);
        } else {
            if (i10 != 2) {
                return false;
            }
            zze();
        }
        return true;
    }

    public z0() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }
}
