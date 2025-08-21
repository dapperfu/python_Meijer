package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* loaded from: classes4.dex */
public final class zzez {
    private final Context zza;
    private final boolean zzb;
    private final long zzc;
    private final TestingConfiguration zzd;
    private final zzfd zze;
    private final zzew zzf;
    private final zzej zzg;

    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.ads.interactivemedia.v3.impl.data.zzbn zza(com.google.ads.interactivemedia.v3.api.BaseRequest r12, com.google.ads.interactivemedia.v3.internal.zzeu r13, java.lang.String r14) {
        /*
            r11 = this;
            java.lang.String r0 = ""
            java.lang.Boolean r13 = r11.zzb(r13)
            boolean r13 = r13.booleanValue()
            r1 = 0
            if (r13 == 0) goto Le
            return r1
        Le:
            r13 = 0
            android.content.Context r2 = r11.zza     // Catch: java.lang.Throwable -> L23
            Kc.a$a r2 = Kc.a.a(r2)     // Catch: java.lang.Throwable -> L23
            java.lang.String r3 = r2.a()     // Catch: java.lang.Throwable -> L23
            boolean r2 = r2.b()     // Catch: java.lang.Throwable -> L23
            java.lang.String r4 = "adid"
            r7 = r2
            r5 = r3
        L21:
            r6 = r4
            goto L4a
        L23:
            r2 = r13
            r3 = r0
        L25:
            android.content.Context r4 = r11.zza     // Catch: android.provider.Settings.SettingNotFoundException -> L42
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: android.provider.Settings.SettingNotFoundException -> L42
            java.lang.String r5 = "advertising_id"
            java.lang.String r5 = android.provider.Settings.Secure.getString(r4, r5)     // Catch: android.provider.Settings.SettingNotFoundException -> L42
            java.lang.String r6 = "limit_ad_tracking"
            int r2 = android.provider.Settings.Secure.getInt(r4, r6)     // Catch: android.provider.Settings.SettingNotFoundException -> L42
            r3 = 1
            if (r2 != r3) goto L3c
            r2 = r3
            goto L3d
        L3c:
            r2 = r13
        L3d:
            java.lang.String r4 = "afai"
            r7 = r2
            goto L21
        L41:
            r3 = r5
        L42:
            java.lang.String r4 = "Failed to get advertising ID."
            com.google.ads.interactivemedia.v3.internal.zzfk.zzd(r4)
            r6 = r0
            r7 = r2
            r5 = r3
        L4a:
            boolean r2 = r11.zzb
            if (r2 == 0) goto L7b
            android.content.Context r2 = r11.zza     // Catch: java.lang.Throwable -> L6d java.lang.Throwable -> L74
            dd.b r2 = dd.C13653a.a(r2)     // Catch: java.lang.Throwable -> L6d java.lang.Throwable -> L74
            Vd.j r2 = r2.h()     // Catch: java.lang.Throwable -> L6d java.lang.Throwable -> L74
            long r3 = r11.zzc     // Catch: java.lang.Throwable -> L6d java.lang.Throwable -> L74
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L6d java.lang.Throwable -> L74
            java.lang.Object r2 = Vd.C5519m.b(r2, r3, r8)     // Catch: java.lang.Throwable -> L6d java.lang.Throwable -> L74
            dd.c r2 = (dd.C13655c) r2     // Catch: java.lang.Throwable -> L6d java.lang.Throwable -> L74
            java.lang.String r3 = r2.a()     // Catch: java.lang.Throwable -> L6d java.lang.Throwable -> L74
            int r13 = r2.b()     // Catch: java.lang.Throwable -> L6e java.lang.Throwable -> L75
        L6a:
            r9 = r13
            r8 = r3
            goto L7d
        L6d:
            r3 = r0
        L6e:
            java.lang.String r2 = "Unable to contact the App Set SDK."
            com.google.ads.interactivemedia.v3.internal.zzfk.zzd(r2)
            goto L6a
        L74:
            r3 = r0
        L75:
            java.lang.String r2 = "Timeout getting AppSet ID."
            com.google.ads.interactivemedia.v3.internal.zzfk.zzd(r2)
            goto L6a
        L7b:
            r9 = r13
            r8 = r0
        L7d:
            android.content.Context r13 = r11.zza
            com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration r2 = r11.zzd
            boolean r13 = com.google.ads.interactivemedia.v3.internal.zzel.zzc(r13, r2)
            com.google.ads.interactivemedia.v3.internal.zzex r12 = r12.zza()
            com.google.ads.interactivemedia.v3.internal.zzew r2 = r11.zzf
            android.content.Context r3 = r11.zza
            boolean r12 = r12.zza(r2, r3, r7, r13)
            if (r12 == 0) goto L9d
            com.google.ads.interactivemedia.v3.internal.zzej r12 = r11.zzg
            if (r13 == 0) goto L99
            com.google.ads.interactivemedia.v3.impl.zzau r1 = com.google.ads.interactivemedia.v3.impl.zzau.GTV
        L99:
            java.lang.String r0 = r12.zza(r1, r14)
        L9d:
            r10 = r0
            com.google.ads.interactivemedia.v3.impl.data.zzbn r12 = com.google.ads.interactivemedia.v3.impl.data.zzbn.create(r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzez.zza(com.google.ads.interactivemedia.v3.api.BaseRequest, com.google.ads.interactivemedia.v3.internal.zzeu, java.lang.String):com.google.ads.interactivemedia.v3.impl.data.zzbn");
    }

    public zzez(Context context, zzew zzewVar, zzfd zzfdVar, Map map, TestingConfiguration testingConfiguration) throws NumberFormatException {
        int i10;
        this.zza = context;
        this.zzb = !zzewVar.zza;
        long j10 = zzewVar.zzb;
        this.zzc = j10 <= 0 ? 150L : j10;
        this.zzf = zzewVar;
        this.zzd = testingConfiguration;
        this.zze = zzfdVar;
        int i11 = zzewVar.zze;
        if (map != null) {
            try {
                i10 = Integer.parseInt((String) map.get("IDENTITY_TOKEN_CUSTOM_TIMEOUT_AND_MEASUREMENT"));
            } catch (NumberFormatException unused) {
                i10 = 0;
            }
            if (i10 > 0) {
                i11 = i10;
            }
        }
        this.zzg = new zzej(new zzei(context, i11, zzfdVar));
    }

    private final Boolean zzb(zzeu zzeuVar) {
        try {
            return (Boolean) zzeuVar.zzc().get();
        } catch (InterruptedException | CancellationException | ExecutionException e10) {
            this.zze.zzg(com.google.ads.interactivemedia.v3.impl.data.zzbp.IDENTIFIER_INFO_FACTORY, com.google.ads.interactivemedia.v3.impl.data.zzbq.SAFE_BLOCKING_GET_IDLESS, e10);
            return Boolean.TRUE;
        }
    }
}
