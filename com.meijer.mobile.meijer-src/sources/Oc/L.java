package Oc;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C8883mb;
import com.google.android.gms.internal.ads.C9097ob;

/* loaded from: classes4.dex */
public final class L extends C8883mb implements N {
    L(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // Oc.N
    public final void h6(Y1 y12) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.d(parcelK1, y12);
        c2(1, parcelK1);
    }
}
