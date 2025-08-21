package com.google.android.libraries.places.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes6.dex */
abstract class zzks extends zzfz {
    private final Locale zza;
    private final String zzb;
    private final zzmx zzc;

    protected abstract Map zze();

    protected abstract String zzf();

    protected static void zzg(Map map, String str, Object obj, Object obj2) {
        String string = obj != null ? obj.toString() : null;
        if (TextUtils.isEmpty(string)) {
            return;
        }
        map.put(str, string);
    }

    @Override // com.google.android.libraries.places.internal.zzfz
    protected final Map zzc() {
        HashMap map = new HashMap();
        map.putAll(this.zzc.zza());
        map.put("X-Places-Android-Sdk", "4.4.1");
        return map;
    }

    @Override // com.google.android.libraries.places.internal.zzfz
    protected final String zzd() {
        zzle zzleVar = new zzle(zzf(), this.zzb);
        zzleVar.zza(this.zza);
        zzleVar.zzb(zze());
        return zzleVar.zzc();
    }

    protected zzks(zzmg zzmgVar, Locale locale, String str, zzmx zzmxVar) {
        super(zzmgVar);
        this.zza = locale;
        this.zzb = str;
        this.zzc = zzmxVar;
    }
}
