package com.google.android.libraries.places.internal;

import com.medallia.digital.mobilesdk.q2;
import io.constructor.BuildConfig;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes6.dex */
final class zzbzg {
    private static final zzcbn zza;
    private static final zzbzd[] zzb;
    private static final Map zzc;

    static {
        zzcbn zzcbnVar = zzcbn.zza;
        zza = zzcbm.zza(":");
        zzbzd zzbzdVar = new zzbzd(zzbzd.zze, zzcbm.zza(""));
        zzcbn zzcbnVar2 = zzbzd.zzb;
        zzbzd zzbzdVar2 = new zzbzd(zzcbnVar2, zzcbm.zza("GET"));
        zzbzd zzbzdVar3 = new zzbzd(zzcbnVar2, zzcbm.zza("POST"));
        zzcbn zzcbnVar3 = zzbzd.zzc;
        zzbzd zzbzdVar4 = new zzbzd(zzcbnVar3, zzcbm.zza(q2.f92724c));
        zzbzd zzbzdVar5 = new zzbzd(zzcbnVar3, zzcbm.zza("/index.html"));
        zzcbn zzcbnVar4 = zzbzd.zzd;
        zzbzd zzbzdVar6 = new zzbzd(zzcbnVar4, zzcbm.zza("http"));
        zzbzd zzbzdVar7 = new zzbzd(zzcbnVar4, zzcbm.zza(BuildConfig.SERVICE_SCHEME));
        zzcbn zzcbnVar5 = zzbzd.zza;
        zzb = new zzbzd[]{zzbzdVar, zzbzdVar2, zzbzdVar3, zzbzdVar4, zzbzdVar5, zzbzdVar6, zzbzdVar7, new zzbzd(zzcbnVar5, zzcbm.zza("200")), new zzbzd(zzcbnVar5, zzcbm.zza("204")), new zzbzd(zzcbnVar5, zzcbm.zza("206")), new zzbzd(zzcbnVar5, zzcbm.zza("304")), new zzbzd(zzcbnVar5, zzcbm.zza("400")), new zzbzd(zzcbnVar5, zzcbm.zza("404")), new zzbzd(zzcbnVar5, zzcbm.zza("500")), new zzbzd("accept-charset", ""), new zzbzd("accept-encoding", "gzip, deflate"), new zzbzd("accept-language", ""), new zzbzd("accept-ranges", ""), new zzbzd("accept", ""), new zzbzd("access-control-allow-origin", ""), new zzbzd("age", ""), new zzbzd("allow", ""), new zzbzd("authorization", ""), new zzbzd("cache-control", ""), new zzbzd("content-disposition", ""), new zzbzd("content-encoding", ""), new zzbzd("content-language", ""), new zzbzd("content-length", ""), new zzbzd("content-location", ""), new zzbzd("content-range", ""), new zzbzd("content-type", ""), new zzbzd("cookie", ""), new zzbzd("date", ""), new zzbzd("etag", ""), new zzbzd("expect", ""), new zzbzd("expires", ""), new zzbzd("from", ""), new zzbzd("host", ""), new zzbzd("if-match", ""), new zzbzd("if-modified-since", ""), new zzbzd("if-none-match", ""), new zzbzd("if-range", ""), new zzbzd("if-unmodified-since", ""), new zzbzd("last-modified", ""), new zzbzd("link", ""), new zzbzd("location", ""), new zzbzd("max-forwards", ""), new zzbzd("proxy-authenticate", ""), new zzbzd("proxy-authorization", ""), new zzbzd("range", ""), new zzbzd("referer", ""), new zzbzd("refresh", ""), new zzbzd("retry-after", ""), new zzbzd("server", ""), new zzbzd("set-cookie", ""), new zzbzd("strict-transport-security", ""), new zzbzd("transfer-encoding", ""), new zzbzd("user-agent", ""), new zzbzd("vary", ""), new zzbzd("via", ""), new zzbzd("www-authenticate", "")};
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        int i10 = 0;
        while (true) {
            zzbzd[] zzbzdVarArr = zzb;
            int length = zzbzdVarArr.length;
            if (i10 >= 61) {
                zzc = Collections.unmodifiableMap(linkedHashMap);
                return;
            } else {
                if (!linkedHashMap.containsKey(zzbzdVarArr[i10].zzf)) {
                    linkedHashMap.put(zzbzdVarArr[i10].zzf, Integer.valueOf(i10));
                }
                i10++;
            }
        }
    }

    static /* synthetic */ zzcbn zza(zzcbn zzcbnVar) throws IOException {
        int iZzj = zzcbnVar.zzj();
        for (int i10 = 0; i10 < iZzj; i10++) {
            byte bZzi = zzcbnVar.zzi(i10);
            if (bZzi >= 65 && bZzi <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(zzcbnVar.zze()));
            }
        }
        return zzcbnVar;
    }
}
