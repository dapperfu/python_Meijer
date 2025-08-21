package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.um, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC9760um extends BinderC8990nb implements InterfaceC9974wm {
    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 2) {
            zzg();
        } else if (i10 == 3) {
            String string = parcel.readString();
            C9097ob.c(parcel);
            a(string);
        } else {
            if (i10 != 4) {
                return false;
            }
            Oc.W0 w02 = (Oc.W0) C9097ob.a(parcel, Oc.W0.CREATOR);
            C9097ob.c(parcel);
            b(w02);
        }
        parcel2.writeNoException();
        return true;
    }

    public AbstractBinderC9760um() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
    }
}
