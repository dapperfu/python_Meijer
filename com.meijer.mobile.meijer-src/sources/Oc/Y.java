package Oc;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C8883mb;

/* loaded from: classes4.dex */
public final class Y extends C8883mb implements InterfaceC4377a0 {
    @Override // Oc.InterfaceC4377a0
    public final void zze() throws RemoteException {
        c2(1, K1());
    }

    Y(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdMetadataListener");
    }
}
