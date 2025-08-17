package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.rm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC9314rm extends BinderC8865nb implements InterfaceC9421sm {
    @Override // com.google.android.gms.internal.ads.BinderC8865nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            InterfaceC7106Ql interfaceC7106QlB9 = AbstractBinderC7072Pl.B9(parcel.readStrongBinder());
            C8972ob.c(parcel);
            K6(interfaceC7106QlB9);
        } else if (i10 == 2) {
            String string = parcel.readString();
            C8972ob.c(parcel);
            a(string);
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

    public AbstractBinderC9314rm() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }
}
