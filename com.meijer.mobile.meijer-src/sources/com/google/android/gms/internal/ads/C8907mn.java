package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.mn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8907mn extends C8883mb implements InterfaceC9228pn {
    C8907mn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9228pn
    public final InterfaceC8800ln i0(com.google.android.gms.dynamic.b bVar, InterfaceC6756Cl interfaceC6756Cl, int i10) throws RemoteException {
        InterfaceC8800ln c8586jn;
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        C9097ob.f(parcelK1, interfaceC6756Cl);
        parcelK1.writeInt(244410000);
        Parcel parcelA2 = a2(1, parcelK1);
        IBinder strongBinder = parcelA2.readStrongBinder();
        if (strongBinder == null) {
            c8586jn = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            if (iInterfaceQueryLocalInterface instanceof InterfaceC8800ln) {
                c8586jn = (InterfaceC8800ln) iInterfaceQueryLocalInterface;
            } else {
                c8586jn = new C8586jn(strongBinder);
            }
        }
        parcelA2.recycle();
        return c8586jn;
    }
}
