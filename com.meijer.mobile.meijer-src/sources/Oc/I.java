package Oc;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C8883mb;
import com.google.android.gms.internal.ads.C9097ob;

/* loaded from: classes4.dex */
public final class I extends C8883mb implements K {
    @Override // Oc.K
    public final void zzc() throws RemoteException {
        c2(1, K1());
    }

    I(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // Oc.K
    public final void k0(W0 w02) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.d(parcelK1, w02);
        c2(2, parcelK1);
    }
}
