package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.So, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7302So extends C8883mb implements InterfaceC7369Uo {
    C7302So(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7369Uo
    public final void Q(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        c2(4, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7369Uo
    public final void Z1(com.google.android.gms.dynamic.b bVar, C7402Vo c7402Vo) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        C9097ob.d(parcelK1, c7402Vo);
        c2(7, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7369Uo
    public final void q3(com.google.android.gms.dynamic.b bVar, int i10) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        parcelK1.writeInt(i10);
        c2(9, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7369Uo
    public final void y(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        c2(11, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7369Uo
    public final void z1(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        c2(5, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7369Uo
    public final void zze(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        c2(8, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7369Uo
    public final void zzf(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        c2(6, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7369Uo
    public final void zzi(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        c2(3, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7369Uo
    public final void zzl(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        c2(1, parcelK1);
    }
}
