package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Dh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC6660Dh extends BinderC8865nb implements InterfaceC6694Eh {
    @Override // com.google.android.gms.internal.ads.BinderC8865nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        InterfaceC9198qh c8984oh;
        if (i10 != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            c8984oh = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            c8984oh = iInterfaceQueryLocalInterface instanceof InterfaceC9198qh ? (InterfaceC9198qh) iInterfaceQueryLocalInterface : new C8984oh(strongBinder);
        }
        C8972ob.c(parcel);
        h3(c8984oh);
        parcel2.writeNoException();
        return true;
    }

    public AbstractBinderC6660Dh() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    public static InterfaceC6694Eh B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC6694Eh ? (InterfaceC6694Eh) iInterfaceQueryLocalInterface : new C6626Ch(iBinder);
    }
}
