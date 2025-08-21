package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
final class O20 implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f69837a;

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 46;
    }

    final /* synthetic */ void a(JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put("gms_sdk_env", this.f69837a);
        } catch (JSONException unused) {
            Rc.p0.k("Failed putting version constants.");
        }
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        return ((Boolean) Oc.A.c().a(C8784lf.f76948Pb)).booleanValue() ? Mj0.h(new S10() { // from class: com.google.android.gms.internal.ads.M20
            @Override // com.google.android.gms.internal.ads.S10
            public final /* synthetic */ void zza(Object obj) {
            }

            @Override // com.google.android.gms.internal.ads.S10
            public final void zzb(Object obj) {
            }
        }) : Mj0.h(new S10() { // from class: com.google.android.gms.internal.ads.N20
            @Override // com.google.android.gms.internal.ads.S10
            public final /* synthetic */ void zza(Object obj) {
            }

            @Override // com.google.android.gms.internal.ads.S10
            public final void zzb(Object obj) throws JSONException {
                this.f69633a.a((JSONObject) obj);
            }
        });
    }

    O20(Context context) {
        this.f69837a = C9550so.c(context, Sc.a.B());
    }
}
