package Ad;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: Ad.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC2805b extends BinderC2809d implements InterfaceC2807c {
    @Override // Ad.BinderC2809d
    protected final boolean A1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Jd.o oVar = (Jd.o) r.a(parcel, Jd.o.CREATOR);
        r.d(parcel);
        H7(oVar);
        return true;
    }

    public AbstractBinderC2805b() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }
}
