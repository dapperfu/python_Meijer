package nd;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import md.C15596b;
import md.C15599e;
import md.C15601g;
import wd.BinderC17810b;
import wd.C17811c;

/* loaded from: classes4.dex */
public abstract class g extends BinderC17810b implements h {
    @Override // wd.BinderC17810b
    protected final boolean A1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            Status status = (Status) C17811c.a(parcel, Status.CREATOR);
            C15596b c15596b = (C15596b) C17811c.a(parcel, C15596b.CREATOR);
            C17811c.b(parcel);
            S2(status, c15596b);
        } else if (i10 == 2) {
            Status status2 = (Status) C17811c.a(parcel, Status.CREATOR);
            C15601g c15601g = (C15601g) C17811c.a(parcel, C15601g.CREATOR);
            C17811c.b(parcel);
            S3(status2, c15601g);
        } else if (i10 == 3) {
            Status status3 = (Status) C17811c.a(parcel, Status.CREATOR);
            C15599e c15599e = (C15599e) C17811c.a(parcel, C15599e.CREATOR);
            C17811c.b(parcel);
            R5(status3, c15599e);
        } else {
            if (i10 != 4) {
                return false;
            }
            Status status4 = (Status) C17811c.a(parcel, Status.CREATOR);
            C17811c.b(parcel);
            M8(status4);
        }
        return true;
    }

    public g() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
    }
}
