package Od;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.O;
import com.google.android.gms.internal.measurement.Q;
import com.google.android.gms.measurement.internal.Z5;

/* renamed from: Od.h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4470h extends O implements InterfaceC4472j {
    C4470h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // Od.InterfaceC4472j
    public final void v8(Z5 z52) throws RemoteException {
        Parcel parcelA2 = a2();
        Q.c(parcelA2, z52);
        F2(2, parcelA2);
    }
}
