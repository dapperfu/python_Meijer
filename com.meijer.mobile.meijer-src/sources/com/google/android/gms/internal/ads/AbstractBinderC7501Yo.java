package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Yo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC7501Yo extends BinderC8990nb implements InterfaceC7534Zo {
    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            String strZzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(strZzf);
        } else {
            if (i10 != 2) {
                return false;
            }
            int iZze = zze();
            parcel2.writeNoException();
            parcel2.writeInt(iZze);
        }
        return true;
    }

    public AbstractBinderC7501Yo() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    public static InterfaceC7534Zo B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
        return iInterfaceQueryLocalInterface instanceof InterfaceC7534Zo ? (InterfaceC7534Zo) iInterfaceQueryLocalInterface : new C7468Xo(iBinder);
    }
}
