package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Qw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7242Qw implements InterfaceC10101xw {

    /* renamed from: a, reason: collision with root package name */
    private final C7099Mp f70527a;

    C7242Qw(C7099Mp c7099Mp) {
        this.f70527a = c7099Mp;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.gms.internal.ads.Mp] */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // com.google.android.gms.internal.ads.InterfaceC10101xw
    public final void a(JSONObject jSONObject) {
        this.f70527a.b(jSONObject.optBoolean("npa_reset") ? -1 : jSONObject.optBoolean("npa"), jSONObject.optLong("timestamp"));
    }
}
