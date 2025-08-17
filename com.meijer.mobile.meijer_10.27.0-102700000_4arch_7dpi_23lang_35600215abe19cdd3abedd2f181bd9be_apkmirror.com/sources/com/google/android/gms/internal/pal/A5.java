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
    public final void j8(Bundle bundle, InterfaceC10997z5 interfaceC10997z5) throws RemoteException {
        Parcel parcelA1 = A1();
        Q4.d(parcelA1, bundle);
        Q4.e(parcelA1, interfaceC10997z5);
        F2(1, parcelA1);
    }
}
