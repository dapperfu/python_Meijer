package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.zh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC10285zh extends BinderC8990nb implements InterfaceC6717Bh {
    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        InterfaceC9323qh c9109oh;
        if (i10 != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            c9109oh = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            c9109oh = iInterfaceQueryLocalInterface instanceof InterfaceC9323qh ? (InterfaceC9323qh) iInterfaceQueryLocalInterface : new C9109oh(strongBinder);
        }
        String string = parcel.readString();
        C9097ob.c(parcel);
        z7(c9109oh, string);
        parcel2.writeNoException();
        return true;
    }

    public AbstractBinderC10285zh() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public static InterfaceC6717Bh B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC6717Bh ? (InterfaceC6717Bh) iInterfaceQueryLocalInterface : new C10178yh(iBinder);
    }
}
