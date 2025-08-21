package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.n30, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8941n30 implements S10 {

    /* renamed from: a, reason: collision with root package name */
    private final String f77830a;

    public C8941n30(String str) {
        this.f77830a = str;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            if (TextUtils.isEmpty(this.f77830a)) {
                return;
            }
            Rc.U.g(jSONObject, "pii").put("adsid", this.f77830a);
        } catch (JSONException e10) {
            Sc.p.h("Failed putting trustless token.", e10);
        }
    }
}
