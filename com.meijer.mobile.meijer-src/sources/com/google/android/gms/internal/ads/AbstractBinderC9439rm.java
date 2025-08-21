package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.rm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC9439rm extends BinderC8990nb implements InterfaceC9546sm {
    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            InterfaceC7231Ql interfaceC7231QlB9 = AbstractBinderC7197Pl.B9(parcel.readStrongBinder());
            C9097ob.c(parcel);
            X6(interfaceC7231QlB9);
        } else if (i10 == 2) {
            String string = parcel.readString();
            C9097ob.c(parcel);
            a(string);
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

    public AbstractBinderC9439rm() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }
}
