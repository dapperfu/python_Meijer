package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;

/* renamed from: com.google.android.gms.internal.ads.To, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC7211To extends BinderC8865nb implements InterfaceC7244Uo {
    public AbstractBinderC7211To() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static InterfaceC7244Uo B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC7244Uo ? (InterfaceC7244Uo) iInterfaceQueryLocalInterface : new C7177So(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.BinderC8865nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcel.readStrongBinder());
                C8972ob.c(parcel);
                zzl(bVarA2);
                break;
            case 2:
                com.google.android.gms.dynamic.b bVarA22 = b.a.a2(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                C8972ob.c(parcel);
                D5(bVarA22, i12);
                break;
            case 3:
                com.google.android.gms.dynamic.b bVarA23 = b.a.a2(parcel.readStrongBinder());
                C8972ob.c(parcel);
                zzi(bVarA23);
                break;
            case 4:
                com.google.android.gms.dynamic.b bVarA24 = b.a.a2(parcel.readStrongBinder());
                C8972ob.c(parcel);
                Q(bVarA24);
                break;
            case 5:
                com.google.android.gms.dynamic.b bVarA25 = b.a.a2(parcel.readStrongBinder());
                C8972ob.c(parcel);
                q1(bVarA25);
                break;
            case 6:
                com.google.android.gms.dynamic.b bVarA26 = b.a.a2(parcel.readStrongBinder());
                C8972ob.c(parcel);
                zzf(bVarA26);
                break;
            case 7:
                com.google.android.gms.dynamic.b bVarA27 = b.a.a2(parcel.readStrongBinder());
                C7277Vo c7277Vo = (C7277Vo) C8972ob.a(parcel, C7277Vo.CREATOR);
                C8972ob.c(parcel);
                Y1(bVarA27, c7277Vo);
                break;
            case 8:
                com.google.android.gms.dynamic.b bVarA28 = b.a.a2(parcel.readStrongBinder());
                C8972ob.c(parcel);
                zze(bVarA28);
                break;
            case 9:
                com.google.android.gms.dynamic.b bVarA29 = b.a.a2(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                C8972ob.c(parcel);
                j3(bVarA29, i13);
                break;
            case 10:
                com.google.android.gms.dynamic.b bVarA210 = b.a.a2(parcel.readStrongBinder());
                C8972ob.c(parcel);
                w0(bVarA210);
                break;
            case 11:
                com.google.android.gms.dynamic.b bVarA211 = b.a.a2(parcel.readStrongBinder());
                C8972ob.c(parcel);
                y(bVarA211);
                break;
            case 12:
                C8972ob.c(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
