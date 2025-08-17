package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.qm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9208qm extends C8758mb implements InterfaceC9421sm {
    C9208qm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9421sm
    public final void b(Mc.W0 w02) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.d(parcelA1, w02);
        b2(3, parcelA1);
    }
}
