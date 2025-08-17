package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.hm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8247hm extends C8758mb implements InterfaceC8459jm {
    C8247hm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8459jm
    public final void b(Mc.W0 w02) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.d(parcelA1, w02);
        b2(4, parcelA1);
    }
}
