package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class S20 implements S10 {

    /* renamed from: a, reason: collision with root package name */
    private final String f69997a;

    /* renamed from: b, reason: collision with root package name */
    private final String f69998b;

    public S20(String str, String str2) {
        this.f69997a = str;
        this.f69998b = str2;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) throws JSONException {
        try {
            JSONObject jSONObjectG = Pc.U.g((JSONObject) obj, "pii");
            jSONObjectG.put("doritos", this.f69997a);
            jSONObjectG.put("doritos_v2", this.f69998b);
        } catch (JSONException unused) {
            Pc.p0.k("Failed putting doritos string.");
        }
    }
}
