package jd;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import yd.BinderC18303b;
import yd.C18304c;

/* renamed from: jd.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC14983f extends IInterface {

    /* renamed from: jd.f$a */
    public static abstract class a extends BinderC18303b implements InterfaceC14983f {
        @Override // yd.BinderC18303b
        protected final boolean K1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 != 1) {
                return false;
            }
            Status status = (Status) C18304c.a(parcel, Status.CREATOR);
            C18304c.b(parcel);
            v6(status);
            return true;
        }

        public a() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }
    }

    void v6(Status status) throws RemoteException;
}
