package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.rn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9316rn extends C8758mb implements InterfaceC9530tn {
    @Override // com.google.android.gms.internal.ads.InterfaceC9530tn
    public final void zzo() throws RemoteException {
        b2(5, A1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9530tn
    public final void zzq() throws RemoteException {
        b2(2, A1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9530tn
    public final void zzr() throws RemoteException {
        b2(4, A1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9530tn
    public final void zzt() throws RemoteException {
        b2(3, A1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9530tn
    public final void zzu() throws RemoteException {
        b2(7, A1());
    }

    C9316rn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9530tn
    public final boolean f() throws RemoteException {
        Parcel parcelA2 = a2(11, A1());
        boolean zG = C8972ob.g(parcelA2);
        parcelA2.recycle();
        return zG;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9530tn
    public final void zzi() throws RemoteException {
        b2(10, A1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9530tn
    public final void zzm() throws RemoteException {
        b2(8, A1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9530tn
    public final void zzv() throws RemoteException {
        b2(14, A1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9530tn
    public final void zzx() throws RemoteException {
        b2(9, A1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9530tn
    public final void C2(int i10, String[] strArr, int[] iArr) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeInt(i10);
        parcelA1.writeStringArray(strArr);
        parcelA1.writeIntArray(iArr);
        b2(15, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9530tn
    public final void F0(Bundle bundle) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.d(parcelA1, bundle);
        Parcel parcelA2 = a2(6, parcelA1);
        if (parcelA2.readInt() != 0) {
            bundle.readFromParcel(parcelA2);
        }
        parcelA2.recycle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9530tn
    public final void O(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        b2(13, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9530tn
    public final void j6(int i10, int i11, Intent intent) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeInt(i10);
        parcelA1.writeInt(i11);
        C8972ob.d(parcelA1, intent);
        b2(12, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9530tn
    public final void v3(Bundle bundle) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.d(parcelA1, bundle);
        b2(1, parcelA1);
    }
}
