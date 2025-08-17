package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.qc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9188qc extends C8758mb implements InterfaceC9401sc {
    @Override // com.google.android.gms.internal.ads.InterfaceC9401sc
    public final Mc.U0 zzf() throws RemoteException {
        Parcel parcelA2 = a2(5, A1());
        Mc.U0 u0B9 = Mc.T0.B9(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return u0B9;
    }

    C9188qc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9401sc
    public final void W4(com.google.android.gms.dynamic.b bVar, InterfaceC10150zc interfaceC10150zc) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        C8972ob.f(parcelA1, interfaceC10150zc);
        b2(4, parcelA1);
    }
}
