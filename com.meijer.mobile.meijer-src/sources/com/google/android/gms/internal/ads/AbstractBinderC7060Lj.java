package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Lj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC7060Lj extends BinderC8990nb implements InterfaceC7093Mj {
    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 2) {
            zzf();
        } else {
            if (i10 != 3) {
                return false;
            }
            String string = parcel.readString();
            C9097ob.c(parcel);
            a(string);
        }
        parcel2.writeNoException();
        return true;
    }

    public AbstractBinderC7060Lj() {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    public static InterfaceC7093Mj B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        return iInterfaceQueryLocalInterface instanceof InterfaceC7093Mj ? (InterfaceC7093Mj) iInterfaceQueryLocalInterface : new C7026Kj(iBinder);
    }
}
