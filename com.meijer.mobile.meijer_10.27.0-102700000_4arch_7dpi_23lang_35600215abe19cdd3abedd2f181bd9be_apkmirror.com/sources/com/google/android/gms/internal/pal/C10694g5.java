package com.google.android.gms.internal.pal;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.pal.g5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10694g5 extends AbstractC10726i5 {
    C10694g5(int i10, String str, String str2) {
        super(1, str, str2, null);
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10726i5
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return jSONObject.optString(l(), (String) k());
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10726i5
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(l()))) {
            return bundle.getString("com.google.android.gms.ads.flag.".concat(l()));
        }
        return (String) k();
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10726i5
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(l(), (String) k());
    }
}
