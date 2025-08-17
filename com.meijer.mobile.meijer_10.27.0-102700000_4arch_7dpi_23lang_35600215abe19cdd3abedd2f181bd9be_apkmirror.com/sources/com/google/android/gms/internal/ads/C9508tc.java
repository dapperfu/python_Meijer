package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.tc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9508tc extends C8758mb implements InterfaceC9722vc {
    C9508tc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9722vc
    public final void P8(Mc.W0 w02) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.d(parcelA1, w02);
        b2(3, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9722vc
    public final void T0(InterfaceC9401sc interfaceC9401sc) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, interfaceC9401sc);
        b2(1, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9722vc
    public final void zzb(int i10) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeInt(i10);
        b2(2, parcelA1);
    }
}
