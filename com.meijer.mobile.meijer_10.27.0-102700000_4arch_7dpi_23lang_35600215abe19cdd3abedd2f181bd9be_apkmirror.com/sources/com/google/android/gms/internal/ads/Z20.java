package com.google.android.gms.internal.ads;

import Mc.C4169y;
import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Z20 implements S10 {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f71979a;

    public Z20(Bundle bundle) {
        this.f71979a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        if (this.f71979a != null) {
            try {
                Pc.U.g(Pc.U.g(jSONObject, "device"), "play_store").put("parental_controls", C4169y.b().k(this.f71979a));
            } catch (JSONException unused) {
                Pc.p0.k("Failed putting parental controls bundle.");
            }
        }
    }
}
