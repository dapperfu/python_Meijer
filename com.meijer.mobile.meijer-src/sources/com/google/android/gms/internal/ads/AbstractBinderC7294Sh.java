package com.google.android.gms.internal.ads;

import Oc.AbstractBinderC4451z0;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Sh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC7294Sh extends BinderC8990nb implements InterfaceC7328Th {
    public AbstractBinderC7294Sh() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        InterfaceC7226Qh c7192Ph;
        switch (i10) {
            case 2:
                String strZzq = zzq();
                parcel2.writeNoException();
                parcel2.writeString(strZzq);
                return true;
            case 3:
                List listZzu = zzu();
                parcel2.writeNoException();
                parcel2.writeList(listZzu);
                return true;
            case 4:
                String strZzo = zzo();
                parcel2.writeNoException();
                parcel2.writeString(strZzo);
                return true;
            case 5:
                InterfaceC7459Xg interfaceC7459XgZzk = zzk();
                parcel2.writeNoException();
                C9097ob.f(parcel2, interfaceC7459XgZzk);
                return true;
            case 6:
                String strZzp = zzp();
                parcel2.writeNoException();
                parcel2.writeString(strZzp);
                return true;
            case 7:
                String strZzn = zzn();
                parcel2.writeNoException();
                parcel2.writeString(strZzn);
                return true;
            case 8:
                double dZze = zze();
                parcel2.writeNoException();
                parcel2.writeDouble(dZze);
                return true;
            case 9:
                String strZzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(strZzt);
                return true;
            case 10:
                String strZzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 11:
                Oc.Y0 y0Zzh = zzh();
                parcel2.writeNoException();
                C9097ob.f(parcel2, y0Zzh);
                return true;
            case 12:
                String strZzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(strZzr);
                return true;
            case 13:
                zzx();
                parcel2.writeNoException();
                return true;
            case 14:
                InterfaceC7224Qg interfaceC7224QgZzi = zzi();
                parcel2.writeNoException();
                C9097ob.f(parcel2, interfaceC7224QgZzi);
                return true;
            case 15:
                Bundle bundle = (Bundle) C9097ob.a(parcel, Bundle.CREATOR);
                C9097ob.c(parcel);
                g5(bundle);
                parcel2.writeNoException();
                return true;
            case 16:
                Bundle bundle2 = (Bundle) C9097ob.a(parcel, Bundle.CREATOR);
                C9097ob.c(parcel);
                boolean zK3 = K3(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zK3 ? 1 : 0);
                return true;
            case 17:
                Bundle bundle3 = (Bundle) C9097ob.a(parcel, Bundle.CREATOR);
                C9097ob.c(parcel);
                r6(bundle3);
                parcel2.writeNoException();
                return true;
            case 18:
                com.google.android.gms.dynamic.b bVarZzm = zzm();
                parcel2.writeNoException();
                C9097ob.f(parcel2, bVarZzm);
                return true;
            case 19:
                com.google.android.gms.dynamic.b bVarZzl = zzl();
                parcel2.writeNoException();
                C9097ob.f(parcel2, bVarZzl);
                return true;
            case 20:
                Bundle bundleZzf = zzf();
                parcel2.writeNoException();
                C9097ob.e(parcel2, bundleZzf);
                return true;
            case 21:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c7192Ph = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    if (iInterfaceQueryLocalInterface instanceof InterfaceC7226Qh) {
                        c7192Ph = (InterfaceC7226Qh) iInterfaceQueryLocalInterface;
                    } else {
                        c7192Ph = new C7192Ph(strongBinder);
                    }
                }
                C9097ob.c(parcel);
                H2(c7192Ph);
                parcel2.writeNoException();
                return true;
            case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                zzw();
                parcel2.writeNoException();
                return true;
            case 23:
                List listZzv = zzv();
                parcel2.writeNoException();
                parcel2.writeList(listZzv);
                return true;
            case 24:
                boolean zH = h();
                parcel2.writeNoException();
                int i12 = C9097ob.f78241b;
                parcel2.writeInt(zH ? 1 : 0);
                return true;
            case 25:
                Oc.D0 d0B9 = Oc.C0.B9(parcel.readStrongBinder());
                C9097ob.c(parcel);
                Y4(d0B9);
                parcel2.writeNoException();
                return true;
            case 26:
                Oc.A0 a0B9 = AbstractBinderC4451z0.B9(parcel.readStrongBinder());
                C9097ob.c(parcel);
                S7(a0B9);
                parcel2.writeNoException();
                return true;
            case 27:
                e();
                parcel2.writeNoException();
                return true;
            case 28:
                v();
                parcel2.writeNoException();
                return true;
            case 29:
                InterfaceC7360Ug interfaceC7360UgZzj = zzj();
                parcel2.writeNoException();
                C9097ob.f(parcel2, interfaceC7360UgZzj);
                return true;
            case 30:
                boolean zG = g();
                parcel2.writeNoException();
                int i13 = C9097ob.f78241b;
                parcel2.writeInt(zG ? 1 : 0);
                return true;
            case 31:
                Oc.U0 u0Zzg = zzg();
                parcel2.writeNoException();
                C9097ob.f(parcel2, u0Zzg);
                return true;
            case com.medallia.digital.mobilesdk.l3.f93325e /* 32 */:
                Oc.N0 n0B9 = Oc.M0.B9(parcel.readStrongBinder());
                C9097ob.c(parcel);
                N8(n0B9);
                parcel2.writeNoException();
                return true;
            case 33:
                Bundle bundle4 = (Bundle) C9097ob.a(parcel, Bundle.CREATOR);
                C9097ob.c(parcel);
                e7(bundle4);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
