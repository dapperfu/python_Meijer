package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
final class zzou implements zznw {
    private final Object zza;
    private final zzov zzb;
    private final zzpg zzc;
    private final zznt zzd;

    zzou(Object obj, zzov zzovVar, zzpg zzpgVar, zznt zzntVar) {
        this.zza = obj;
        this.zzb = zzovVar;
        this.zzc = zzpgVar;
        this.zzd = zzntVar;
    }

    private final synchronized byte[] zzj(Map map, Map map2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e10) {
            this.zzd.zzc(2007, System.currentTimeMillis() - jCurrentTimeMillis, e10);
            return null;
        }
        return (byte[]) this.zza.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.zza, null, map2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zznw
    public final synchronized String zza(Context context, String str, String str2, View view, Activity activity) {
        Map mapZza;
        mapZza = this.zzc.zza();
        mapZza.put("f", "c");
        mapZza.put("ctx", context);
        mapZza.put("cs", str2);
        mapZza.put("aid", null);
        mapZza.put("view", view);
        mapZza.put("act", activity);
        return zzi(zzj(null, mapZza));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zznw
    public final synchronized String zzb(Context context, String str, View view, Activity activity) {
        Map mapZzc;
        mapZzc = this.zzc.zzc();
        mapZzc.put("f", "v");
        mapZzc.put("ctx", context);
        mapZzc.put("aid", null);
        mapZzc.put("view", view);
        mapZzc.put("act", activity);
        return zzi(zzj(null, mapZzc));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zznw
    public final synchronized String zzc(Context context, String str) {
        Map mapZzb;
        mapZzb = this.zzc.zzb();
        mapZzb.put("f", "q");
        mapZzb.put("ctx", context);
        mapZzb.put("aid", null);
        return zzi(zzj(null, mapZzb));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zznw
    public final synchronized void zzd(String str, MotionEvent motionEvent) throws zzpe {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            HashMap map = new HashMap();
            map.put("t", new Throwable());
            map.put("aid", null);
            map.put("evt", motionEvent);
            this.zza.getClass().getDeclaredMethod("he", Map.class).invoke(this.zza, map);
            this.zzd.zzd(3003, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e10) {
            throw new zzpe(2005, e10);
        }
    }

    public final synchronized int zze() throws zzpe {
        try {
        } catch (Exception e10) {
            throw new zzpe(2006, e10);
        }
        return ((Integer) this.zza.getClass().getDeclaredMethod("lcs", null).invoke(this.zza, null)).intValue();
    }

    final zzov zzf() {
        return this.zzb;
    }

    public final synchronized void zzg() throws zzpe {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.zza.getClass().getDeclaredMethod("close", null).invoke(this.zza, null);
            this.zzd.zzd(3001, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e10) {
            throw new zzpe(2003, e10);
        }
    }

    final synchronized boolean zzh() throws zzpe {
        try {
        } catch (Exception e10) {
            throw new zzpe(2001, e10);
        }
        return ((Boolean) this.zza.getClass().getDeclaredMethod("init", null).invoke(this.zza, null)).booleanValue();
    }

    private static String zzi(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        zzcg zzcgVarZza = zzch.zza();
        zzcgVarZza.zzc(5);
        zzcgVarZza.zza(zzacw.zzp(bArr, 0, bArr.length));
        return Base64.encodeToString(((zzch) zzcgVarZza.zzal()).zzav(), 11);
    }
}
