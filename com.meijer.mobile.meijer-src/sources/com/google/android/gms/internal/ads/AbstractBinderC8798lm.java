package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;

/* renamed from: com.google.android.gms.internal.ads.lm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC8798lm extends BinderC8990nb implements InterfaceC8905mm {
    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcel.readStrongBinder());
            C9097ob.c(parcel);
            B0(bVarA2);
        } else if (i10 == 2) {
            String string = parcel.readString();
            C9097ob.c(parcel);
            a(string);
        } else if (i10 == 3) {
            Oc.W0 w02 = (Oc.W0) C9097ob.a(parcel, Oc.W0.CREATOR);
            C9097ob.c(parcel);
            b(w02);
        } else {
            if (i10 != 4) {
                return false;
            }
            InterfaceC7062Ll interfaceC7062LlB9 = AbstractBinderC7028Kl.B9(parcel.readStrongBinder());
            C9097ob.c(parcel);
            B8(interfaceC7062LlB9);
        }
        parcel2.writeNoException();
        return true;
    }

    public AbstractBinderC8798lm() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }
}
