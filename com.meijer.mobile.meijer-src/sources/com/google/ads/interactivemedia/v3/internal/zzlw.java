package com.google.ads.interactivemedia.v3.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes4.dex */
final class zzlw extends zzma {
    zzlw(int i10, String str, Long l10, Long l11) {
        super(1, str, l10, l11, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzma
    public final /* bridge */ /* synthetic */ Object zza(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(zzj(), ((Long) zzi()).longValue()));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzma
    public final /* bridge */ /* synthetic */ Object zzb(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(zzj()))) {
            return Long.valueOf(bundle.getLong("com.google.android.gms.ads.flag.".concat(zzj())));
        }
        return (Long) zzi();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzma
    public final /* bridge */ /* synthetic */ Object zzc(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(zzj(), ((Long) zzi()).longValue()));
    }
}
