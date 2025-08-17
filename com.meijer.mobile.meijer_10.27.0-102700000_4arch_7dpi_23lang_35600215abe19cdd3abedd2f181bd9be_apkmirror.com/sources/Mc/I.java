package Mc;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C8758mb;
import com.google.android.gms.internal.ads.C8972ob;

/* loaded from: classes4.dex */
public final class I extends C8758mb implements K {
    @Override // Mc.K
    public final void zzc() throws RemoteException {
        b2(1, A1());
    }

    I(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // Mc.K
    public final void M0(W0 w02) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.d(parcelA1, w02);
        b2(2, parcelA1);
    }
}
