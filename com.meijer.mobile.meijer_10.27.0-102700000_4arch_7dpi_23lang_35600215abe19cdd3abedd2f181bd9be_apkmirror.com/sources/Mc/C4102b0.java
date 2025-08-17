package Mc;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C8758mb;
import com.google.android.gms.internal.ads.C8972ob;

/* renamed from: Mc.b0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4102b0 extends C8758mb implements InterfaceC4105c0 {
    C4102b0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloadCallback");
    }

    @Override // Mc.InterfaceC4105c0
    public final void p4(J1 j12) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.d(parcelA1, j12);
        b2(1, parcelA1);
    }

    @Override // Mc.InterfaceC4105c0
    public final void r1(J1 j12) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.d(parcelA1, j12);
        b2(2, parcelA1);
    }
}
