package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Bm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC6598Bm extends BinderC8865nb implements InterfaceC6632Cm {
    @Override // com.google.android.gms.internal.ads.BinderC8865nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            String string = parcel.readString();
            C8972ob.c(parcel);
            a(string);
        } else if (i10 == 2) {
            String string2 = parcel.readString();
            C8972ob.c(parcel);
            i(string2);
        } else {
            if (i10 != 3) {
                return false;
            }
            Mc.W0 w02 = (Mc.W0) C8972ob.a(parcel, Mc.W0.CREATOR);
            C8972ob.c(parcel);
            k2(w02);
        }
        parcel2.writeNoException();
        return true;
    }

    public AbstractBinderC6598Bm() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }
}
