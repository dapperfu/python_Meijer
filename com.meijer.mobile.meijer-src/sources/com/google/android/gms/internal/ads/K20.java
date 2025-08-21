package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class K20 implements S10 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f68857a;

    public K20(JSONObject jSONObject) {
        this.f68857a = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) throws JSONException {
        try {
            ((JSONObject) obj).put("cache_state", this.f68857a);
        } catch (JSONException unused) {
            Rc.p0.k("Unable to get cache_state");
        }
    }
}
