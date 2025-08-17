package Mc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.BinderC8865nb;
import com.google.android.gms.internal.ads.C8972ob;

/* loaded from: classes4.dex */
public abstract class M0 extends BinderC8865nb implements N0 {
    @Override // com.google.android.gms.internal.ads.BinderC8865nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            f2 f2Var = (f2) C8972ob.a(parcel, f2.CREATOR);
            C8972ob.c(parcel);
            p8(f2Var);
            parcel2.writeNoException();
        } else {
            if (i10 != 2) {
                return false;
            }
            boolean zZzf = zzf();
            parcel2.writeNoException();
            int i12 = C8972ob.f77401b;
            parcel2.writeInt(zZzf ? 1 : 0);
        }
        return true;
    }

    public M0() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static N0 B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return iInterfaceQueryLocalInterface instanceof N0 ? (N0) iInterfaceQueryLocalInterface : new L0(iBinder);
    }
}
