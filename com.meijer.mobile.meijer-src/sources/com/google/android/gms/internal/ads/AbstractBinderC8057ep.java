package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.ep, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC8057ep extends BinderC8990nb implements InterfaceC8164fp {
    public AbstractBinderC8057ep() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        InterfaceC7534Zo c7468Xo;
        switch (i10) {
            case 1:
                zzj();
                break;
            case 2:
                zzg();
                break;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c7468Xo = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    if (iInterfaceQueryLocalInterface instanceof InterfaceC7534Zo) {
                        c7468Xo = (InterfaceC7534Zo) iInterfaceQueryLocalInterface;
                    } else {
                        c7468Xo = new C7468Xo(strongBinder);
                    }
                }
                C9097ob.c(parcel);
                W1(c7468Xo);
                break;
            case 4:
                int i12 = parcel.readInt();
                C9097ob.c(parcel);
                zzh(i12);
                break;
            case 5:
                Oc.W0 w02 = (Oc.W0) C9097ob.a(parcel, Oc.W0.CREATOR);
                C9097ob.c(parcel);
                g9(w02);
                break;
            case 6:
                zzf();
                break;
            case 7:
                zze();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
