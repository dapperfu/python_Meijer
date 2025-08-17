package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;

/* renamed from: com.google.android.gms.internal.ads.Vg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7268Vg extends C8758mb implements InterfaceC7334Xg {
    @Override // com.google.android.gms.internal.ads.InterfaceC7334Xg
    public final double zzb() throws RemoteException {
        Parcel parcelA2 = a2(3, A1());
        double d10 = parcelA2.readDouble();
        parcelA2.recycle();
        return d10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7334Xg
    public final int zzc() throws RemoteException {
        Parcel parcelA2 = a2(5, A1());
        int i10 = parcelA2.readInt();
        parcelA2.recycle();
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7334Xg
    public final int zzd() throws RemoteException {
        Parcel parcelA2 = a2(4, A1());
        int i10 = parcelA2.readInt();
        parcelA2.recycle();
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7334Xg
    public final Uri zze() throws RemoteException {
        Parcel parcelA2 = a2(2, A1());
        Uri uri = (Uri) C8972ob.a(parcelA2, Uri.CREATOR);
        parcelA2.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7334Xg
    public final com.google.android.gms.dynamic.b zzf() throws RemoteException {
        Parcel parcelA2 = a2(1, A1());
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return bVarA2;
    }

    C7268Vg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }
}
