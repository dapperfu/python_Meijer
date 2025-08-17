package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.vh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9732vh extends C8758mb implements InterfaceC9946xh {
    C9732vh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9946xh
    public final void L4(InterfaceC8877nh interfaceC8877nh) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, interfaceC8877nh);
        b2(1, parcelA1);
    }
}
