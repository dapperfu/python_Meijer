package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.gq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8273gq extends C8883mb implements InterfaceC8486iq {
    C8273gq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8486iq
    public final void d5(com.google.android.gms.dynamic.b bVar, C8913mq c8913mq, InterfaceC8166fq interfaceC8166fq) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        C9097ob.d(parcelK1, c8913mq);
        C9097ob.f(parcelK1, interfaceC8166fq);
        c2(1, parcelK1);
    }
}
