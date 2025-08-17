package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.hp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8253hp extends C8758mb implements InterfaceC8465jp {
    @Override // com.google.android.gms.internal.ads.InterfaceC8465jp
    public final void zzg() throws RemoteException {
        b2(1, A1());
    }

    C8253hp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8465jp
    public final void b(Mc.W0 w02) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.d(parcelA1, w02);
        b2(3, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8465jp
    public final void zze(int i10) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeInt(i10);
        b2(2, parcelA1);
    }
}
