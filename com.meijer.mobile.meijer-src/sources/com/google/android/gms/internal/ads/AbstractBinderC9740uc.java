package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.uc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC9740uc extends BinderC8990nb implements InterfaceC9847vc {
    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        InterfaceC9526sc c9313qc;
        if (i10 == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                c9313qc = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                c9313qc = iInterfaceQueryLocalInterface instanceof InterfaceC9526sc ? (InterfaceC9526sc) iInterfaceQueryLocalInterface : new C9313qc(strongBinder);
            }
            C9097ob.c(parcel);
            U0(c9313qc);
        } else if (i10 == 2) {
            parcel.readInt();
            C9097ob.c(parcel);
        } else {
            if (i10 != 3) {
                return false;
            }
            Oc.W0 w02 = (Oc.W0) C9097ob.a(parcel, Oc.W0.CREATOR);
            C9097ob.c(parcel);
            z2(w02);
        }
        parcel2.writeNoException();
        return true;
    }

    public AbstractBinderC9740uc() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public static InterfaceC9847vc B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        return iInterfaceQueryLocalInterface instanceof InterfaceC9847vc ? (InterfaceC9847vc) iInterfaceQueryLocalInterface : new C9633tc(iBinder);
    }
}
