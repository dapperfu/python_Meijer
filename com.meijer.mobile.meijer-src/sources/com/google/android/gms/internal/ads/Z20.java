package com.google.android.gms.internal.ads;

import Oc.C4447y;
import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Z20 implements S10 {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f72819a;

    public Z20(Bundle bundle) {
        this.f72819a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        if (this.f72819a != null) {
            try {
                Rc.U.g(Rc.U.g(jSONObject, "device"), "play_store").put("parental_controls", C4447y.b().k(this.f72819a));
            } catch (JSONException unused) {
                Rc.p0.k("Failed putting parental controls bundle.");
            }
        }
    }
}
