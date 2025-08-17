package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class G20 implements S10 {

    /* renamed from: a, reason: collision with root package name */
    final String f67067a;

    /* renamed from: b, reason: collision with root package name */
    final int f67068b;

    public G20(String str, int i10) {
        this.f67067a = str;
        this.f67068b = i10;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        if (TextUtils.isEmpty(this.f67067a) || this.f67068b == -1) {
            return;
        }
        try {
            JSONObject jSONObjectG = Pc.U.g(jSONObject, "pii");
            jSONObjectG.put("pvid", this.f67067a);
            jSONObjectG.put("pvid_s", this.f67068b);
        } catch (JSONException e10) {
            Pc.p0.l("Failed putting gms core app set ID info.", e10);
        }
    }
}
