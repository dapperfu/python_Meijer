package com.google.ads.interactivemedia.v3.impl;

import Td.AbstractC5232j;
import Td.C5233k;
import Td.C5235m;
import android.content.Context;
import android.os.RemoteException;
import com.google.ads.interactivemedia.v3.internal.zznf;
import com.google.ads.interactivemedia.v3.internal.zzng;
import com.google.ads.interactivemedia.v3.internal.zznm;
import com.google.ads.interactivemedia.v3.internal.zzpo;
import com.google.android.gms.common.api.ApiException;
import hd.AbstractC14417s;
import hd.InterfaceC14415p;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes4.dex */
final class zzbr implements zzbq {
    private final zznf zza;
    private final com.google.ads.interactivemedia.v3.impl.data.zzbn zzb;

    @Override // com.google.ads.interactivemedia.v3.impl.zzbq
    public final com.google.ads.interactivemedia.v3.impl.data.zzbz zza(com.google.ads.interactivemedia.v3.impl.data.zzby zzbyVar) {
        AbstractC5232j abstractC5232jDoRead;
        try {
            com.google.ads.interactivemedia.v3.impl.data.zzbx zzbxVarRequestType = zzbyVar.requestType();
            com.google.ads.interactivemedia.v3.impl.data.zzbx zzbxVar = com.google.ads.interactivemedia.v3.impl.data.zzbx.GET;
            final int i10 = zzbxVarRequestType == zzbxVar ? 0 : 1;
            final String strUrl = zzbyVar.url();
            final String strContent = zzbyVar.content();
            if (strUrl != null && (zzbxVarRequestType == zzbxVar || strContent != null)) {
                zznf zznfVar = this.zza;
                if (this.zzb.isLimitedAdTracking()) {
                    abstractC5232jDoRead = C5235m.e(new zzng(8));
                } else {
                    final zznm zznmVar = (zznm) zznfVar;
                    abstractC5232jDoRead = ((zznm) zznfVar).doRead(AbstractC14417s.a().d(zzpo.zzb).c(false).b(new InterfaceC14415p() { // from class: com.google.ads.interactivemedia.v3.internal.zznh
                        @Override // hd.InterfaceC14415p
                        public final void accept(Object obj, Object obj2) throws RemoteException {
                            ((zzna) ((zznn) obj).getService()).zze(new zznb(strUrl, i10, strContent), new zznl(zznmVar, (C5233k) obj2));
                        }
                    }).a());
                }
                return com.google.ads.interactivemedia.v3.impl.data.zzbz.forResponse(zzbyVar.id(), (String) C5235m.b(abstractC5232jDoRead, zzbyVar.connectionTimeoutMs() + zzbyVar.readTimeoutMs(), TimeUnit.MILLISECONDS));
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
