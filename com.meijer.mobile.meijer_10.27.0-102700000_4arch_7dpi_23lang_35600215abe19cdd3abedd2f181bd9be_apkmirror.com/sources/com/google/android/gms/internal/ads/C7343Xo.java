package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Xo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7343Xo extends C8758mb implements InterfaceC7409Zo {
    @Override // com.google.android.gms.internal.ads.InterfaceC7409Zo
    public final int zze() throws RemoteException {
        Parcel parcelA2 = a2(2, A1());
        int i10 = parcelA2.readInt();
        parcelA2.recycle();
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7409Zo
    public final String zzf() throws RemoteException {
        Parcel parcelA2 = a2(1, A1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    C7343Xo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }
}
