package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.kh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC8556kh extends BinderC8865nb implements InterfaceC8663lh {
    public AbstractBinderC8556kh() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    @Override // com.google.android.gms.internal.ads.BinderC8865nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 2:
                com.google.android.gms.dynamic.b bVarZzh = zzh();
                parcel2.writeNoException();
                C8972ob.f(parcel2, bVarZzh);
                return true;
            case 3:
                String strZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeString(strZzk);
                return true;
            case 4:
                List listZzo = zzo();
                parcel2.writeNoException();
                parcel2.writeList(listZzo);
                return true;
            case 5:
                String strZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZzi);
                return true;
            case 6:
                InterfaceC7334Xg interfaceC7334XgZzf = zzf();
                parcel2.writeNoException();
                C8972ob.f(parcel2, interfaceC7334XgZzf);
                return true;
            case 7:
                String strZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 8:
                double dZzb = zzb();
                parcel2.writeNoException();
                parcel2.writeDouble(dZzb);
                return true;
            case 9:
                String strZzn = zzn();
                parcel2.writeNoException();
                parcel2.writeString(strZzn);
                return true;
            case 10:
                String strZzm = zzm();
                parcel2.writeNoException();
                parcel2.writeString(strZzm);
                return true;
            case 11:
                Bundle bundleZzc = zzc();
                parcel2.writeNoException();
                C8972ob.e(parcel2, bundleZzc);
                return true;
            case 12:
                zzp();
                parcel2.writeNoException();
                return true;
            case 13:
                Mc.Y0 y0Zzd = zzd();
                parcel2.writeNoException();
                C8972ob.f(parcel2, y0Zzd);
                return true;
            case 14:
                Bundle bundle = (Bundle) C8972ob.a(parcel, Bundle.CREATOR);
                C8972ob.c(parcel);
                u(bundle);
                parcel2.writeNoException();
                return true;
            case 15:
                Bundle bundle2 = (Bundle) C8972ob.a(parcel, Bundle.CREATOR);
                C8972ob.c(parcel);
                boolean zF0 = F0(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zF0 ? 1 : 0);
                return true;
            case 16:
                Bundle bundle3 = (Bundle) C8972ob.a(parcel, Bundle.CREATOR);
                C8972ob.c(parcel);
                J0(bundle3);
                parcel2.writeNoException();
                return true;
            case 17:
                InterfaceC7099Qg interfaceC7099QgZze = zze();
                parcel2.writeNoException();
                C8972ob.f(parcel2, interfaceC7099QgZze);
                return true;
            case 18:
                com.google.android.gms.dynamic.b bVarZzg = zzg();
                parcel2.writeNoException();
                C8972ob.f(parcel2, bVarZzg);
                return true;
            case 19:
                String strZzl = zzl();
                parcel2.writeNoException();
                parcel2.writeString(strZzl);
                return true;
            default:
                return false;
        }
    }
}
