package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.No, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7132No extends C8883mb implements InterfaceC7200Po {
    @Override // com.google.android.gms.internal.ads.InterfaceC7200Po
    public final void zzf() throws RemoteException {
        c2(4, K1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7200Po
    public final void zzh() throws RemoteException {
        c2(6, K1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7200Po
    public final void zzi() throws RemoteException {
        c2(1, K1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7200Po
    public final void zzj() throws RemoteException {
        c2(2, K1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7200Po
    public final void zzl() throws RemoteException {
        c2(3, K1());
    }

    C7132No(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7200Po
    public final void zzk() throws RemoteException {
        c2(8, K1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7200Po
    public final void I6(InterfaceC6963Io interfaceC6963Io) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, interfaceC6963Io);
        c2(5, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7200Po
    public final void zzg(int i10) throws RemoteException {
        Parcel parcelK1 = K1();
        parcelK1.writeInt(i10);
        c2(7, parcelK1);
    }
}
