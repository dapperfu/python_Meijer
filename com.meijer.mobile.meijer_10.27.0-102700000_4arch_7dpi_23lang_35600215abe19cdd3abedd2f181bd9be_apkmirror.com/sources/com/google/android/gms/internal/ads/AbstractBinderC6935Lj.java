package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Lj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC6935Lj extends BinderC8865nb implements InterfaceC6968Mj {
    @Override // com.google.android.gms.internal.ads.BinderC8865nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 2) {
            zzf();
        } else {
            if (i10 != 3) {
                return false;
            }
            String string = parcel.readString();
            C8972ob.c(parcel);
            a(string);
        }
        parcel2.writeNoException();
        return true;
    }

    public AbstractBinderC6935Lj() {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    public static InterfaceC6968Mj B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        return iInterfaceQueryLocalInterface instanceof InterfaceC6968Mj ? (InterfaceC6968Mj) iInterfaceQueryLocalInterface : new C6901Kj(iBinder);
    }
}
