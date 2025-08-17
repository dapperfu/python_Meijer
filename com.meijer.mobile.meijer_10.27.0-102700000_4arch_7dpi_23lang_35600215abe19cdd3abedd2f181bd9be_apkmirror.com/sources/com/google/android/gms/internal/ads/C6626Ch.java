package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Ch, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6626Ch extends C8758mb implements InterfaceC6694Eh {
    C6626Ch(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6694Eh
    public final void h3(InterfaceC9198qh interfaceC9198qh) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, interfaceC9198qh);
        b2(1, parcelA1);
    }
}
