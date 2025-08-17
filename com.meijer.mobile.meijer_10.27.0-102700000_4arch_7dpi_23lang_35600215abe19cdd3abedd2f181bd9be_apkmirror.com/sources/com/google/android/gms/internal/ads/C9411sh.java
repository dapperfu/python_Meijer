package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.sh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9411sh extends C8758mb implements InterfaceC9625uh {
    C9411sh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9625uh
    public final void O5(InterfaceC8663lh interfaceC8663lh) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, interfaceC8663lh);
        b2(1, parcelA1);
    }
}
