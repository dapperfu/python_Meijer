package Mc;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C8758mb;

/* loaded from: classes4.dex */
public final class Y extends C8758mb implements InterfaceC4099a0 {
    @Override // Mc.InterfaceC4099a0
    public final void zze() throws RemoteException {
        b2(1, A1());
    }

    Y(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdMetadataListener");
    }
}
