package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.tc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9633tc extends C8883mb implements InterfaceC9847vc {
    C9633tc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9847vc
    public final void U0(InterfaceC9526sc interfaceC9526sc) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, interfaceC9526sc);
        c2(1, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9847vc
    public final void z2(Oc.W0 w02) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.d(parcelK1, w02);
        c2(3, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9847vc
    public final void zzb(int i10) throws RemoteException {
        Parcel parcelK1 = K1();
        parcelK1.writeInt(i10);
        c2(2, parcelK1);
    }
}
