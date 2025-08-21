package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.jq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8592jq extends C8883mb implements InterfaceC8806lq {
    C8592jq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8806lq
    public final InterfaceC8486iq i0(com.google.android.gms.dynamic.b bVar, InterfaceC6756Cl interfaceC6756Cl, int i10) throws RemoteException {
        InterfaceC8486iq c8273gq;
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        C9097ob.f(parcelK1, interfaceC6756Cl);
        parcelK1.writeInt(244410000);
        Parcel parcelA2 = a2(2, parcelK1);
        IBinder strongBinder = parcelA2.readStrongBinder();
        if (strongBinder == null) {
            c8273gq = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            if (iInterfaceQueryLocalInterface instanceof InterfaceC8486iq) {
                c8273gq = (InterfaceC8486iq) iInterfaceQueryLocalInterface;
            } else {
                c8273gq = new C8273gq(strongBinder);
            }
        }
        parcelA2.recycle();
        return c8273gq;
    }
}
