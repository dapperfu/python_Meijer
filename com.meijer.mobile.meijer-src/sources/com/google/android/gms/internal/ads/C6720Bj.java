package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Bj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6720Bj extends C8883mb implements IInterface {
    C6720Bj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void Z3(C9861vj c9861vj, InterfaceC6686Aj interfaceC6686Aj) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.d(parcelK1, c9861vj);
        C9097ob.f(parcelK1, interfaceC6686Aj);
        I2(2, parcelK1);
    }
}
