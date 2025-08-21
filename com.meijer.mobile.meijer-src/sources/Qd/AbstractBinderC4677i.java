package Qd;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.P;
import com.google.android.gms.internal.measurement.Q;
import com.google.android.gms.measurement.internal.Z5;

/* renamed from: Qd.i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC4677i extends P implements InterfaceC4678j {
    @Override // com.google.android.gms.internal.measurement.P
    protected final boolean K1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 2) {
            return false;
        }
        Z5 z52 = (Z5) Q.b(parcel, Z5.CREATOR);
        Q.f(parcel);
        s8(z52);
        return true;
    }

    public AbstractBinderC4677i() {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }
}
