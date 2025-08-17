package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Xe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7330Xe extends AbstractC7593bf {
    C7330Xe(int i10, String str, Long l10, Long l11) {
        super(1, str, l10, l11, null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7593bf
    public final /* bridge */ /* synthetic */ void d(SharedPreferences.Editor editor, Object obj) {
        editor.putLong(l(), ((Long) obj).longValue());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7593bf
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(l(), ((Long) k()).longValue()));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7593bf
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(l()))) {
            return Long.valueOf(bundle.getLong("com.google.android.gms.ads.flag.".concat(l())));
        }
        return (Long) k();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7593bf
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(l(), ((Long) k()).longValue()));
    }
}
