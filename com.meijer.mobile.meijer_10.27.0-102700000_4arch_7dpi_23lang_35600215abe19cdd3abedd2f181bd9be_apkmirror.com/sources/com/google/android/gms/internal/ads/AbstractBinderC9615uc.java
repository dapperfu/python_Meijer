package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.uc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC9615uc extends BinderC8865nb implements InterfaceC9722vc {
    @Override // com.google.android.gms.internal.ads.BinderC8865nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        InterfaceC9401sc c9188qc;
        if (i10 == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                c9188qc = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                c9188qc = iInterfaceQueryLocalInterface instanceof InterfaceC9401sc ? (InterfaceC9401sc) iInterfaceQueryLocalInterface : new C9188qc(strongBinder);
            }
            C8972ob.c(parcel);
            T0(c9188qc);
        } else if (i10 == 2) {
            parcel.readInt();
            C8972ob.c(parcel);
        } else {
            if (i10 != 3) {
                return false;
            }
            Mc.W0 w02 = (Mc.W0) C8972ob.a(parcel, Mc.W0.CREATOR);
            C8972ob.c(parcel);
            P8(w02);
        }
        parcel2.writeNoException();
        return true;
    }

    public AbstractBinderC9615uc() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public static InterfaceC9722vc B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        return iInterfaceQueryLocalInterface instanceof InterfaceC9722vc ? (InterfaceC9722vc) iInterfaceQueryLocalInterface : new C9508tc(iBinder);
    }
}
