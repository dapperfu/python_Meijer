package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class S20 implements S10 {

    /* renamed from: a, reason: collision with root package name */
    private final String f70837a;

    /* renamed from: b, reason: collision with root package name */
    private final String f70838b;

    public S20(String str, String str2) {
        this.f70837a = str;
        this.f70838b = str2;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) throws JSONException {
        try {
            JSONObject jSONObjectG = Rc.U.g((JSONObject) obj, "pii");
            jSONObjectG.put("doritos", this.f70837a);
            jSONObjectG.put("doritos_v2", this.f70838b);
        } catch (JSONException unused) {
            Rc.p0.k("Failed putting doritos string.");
        }
    }
}
