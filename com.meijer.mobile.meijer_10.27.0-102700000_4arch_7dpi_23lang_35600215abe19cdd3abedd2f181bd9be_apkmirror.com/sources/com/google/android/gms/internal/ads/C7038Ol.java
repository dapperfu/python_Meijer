package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Ol, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7038Ol extends C8758mb implements InterfaceC7106Ql {
    @Override // com.google.android.gms.internal.ads.InterfaceC7106Ql
    public final InterfaceC7334Xg zzl() throws RemoteException {
        Parcel parcelA2 = a2(5, A1());
        InterfaceC7334Xg interfaceC7334XgB9 = AbstractBinderC7301Wg.B9(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return interfaceC7334XgB9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7106Ql
    public final String zzp() throws RemoteException {
        Parcel parcelA2 = a2(7, A1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7106Ql
    public final String zzq() throws RemoteException {
        Parcel parcelA2 = a2(4, A1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7106Ql
    public final String zzr() throws RemoteException {
        Parcel parcelA2 = a2(6, A1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7106Ql
    public final String zzs() throws RemoteException {
        Parcel parcelA2 = a2(2, A1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7106Ql
    public final List zzv() throws RemoteException {
        Parcel parcelA2 = a2(3, A1());
        ArrayList arrayListB = C8972ob.b(parcelA2);
        parcelA2.recycle();
        return arrayListB;
    }

    C7038Ol(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7106Ql
    public final boolean r() throws RemoteException {
        Parcel parcelA2 = a2(17, A1());
        boolean zG = C8972ob.g(parcelA2);
        parcelA2.recycle();
        return zG;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7106Ql
    public final boolean v() throws RemoteException {
        Parcel parcelA2 = a2(18, A1());
        boolean zG = C8972ob.g(parcelA2);
        parcelA2.recycle();
        return zG;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7106Ql
    public final double zze() throws RemoteException {
        Parcel parcelA2 = a2(8, A1());
        double d10 = parcelA2.readDouble();
        parcelA2.recycle();
        return d10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7106Ql
    public final float zzf() throws RemoteException {
        Parcel parcelA2 = a2(23, A1());
        float f10 = parcelA2.readFloat();
        parcelA2.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7106Ql
    public final float zzg() throws RemoteException {
        Parcel parcelA2 = a2(25, A1());
        float f10 = parcelA2.readFloat();
        parcelA2.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7106Ql
    public final float zzh() throws RemoteException {
        Parcel parcelA2 = a2(24, A1());
        float f10 = parcelA2.readFloat();
        parcelA2.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7106Ql
    public final Bundle zzi() throws RemoteException {
        Parcel parcelA2 = a2(16, A1());
        Bundle bundle = (Bundle) C8972ob.a(parcelA2, Bundle.CREATOR);
        parcelA2.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7106Ql
    public final Mc.Y0 zzj() throws RemoteException {
        Parcel parcelA2 = a2(11, A1());
        Mc.Y0 y0B9 = Mc.X0.B9(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return y0B9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7106Ql
    public final InterfaceC7099Qg zzk() throws RemoteException {
        Parcel parcelA2 = a2(12, A1());
        InterfaceC7099Qg interfaceC7099QgB9 = AbstractBinderC7065Pg.B9(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return interfaceC7099QgB9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7106Ql
    public final com.google.android.gms.dynamic.b zzm() throws RemoteException {
        Parcel parcelA2 = a2(13, A1());
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return bVarA2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7106Ql
    public final com.google.android.gms.dynamic.b zzn() throws RemoteException {
        Parcel parcelA2 = a2(14, A1());
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return bVarA2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7106Ql
    public final com.google.android.gms.dynamic.b zzo() throws RemoteException {
        Parcel parcelA2 = a2(15, A1());
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return bVarA2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7106Ql
    public final String zzt() throws RemoteException {
        Parcel parcelA2 = a2(10, A1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7106Ql
    public final String zzu() throws RemoteException {
        Parcel parcelA2 = a2(9, A1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7106Ql
    public final void zzx() throws RemoteException {
        b2(19, A1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7106Ql
    public final void C8(com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2, com.google.android.gms.dynamic.b bVar3) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        C8972ob.f(parcelA1, bVar2);
        C8972ob.f(parcelA1, bVar3);
        b2(21, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7106Ql
    public final void K(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        b2(22, parcelA1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7106Ql
    public final void x5(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelA1 = A1();
        C8972ob.f(parcelA1, bVar);
        b2(20, parcelA1);
    }
}
