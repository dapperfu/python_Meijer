package nd;

import android.os.Parcel;
import android.os.RemoteException;
import md.C15602h;
import wd.BinderC17810b;
import wd.C17811c;

/* loaded from: classes4.dex */
public abstract class j extends BinderC17810b implements k {
    @Override // wd.BinderC17810b
    protected final boolean A1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        C15602h c15602h = (C15602h) C17811c.a(parcel, C15602h.CREATOR);
        C17811c.b(parcel);
        X8(c15602h);
        return true;
    }

    public j() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallStatusListener");
    }
}
