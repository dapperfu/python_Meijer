package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.dp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7825dp extends C8758mb implements InterfaceC8039fp {
    @Override // com.google.android.gms.internal.ads.InterfaceC8039fp
    public final void zze() throws RemoteException {
        b2(7, A1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8039fp
    public final void zzf() throws RemoteException {
        b2(6, A1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8039fp
    public final void zzg() throws RemoteException {
        b2(2, A1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8039fp
    public final void zzj() throws RemoteException {
        b2(1, A1());
    }

    C7825dp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8039fp
    public final void T1(InterfaceC7409Zo interfaceC7409Zo) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, interfaceC7409Zo);
        b2(3, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8039fp
    public final void W0(Mc.W0 w02) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.d(parcelA1, w02);
        b2(5, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8039fp
    public final void zzh(int i10) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeInt(i10);
        b2(4, parcelA1);
    }
}
