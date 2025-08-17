package com.google.android.libraries.places.internal;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class zzfh {
    public static final /* synthetic */ int zza = 0;
    private static final long zzb = TimeUnit.MINUTES.toMicros(1);
    private final zzdy zzc;
    private final Context zzd;

    zzfh(Context context, zzdy zzdyVar) {
        this.zzd = context;
        this.zzc = zzdyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Ce.L zza(java.lang.String r14) {
        /*
            r13 = this;
            android.content.Context r14 = r13.zzd
            java.lang.String r0 = "wifi"
            java.lang.Object r14 = r14.getSystemService(r0)
            android.net.wifi.WifiManager r14 = (android.net.wifi.WifiManager) r14
            if (r14 == 0) goto La5
            boolean r0 = r14.isWifiEnabled()
            if (r0 != 0) goto L14
            goto La5
        L14:
            java.util.List r0 = r14.getScanResults()
            if (r0 == 0) goto La0
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L22
            goto La0
        L22:
            com.google.android.libraries.places.internal.zzfg r1 = com.google.android.libraries.places.internal.zzfg.zza
            Ce.g0 r1 = Ce.g0.b(r1)
            Ce.L r0 = r1.c(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.net.wifi.WifiInfo r14 = r14.getConnectionInfo()
            int r2 = r0.size()
            r3 = 0
            r4 = r3
        L3b:
            if (r4 >= r2) goto L9b
            java.lang.Object r5 = r0.get(r4)
            android.net.wifi.ScanResult r5 = (android.net.wifi.ScanResult) r5
            if (r5 == 0) goto L98
            java.lang.String r6 = r5.SSID
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L4e
            goto L98
        L4e:
            com.google.android.libraries.places.internal.zzdy r6 = r13.zzc
            long r6 = r6.zzb()
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r8
            long r8 = r5.timestamp
            long r6 = r6 - r8
            long r8 = com.google.android.libraries.places.internal.zzfh.zzb
            java.lang.String r10 = r5.SSID
            if (r10 == 0) goto L90
            r11 = 95
            int r11 = r10.indexOf(r11)
            if (r11 >= 0) goto L6a
        L68:
            r12 = r3
            goto L81
        L6a:
            java.util.Locale r11 = java.util.Locale.ENGLISH
            java.lang.String r10 = r10.toLowerCase(r11)
            java.lang.String r11 = "_nomap"
            boolean r11 = r10.contains(r11)
            r12 = 1
            if (r11 != 0) goto L81
            java.lang.String r11 = "_optout"
            boolean r10 = r10.contains(r11)
            if (r10 == 0) goto L68
        L81:
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 > 0) goto L98
            if (r12 != 0) goto L98
            com.google.android.libraries.places.internal.zzff r6 = new com.google.android.libraries.places.internal.zzff
            r6.<init>(r14, r5)
            r1.add(r6)
            goto L98
        L90:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Null SSID."
            r14.<init>(r0)
            throw r14
        L98:
            int r4 = r4 + 1
            goto L3b
        L9b:
            Ce.L r14 = Ce.L.s(r1)
            return r14
        La0:
            Ce.L r14 = Ce.L.x()
            return r14
        La5:
            Ce.L r14 = Ce.L.x()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzfh.zza(java.lang.String):Ce.L");
    }
}
