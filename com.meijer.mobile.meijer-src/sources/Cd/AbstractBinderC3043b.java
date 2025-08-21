package Cd;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: Cd.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC3043b extends BinderC3047d implements InterfaceC3045c {
    @Override // Cd.BinderC3047d
    protected final boolean K1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Ld.o oVar = (Ld.o) r.a(parcel, Ld.o.CREATOR);
        r.d(parcel);
        R0(oVar);
        return true;
    }

    public AbstractBinderC3043b() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }
}
