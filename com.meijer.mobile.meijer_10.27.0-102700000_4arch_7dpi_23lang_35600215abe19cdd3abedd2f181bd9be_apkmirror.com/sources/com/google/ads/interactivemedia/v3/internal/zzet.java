package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes4.dex */
public final class zzet implements zzeu {
    private final com.google.ads.interactivemedia.v3.impl.zzba zza;
    private final Context zzb;
    private final ExecutorService zzc;
    private final zzes zze;
    private final zzfd zzf;
    private Future zzd = null;
    private SharedPreferences.OnSharedPreferenceChangeListener zzg = null;

    public zzet(com.google.ads.interactivemedia.v3.impl.zzba zzbaVar, Context context, ExecutorService executorService, zzes zzesVar, zzfd zzfdVar) {
        this.zza = zzbaVar;
        this.zzb = context;
        this.zzc = executorService;
        this.zze = zzesVar;
        this.zzf = zzfdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Future zzf() {
        if (!this.zze.zzb) {
            return zzuk.zzb(Boolean.FALSE);
        }
        return zzuk.zzc(this.zza.zzd(zza()), new zzpz() { // from class: com.google.ads.interactivemedia.v3.internal.zzeq
            @Override // com.google.ads.interactivemedia.v3.internal.zzpz
            public final Object zza(Object obj) {
                return (Boolean) ((zzqf) obj).zza(new zzpz() { // from class: com.google.ads.interactivemedia.v3.internal.zzep
                    @Override // com.google.ads.interactivemedia.v3.internal.zzpz
                    public final Object zza(Object obj2) {
                        return Boolean.valueOf(Boolean.parseBoolean((String) obj2));
                    }
                }).zzc(Boolean.TRUE);
            }
        }, this.zzc);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0074 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map zza() {
        /*
            r11 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            android.content.Context r1 = r11.zzb
            android.content.SharedPreferences r1 = k4.b.a(r1)
            if (r1 != 0) goto Lf
            goto La8
        Lf:
            com.google.ads.interactivemedia.v3.internal.zzes r2 = r11.zze
            com.google.ads.interactivemedia.v3.internal.zzrp r2 = com.google.ads.interactivemedia.v3.internal.zzes.zzb(r2)
            com.google.ads.interactivemedia.v3.internal.zzrr r2 = r2.entrySet()
            com.google.ads.interactivemedia.v3.internal.zzss r2 = r2.iterator()
        L1d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto La8
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            boolean r5 = r1.contains(r4)
            if (r5 == 0) goto L1d
            int r5 = r3.hashCode()     // Catch: java.lang.ClassCastException -> L85
            r6 = -1950496919(0xffffffff8bbdc769, float:-7.310019E-32)
            r7 = -1
            r8 = 1
            r9 = 0
            r10 = 2
            if (r5 == r6) goto L67
            r6 = -1808118735(0xffffffff943a4c31, float:-9.405626E-27)
            if (r5 == r6) goto L5d
            r6 = 1729365000(0x67140408, float:6.989846E23)
            if (r5 == r6) goto L53
            goto L71
        L53:
            java.lang.String r5 = "Boolean"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L71
            r3 = r10
            goto L72
        L5d:
            java.lang.String r5 = "String"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L71
            r3 = r9
            goto L72
        L67:
            java.lang.String r5 = "Number"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L71
            r3 = r8
            goto L72
        L71:
            r3 = r7
        L72:
            if (r3 == 0) goto L93
            if (r3 == r8) goto L87
            if (r3 == r10) goto L79
            goto L1d
        L79:
            boolean r3 = r1.getBoolean(r4, r9)     // Catch: java.lang.ClassCastException -> L85
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.ClassCastException -> L85
            r0.put(r4, r3)     // Catch: java.lang.ClassCastException -> L85
            goto L1d
        L85:
            r3 = move-exception
            goto L9d
        L87:
            int r3 = r1.getInt(r4, r7)     // Catch: java.lang.ClassCastException -> L85
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.ClassCastException -> L85
            r0.put(r4, r3)     // Catch: java.lang.ClassCastException -> L85
            goto L1d
        L93:
            java.lang.String r3 = ""
            java.lang.String r3 = r1.getString(r4, r3)     // Catch: java.lang.ClassCastException -> L85
            r0.put(r4, r3)     // Catch: java.lang.ClassCastException -> L85
            goto L1d
        L9d:
            com.google.ads.interactivemedia.v3.internal.zzfd r4 = r11.zzf
            com.google.ads.interactivemedia.v3.impl.data.zzbp r5 = com.google.ads.interactivemedia.v3.impl.data.zzbp.IDENTITY_MANAGER
            com.google.ads.interactivemedia.v3.impl.data.zzbq r6 = com.google.ads.interactivemedia.v3.impl.data.zzbq.GET_CONSENT_SETTINGS
            r4.zzg(r5, r6, r3)
            goto L1d
        La8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzet.zza():java.util.Map");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzeu
    public final Future zzc() {
        if (this.zzd == null) {
            this.zzf.zzg(com.google.ads.interactivemedia.v3.impl.data.zzbp.IDENTITY_MANAGER, com.google.ads.interactivemedia.v3.impl.data.zzbq.GET_IDLESS_STATE, new IllegalStateException("idLessState must be defined"));
            zze();
        }
        return this.zzd;
    }

    public final void zze() {
        this.zzd = zzf();
        SharedPreferences sharedPreferencesA = k4.b.a(this.zzb.getApplicationContext());
        zzer zzerVar = new zzer(this);
        this.zzg = zzerVar;
        sharedPreferencesA.registerOnSharedPreferenceChangeListener(zzerVar);
    }
}
