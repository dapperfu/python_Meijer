package Ld;

import Bd.C2951a;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: Ld.d0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4047d0 extends C2951a implements InterfaceC4050f {
    @Override // Ld.InterfaceC4050f
    public final Md.I z2() throws RemoteException {
        Parcel parcelA1 = A1(3, a2());
        Md.I i10 = (Md.I) Bd.s.a(parcelA1, Md.I.CREATOR);
        parcelA1.recycle();
        return i10;
    }

    C4047d0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IProjectionDelegate");
    }
}
