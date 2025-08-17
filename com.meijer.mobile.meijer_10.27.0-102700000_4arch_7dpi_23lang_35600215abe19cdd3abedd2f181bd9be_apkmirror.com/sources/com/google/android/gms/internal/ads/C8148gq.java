package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.gq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8148gq extends C8758mb implements InterfaceC8361iq {
    C8148gq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8361iq
    public final void N4(com.google.android.gms.dynamic.b bVar, C8788mq c8788mq, InterfaceC8041fq interfaceC8041fq) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        C8972ob.d(parcelA1, c8788mq);
        C8972ob.f(parcelA1, interfaceC8041fq);
        b2(1, parcelA1);
    }
}
