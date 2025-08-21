package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.Oj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC7161Oj extends BinderC8990nb implements InterfaceC7195Pj {
    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(C6958Ij.CREATOR);
        C9097ob.c(parcel);
        v4(arrayListCreateTypedArrayList);
        parcel2.writeNoException();
        return true;
    }

    public AbstractBinderC7161Oj() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    public static InterfaceC7195Pj B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        return iInterfaceQueryLocalInterface instanceof InterfaceC7195Pj ? (InterfaceC7195Pj) iInterfaceQueryLocalInterface : new C7127Nj(iBinder);
    }
}
