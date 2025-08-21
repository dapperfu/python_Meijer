package Oc;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C8883mb;
import com.google.android.gms.internal.ads.C9097ob;

/* loaded from: classes4.dex */
public final class F0 extends C8883mb implements H0 {
    F0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // Oc.H0
    public final void x1(W0 w02) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.d(parcelK1, w02);
        c2(1, parcelK1);
    }
}
