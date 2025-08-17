package Mc;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.BinderC8865nb;
import com.google.android.gms.internal.ads.C8972ob;

/* loaded from: classes4.dex */
public abstract class J extends BinderC8865nb implements K {
    @Override // com.google.android.gms.internal.ads.BinderC8865nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzc();
        } else {
            if (i10 != 2) {
                return false;
            }
            W0 w02 = (W0) C8972ob.a(parcel, W0.CREATOR);
            C8972ob.c(parcel);
            M0(w02);
        }
        parcel2.writeNoException();
        return true;
    }

    public J() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }
}
