package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.lu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8814lu extends C8883mb implements InterfaceC9028nu {
    C8814lu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.measurement.IMeasurementManager");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9028nu
    public final void x8(com.google.android.gms.dynamic.b bVar, InterfaceC8707ku interfaceC8707ku) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        C9097ob.f(parcelK1, interfaceC8707ku);
        c2(2, parcelK1);
    }
}
