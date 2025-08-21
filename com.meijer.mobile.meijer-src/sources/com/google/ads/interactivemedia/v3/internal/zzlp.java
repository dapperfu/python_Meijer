package com.google.ads.interactivemedia.v3.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes4.dex */
public final class zzlp extends zzlg implements IInterface {
    zzlp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
    }

    public final IBinder zze(com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2, byte[] bArr) throws RemoteException {
        Parcel parcelZza = zza();
        zzli.zzd(parcelZza, bVar);
        zzli.zzd(parcelZza, bVar2);
        parcelZza.writeByteArray(bArr);
        Parcel parcelZzu = zzu(3, parcelZza);
        IBinder strongBinder = parcelZzu.readStrongBinder();
        parcelZzu.recycle();
        return strongBinder;
    }
}
