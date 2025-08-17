package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.We, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7297We extends AbstractC7593bf {
    C7297We(int i10, String str, Integer num, Integer num2) {
        super(1, str, num, num2, null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7593bf
    public final /* bridge */ /* synthetic */ void d(SharedPreferences.Editor editor, Object obj) {
        editor.putInt(l(), ((Integer) obj).intValue());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7593bf
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(l(), ((Integer) k()).intValue()));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7593bf
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(l()))) {
            return Integer.valueOf(bundle.getInt("com.google.android.gms.ads.flag.".concat(l())));
        }
        return (Integer) k();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7593bf
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(l(), ((Integer) k()).intValue()));
    }
}
