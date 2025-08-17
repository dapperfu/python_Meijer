package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.No, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7007No extends C8758mb implements InterfaceC7075Po {
    @Override // com.google.android.gms.internal.ads.InterfaceC7075Po
    public final void zzf() throws RemoteException {
        b2(4, A1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7075Po
    public final void zzh() throws RemoteException {
        b2(6, A1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7075Po
    public final void zzi() throws RemoteException {
        b2(1, A1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7075Po
    public final void zzj() throws RemoteException {
        b2(2, A1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7075Po
    public final void zzl() throws RemoteException {
        b2(3, A1());
    }

    C7007No(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7075Po
    public final void zzk() throws RemoteException {
        b2(8, A1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7075Po
    public final void t6(InterfaceC6838Io interfaceC6838Io) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, interfaceC6838Io);
        b2(5, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7075Po
    public final void zzg(int i10) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeInt(i10);
        b2(7, parcelA1);
    }
}
