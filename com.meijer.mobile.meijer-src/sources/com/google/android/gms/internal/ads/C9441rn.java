package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.rn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9441rn extends C8883mb implements InterfaceC9655tn {
    @Override // com.google.android.gms.internal.ads.InterfaceC9655tn
    public final void zzo() throws RemoteException {
        c2(5, K1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9655tn
    public final void zzq() throws RemoteException {
        c2(2, K1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9655tn
    public final void zzr() throws RemoteException {
        c2(4, K1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9655tn
    public final void zzt() throws RemoteException {
        c2(3, K1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9655tn
    public final void zzu() throws RemoteException {
        c2(7, K1());
    }

    C9441rn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9655tn
    public final boolean g() throws RemoteException {
        Parcel parcelA2 = a2(11, K1());
        boolean zG = C9097ob.g(parcelA2);
        parcelA2.recycle();
        return zG;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9655tn
    public final void zzi() throws RemoteException {
        c2(10, K1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9655tn
    public final void zzm() throws RemoteException {
        c2(8, K1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9655tn
    public final void zzv() throws RemoteException {
        c2(14, K1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9655tn
    public final void zzx() throws RemoteException {
        c2(9, K1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9655tn
    public final void F2(int i10, String[] strArr, int[] iArr) throws RemoteException {
        Parcel parcelK1 = K1();
        parcelK1.writeInt(i10);
        parcelK1.writeStringArray(strArr);
        parcelK1.writeIntArray(iArr);
        c2(15, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9655tn
    public final void G3(Bundle bundle) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.d(parcelK1, bundle);
        c2(1, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9655tn
    public final void I0(Bundle bundle) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.d(parcelK1, bundle);
        Parcel parcelA2 = a2(6, parcelK1);
        if (parcelA2.readInt() != 0) {
            bundle.readFromParcel(parcelA2);
        }
        parcelA2.recycle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9655tn
    public final void O(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        c2(13, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9655tn
    public final void w6(int i10, int i11, Intent intent) throws RemoteException {
        Parcel parcelK1 = K1();
        parcelK1.writeInt(i10);
        parcelK1.writeInt(i11);
        C9097ob.d(parcelK1, intent);
        c2(12, parcelK1);
    }
}
