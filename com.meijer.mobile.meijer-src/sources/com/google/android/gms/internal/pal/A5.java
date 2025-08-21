package com.google.android.gms.internal.pal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public final class A5 extends O4 implements C5 {
    A5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.signalsdk.ISignalSdkService");
    }

    @Override // com.google.android.gms.internal.pal.C5
    public final void g8(Bundle bundle, InterfaceC11122z5 interfaceC11122z5) throws RemoteException {
        Parcel parcelK1 = K1();
        Q4.d(parcelK1, bundle);
        Q4.e(parcelK1, interfaceC11122z5);
        I2(1, parcelK1);
    }
}
