package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Bm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC6723Bm extends BinderC8990nb implements InterfaceC6757Cm {
    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            String string = parcel.readString();
            C9097ob.c(parcel);
            a(string);
        } else if (i10 == 2) {
            String string2 = parcel.readString();
            C9097ob.c(parcel);
            i(string2);
        } else {
            if (i10 != 3) {
                return false;
            }
            Oc.W0 w02 = (Oc.W0) C9097ob.a(parcel, Oc.W0.CREATOR);
            C9097ob.c(parcel);
            C1(w02);
        }
        parcel2.writeNoException();
        return true;
    }

    public AbstractBinderC6723Bm() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }
}
