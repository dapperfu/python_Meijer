package Od;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.O;
import java.util.List;

/* renamed from: Od.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4467e extends O implements InterfaceC4469g {
    C4467e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    @Override // Od.InterfaceC4469g
    public final void y4(List list) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeTypedList(list);
        F2(2, parcelA2);
    }
}
