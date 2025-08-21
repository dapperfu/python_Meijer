package com.google.android.gms.internal.pal;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.pal.e5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10786e5 extends AbstractC10851i5 {
    C10786e5(int i10, String str, Float f10) {
        super(1, str, f10, null);
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10851i5
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(l(), ((Float) k()).floatValue()));
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10851i5
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(l()))) {
            return Float.valueOf(bundle.getFloat("com.google.android.gms.ads.flag.".concat(l())));
        }
        return (Float) k();
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10851i5
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(l(), ((Float) k()).floatValue()));
    }
}
