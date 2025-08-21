package Oc;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C8883mb;

/* loaded from: classes4.dex */
public final class C extends C8883mb implements E {
    @Override // Oc.E
    public final void zzb() throws RemoteException {
        c2(1, K1());
    }

    C(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdClickListener");
    }
}
