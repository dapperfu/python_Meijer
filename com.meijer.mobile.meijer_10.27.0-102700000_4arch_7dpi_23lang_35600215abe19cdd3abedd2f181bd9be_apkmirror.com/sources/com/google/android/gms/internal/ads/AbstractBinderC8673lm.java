package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;

/* renamed from: com.google.android.gms.internal.ads.lm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC8673lm extends BinderC8865nb implements InterfaceC8780mm {
    @Override // com.google.android.gms.internal.ads.BinderC8865nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcel.readStrongBinder());
            C8972ob.c(parcel);
            y0(bVarA2);
        } else if (i10 == 2) {
            String string = parcel.readString();
            C8972ob.c(parcel);
            a(string);
        } else if (i10 == 3) {
            Mc.W0 w02 = (Mc.W0) C8972ob.a(parcel, Mc.W0.CREATOR);
            C8972ob.c(parcel);
            b(w02);
        } else {
            if (i10 != 4) {
                return false;
            }
            InterfaceC6937Ll interfaceC6937LlB9 = AbstractBinderC6903Kl.B9(parcel.readStrongBinder());
            C8972ob.c(parcel);
            H8(interfaceC6937LlB9);
        }
        parcel2.writeNoException();
        return true;
    }

    public AbstractBinderC8673lm() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }
}
