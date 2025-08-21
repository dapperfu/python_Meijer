package pd;

import android.os.Parcel;
import android.os.RemoteException;
import od.C16112h;
import yd.BinderC18303b;
import yd.C18304c;

/* loaded from: classes4.dex */
public abstract class j extends BinderC18303b implements k {
    @Override // yd.BinderC18303b
    protected final boolean K1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        C16112h c16112h = (C16112h) C18304c.a(parcel, C16112h.CREATOR);
        C18304c.b(parcel);
        l6(c16112h);
        return true;
    }

    public j() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallStatusListener");
    }
}
