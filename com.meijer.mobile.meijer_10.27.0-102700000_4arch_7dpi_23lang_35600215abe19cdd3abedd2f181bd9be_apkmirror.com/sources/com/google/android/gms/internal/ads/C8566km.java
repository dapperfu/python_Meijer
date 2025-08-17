package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.km, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8566km extends C8758mb implements InterfaceC8780mm {
    C8566km(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8780mm
    public final void b(Mc.W0 w02) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.d(parcelA1, w02);
        b2(3, parcelA1);
    }
}
