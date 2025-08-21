package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Ch, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6751Ch extends C8883mb implements InterfaceC6819Eh {
    C6751Ch(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6819Eh
    public final void p3(InterfaceC9323qh interfaceC9323qh) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, interfaceC9323qh);
        c2(1, parcelK1);
    }
}
