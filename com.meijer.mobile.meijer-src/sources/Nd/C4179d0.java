package Nd;

import Dd.C3100a;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: Nd.d0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4179d0 extends C3100a implements InterfaceC4182f {
    @Override // Nd.InterfaceC4182f
    public final Od.I B2() throws RemoteException {
        Parcel parcelK1 = K1(3, a2());
        Od.I i10 = (Od.I) Dd.s.a(parcelK1, Od.I.CREATOR);
        parcelK1.recycle();
        return i10;
    }

    C4179d0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IProjectionDelegate");
    }
}
