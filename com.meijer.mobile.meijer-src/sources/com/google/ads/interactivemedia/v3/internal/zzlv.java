package com.google.ads.interactivemedia.v3.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes4.dex */
final class zzlv extends zzma {
    zzlv(int i10, String str, Integer num, Integer num2) {
        super(1, str, num, num2, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzma
    public final /* bridge */ /* synthetic */ Object zza(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(zzj(), ((Integer) zzi()).intValue()));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzma
    public final /* bridge */ /* synthetic */ Object zzb(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(zzj()))) {
            return Integer.valueOf(bundle.getInt("com.google.android.gms.ads.flag.".concat(zzj())));
        }
        return (Integer) zzi();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzma
    public final /* bridge */ /* synthetic */ Object zzc(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(zzj(), ((Integer) zzi()).intValue()));
    }
}
