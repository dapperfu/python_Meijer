package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.ip, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC8359ip extends BinderC8865nb implements InterfaceC8465jp {
    @Override // com.google.android.gms.internal.ads.BinderC8865nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzg();
        } else if (i10 == 2) {
            int i12 = parcel.readInt();
            C8972ob.c(parcel);
            zze(i12);
        } else {
            if (i10 != 3) {
                return false;
            }
            Mc.W0 w02 = (Mc.W0) C8972ob.a(parcel, Mc.W0.CREATOR);
            C8972ob.c(parcel);
            b(w02);
        }
        parcel2.writeNoException();
        return true;
    }

    public AbstractBinderC8359ip() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }
}
