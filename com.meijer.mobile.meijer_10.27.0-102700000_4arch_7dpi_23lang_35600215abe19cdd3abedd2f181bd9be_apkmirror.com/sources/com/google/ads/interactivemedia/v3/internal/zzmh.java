package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.ConditionVariable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class zzmh implements SharedPreferences.OnSharedPreferenceChangeListener {
    private Context zzg;
    private final Object zzb = new Object();
    private final ConditionVariable zzc = new ConditionVariable();
    private volatile boolean zzd = false;
    volatile boolean zza = false;
    private SharedPreferences zze = null;
    private Bundle zzf = new Bundle();
    private JSONObject zzh = new JSONObject();
    private boolean zzi = false;
    private boolean zzj = false;

    final boolean zzd() {
        return this.zzi;
    }

    private final void zze(final SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        try {
            this.zzh = new JSONObject((String) zzmk.zza(new zzqn() { // from class: com.google.ads.interactivemedia.v3.internal.zzme
                @Override // com.google.ads.interactivemedia.v3.internal.zzqn
                public final Object zza() {
                    return sharedPreferences.getString("flag_configuration", "{}");
                }
            }));
        } catch (JSONException unused) {
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            zze(sharedPreferences);
        }
    }

    public final Object zza(final zzma zzmaVar) {
        if (!this.zzc.block(5000L)) {
            synchronized (this.zzb) {
                try {
                    if (!this.zza) {
                        throw new IllegalStateException("Flags.initialize() was not called!");
                    }
                } finally {
                }
            }
        }
        if (!this.zzd || this.zze == null || this.zzj) {
            synchronized (this.zzb) {
                if (this.zzd && this.zze != null && !this.zzj) {
                }
                return zzmaVar.zzi();
            }
        }
        if (zzmaVar.zzd() != 2) {
            return (zzmaVar.zzd() == 1 && this.zzh.has(zzmaVar.zzj())) ? zzmaVar.zza(this.zzh) : zzmk.zza(new zzqn() { // from class: com.google.ads.interactivemedia.v3.internal.zzmf
                @Override // com.google.ads.interactivemedia.v3.internal.zzqn
                public final Object zza() {
                    return this.zza.zzb(zzmaVar);
                }
            });
        }
        Bundle bundle = this.zzf;
        return bundle == null ? zzmaVar.zzi() : zzmaVar.zzb(bundle);
    }

    final /* synthetic */ Object zzb(zzma zzmaVar) {
        return zzmaVar.zzc(this.zze);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a9 A[Catch: all -> 0x0058, TRY_ENTER, TryCatch #0 {all -> 0x0058, blocks: (B:22:0x0046, B:25:0x0050, B:31:0x005d, B:34:0x0068, B:35:0x0070, B:37:0x0076, B:39:0x0086, B:41:0x009b, B:45:0x00a9, B:47:0x00ad, B:49:0x00bd, B:51:0x00d2, B:54:0x00de, B:64:0x011d, B:68:0x012a, B:70:0x0141, B:72:0x0145, B:73:0x0148, B:57:0x00ef, B:59:0x00fd, B:61:0x0105, B:62:0x0110), top: B:83:0x0046, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00de A[Catch: all -> 0x0058, TRY_ENTER, TryCatch #0 {all -> 0x0058, blocks: (B:22:0x0046, B:25:0x0050, B:31:0x005d, B:34:0x0068, B:35:0x0070, B:37:0x0076, B:39:0x0086, B:41:0x009b, B:45:0x00a9, B:47:0x00ad, B:49:0x00bd, B:51:0x00d2, B:54:0x00de, B:64:0x011d, B:68:0x012a, B:70:0x0141, B:72:0x0145, B:73:0x0148, B:57:0x00ef, B:59:0x00fd, B:61:0x0105, B:62:0x0110), top: B:83:0x0046, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0121 A[Catch: all -> 0x000f, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x000f, blocks: (B:7:0x0009, B:9:0x000d, B:13:0x0012, B:15:0x0017, B:16:0x0019, B:18:0x002b, B:19:0x002f, B:20:0x0031, B:42:0x009f, B:43:0x00a6, B:52:0x00d6, B:66:0x0121, B:74:0x014f, B:75:0x0156, B:77:0x0158, B:78:0x015f, B:22:0x0046, B:25:0x0050, B:31:0x005d, B:34:0x0068, B:35:0x0070, B:37:0x0076, B:39:0x0086, B:41:0x009b, B:45:0x00a9, B:47:0x00ad, B:49:0x00bd, B:51:0x00d2, B:54:0x00de, B:64:0x011d, B:68:0x012a, B:70:0x0141, B:72:0x0145, B:73:0x0148, B:57:0x00ef, B:59:0x00fd, B:61:0x0105, B:62:0x0110), top: B:88:0x0009, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012a A[Catch: all -> 0x0058, TRY_ENTER, TryCatch #0 {all -> 0x0058, blocks: (B:22:0x0046, B:25:0x0050, B:31:0x005d, B:34:0x0068, B:35:0x0070, B:37:0x0076, B:39:0x0086, B:41:0x009b, B:45:0x00a9, B:47:0x00ad, B:49:0x00bd, B:51:0x00d2, B:54:0x00de, B:64:0x011d, B:68:0x012a, B:70:0x0141, B:72:0x0145, B:73:0x0148, B:57:0x00ef, B:59:0x00fd, B:61:0x0105, B:62:0x0110), top: B:83:0x0046, outer: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzc(android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzmh.zzc(android.content.Context):void");
    }
}
