package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.jq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8467jq extends C8758mb implements InterfaceC8681lq {
    C8467jq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8681lq
    public final InterfaceC8361iq g0(com.google.android.gms.dynamic.b bVar, InterfaceC6631Cl interfaceC6631Cl, int i10) throws RemoteException {
        InterfaceC8361iq c8148gq;
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        C8972ob.f(parcelA1, interfaceC6631Cl);
        parcelA1.writeInt(244410000);
        Parcel parcelA2 = a2(2, parcelA1);
        IBinder strongBinder = parcelA2.readStrongBinder();
        if (strongBinder == null) {
            c8148gq = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            if (iInterfaceQueryLocalInterface instanceof InterfaceC8361iq) {
                c8148gq = (InterfaceC8361iq) iInterfaceQueryLocalInterface;
            } else {
                c8148gq = new C8148gq(strongBinder);
            }
        }
        parcelA2.recycle();
        return c8148gq;
    }
}
