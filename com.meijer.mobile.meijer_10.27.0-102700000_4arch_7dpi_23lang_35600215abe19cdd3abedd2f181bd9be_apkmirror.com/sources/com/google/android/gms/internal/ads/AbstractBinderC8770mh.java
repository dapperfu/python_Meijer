package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.mh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC8770mh extends BinderC8865nb implements InterfaceC8877nh {
    public AbstractBinderC8770mh() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    @Override // com.google.android.gms.internal.ads.BinderC8865nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 2:
                com.google.android.gms.dynamic.b bVarZzg = zzg();
                parcel2.writeNoException();
                C8972ob.f(parcel2, bVarZzg);
                return true;
            case 3:
                String strZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeString(strZzk);
                return true;
            case 4:
                List listZzm = zzm();
                parcel2.writeNoException();
                parcel2.writeList(listZzm);
                return true;
            case 5:
                String strZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZzi);
                return true;
            case 6:
                InterfaceC7334Xg interfaceC7334XgZze = zze();
                parcel2.writeNoException();
                C8972ob.f(parcel2, interfaceC7334XgZze);
                return true;
            case 7:
                String strZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 8:
                String strZzh = zzh();
                parcel2.writeNoException();
                parcel2.writeString(strZzh);
                return true;
            case 9:
                Bundle bundleZzb = zzb();
                parcel2.writeNoException();
                C8972ob.e(parcel2, bundleZzb);
                return true;
            case 10:
                zzn();
                parcel2.writeNoException();
                return true;
            case 11:
                Mc.Y0 y0Zzc = zzc();
                parcel2.writeNoException();
                C8972ob.f(parcel2, y0Zzc);
                return true;
            case 12:
                Bundle bundle = (Bundle) C8972ob.a(parcel, Bundle.CREATOR);
                C8972ob.c(parcel);
                V(bundle);
                parcel2.writeNoException();
                return true;
            case 13:
                Bundle bundle2 = (Bundle) C8972ob.a(parcel, Bundle.CREATOR);
                C8972ob.c(parcel);
                boolean zU = u(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zU ? 1 : 0);
                return true;
            case 14:
                Bundle bundle3 = (Bundle) C8972ob.a(parcel, Bundle.CREATOR);
                C8972ob.c(parcel);
                T(bundle3);
                parcel2.writeNoException();
                return true;
            case 15:
                InterfaceC7099Qg interfaceC7099QgZzd = zzd();
                parcel2.writeNoException();
                C8972ob.f(parcel2, interfaceC7099QgZzd);
                return true;
            case 16:
                com.google.android.gms.dynamic.b bVarZzf = zzf();
                parcel2.writeNoException();
                C8972ob.f(parcel2, bVarZzf);
                return true;
            case 17:
                String strZzl = zzl();
                parcel2.writeNoException();
                parcel2.writeString(strZzl);
                return true;
            default:
                return false;
        }
    }
}
