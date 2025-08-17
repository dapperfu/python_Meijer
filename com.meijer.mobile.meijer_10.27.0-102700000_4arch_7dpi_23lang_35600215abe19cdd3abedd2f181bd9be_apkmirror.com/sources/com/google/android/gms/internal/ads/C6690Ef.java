package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Ef, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6690Ef extends C8758mb implements InterfaceC6758Gf {
    C6690Ef(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6758Gf
    public final void y5(InterfaceC6656Df interfaceC6656Df) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, interfaceC6656Df);
        b2(1, parcelA1);
    }
}
