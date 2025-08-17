package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Qw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7117Qw implements InterfaceC9976xw {

    /* renamed from: a, reason: collision with root package name */
    private final C6974Mp f69687a;

    C7117Qw(C6974Mp c6974Mp) {
        this.f69687a = c6974Mp;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.gms.internal.ads.Mp] */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // com.google.android.gms.internal.ads.InterfaceC9976xw
    public final void a(JSONObject jSONObject) {
        this.f69687a.b(jSONObject.optBoolean("npa_reset") ? -1 : jSONObject.optBoolean("npa"), jSONObject.optLong("timestamp"));
    }
}
