package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes4.dex */
public abstract class zzmu extends zzlh implements zzmv {
    @Override // com.google.ads.interactivemedia.v3.internal.zzlh
    protected final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zznd zzndVar = (zznd) zzli.zza(parcel, zznd.CREATOR);
            zzli.zzb(parcel);
            zzc(zzndVar);
        } else {
            if (i10 != 2) {
                return false;
            }
            int i12 = parcel.readInt();
            zzli.zzb(parcel);
            zzb(i12);
        }
        return true;
    }

    public zzmu() {
        super("com.google.android.gms.ads.signalsdk.INetworkRequestCallback");
    }
}
