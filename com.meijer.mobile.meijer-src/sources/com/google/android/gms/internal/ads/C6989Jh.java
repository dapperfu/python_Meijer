package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Jh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6989Jh extends C8883mb implements InterfaceC7057Lh {
    C6989Jh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7057Lh
    public final void u3(InterfaceC7328Th interfaceC7328Th) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, interfaceC7328Th);
        c2(1, parcelK1);
    }
}
