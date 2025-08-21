package com.google.ads.interactivemedia.v3.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes4.dex */
final class zzlu extends zzma {
    zzlu(int i10, String str, Boolean bool, Boolean bool2) {
        super(i10, str, bool, bool2, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzma
    public final /* bridge */ /* synthetic */ Object zza(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(zzj(), ((Boolean) zzi()).booleanValue()));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzma
    public final /* bridge */ /* synthetic */ Object zzb(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(zzj()))) {
            return Boolean.valueOf(bundle.getBoolean("com.google.android.gms.ads.flag.".concat(zzj())));
        }
        return (Boolean) zzi();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzma
    public final /* bridge */ /* synthetic */ Object zzc(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(zzj(), ((Boolean) zzi()).booleanValue()));
    }
}
