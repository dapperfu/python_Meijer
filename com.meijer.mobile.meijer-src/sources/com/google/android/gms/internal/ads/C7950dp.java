package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.dp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7950dp extends C8883mb implements InterfaceC8164fp {
    @Override // com.google.android.gms.internal.ads.InterfaceC8164fp
    public final void zze() throws RemoteException {
        c2(7, K1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8164fp
    public final void zzf() throws RemoteException {
        c2(6, K1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8164fp
    public final void zzg() throws RemoteException {
        c2(2, K1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8164fp
    public final void zzj() throws RemoteException {
        c2(1, K1());
    }

    C7950dp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8164fp
    public final void W1(InterfaceC7534Zo interfaceC7534Zo) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, interfaceC7534Zo);
        c2(3, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8164fp
    public final void g9(Oc.W0 w02) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.d(parcelK1, w02);
        c2(5, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8164fp
    public final void zzh(int i10) throws RemoteException {
        Parcel parcelK1 = K1();
        parcelK1.writeInt(i10);
        c2(4, parcelK1);
    }
}
