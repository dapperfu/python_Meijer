package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.Oj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC7036Oj extends BinderC8865nb implements InterfaceC7070Pj {
    @Override // com.google.android.gms.internal.ads.BinderC8865nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(C6833Ij.CREATOR);
        C8972ob.c(parcel);
        f4(arrayListCreateTypedArrayList);
        parcel2.writeNoException();
        return true;
    }

    public AbstractBinderC7036Oj() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    public static InterfaceC7070Pj B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        return iInterfaceQueryLocalInterface instanceof InterfaceC7070Pj ? (InterfaceC7070Pj) iInterfaceQueryLocalInterface : new C7002Nj(iBinder);
    }
}
