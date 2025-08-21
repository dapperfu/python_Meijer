package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.hp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8378hp extends C8883mb implements InterfaceC8590jp {
    @Override // com.google.android.gms.internal.ads.InterfaceC8590jp
    public final void zzg() throws RemoteException {
        c2(1, K1());
    }

    C8378hp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8590jp
    public final void b(Oc.W0 w02) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.d(parcelK1, w02);
        c2(3, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8590jp
    public final void zze(int i10) throws RemoteException {
        Parcel parcelK1 = K1();
        parcelK1.writeInt(i10);
        c2(2, parcelK1);
    }
}
