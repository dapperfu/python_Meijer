package com.google.ads.interactivemedia.v3.internal;

import android.util.Base64;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes4.dex */
public final class zzfd {
    private final com.google.ads.interactivemedia.v3.impl.zzbi zzb;
    private final zzfj zzc;
    private final Queue zza = new ConcurrentLinkedQueue();
    private int zzd = 1;

    public final zzahj zzb() {
        return this.zzc.zzb();
    }

    private final void zzi(com.google.ads.interactivemedia.v3.impl.data.zzbr zzbrVar) {
        JavaScriptMessage javaScriptMessage = new JavaScriptMessage(JavaScriptMessage.MsgChannel.adsLoader, JavaScriptMessage.MsgType.nativeInstrumentation, "*", zzbrVar);
        int i10 = this.zzd;
        int i11 = i10 - 1;
        if (i10 == 0) {
            throw null;
        }
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            this.zzb.zzn(javaScriptMessage);
        } else if (this.zza.size() > 6) {
            this.zzd = 3;
        } else {
            this.zza.add(javaScriptMessage);
        }
    }

    public final zzahj zzc(String str) {
        return this.zzc.zzc(str);
    }

    public final void zzd() {
        this.zzc.zzd();
    }

    public final void zze(String str) {
        zzqf zzqfVarZza = this.zzc.zza(str);
        if (zzqfVarZza.zze()) {
            zzahe zzaheVar = (zzahe) zzqfVarZza.zzb();
            zzi(com.google.ads.interactivemedia.v3.impl.data.zzbr.create(System.currentTimeMillis(), com.google.ads.interactivemedia.v3.impl.data.zzbp.LATENCY_MEASUREMENT_TRACKER, com.google.ads.interactivemedia.v3.impl.data.zzbq.FLUSH_LATENCY_MEASUREMENT, Base64.encodeToString(zzaheVar.zzav(), 0)));
            this.zzc.zze(str);
        }
    }

    public final void zzh(boolean z10) {
        if (!z10) {
            this.zzd = 3;
            this.zza.clear();
            return;
        }
        this.zzd = 2;
        JavaScriptMessage javaScriptMessage = (JavaScriptMessage) this.zza.poll();
        while (javaScriptMessage != null) {
            this.zzb.zzn(javaScriptMessage);
            javaScriptMessage = (JavaScriptMessage) this.zza.poll();
        }
    }

    public zzfd(com.google.ads.interactivemedia.v3.impl.zzbi zzbiVar, zzfj zzfjVar) {
        this.zzb = zzbiVar;
        this.zzc = zzfjVar;
    }

    public static zzahh zza(long j10, long j11) {
        zzahg zzahgVarZzc = zzahh.zzc();
        zzahgVarZzc.zzb(j10);
        zzahgVarZzc.zza(j11);
        return (zzahh) zzahgVarZzc.zzal();
    }

    public final void zzf(AdErrorEvent adErrorEvent) {
        zzi(com.google.ads.interactivemedia.v3.impl.data.zzbr.create(System.currentTimeMillis(), adErrorEvent));
    }

    public final void zzg(com.google.ads.interactivemedia.v3.impl.data.zzbp zzbpVar, com.google.ads.interactivemedia.v3.impl.data.zzbq zzbqVar, Exception exc) {
        zzi(com.google.ads.interactivemedia.v3.impl.data.zzbr.create(System.currentTimeMillis(), zzbpVar, zzbqVar, exc));
    }
}
