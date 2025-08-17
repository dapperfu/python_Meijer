package Od;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.P;
import com.google.android.gms.internal.measurement.Q;
import com.google.android.gms.measurement.internal.S5;
import java.util.ArrayList;

/* renamed from: Od.f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC4468f extends P implements InterfaceC4469g {
    @Override // com.google.android.gms.internal.measurement.P
    protected final boolean A1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 2) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(S5.CREATOR);
        Q.f(parcel);
        y4(arrayListCreateTypedArrayList);
        return true;
    }

    public AbstractBinderC4468f() {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }
}
