package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.yc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC10168yc extends BinderC8990nb implements InterfaceC10275zc {
    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzf();
        } else if (i10 == 2) {
            zzc();
        } else if (i10 == 3) {
            Oc.W0 w02 = (Oc.W0) C9097ob.a(parcel, Oc.W0.CREATOR);
            C9097ob.c(parcel);
            a0(w02);
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

    public AbstractBinderC10168yc() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }
}
