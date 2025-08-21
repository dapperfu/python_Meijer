package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Zj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7529Zj extends C8883mb implements InterfaceC7728bk {
    @Override // com.google.android.gms.internal.ads.InterfaceC7728bk
    public final void zzf() throws RemoteException {
        c2(1, K1());
    }

    C7529Zj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7728bk
    public final void zze(int i10) throws RemoteException {
        Parcel parcelK1 = K1();
        parcelK1.writeInt(i10);
        c2(2, parcelK1);
    }
}
