package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.mn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8782mn extends C8758mb implements InterfaceC9103pn {
    C8782mn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9103pn
    public final InterfaceC8675ln g0(com.google.android.gms.dynamic.b bVar, InterfaceC6631Cl interfaceC6631Cl, int i10) throws RemoteException {
        InterfaceC8675ln c8461jn;
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        C8972ob.f(parcelA1, interfaceC6631Cl);
        parcelA1.writeInt(244410000);
        Parcel parcelA2 = a2(1, parcelA1);
        IBinder strongBinder = parcelA2.readStrongBinder();
        if (strongBinder == null) {
            c8461jn = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            if (iInterfaceQueryLocalInterface instanceof InterfaceC8675ln) {
                c8461jn = (InterfaceC8675ln) iInterfaceQueryLocalInterface;
            } else {
                c8461jn = new C8461jn(strongBinder);
            }
        }
        parcelA2.recycle();
        return c8461jn;
    }
}
