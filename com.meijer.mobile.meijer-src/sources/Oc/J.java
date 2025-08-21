package Oc;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.BinderC8990nb;
import com.google.android.gms.internal.ads.C9097ob;

/* loaded from: classes4.dex */
public abstract class J extends BinderC8990nb implements K {
    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzc();
        } else {
            if (i10 != 2) {
                return false;
            }
            W0 w02 = (W0) C9097ob.a(parcel, W0.CREATOR);
            C9097ob.c(parcel);
            k0(w02);
        }
        parcel2.writeNoException();
        return true;
    }

    public J() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }
}
