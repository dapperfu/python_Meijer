package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Bj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6595Bj extends C8758mb implements IInterface {
    C6595Bj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void N3(C9736vj c9736vj, InterfaceC6561Aj interfaceC6561Aj) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.d(parcelA1, c9736vj);
        C8972ob.f(parcelA1, interfaceC6561Aj);
        F2(2, parcelA1);
    }
}
