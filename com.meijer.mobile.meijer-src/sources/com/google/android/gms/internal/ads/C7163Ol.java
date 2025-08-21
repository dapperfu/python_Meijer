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
public final class C7163Ol extends C8883mb implements InterfaceC7231Ql {
    @Override // com.google.android.gms.internal.ads.InterfaceC7231Ql
    public final InterfaceC7459Xg zzl() throws RemoteException {
        Parcel parcelA2 = a2(5, K1());
        InterfaceC7459Xg interfaceC7459XgB9 = AbstractBinderC7426Wg.B9(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return interfaceC7459XgB9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7231Ql
    public final String zzp() throws RemoteException {
        Parcel parcelA2 = a2(7, K1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7231Ql
    public final String zzq() throws RemoteException {
        Parcel parcelA2 = a2(4, K1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7231Ql
    public final String zzr() throws RemoteException {
        Parcel parcelA2 = a2(6, K1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7231Ql
    public final String zzs() throws RemoteException {
        Parcel parcelA2 = a2(2, K1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7231Ql
    public final List zzv() throws RemoteException {
        Parcel parcelA2 = a2(3, K1());
        ArrayList arrayListB = C9097ob.b(parcelA2);
        parcelA2.recycle();
        return arrayListB;
    }

    C7163Ol(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7231Ql
    public final boolean r() throws RemoteException {
        Parcel parcelA2 = a2(17, K1());
        boolean zG = C9097ob.g(parcelA2);
        parcelA2.recycle();
        return zG;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7231Ql
    public final boolean v() throws RemoteException {
        Parcel parcelA2 = a2(18, K1());
        boolean zG = C9097ob.g(parcelA2);
        parcelA2.recycle();
        return zG;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7231Ql
    public final double zze() throws RemoteException {
        Parcel parcelA2 = a2(8, K1());
        double d10 = parcelA2.readDouble();
        parcelA2.recycle();
        return d10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7231Ql
    public final float zzf() throws RemoteException {
        Parcel parcelA2 = a2(23, K1());
        float f10 = parcelA2.readFloat();
        parcelA2.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7231Ql
    public final float zzg() throws RemoteException {
        Parcel parcelA2 = a2(25, K1());
        float f10 = parcelA2.readFloat();
        parcelA2.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7231Ql
    public final float zzh() throws RemoteException {
        Parcel parcelA2 = a2(24, K1());
        float f10 = parcelA2.readFloat();
        parcelA2.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7231Ql
    public final Bundle zzi() throws RemoteException {
        Parcel parcelA2 = a2(16, K1());
        Bundle bundle = (Bundle) C9097ob.a(parcelA2, Bundle.CREATOR);
        parcelA2.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7231Ql
    public final Oc.Y0 zzj() throws RemoteException {
        Parcel parcelA2 = a2(11, K1());
        Oc.Y0 y0B9 = Oc.X0.B9(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return y0B9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7231Ql
    public final InterfaceC7224Qg zzk() throws RemoteException {
        Parcel parcelA2 = a2(12, K1());
        InterfaceC7224Qg interfaceC7224QgB9 = AbstractBinderC7190Pg.B9(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return interfaceC7224QgB9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7231Ql
    public final com.google.android.gms.dynamic.b zzm() throws RemoteException {
        Parcel parcelA2 = a2(13, K1());
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return bVarA2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7231Ql
    public final com.google.android.gms.dynamic.b zzn() throws RemoteException {
        Parcel parcelA2 = a2(14, K1());
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return bVarA2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7231Ql
    public final com.google.android.gms.dynamic.b zzo() throws RemoteException {
        Parcel parcelA2 = a2(15, K1());
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return bVarA2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7231Ql
    public final String zzt() throws RemoteException {
        Parcel parcelA2 = a2(10, K1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7231Ql
    public final String zzu() throws RemoteException {
        Parcel parcelA2 = a2(9, K1());
        String string = parcelA2.readString();
        parcelA2.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7231Ql
    public final void zzx() throws RemoteException {
        c2(19, K1());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7231Ql
    public final void E5(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        c2(20, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7231Ql
    public final void K(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        c2(22, parcelK1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7231Ql
    public final void w8(com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2, com.google.android.gms.dynamic.b bVar3) throws RemoteException {
        Parcel parcelK1 = K1();
        C9097ob.f(parcelK1, bVar);
        C9097ob.f(parcelK1, bVar2);
        C9097ob.f(parcelK1, bVar3);
        c2(21, parcelK1);
    }
}
