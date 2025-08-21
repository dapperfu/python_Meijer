package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Kh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC7023Kh extends BinderC8990nb implements InterfaceC7057Lh {
    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        InterfaceC7328Th c7260Rh;
        if (i10 != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            c7260Rh = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
            c7260Rh = iInterfaceQueryLocalInterface instanceof InterfaceC7328Th ? (InterfaceC7328Th) iInterfaceQueryLocalInterface : new C7260Rh(strongBinder);
        }
        C9097ob.c(parcel);
        u3(c7260Rh);
        parcel2.writeNoException();
        return true;
    }

    public AbstractBinderC7023Kh() {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    public static InterfaceC7057Lh B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC7057Lh ? (InterfaceC7057Lh) iInterfaceQueryLocalInterface : new C6989Jh(iBinder);
    }
}
