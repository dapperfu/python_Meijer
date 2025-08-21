package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Mh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7090Mh extends C8883mb implements InterfaceC7158Oh {
    C7090Mh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7158Oh
    public final boolean zze(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        Parcel parcelA2 = a2(2, parcelK1);
        boolean zG = C9097ob.g(parcelA2);
        parcelA2.recycle();
        return zG;
    }
}
