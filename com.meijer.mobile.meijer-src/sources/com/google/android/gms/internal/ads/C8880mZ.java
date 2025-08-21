package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.mZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8880mZ implements S10 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f77662a;

    /* renamed from: b, reason: collision with root package name */
    private final JSONObject f77663b;

    public C8880mZ(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f77662a = jSONObject;
        this.f77663b = jSONObject2;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        JSONObject jSONObject = this.f77663b;
        AB ab2 = (AB) obj;
        if (jSONObject != null) {
            ab2.f65929b.putString("fwd_common_cld", jSONObject.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((AB) obj).f65928a;
        JSONObject jSONObject = this.f77662a;
        if (jSONObject != null) {
            bundle.putString("fwd_cld", jSONObject.toString());
        }
        JSONObject jSONObject2 = this.f77663b;
        if (jSONObject2 != null) {
            bundle.putString("fwd_common_cld", jSONObject2.toString());
        }
    }
}
