package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Kh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC6898Kh extends BinderC8865nb implements InterfaceC6932Lh {
    @Override // com.google.android.gms.internal.ads.BinderC8865nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        InterfaceC7203Th c7135Rh;
        if (i10 != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            c7135Rh = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
            c7135Rh = iInterfaceQueryLocalInterface instanceof InterfaceC7203Th ? (InterfaceC7203Th) iInterfaceQueryLocalInterface : new C7135Rh(strongBinder);
        }
        C8972ob.c(parcel);
        m3(c7135Rh);
        parcel2.writeNoException();
        return true;
    }

    public AbstractBinderC6898Kh() {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    public static InterfaceC6932Lh B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC6932Lh ? (InterfaceC6932Lh) iInterfaceQueryLocalInterface : new C6864Jh(iBinder);
    }
}
