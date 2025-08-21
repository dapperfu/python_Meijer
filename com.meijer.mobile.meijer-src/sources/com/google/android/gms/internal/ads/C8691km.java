package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.km, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8691km extends C8883mb implements InterfaceC8905mm {
    C8691km(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8905mm
    public final void b(Oc.W0 w02) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.d(parcelK1, w02);
        c2(3, parcelK1);
    }
}
