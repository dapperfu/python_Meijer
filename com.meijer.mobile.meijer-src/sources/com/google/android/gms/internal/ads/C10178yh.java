package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.yh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10178yh extends C8883mb implements InterfaceC6717Bh {
    C10178yh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6717Bh
    public final void z7(InterfaceC9323qh interfaceC9323qh, String str) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, interfaceC9323qh);
        parcelK1.writeString(str);
        c2(1, parcelK1);
    }
}
