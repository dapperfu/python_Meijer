package com.google.ads.interactivemedia.v3.impl;

import Vd.AbstractC5516j;
import Vd.C5517k;
import Vd.C5519m;
import android.content.Context;
import android.os.RemoteException;
import com.google.ads.interactivemedia.v3.internal.zznf;
import com.google.ads.interactivemedia.v3.internal.zzng;
import com.google.ads.interactivemedia.v3.internal.zznm;
import com.google.ads.interactivemedia.v3.internal.zzpo;
import com.google.android.gms.common.api.ApiException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import jd.AbstractC14995s;
import jd.InterfaceC14993p;

/* loaded from: classes4.dex */
final class zzbr implements zzbq {
    private final zznf zza;
    private final com.google.ads.interactivemedia.v3.impl.data.zzbn zzb;

    @Override // com.google.ads.interactivemedia.v3.impl.zzbq
    public final com.google.ads.interactivemedia.v3.impl.data.zzbz zza(com.google.ads.interactivemedia.v3.impl.data.zzby zzbyVar) {
        AbstractC5516j abstractC5516jDoRead;
        try {
            com.google.ads.interactivemedia.v3.impl.data.zzbx zzbxVarRequestType = zzbyVar.requestType();
            com.google.ads.interactivemedia.v3.impl.data.zzbx zzbxVar = com.google.ads.interactivemedia.v3.impl.data.zzbx.GET;
            final int i10 = zzbxVarRequestType == zzbxVar ? 0 : 1;
            final String strUrl = zzbyVar.url();
            final String strContent = zzbyVar.content();
            if (strUrl != null && (zzbxVarRequestType == zzbxVar || strContent != null)) {
                zznf zznfVar = this.zza;
                if (this.zzb.isLimitedAdTracking()) {
                    abstractC5516jDoRead = C5519m.e(new zzng(8));
                } else {
                    final zznm zznmVar = (zznm) zznfVar;
                    abstractC5516jDoRead = ((zznm) zznfVar).doRead(AbstractC14995s.a().d(zzpo.zzb).c(false).b(new InterfaceC14993p() { // from class: com.google.ads.interactivemedia.v3.internal.zznh
                        @Override // jd.InterfaceC14993p
                        public final void accept(Object obj, Object obj2) throws RemoteException {
                            ((zzna) ((zznn) obj).getService()).zze(new zznb(strUrl, i10, strContent), new zznl(zznmVar, (C5517k) obj2));
                        }
                    }).a());
                }
                return com.google.ads.interactivemedia.v3.impl.data.zzbz.forResponse(zzbyVar.id(), (String) C5519m.b(abstractC5516jDoRead, zzbyVar.connectionTimeoutMs() + zzbyVar.readTimeoutMs(), TimeUnit.MILLISECONDS));
            }
            return com.google.ads.interactivemedia.v3.impl.data.zzbz.forError(zzbyVar.id(), 100);
        } catch (InterruptedException | TimeoutException unused) {
            return com.google.ads.interactivemedia.v3.impl.data.zzbz.forError(zzbyVar.id(), 101);
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof zzng) {
                return com.google.ads.interactivemedia.v3.impl.data.zzbz.forError(zzbyVar.id(), ((zzng) cause).zza());
            }
            return cause instanceof ApiException ? com.google.ads.interactivemedia.v3.impl.data.zzbz.forError(zzbyVar.id(), 102) : com.google.ads.interactivemedia.v3.impl.data.zzbz.forError(zzbyVar.id(), 100);
        }
    }

    zzbr(Context context, com.google.ads.interactivemedia.v3.impl.data.zzbn zzbnVar) {
        this.zza = new zznm(context);
        this.zzb = zzbnVar;
    }
}
