package Oc;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C8883mb;
import com.google.android.gms.internal.ads.C9097ob;

/* loaded from: classes4.dex */
public final class L0 extends C8883mb implements N0 {
    @Override // Oc.N0
    public final boolean zzf() throws RemoteException {
        Parcel parcelA2 = a2(2, K1());
        boolean zG = C9097ob.g(parcelA2);
        parcelA2.recycle();
        return zG;
    }

    L0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // Oc.N0
    public final void m3(f2 f2Var) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.d(parcelK1, f2Var);
        c2(1, parcelK1);
    }
}
