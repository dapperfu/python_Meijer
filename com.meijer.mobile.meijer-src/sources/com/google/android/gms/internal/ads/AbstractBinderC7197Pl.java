package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Pl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC7197Pl extends BinderC8990nb implements InterfaceC7231Ql {
    public AbstractBinderC7197Pl() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    public static InterfaceC7231Ql B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        return iInterfaceQueryLocalInterface instanceof InterfaceC7231Ql ? (InterfaceC7231Ql) iInterfaceQueryLocalInterface : new C7163Ol(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 2:
                String strZzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 3:
                List listZzv = zzv();
                parcel2.writeNoException();
                parcel2.writeList(listZzv);
                return true;
            case 4:
                String strZzq = zzq();
                parcel2.writeNoException();
                parcel2.writeString(strZzq);
                return true;
            case 5:
                InterfaceC7459Xg interfaceC7459XgZzl = zzl();
                parcel2.writeNoException();
                C9097ob.f(parcel2, interfaceC7459XgZzl);
                return true;
            case 6:
                String strZzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(strZzr);
                return true;
            case 7:
                String strZzp = zzp();
                parcel2.writeNoException();
                parcel2.writeString(strZzp);
                return true;
            case 8:
                double dZze = zze();
                parcel2.writeNoException();
                parcel2.writeDouble(dZze);
                return true;
            case 9:
                String strZzu = zzu();
                parcel2.writeNoException();
                parcel2.writeString(strZzu);
                return true;
            case 10:
                String strZzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(strZzt);
                return true;
            case 11:
                Oc.Y0 y0Zzj = zzj();
                parcel2.writeNoException();
                C9097ob.f(parcel2, y0Zzj);
                return true;
            case 12:
                parcel2.writeNoException();
                C9097ob.f(parcel2, null);
                return true;
            case 13:
                com.google.android.gms.dynamic.b bVarZzm = zzm();
                parcel2.writeNoException();
                C9097ob.f(parcel2, bVarZzm);
                return true;
            case 14:
                com.google.android.gms.dynamic.b bVarZzn = zzn();
                parcel2.writeNoException();
                C9097ob.f(parcel2, bVarZzn);
                return true;
            case 15:
                com.google.android.gms.dynamic.b bVarZzo = zzo();
                parcel2.writeNoException();
                C9097ob.f(parcel2, bVarZzo);
                return true;
            case 16:
                Bundle bundleZzi = zzi();
                parcel2.writeNoException();
                C9097ob.e(parcel2, bundleZzi);
                return true;
            case 17:
                boolean zR = r();
                parcel2.writeNoException();
                int i12 = C9097ob.f78241b;
                parcel2.writeInt(zR ? 1 : 0);
                return true;
            case 18:
                boolean zV = v();
                parcel2.writeNoException();
                int i13 = C9097ob.f78241b;
                parcel2.writeInt(zV ? 1 : 0);
                return true;
            case 19:
                zzx();
                parcel2.writeNoException();
                return true;
            case 20:
                com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcel.readStrongBinder());
                C9097ob.c(parcel);
                E5(bVarA2);
                parcel2.writeNoException();
                return true;
            case 21:
                com.google.android.gms.dynamic.b bVarA22 = b.a.a2(parcel.readStrongBinder());
                com.google.android.gms.dynamic.b bVarA23 = b.a.a2(parcel.readStrongBinder());
                com.google.android.gms.dynamic.b bVarA24 = b.a.a2(parcel.readStrongBinder());
                C9097ob.c(parcel);
                w8(bVarA22, bVarA23, bVarA24);
                parcel2.writeNoException();
                return true;
            case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                com.google.android.gms.dynamic.b bVarA25 = b.a.a2(parcel.readStrongBinder());
                C9097ob.c(parcel);
                K(bVarA25);
                parcel2.writeNoException();
                return true;
            case 23:
                float fZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzf);
                return true;
            case 24:
                float fZzh = zzh();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzh);
                return true;
            case 25:
                float fZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzg);
                return true;
            default:
                return false;
        }
    }
}
