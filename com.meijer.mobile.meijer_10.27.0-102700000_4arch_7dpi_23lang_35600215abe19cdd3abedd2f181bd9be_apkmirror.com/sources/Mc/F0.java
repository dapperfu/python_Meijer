package Mc;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C8758mb;
import com.google.android.gms.internal.ads.C8972ob;

/* loaded from: classes4.dex */
public final class F0 extends C8758mb implements H0 {
    F0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // Mc.H0
    public final void P7(W0 w02) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.d(parcelA1, w02);
        b2(1, parcelA1);
    }
}
