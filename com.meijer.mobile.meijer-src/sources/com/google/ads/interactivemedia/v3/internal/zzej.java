package com.google.ads.interactivemedia.v3.internal;

import Vd.C5517k;
import Vd.C5519m;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import jd.AbstractC14995s;
import jd.InterfaceC14993p;

/* loaded from: classes4.dex */
public final class zzej {
    private final zznf zza;
    private final zzfd zzb;
    private final int zzc;

    public final String zza(com.google.ads.interactivemedia.v3.impl.zzau zzauVar, String str) {
        if (this.zzc <= 0) {
            zzfk.zzc("AdsIdentityTokenLoader: invalid parameter for gksTimeoutMs");
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            final Bundle bundle = new Bundle();
            if (zzauVar != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("x-afma-token-requester-type", zzauVar.toString());
                bundle.putBundle("extra_headers", bundle2);
            }
            zznf zznfVar = this.zza;
            final zznm zznmVar = (zznm) zznfVar;
            return (String) C5519m.b(((zznm) zznfVar).doRead(AbstractC14995s.a().c(false).d(zzpo.zza).b(new InterfaceC14993p() { // from class: com.google.ads.interactivemedia.v3.internal.zzni
                @Override // jd.InterfaceC14993p
                public final void accept(Object obj, Object obj2) throws RemoteException {
                    ((zzna) ((zznn) obj).getService()).zzf(bundle, new zznk(zznmVar, (C5517k) obj2));
                }
            }).a()), this.zzc, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            e = e10;
            this.zzb.zzg(com.google.ads.interactivemedia.v3.impl.data.zzbp.ADS_IDENTITY_TOKEN_LOADER, com.google.ads.interactivemedia.v3.impl.data.zzbq.GET_ADSIDENTITY_TOKEN, e);
            this.zzb.zzc(str).zzk(zzfd.zza(jCurrentTimeMillis, System.currentTimeMillis()));
            return "";
        } catch (ExecutionException e11) {
            e = e11;
            this.zzb.zzg(com.google.ads.interactivemedia.v3.impl.data.zzbp.ADS_IDENTITY_TOKEN_LOADER, com.google.ads.interactivemedia.v3.impl.data.zzbq.GET_ADSIDENTITY_TOKEN, e);
            this.zzb.zzc(str).zzk(zzfd.zza(jCurrentTimeMillis, System.currentTimeMillis()));
            return "";
        } catch (TimeoutException e12) {
            e = e12;
            this.zzb.zzg(com.google.ads.interactivemedia.v3.impl.data.zzbp.ADS_IDENTITY_TOKEN_LOADER, com.google.ads.interactivemedia.v3.impl.data.zzbq.GET_ADSIDENTITY_TOKEN, e);
            this.zzb.zzc(str).zzk(zzfd.zza(jCurrentTimeMillis, System.currentTimeMillis()));
            return "";
        }
    }

    public zzej(zzei zzeiVar) {
        this.zza = new zznm(zzeiVar.zza);
        this.zzb = zzeiVar.zzc;
        this.zzc = zzeiVar.zzb;
    }
}
