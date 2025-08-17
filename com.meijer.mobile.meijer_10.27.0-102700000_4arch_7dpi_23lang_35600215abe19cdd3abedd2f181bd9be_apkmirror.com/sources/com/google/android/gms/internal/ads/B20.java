package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class B20 implements S10 {

    /* renamed from: a, reason: collision with root package name */
    private final String f65410a;

    public B20(String str) {
        this.f65410a = str;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) throws JSONException {
        try {
            ((JSONObject) obj).put("ms", this.f65410a);
        } catch (JSONException e10) {
            Pc.p0.l("Failed putting Ad ID.", e10);
        }
    }
}
