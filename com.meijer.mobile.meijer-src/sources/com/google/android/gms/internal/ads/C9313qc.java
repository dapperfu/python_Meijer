package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.qc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9313qc extends C8883mb implements InterfaceC9526sc {
    @Override // com.google.android.gms.internal.ads.InterfaceC9526sc
    public final Oc.U0 zzf() throws RemoteException {
        Parcel parcelA2 = a2(5, K1());
        Oc.U0 u0B9 = Oc.T0.B9(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return u0B9;
    }

    C9313qc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9526sc
    public final void j5(com.google.android.gms.dynamic.b bVar, InterfaceC10275zc interfaceC10275zc) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        C9097ob.f(parcelK1, interfaceC10275zc);
        c2(4, parcelK1);
    }
}
