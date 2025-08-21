package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Xo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7468Xo extends C8883mb implements InterfaceC7534Zo {
    @Override // com.google.android.gms.internal.ads.InterfaceC7534Zo
    public final int zze() throws RemoteException {
        Parcel parcelA2 = a2(2, K1());
        int i10 = parcelA2.readInt();
        parcelA2.recycle();
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7534Zo
    public final String zzf() throws RemoteException {
        Parcel parcelA2 = a2(1, K1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    C7468Xo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }
}
