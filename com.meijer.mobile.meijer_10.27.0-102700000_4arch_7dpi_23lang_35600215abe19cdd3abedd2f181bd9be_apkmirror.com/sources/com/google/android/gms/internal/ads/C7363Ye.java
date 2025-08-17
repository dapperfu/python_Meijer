package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Ye, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7363Ye extends AbstractC7593bf {
    C7363Ye(int i10, String str, Float f10, Float f11) {
        super(1, str, f10, f11, null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7593bf
    public final /* bridge */ /* synthetic */ void d(SharedPreferences.Editor editor, Object obj) {
        editor.putFloat(l(), ((Float) obj).floatValue());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7593bf
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(l(), ((Float) k()).floatValue()));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7593bf
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(l()))) {
            return Float.valueOf(bundle.getFloat("com.google.android.gms.ads.flag.".concat(l())));
        }
        return (Float) k();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7593bf
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(l(), ((Float) k()).floatValue()));
    }
}
