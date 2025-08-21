package Oc;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C8883mb;
import com.google.android.gms.internal.ads.C9097ob;

/* renamed from: Oc.b0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4380b0 extends C8883mb implements InterfaceC4383c0 {
    C4380b0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloadCallback");
    }

    @Override // Oc.InterfaceC4383c0
    public final void L3(J1 j12) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.d(parcelK1, j12);
        c2(2, parcelK1);
    }

    @Override // Oc.InterfaceC4383c0
    public final void r4(J1 j12) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.d(parcelK1, j12);
        c2(1, parcelK1);
    }
}
