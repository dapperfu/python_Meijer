package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.zh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC10160zh extends BinderC8865nb implements InterfaceC6592Bh {
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
        String string = parcel.readString();
        C8972ob.c(parcel);
        t7(c8984oh, string);
        parcel2.writeNoException();
        return true;
    }

    public AbstractBinderC10160zh() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public static InterfaceC6592Bh B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC6592Bh ? (InterfaceC6592Bh) iInterfaceQueryLocalInterface : new C10053yh(iBinder);
    }
}
