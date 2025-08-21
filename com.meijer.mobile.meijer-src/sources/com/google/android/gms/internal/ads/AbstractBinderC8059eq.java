package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.eq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC8059eq extends BinderC8990nb implements InterfaceC8166fq {
    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            parcel.readString();
            parcel.readString();
            C9097ob.c(parcel);
        } else if (i10 == 2) {
            String string = parcel.readString();
            C9097ob.c(parcel);
            d(string);
        } else {
            if (i10 != 3) {
                return false;
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Bundle bundle = (Bundle) C9097ob.a(parcel, Bundle.CREATOR);
            C9097ob.c(parcel);
            U1(string2, string3, bundle);
        }
        parcel2.writeNoException();
        return true;
    }

    public AbstractBinderC8059eq() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }
}
