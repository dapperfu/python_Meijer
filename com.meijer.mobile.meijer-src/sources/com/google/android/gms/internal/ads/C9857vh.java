package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.vh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9857vh extends C8883mb implements InterfaceC10071xh {
    C9857vh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10071xh
    public final void a5(InterfaceC9002nh interfaceC9002nh) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, interfaceC9002nh);
        c2(1, parcelK1);
    }
}
