package com.google.ads.interactivemedia.v3.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes4.dex */
public final class zzot extends zzlg implements IInterface {
    zzot(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzor zze(zzop zzopVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzli.zzc(parcelZza, zzopVar);
        Parcel parcelZzu = zzu(1, parcelZza);
        zzor zzorVar = (zzor) zzli.zza(parcelZzu, zzor.CREATOR);
        parcelZzu.recycle();
        return zzorVar;
    }

    public final zzpa zzf(zzoy zzoyVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzli.zzc(parcelZza, zzoyVar);
        Parcel parcelZzu = zzu(3, parcelZza);
        zzpa zzpaVar = (zzpa) zzli.zza(parcelZzu, zzpa.CREATOR);
        parcelZzu.recycle();
        return zzpaVar;
    }
}
