package pd;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import od.C16106b;
import od.C16109e;
import od.C16111g;
import yd.BinderC18303b;
import yd.C18304c;

/* loaded from: classes4.dex */
public abstract class g extends BinderC18303b implements h {
    @Override // yd.BinderC18303b
    protected final boolean K1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            Status status = (Status) C18304c.a(parcel, Status.CREATOR);
            C16106b c16106b = (C16106b) C18304c.a(parcel, C16106b.CREATOR);
            C18304c.b(parcel);
            k6(status, c16106b);
        } else if (i10 == 2) {
            Status status2 = (Status) C18304c.a(parcel, Status.CREATOR);
            C16111g c16111g = (C16111g) C18304c.a(parcel, C16111g.CREATOR);
            C18304c.b(parcel);
            K8(status2, c16111g);
        } else if (i10 == 3) {
            Status status3 = (Status) C18304c.a(parcel, Status.CREATOR);
            C16109e c16109e = (C16109e) C18304c.a(parcel, C16109e.CREATOR);
            C18304c.b(parcel);
            u4(status3, c16109e);
        } else {
            if (i10 != 4) {
                return false;
            }
            Status status4 = (Status) C18304c.a(parcel, Status.CREATOR);
            C18304c.b(parcel);
            I8(status4);
        }
        return true;
    }

    public g() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
    }
}
