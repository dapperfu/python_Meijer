package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.yc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC10043yc extends BinderC8865nb implements InterfaceC10150zc {
    @Override // com.google.android.gms.internal.ads.BinderC8865nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzf();
        } else if (i10 == 2) {
            zzc();
        } else if (i10 == 3) {
            Mc.W0 w02 = (Mc.W0) C8972ob.a(parcel, Mc.W0.CREATOR);
            C8972ob.c(parcel);
            H0(w02);
        } else if (i10 == 4) {
            zze();
        } else {
            if (i10 != 5) {
                return false;
            }
            zzb();
        }
        parcel2.writeNoException();
        return true;
    }

    public AbstractBinderC10043yc() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }
}
