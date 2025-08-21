package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.ip, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC8484ip extends BinderC8990nb implements InterfaceC8590jp {
    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzg();
        } else if (i10 == 2) {
            int i12 = parcel.readInt();
            C9097ob.c(parcel);
            zze(i12);
        } else {
            if (i10 != 3) {
                return false;
            }
            Oc.W0 w02 = (Oc.W0) C9097ob.a(parcel, Oc.W0.CREATOR);
            C9097ob.c(parcel);
            b(w02);
        }
        parcel2.writeNoException();
        return true;
    }

    public AbstractBinderC8484ip() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }
}
