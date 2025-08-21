package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.sh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9536sh extends C8883mb implements InterfaceC9750uh {
    C9536sh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9750uh
    public final void a6(InterfaceC8788lh interfaceC8788lh) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, interfaceC8788lh);
        c2(1, parcelK1);
    }
}
