package Mc;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C8758mb;
import com.google.android.gms.internal.ads.C8972ob;

/* loaded from: classes4.dex */
public final class L0 extends C8758mb implements N0 {
    @Override // Mc.N0
    public final boolean zzf() throws RemoteException {
        Parcel parcelA2 = a2(2, A1());
        boolean zG = C8972ob.g(parcelA2);
        parcelA2.recycle();
        return zG;
    }

    L0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // Mc.N0
    public final void p8(f2 f2Var) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.d(parcelA1, f2Var);
        b2(1, parcelA1);
    }
}
