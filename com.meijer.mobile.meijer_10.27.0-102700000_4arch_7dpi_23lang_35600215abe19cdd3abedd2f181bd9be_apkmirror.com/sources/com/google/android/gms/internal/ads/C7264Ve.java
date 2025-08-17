package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Ve, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7264Ve extends AbstractC7593bf {
    C7264Ve(int i10, String str, Boolean bool, Boolean bool2) {
        super(i10, str, bool, bool2, null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7593bf
    public final /* bridge */ /* synthetic */ void d(SharedPreferences.Editor editor, Object obj) {
        editor.putBoolean(l(), ((Boolean) obj).booleanValue());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7593bf
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(l(), ((Boolean) k()).booleanValue()));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7593bf
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(l()))) {
            return Boolean.valueOf(bundle.getBoolean("com.google.android.gms.ads.flag.".concat(l())));
        }
        return (Boolean) k();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7593bf
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(l(), ((Boolean) k()).booleanValue()));
    }
}
