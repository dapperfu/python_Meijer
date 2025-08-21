package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.xc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10061xc extends C8883mb implements InterfaceC10275zc {
    @Override // com.google.android.gms.internal.ads.InterfaceC10275zc
    public final void zzb() throws RemoteException {
        c2(5, K1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10275zc
    public final void zzc() throws RemoteException {
        c2(2, K1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10275zc
    public final void zze() throws RemoteException {
        c2(4, K1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10275zc
    public final void zzf() throws RemoteException {
        c2(1, K1());
    }

    C10061xc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10275zc
    public final void a0(Oc.W0 w02) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.d(parcelK1, w02);
        c2(3, parcelK1);
    }
}
