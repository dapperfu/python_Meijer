package hd;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import wd.BinderC17810b;
import wd.C17811c;

/* renamed from: hd.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC14405f extends IInterface {

    /* renamed from: hd.f$a */
    public static abstract class a extends BinderC17810b implements InterfaceC14405f {
        @Override // wd.BinderC17810b
        protected final boolean A1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 != 1) {
                return false;
            }
            Status status = (Status) C17811c.a(parcel, Status.CREATOR);
            C17811c.b(parcel);
            i6(status);
            return true;
        }

        public a() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }
    }

    void i6(Status status) throws RemoteException;
}
