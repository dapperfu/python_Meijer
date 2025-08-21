package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Gh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6887Gh extends C8883mb implements InterfaceC6955Ih {
    C6887Gh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6955Ih
    public final void P4(Oc.V v10, com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, v10);
        C9097ob.f(parcelK1, bVar);
        c2(1, parcelK1);
    }
}
