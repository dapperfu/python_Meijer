package Oc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.BinderC8990nb;

/* loaded from: classes4.dex */
public abstract class C0 extends BinderC8990nb implements D0 {
    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            String strZze = zze();
            parcel2.writeNoException();
            parcel2.writeString(strZze);
        } else {
            if (i10 != 2) {
                return false;
            }
            String strZzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(strZzf);
        }
        return true;
    }

    public C0() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    public static D0 B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        return iInterfaceQueryLocalInterface instanceof D0 ? (D0) iInterfaceQueryLocalInterface : new B0(iBinder);
    }
}
