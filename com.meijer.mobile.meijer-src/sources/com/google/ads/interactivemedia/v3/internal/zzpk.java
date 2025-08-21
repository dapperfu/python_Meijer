package com.google.ads.interactivemedia.v3.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes4.dex */
public final class zzpk extends zzlg implements zzpm {
    @Override // com.google.ads.interactivemedia.v3.internal.zzpm
    public final void zzf() throws RemoteException {
        zzv(3, zza());
    }

    zzpk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzpm
    public final void zze(com.google.android.gms.dynamic.b bVar, String str, String str2) throws RemoteException {
        Parcel parcelZza = zza();
        zzli.zzd(parcelZza, bVar);
        parcelZza.writeString(str);
        parcelZza.writeString(null);
        zzv(8, parcelZza);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzpm
    public final void zzg(int i10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i10);
        zzv(7, parcelZza);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzpm
    public final void zzh(int[] iArr) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeIntArray(null);
        zzv(4, parcelZza);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzpm
    public final void zzi(int i10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i10);
        zzv(6, parcelZza);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzpm
    public final void zzj(byte[] bArr) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeByteArray(bArr);
        zzv(5, parcelZza);
    }
}
