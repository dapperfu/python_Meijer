package xd;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import dd.C13658f;

/* renamed from: xd.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC18161e extends BinderC18158b implements InterfaceC18162f {
    @Override // xd.BinderC18158b
    protected final boolean K1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        C4((Status) C18159c.a(parcel, Status.CREATOR), (C13658f) C18159c.a(parcel, C13658f.CREATOR));
        return true;
    }

    public AbstractBinderC18161e() {
        super("com.google.android.gms.appset.internal.IAppSetIdCallback");
    }
}
