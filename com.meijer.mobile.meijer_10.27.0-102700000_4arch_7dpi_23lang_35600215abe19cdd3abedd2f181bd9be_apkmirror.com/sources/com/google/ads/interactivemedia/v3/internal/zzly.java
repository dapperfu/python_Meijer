package com.google.ads.interactivemedia.v3.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes4.dex */
final class zzly extends zzma {
    zzly(int i10, String str, String str2, String str3) {
        super(1, str, str2, str3, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzma
    public final /* bridge */ /* synthetic */ Object zza(JSONObject jSONObject) {
        return jSONObject.optString(zzj(), (String) zzi());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzma
    public final /* bridge */ /* synthetic */ Object zzb(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(zzj()))) {
            return bundle.getString("com.google.android.gms.ads.flag.".concat(zzj()));
        }
        return (String) zzi();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzma
    public final /* bridge */ /* synthetic */ Object zzc(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(zzj(), (String) zzi());
    }
}
