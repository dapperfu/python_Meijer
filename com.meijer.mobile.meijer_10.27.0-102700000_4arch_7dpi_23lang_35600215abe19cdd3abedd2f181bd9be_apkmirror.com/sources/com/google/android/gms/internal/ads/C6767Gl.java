package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Gl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6767Gl extends C8758mb implements InterfaceC6835Il {
    @Override // com.google.android.gms.internal.ads.InterfaceC6835Il
    public final void e0(int i10) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6835Il
    public final void e8(C7277Vo c7277Vo) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6835Il
    public final void zze() throws RemoteException {
        b2(1, A1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6835Il
    public final void zzf() throws RemoteException {
        b2(2, A1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6835Il
    public final void zzn() throws RemoteException {
        b2(4, A1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6835Il
    public final void zzo() throws RemoteException {
        b2(6, A1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6835Il
    public final void zzp() throws RemoteException {
        b2(5, A1());
    }

    C6767Gl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6835Il
    public final void zzm() throws RemoteException {
        b2(8, A1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6835Il
    public final void zzu() throws RemoteException {
        b2(18, A1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6835Il
    public final void zzv() throws RemoteException {
        b2(11, A1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6835Il
    public final void zzw() throws RemoteException {
        b2(15, A1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6835Il
    public final void zzx() throws RemoteException {
        b2(20, A1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6835Il
    public final void zzy() throws RemoteException {
        b2(13, A1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6835Il
    public final void F8(InterfaceC9198qh interfaceC9198qh, String str) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, interfaceC9198qh);
        parcelA1.writeString(str);
        b2(10, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6835Il
    public final void G1(Mc.W0 w02) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.d(parcelA1, w02);
        b2(23, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6835Il
    public final void I0(String str, String str2) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeString(str);
        parcelA1.writeString(str2);
        b2(9, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6835Il
    public final void Y5(InterfaceC7409Zo interfaceC7409Zo) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, interfaceC7409Zo);
        b2(16, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6835Il
    public final void n1(int i10, String str) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeInt(i10);
        parcelA1.writeString(str);
        b2(22, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6835Il
    public final void q4(Mc.W0 w02) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.d(parcelA1, w02);
        b2(24, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6835Il
    public final void x(String str) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeString(str);
        b2(21, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6835Il
    public final void zzg(int i10) throws RemoteException {
        Parcel parcelA1 = A1();
        parcelA1.writeInt(i10);
        b2(3, parcelA1);
    }
}
