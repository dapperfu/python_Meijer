package Qd;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.O;
import java.util.List;

/* renamed from: Qd.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4673e extends O implements InterfaceC4675g {
    C4673e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    @Override // Qd.InterfaceC4675g
    public final void K4(List list) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeTypedList(list);
        I2(2, parcelA2);
    }
}
