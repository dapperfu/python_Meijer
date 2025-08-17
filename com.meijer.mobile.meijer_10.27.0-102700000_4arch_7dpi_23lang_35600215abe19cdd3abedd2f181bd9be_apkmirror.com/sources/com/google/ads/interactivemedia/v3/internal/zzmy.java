package com.google.ads.interactivemedia.v3.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes4.dex */
public final class zzmy extends zzlg implements zzna {
    zzmy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.signalsdk.ISignalSdkService");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzna
    public final void zze(zznb zznbVar, zzmv zzmvVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzli.zzc(parcelZza, zznbVar);
        zzli.zzd(parcelZza, zzmvVar);
        zzw(2, parcelZza);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzna
    public final void zzf(Bundle bundle, zzmx zzmxVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzli.zzc(parcelZza, bundle);
        zzli.zzd(parcelZza, zzmxVar);
        zzw(1, parcelZza);
    }
}
