package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.So, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7177So extends C8758mb implements InterfaceC7244Uo {
    C7177So(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244Uo
    public final void Q(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        b2(4, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244Uo
    public final void Y1(com.google.android.gms.dynamic.b bVar, C7277Vo c7277Vo) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        C8972ob.d(parcelA1, c7277Vo);
        b2(7, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244Uo
    public final void j3(com.google.android.gms.dynamic.b bVar, int i10) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        parcelA1.writeInt(i10);
        b2(9, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244Uo
    public final void q1(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        b2(5, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244Uo
    public final void y(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        b2(11, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244Uo
    public final void zze(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        b2(8, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244Uo
    public final void zzf(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        b2(6, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244Uo
    public final void zzi(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        b2(3, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244Uo
    public final void zzl(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        b2(1, parcelA1);
    }
}
