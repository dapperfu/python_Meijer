package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Gh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6762Gh extends C8758mb implements InterfaceC6830Ih {
    C6762Gh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6830Ih
    public final void D1(Mc.V v10, com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, v10);
        C8972ob.f(parcelA1, bVar);
        b2(1, parcelA1);
    }
}
