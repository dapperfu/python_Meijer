package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.lu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8689lu extends C8758mb implements InterfaceC8903nu {
    C8689lu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.measurement.IMeasurementManager");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8903nu
    public final void D8(com.google.android.gms.dynamic.b bVar, InterfaceC8582ku interfaceC8582ku) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        C8972ob.f(parcelA1, interfaceC8582ku);
        b2(2, parcelA1);
    }
}
