package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;

/* renamed from: com.google.android.gms.internal.ads.Vg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7393Vg extends C8883mb implements InterfaceC7459Xg {
    @Override // com.google.android.gms.internal.ads.InterfaceC7459Xg
    public final double zzb() throws RemoteException {
        Parcel parcelA2 = a2(3, K1());
        double d10 = parcelA2.readDouble();
        parcelA2.recycle();
        return d10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7459Xg
    public final int zzc() throws RemoteException {
        Parcel parcelA2 = a2(5, K1());
        int i10 = parcelA2.readInt();
        parcelA2.recycle();
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7459Xg
    public final int zzd() throws RemoteException {
        Parcel parcelA2 = a2(4, K1());
        int i10 = parcelA2.readInt();
        parcelA2.recycle();
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7459Xg
    public final Uri zze() throws RemoteException {
        Parcel parcelA2 = a2(2, K1());
        Uri uri = (Uri) C9097ob.a(parcelA2, Uri.CREATOR);
        parcelA2.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7459Xg
    public final com.google.android.gms.dynamic.b zzf() throws RemoteException {
        Parcel parcelA2 = a2(1, K1());
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcelA2.readStrongBinder());
        parcelA2.recycle();
        return bVarA2;
    }

    C7393Vg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }
}
