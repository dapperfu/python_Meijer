package com.google.android.gms.internal.ads;

import Mc.InterfaceC4099a0;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;

/* renamed from: com.google.android.gms.internal.ads.Ko, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC6906Ko extends BinderC8865nb implements InterfaceC6940Lo {
    @Override // com.google.android.gms.internal.ads.BinderC8865nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            C7109Qo c7109Qo = (C7109Qo) C8972ob.a(parcel, C7109Qo.CREATOR);
            C8972ob.c(parcel);
            g8(c7109Qo);
            parcel2.writeNoException();
        } else if (i10 != 2) {
            InterfaceC7075Po c7007No = null;
            C6872Jo c6872Jo = null;
            if (i10 == 3) {
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    c7007No = iInterfaceQueryLocalInterface instanceof InterfaceC7075Po ? (InterfaceC7075Po) iInterfaceQueryLocalInterface : new C7007No(strongBinder);
                }
                C8972ob.c(parcel);
                V4(c7007No);
                parcel2.writeNoException();
            } else if (i10 != 34) {
                switch (i10) {
                    case 5:
                        boolean zZzs = zzs();
                        parcel2.writeNoException();
                        int i12 = C8972ob.f77401b;
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
                        C8972ob.c(parcel);
                        zzi(bVarA2);
                        parcel2.writeNoException();
                        break;
                    case 10:
                        com.google.android.gms.dynamic.b bVarA22 = b.a.a2(parcel.readStrongBinder());
                        C8972ob.c(parcel);
                        O(bVarA22);
                        parcel2.writeNoException();
                        break;
                    case 11:
                        com.google.android.gms.dynamic.b bVarA23 = b.a.a2(parcel.readStrongBinder());
                        C8972ob.c(parcel);
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
                        C8972ob.c(parcel);
                        C(string);
                        parcel2.writeNoException();
                        break;
                    case 14:
                        InterfaceC4099a0 interfaceC4099a0B9 = Mc.Z.B9(parcel.readStrongBinder());
                        C8972ob.c(parcel);
                        f5(interfaceC4099a0B9);
                        parcel2.writeNoException();
                        break;
                    case 15:
                        Bundle bundleZzb = zzb();
                        parcel2.writeNoException();
                        C8972ob.e(parcel2, bundleZzb);
                        break;
                    case 16:
                        IBinder strongBinder2 = parcel.readStrongBinder();
                        if (strongBinder2 != null) {
                            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                            c6872Jo = iInterfaceQueryLocalInterface2 instanceof C6872Jo ? (C6872Jo) iInterfaceQueryLocalInterface2 : new C6872Jo(strongBinder2);
                        }
                        C8972ob.c(parcel);
                        r6(c6872Jo);
                        parcel2.writeNoException();
                        break;
                    case 17:
                        parcel.readString();
                        C8972ob.c(parcel);
                        parcel2.writeNoException();
                        break;
                    case 18:
                        com.google.android.gms.dynamic.b bVarA24 = b.a.a2(parcel.readStrongBinder());
                        C8972ob.c(parcel);
                        E(bVarA24);
                        parcel2.writeNoException();
                        break;
                    case 19:
                        String string2 = parcel.readString();
                        C8972ob.c(parcel);
                        B(string2);
                        parcel2.writeNoException();
                        break;
                    case 20:
                        boolean zZzt = zzt();
                        parcel2.writeNoException();
                        int i13 = C8972ob.f77401b;
                        parcel2.writeInt(zZzt ? 1 : 0);
                        break;
                    case 21:
                        Mc.U0 u0Zzc = zzc();
                        parcel2.writeNoException();
                        C8972ob.f(parcel2, u0Zzc);
                        break;
                    default:
                        return false;
                }
            } else {
                boolean zG = C8972ob.g(parcel);
                C8972ob.c(parcel);
                q(zG);
                parcel2.writeNoException();
            }
        } else {
            zzq();
            parcel2.writeNoException();
        }
        return true;
    }

    public AbstractBinderC6906Ko() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }
}
