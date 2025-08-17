package vd;

import android.os.Parcel;
import android.os.RemoteException;
import bd.C6227f;
import com.google.android.gms.common.api.Status;

/* renamed from: vd.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC17549e extends BinderC17546b implements InterfaceC17550f {
    @Override // vd.BinderC17546b
    protected final boolean A1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        o7((Status) C17547c.a(parcel, Status.CREATOR), (C6227f) C17547c.a(parcel, C6227f.CREATOR));
        return true;
    }

    public AbstractBinderC17549e() {
        super("com.google.android.gms.appset.internal.IAppSetIdCallback");
    }
}
