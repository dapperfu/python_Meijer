package com.google.android.gms.internal.pal;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.pal.d5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10644d5 extends AbstractC10726i5 {
    C10644d5(int i10, String str, Long l10) {
        super(1, str, l10, null);
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10726i5
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(l(), ((Long) k()).longValue()));
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10726i5
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(l()))) {
            return Long.valueOf(bundle.getLong("com.google.android.gms.ads.flag.".concat(l())));
        }
        return (Long) k();
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10726i5
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(l(), ((Long) k()).longValue()));
    }
}
