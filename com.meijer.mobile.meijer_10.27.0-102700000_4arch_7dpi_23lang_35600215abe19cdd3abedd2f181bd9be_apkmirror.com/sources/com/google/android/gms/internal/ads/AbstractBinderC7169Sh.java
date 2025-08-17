package com.google.android.gms.internal.ads;

import Mc.AbstractBinderC4173z0;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Sh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC7169Sh extends BinderC8865nb implements InterfaceC7203Th {
    public AbstractBinderC7169Sh() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.BinderC8865nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        InterfaceC7101Qh c7067Ph;
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
                InterfaceC7334Xg interfaceC7334XgZzk = zzk();
                parcel2.writeNoException();
                C8972ob.f(parcel2, interfaceC7334XgZzk);
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
                Mc.Y0 y0Zzh = zzh();
                parcel2.writeNoException();
                C8972ob.f(parcel2, y0Zzh);
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
                InterfaceC7099Qg interfaceC7099QgZzi = zzi();
                parcel2.writeNoException();
                C8972ob.f(parcel2, interfaceC7099QgZzi);
                return true;
            case 15:
                Bundle bundle = (Bundle) C8972ob.a(parcel, Bundle.CREATOR);
                C8972ob.c(parcel);
                T4(bundle);
                parcel2.writeNoException();
                return true;
            case 16:
                Bundle bundle2 = (Bundle) C8972ob.a(parcel, Bundle.CREATOR);
                C8972ob.c(parcel);
                boolean zY3 = y3(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zY3 ? 1 : 0);
                return true;
            case 17:
                Bundle bundle3 = (Bundle) C8972ob.a(parcel, Bundle.CREATOR);
                C8972ob.c(parcel);
                c6(bundle3);
                parcel2.writeNoException();
                return true;
            case 18:
                com.google.android.gms.dynamic.b bVarZzm = zzm();
                parcel2.writeNoException();
                C8972ob.f(parcel2, bVarZzm);
                return true;
            case 19:
                com.google.android.gms.dynamic.b bVarZzl = zzl();
                parcel2.writeNoException();
                C8972ob.f(parcel2, bVarZzl);
                return true;
            case 20:
                Bundle bundleZzf = zzf();
                parcel2.writeNoException();
                C8972ob.e(parcel2, bundleZzf);
                return true;
            case 21:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c7067Ph = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    if (iInterfaceQueryLocalInterface instanceof InterfaceC7101Qh) {
                        c7067Ph = (InterfaceC7101Qh) iInterfaceQueryLocalInterface;
                    } else {
                        c7067Ph = new C7067Ph(strongBinder);
                    }
                }
                C8972ob.c(parcel);
                E2(c7067Ph);
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
                boolean zG = g();
                parcel2.writeNoException();
                int i12 = C8972ob.f77401b;
                parcel2.writeInt(zG ? 1 : 0);
                return true;
            case 25:
                Mc.D0 d0B9 = Mc.C0.B9(parcel.readStrongBinder());
                C8972ob.c(parcel);
                i4(d0B9);
                parcel2.writeNoException();
                return true;
            case 26:
                Mc.A0 a0B9 = AbstractBinderC4173z0.B9(parcel.readStrongBinder());
                C8972ob.c(parcel);
                Q5(a0B9);
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
                InterfaceC7235Ug interfaceC7235UgZzj = zzj();
                parcel2.writeNoException();
                C8972ob.f(parcel2, interfaceC7235UgZzj);
                return true;
            case 30:
                boolean zF = f();
                parcel2.writeNoException();
                int i13 = C8972ob.f77401b;
                parcel2.writeInt(zF ? 1 : 0);
                return true;
            case 31:
                Mc.U0 u0Zzg = zzg();
                parcel2.writeNoException();
                C8972ob.f(parcel2, u0Zzg);
                return true;
            case com.medallia.digital.mobilesdk.l3.f92486e /* 32 */:
                Mc.N0 n0B9 = Mc.M0.B9(parcel.readStrongBinder());
                C8972ob.c(parcel);
                m9(n0B9);
                parcel2.writeNoException();
                return true;
            case 33:
                Bundle bundle4 = (Bundle) C8972ob.a(parcel, Bundle.CREATOR);
                C8972ob.c(parcel);
                T6(bundle4);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
