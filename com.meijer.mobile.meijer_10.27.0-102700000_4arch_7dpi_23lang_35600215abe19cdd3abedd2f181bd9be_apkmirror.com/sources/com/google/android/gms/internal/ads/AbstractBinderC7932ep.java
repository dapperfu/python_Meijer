package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.ep, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC7932ep extends BinderC8865nb implements InterfaceC8039fp {
    public AbstractBinderC7932ep() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.BinderC8865nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        InterfaceC7409Zo c7343Xo;
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
                    c7343Xo = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    if (iInterfaceQueryLocalInterface instanceof InterfaceC7409Zo) {
                        c7343Xo = (InterfaceC7409Zo) iInterfaceQueryLocalInterface;
                    } else {
                        c7343Xo = new C7343Xo(strongBinder);
                    }
                }
                C8972ob.c(parcel);
                T1(c7343Xo);
                break;
            case 4:
                int i12 = parcel.readInt();
                C8972ob.c(parcel);
                zzh(i12);
                break;
            case 5:
                Mc.W0 w02 = (Mc.W0) C8972ob.a(parcel, Mc.W0.CREATOR);
                C8972ob.c(parcel);
                W0(w02);
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
