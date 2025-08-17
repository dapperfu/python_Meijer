package Mc;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C8758mb;
import com.google.android.gms.internal.ads.C8972ob;

/* loaded from: classes4.dex */
public final class L extends C8758mb implements N {
    L(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // Mc.N
    public final void w7(Y1 y12) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.d(parcelA1, y12);
        b2(1, parcelA1);
    }
}
