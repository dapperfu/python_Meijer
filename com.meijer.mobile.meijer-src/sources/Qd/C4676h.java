package Qd;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.O;
import com.google.android.gms.internal.measurement.Q;
import com.google.android.gms.measurement.internal.Z5;

/* renamed from: Qd.h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4676h extends O implements InterfaceC4678j {
    C4676h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // Qd.InterfaceC4678j
    public final void s8(Z5 z52) throws RemoteException {
        Parcel parcelA2 = a2();
        Q.c(parcelA2, z52);
        I2(2, parcelA2);
    }
}
