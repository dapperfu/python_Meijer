package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Mh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6965Mh extends C8758mb implements InterfaceC7033Oh {
    C6965Mh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7033Oh
    public final boolean zze(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        Parcel parcelA2 = a2(2, parcelA1);
        boolean zG = C8972ob.g(parcelA2);
        parcelA2.recycle();
        return zG;
    }
}
