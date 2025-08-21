package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;

/* renamed from: com.google.android.gms.internal.ads.To, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC7336To extends BinderC8990nb implements InterfaceC7369Uo {
    public AbstractBinderC7336To() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static InterfaceC7369Uo B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC7369Uo ? (InterfaceC7369Uo) iInterfaceQueryLocalInterface : new C7302So(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcel.readStrongBinder());
                C9097ob.c(parcel);
                zzl(bVarA2);
                break;
            case 2:
                com.google.android.gms.dynamic.b bVarA22 = b.a.a2(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                C9097ob.c(parcel);
                N5(bVarA22, i12);
                break;
            case 3:
                com.google.android.gms.dynamic.b bVarA23 = b.a.a2(parcel.readStrongBinder());
                C9097ob.c(parcel);
                zzi(bVarA23);
                break;
            case 4:
                com.google.android.gms.dynamic.b bVarA24 = b.a.a2(parcel.readStrongBinder());
                C9097ob.c(parcel);
                Q(bVarA24);
                break;
            case 5:
                com.google.android.gms.dynamic.b bVarA25 = b.a.a2(parcel.readStrongBinder());
                C9097ob.c(parcel);
                z1(bVarA25);
                break;
            case 6:
                com.google.android.gms.dynamic.b bVarA26 = b.a.a2(parcel.readStrongBinder());
                C9097ob.c(parcel);
                zzf(bVarA26);
                break;
            case 7:
                com.google.android.gms.dynamic.b bVarA27 = b.a.a2(parcel.readStrongBinder());
                C7402Vo c7402Vo = (C7402Vo) C9097ob.a(parcel, C7402Vo.CREATOR);
                C9097ob.c(parcel);
                Z1(bVarA27, c7402Vo);
                break;
            case 8:
                com.google.android.gms.dynamic.b bVarA28 = b.a.a2(parcel.readStrongBinder());
                C9097ob.c(parcel);
                zze(bVarA28);
                break;
            case 9:
                com.google.android.gms.dynamic.b bVarA29 = b.a.a2(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                C9097ob.c(parcel);
                q3(bVarA29, i13);
                break;
            case 10:
                com.google.android.gms.dynamic.b bVarA210 = b.a.a2(parcel.readStrongBinder());
                C9097ob.c(parcel);
                z0(bVarA210);
                break;
            case 11:
                com.google.android.gms.dynamic.b bVarA211 = b.a.a2(parcel.readStrongBinder());
                C9097ob.c(parcel);
                y(bVarA211);
                break;
            case 12:
                C9097ob.c(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
