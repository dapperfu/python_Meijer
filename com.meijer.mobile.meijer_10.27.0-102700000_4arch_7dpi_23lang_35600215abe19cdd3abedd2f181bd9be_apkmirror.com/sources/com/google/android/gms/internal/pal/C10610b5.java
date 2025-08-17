package com.google.android.gms.internal.pal;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.pal.b5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10610b5 extends AbstractC10726i5 {
    C10610b5(int i10, String str, Boolean bool) {
        super(i10, str, bool, null);
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10726i5
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(l(), ((Boolean) k()).booleanValue()));
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10726i5
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(l()))) {
            return Boolean.valueOf(bundle.getBoolean("com.google.android.gms.ads.flag.".concat(l())));
        }
        return (Boolean) k();
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10726i5
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(l(), ((Boolean) k()).booleanValue()));
    }
}
