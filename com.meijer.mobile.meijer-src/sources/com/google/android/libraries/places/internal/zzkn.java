package com.google.android.libraries.places.internal;

import Ee.L;
import android.location.Location;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import java.util.Locale;

/* loaded from: classes6.dex */
final class zzkn extends zzks {
    private final Location zza;
    private final L zzb;

    @Override // com.google.android.libraries.places.internal.zzks
    protected final String zzf() {
        return "findplacefromuserlocation/json";
    }

    zzkn(FindCurrentPlaceRequest findCurrentPlaceRequest, Location location, L l10, Locale locale, String str, zzmx zzmxVar) {
        super(findCurrentPlaceRequest, locale, str, zzmxVar);
        this.zza = location;
        this.zzb = l10;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0026  */
    @Override // com.google.android.libraries.places.internal.zzks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map zze() {
        /*
            r6 = this;
            com.google.android.libraries.places.internal.zzmg r0 = r6.zza()
            com.google.android.libraries.places.api.net.FindCurrentPlaceRequest r0 = (com.google.android.libraries.places.api.net.FindCurrentPlaceRequest) r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            android.location.Location r2 = r6.zza
            java.lang.String r3 = com.google.android.libraries.places.internal.zzlk.zzb(r2)
            java.lang.String r4 = "location"
            r5 = 0
            com.google.android.libraries.places.internal.zzks.zzg(r1, r4, r3, r5)
            Ee.L r3 = r6.zzb
            r4 = 4000(0xfa0, float:5.605E-42)
            java.lang.String r3 = com.google.android.libraries.places.internal.zzlk.zza(r3, r4)
            java.lang.String r4 = "wifiaccesspoints"
            com.google.android.libraries.places.internal.zzks.zzg(r1, r4, r3, r5)
            if (r2 != 0) goto L28
        L26:
            r3 = r5
            goto L42
        L28:
            float r3 = r2.getAccuracy()
            boolean r4 = r2.hasAccuracy()
            if (r4 == 0) goto L26
            r4 = 0
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 <= 0) goto L26
            r4 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r4
            int r3 = java.lang.Math.round(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L42:
            java.lang.String r4 = "precision"
            com.google.android.libraries.places.internal.zzks.zzg(r1, r4, r3, r5)
            long r2 = r2.getTime()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "timestamp"
            com.google.android.libraries.places.internal.zzks.zzg(r1, r3, r2, r5)
            java.util.List r0 = r0.getPlaceFields()
            java.lang.String r0 = com.google.android.libraries.places.internal.zzll.zzb(r0)
            java.lang.String r2 = "fields"
            com.google.android.libraries.places.internal.zzks.zzg(r1, r2, r0, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkn.zze():java.util.Map");
    }
}
