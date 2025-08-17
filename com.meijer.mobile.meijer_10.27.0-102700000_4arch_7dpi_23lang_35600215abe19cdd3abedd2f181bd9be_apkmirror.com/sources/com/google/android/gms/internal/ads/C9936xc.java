package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.xc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9936xc extends C8758mb implements InterfaceC10150zc {
    @Override // com.google.android.gms.internal.ads.InterfaceC10150zc
    public final void zzb() throws RemoteException {
        b2(5, A1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10150zc
    public final void zzc() throws RemoteException {
        b2(2, A1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10150zc
    public final void zze() throws RemoteException {
        b2(4, A1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10150zc
    public final void zzf() throws RemoteException {
        b2(1, A1());
    }

    C9936xc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10150zc
    public final void H0(Mc.W0 w02) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.d(parcelA1, w02);
        b2(3, parcelA1);
    }
}
