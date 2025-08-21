package Oc;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C8883mb;

/* loaded from: classes4.dex */
public final class I0 extends C8883mb implements K0 {
    @Override // Oc.K0
    public final void zze() throws RemoteException {
        c2(1, K1());
    }

    I0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
    }
}
