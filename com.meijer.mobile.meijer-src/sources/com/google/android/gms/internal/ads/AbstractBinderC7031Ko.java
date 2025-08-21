package com.google.android.gms.internal.ads;

import Oc.InterfaceC4377a0;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;

/* renamed from: com.google.android.gms.internal.ads.Ko, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC7031Ko extends BinderC8990nb implements InterfaceC7065Lo {
    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            C7234Qo c7234Qo = (C7234Qo) C9097ob.a(parcel, C7234Qo.CREATOR);
            C9097ob.c(parcel);
            e8(c7234Qo);
            parcel2.writeNoException();
        } else if (i10 != 2) {
            InterfaceC7200Po c7132No = null;
            C6997Jo c6997Jo = null;
            if (i10 == 3) {
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    c7132No = iInterfaceQueryLocalInterface instanceof InterfaceC7200Po ? (InterfaceC7200Po) iInterfaceQueryLocalInterface : new C7132No(strongBinder);
                }
                C9097ob.c(parcel);
                i5(c7132No);
                parcel2.writeNoException();
            } else if (i10 != 34) {
                switch (i10) {
                    case 5:
                        boolean zZzs = zzs();
                        parcel2.writeNoException();
                        int i12 = C9097ob.f78241b;
                        parcel2.writeInt(zZzs ? 1 : 0);
                        break;
                    case 6:
                        zzh();
                        parcel2.writeNoException();
                        break;
                    case 7:
                        zzj();
                        parcel2.writeNoException();
                        break;
                    case 8:
                        zze();
                        parcel2.writeNoException();
                        break;
                    case 9:
                        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcel.readStrongBinder());
                        C9097ob.c(parcel);
                        zzi(bVarA2);
                        parcel2.writeNoException();
                        break;
                    case 10:
                        com.google.android.gms.dynamic.b bVarA22 = b.a.a2(parcel.readStrongBinder());
                        C9097ob.c(parcel);
                        O(bVarA22);
                        parcel2.writeNoException();
                        break;
                    case 11:
                        com.google.android.gms.dynamic.b bVarA23 = b.a.a2(parcel.readStrongBinder());
                        C9097ob.c(parcel);
                        zzf(bVarA23);
                        parcel2.writeNoException();
                        break;
                    case 12:
                        String strZzd = zzd();
                        parcel2.writeNoException();
                        parcel2.writeString(strZzd);
                        break;
                    case 13:
                        String string = parcel.readString();
                        C9097ob.c(parcel);
                        C(string);
                        parcel2.writeNoException();
                        break;
                    case 14:
                        InterfaceC4377a0 interfaceC4377a0B9 = Oc.Z.B9(parcel.readStrongBinder());
                        C9097ob.c(parcel);
                        e4(interfaceC4377a0B9);
                        parcel2.writeNoException();
                        break;
                    case 15:
                        Bundle bundleZzb = zzb();
                        parcel2.writeNoException();
                        C9097ob.e(parcel2, bundleZzb);
                        break;
                    case 16:
                        IBinder strongBinder2 = parcel.readStrongBinder();
                        if (strongBinder2 != null) {
                            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                            c6997Jo = iInterfaceQueryLocalInterface2 instanceof C6997Jo ? (C6997Jo) iInterfaceQueryLocalInterface2 : new C6997Jo(strongBinder2);
                        }
                        C9097ob.c(parcel);
                        G6(c6997Jo);
                        parcel2.writeNoException();
                        break;
                    case 17:
                        parcel.readString();
                        C9097ob.c(parcel);
                        parcel2.writeNoException();
                        break;
                    case 18:
                        com.google.android.gms.dynamic.b bVarA24 = b.a.a2(parcel.readStrongBinder());
                        C9097ob.c(parcel);
                        E(bVarA24);
                        parcel2.writeNoException();
                        break;
                    case 19:
                        String string2 = parcel.readString();
                        C9097ob.c(parcel);
                        B(string2);
                        parcel2.writeNoException();
                        break;
                    case 20:
                        boolean zZzt = zzt();
                        parcel2.writeNoException();
                        int i13 = C9097ob.f78241b;
                        parcel2.writeInt(zZzt ? 1 : 0);
                        break;
                    case 21:
                        Oc.U0 u0Zzc = zzc();
                        parcel2.writeNoException();
                        C9097ob.f(parcel2, u0Zzc);
                        break;
                    default:
                        return false;
                }
            } else {
                boolean zG = C9097ob.g(parcel);
                C9097ob.c(parcel);
                q(zG);
                parcel2.writeNoException();
            }
        } else {
            zzq();
            parcel2.writeNoException();
        }
        return true;
    }

    public AbstractBinderC7031Ko() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }
}
