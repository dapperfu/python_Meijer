package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.dh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7935dh extends C8883mb implements InterfaceC8148fh {
    C7935dh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8148fh
    public final IBinder M4(com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2, com.google.android.gms.dynamic.b bVar3, int i10) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        C9097ob.f(parcelK1, bVar2);
        C9097ob.f(parcelK1, bVar3);
        parcelK1.writeInt(244410000);
        Parcel parcelA2 = a2(1, parcelK1);
        IBinder strongBinder = parcelA2.readStrongBinder();
        parcelA2.recycle();
        return strongBinder;
    }
}
