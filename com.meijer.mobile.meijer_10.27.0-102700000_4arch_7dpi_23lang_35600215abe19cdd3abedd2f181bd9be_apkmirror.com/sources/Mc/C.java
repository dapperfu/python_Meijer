package Mc;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C8758mb;

/* loaded from: classes4.dex */
public final class C extends C8758mb implements E {
    @Override // Mc.E
    public final void zzb() throws RemoteException {
        b2(1, A1());
    }

    C(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdClickListener");
    }
}
