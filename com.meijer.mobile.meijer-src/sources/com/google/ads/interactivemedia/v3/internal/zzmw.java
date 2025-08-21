package com.google.ads.interactivemedia.v3.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes4.dex */
public abstract class zzmw extends zzlh implements zzmx {
    @Override // com.google.ads.interactivemedia.v3.internal.zzlh
    protected final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            Bundle bundle = (Bundle) zzli.zza(parcel, Bundle.CREATOR);
            zzli.zzb(parcel);
            zzc(bundle);
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

    public zzmw() {
        super("com.google.android.gms.ads.signalsdk.ISignalSdkCallback");
    }
}
