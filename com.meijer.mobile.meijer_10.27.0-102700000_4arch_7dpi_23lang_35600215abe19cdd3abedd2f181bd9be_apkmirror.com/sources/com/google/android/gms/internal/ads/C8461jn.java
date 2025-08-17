package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.jn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8461jn extends C8758mb implements InterfaceC8675ln {
    @Override // com.google.android.gms.internal.ads.InterfaceC8675ln
    public final void zzh() throws RemoteException {
        b2(3, A1());
    }

    C8461jn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8675ln
    public final void O0(Intent intent) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.d(parcelA1, intent);
        b2(1, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8675ln
    public final void P0(com.google.android.gms.dynamic.b bVar, Nc.a aVar) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        C8972ob.d(parcelA1, aVar);
        b2(6, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8675ln
    public final void j2(String[] strArr, int[] iArr, com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeStringArray(strArr);
        parcelA1.writeIntArray(iArr);
        C8972ob.f(parcelA1, bVar);
        b2(5, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8675ln
    public final void y0(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        b2(4, parcelA1);
    }
}
