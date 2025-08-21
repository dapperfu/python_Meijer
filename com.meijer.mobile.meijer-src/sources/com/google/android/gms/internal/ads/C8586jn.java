package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.jn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8586jn extends C8883mb implements InterfaceC8800ln {
    @Override // com.google.android.gms.internal.ads.InterfaceC8800ln
    public final void zzh() throws RemoteException {
        c2(3, K1());
    }

    C8586jn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8800ln
    public final void B0(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        c2(4, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8800ln
    public final void G8(com.google.android.gms.dynamic.b bVar, Pc.a aVar) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        C9097ob.d(parcelK1, aVar);
        c2(6, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8800ln
    public final void O0(Intent intent) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.d(parcelK1, intent);
        c2(1, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8800ln
    public final void l2(String[] strArr, int[] iArr, com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelK1 = K1();
        parcelK1.writeStringArray(strArr);
        parcelK1.writeIntArray(iArr);
        C9097ob.f(parcelK1, bVar);
        c2(5, parcelK1);
    }
}
