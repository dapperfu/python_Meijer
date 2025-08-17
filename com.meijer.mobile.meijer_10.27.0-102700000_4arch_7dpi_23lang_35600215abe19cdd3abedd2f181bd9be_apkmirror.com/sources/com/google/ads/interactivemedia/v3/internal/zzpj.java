package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.fullstory.FS;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* loaded from: classes4.dex */
public final class zzpj {
    final zzpm zza;
    final boolean zzb;

    private zzpj(zzpm zzpmVar) {
        this.zza = zzpmVar;
        this.zzb = zzpmVar != null;
    }

    public final zzpi zza(byte[] bArr) {
        return new zzpi(this, bArr, null);
    }

    public static zzpj zzb(Context context, String str, String str2) throws zzon {
        zzpm zzpkVar;
        try {
            try {
                try {
                    IBinder iBinderD = DynamiteModule.e(context, DynamiteModule.f64996b, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (iBinderD == null) {
                        zzpkVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderD.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        zzpkVar = iInterfaceQueryLocalInterface instanceof zzpm ? (zzpm) iInterfaceQueryLocalInterface : new zzpk(iBinderD);
                    }
                    zzpkVar.zze(com.google.android.gms.dynamic.d.F2(context), str, null);
                    FS.log_i("GASS", "GassClearcutLogger Initialized.");
                    return new zzpj(zzpkVar);
                } catch (Exception e10) {
                    throw new zzon(e10);
                }
            } catch (Exception e11) {
                throw new zzon(e11);
            }
        } catch (RemoteException | zzon | NullPointerException | SecurityException unused) {
            FS.log_d("GASS", "Cannot dynamite load clearcut");
            return new zzpj(new zzpn());
        }
    }

    public static zzpj zzc() {
        zzpn zzpnVar = new zzpn();
        FS.log_d("GASS", "Clearcut logging disabled");
        return new zzpj(zzpnVar);
    }
}
