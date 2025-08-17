package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Kj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6901Kj extends C8758mb implements InterfaceC6968Mj {
    @Override // com.google.android.gms.internal.ads.InterfaceC6968Mj
    public final void zzf() throws RemoteException {
        b2(2, A1());
    }

    C6901Kj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6968Mj
    public final void a(String str) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeString(str);
        b2(3, parcelA1);
    }
}
