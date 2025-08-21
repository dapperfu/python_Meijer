package com.google.android.gms.internal.pal;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.pal.c5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10752c5 extends AbstractC10851i5 {
    C10752c5(int i10, String str, Integer num) {
        super(1, str, num, null);
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10851i5
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(l(), ((Integer) k()).intValue()));
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10851i5
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(l()))) {
            return Integer.valueOf(bundle.getInt("com.google.android.gms.ads.flag.".concat(l())));
        }
        return (Integer) k();
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10851i5
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(l(), ((Integer) k()).intValue()));
    }
}
