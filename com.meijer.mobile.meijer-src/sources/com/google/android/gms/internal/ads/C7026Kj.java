package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Kj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7026Kj extends C8883mb implements InterfaceC7093Mj {
    @Override // com.google.android.gms.internal.ads.InterfaceC7093Mj
    public final void zzf() throws RemoteException {
        c2(2, K1());
    }

    C7026Kj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7093Mj
    public final void a(String str) throws RemoteException {
        Parcel parcelK1 = K1();
        parcelK1.writeString(str);
        c2(3, parcelK1);
    }
}
