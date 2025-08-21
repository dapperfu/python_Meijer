package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Ef, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6815Ef extends C8883mb implements InterfaceC6883Gf {
    C6815Ef(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6883Gf
    public final void I5(InterfaceC6781Df interfaceC6781Df) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, interfaceC6781Df);
        c2(1, parcelK1);
    }
}
