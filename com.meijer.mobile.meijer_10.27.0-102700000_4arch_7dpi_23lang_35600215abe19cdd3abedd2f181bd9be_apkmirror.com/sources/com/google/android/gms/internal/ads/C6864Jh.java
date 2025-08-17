package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Jh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6864Jh extends C8758mb implements InterfaceC6932Lh {
    C6864Jh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6932Lh
    public final void m3(InterfaceC7203Th interfaceC7203Th) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, interfaceC7203Th);
        b2(1, parcelA1);
    }
}
