package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Zj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7404Zj extends C8758mb implements InterfaceC7603bk {
    @Override // com.google.android.gms.internal.ads.InterfaceC7603bk
    public final void zzf() throws RemoteException {
        b2(1, A1());
    }

    C7404Zj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7603bk
    public final void zze(int i10) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeInt(i10);
        b2(2, parcelA1);
    }
}
