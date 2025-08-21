package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Hb0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6910Hb0 {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f68311a;

    /* renamed from: b, reason: collision with root package name */
    private final C7215Qb0 f68312b;

    public C6910Hb0(C7215Qb0 c7215Qb0) {
        this.f68312b = c7215Qb0;
    }

    public final JSONObject a() {
        return this.f68311a;
    }

    public final void e(JSONObject jSONObject) {
        this.f68311a = jSONObject;
    }

    public final void b() {
        this.f68312b.b(new AsyncTaskC7249Rb0(this));
    }

    public final void c(JSONObject jSONObject, HashSet hashSet, long j10) {
        this.f68312b.b(new AsyncTaskC7283Sb0(this, hashSet, jSONObject, j10));
    }

    public final void d(JSONObject jSONObject, HashSet hashSet, long j10) {
        this.f68312b.b(new AsyncTaskC7351Ub0(this, hashSet, jSONObject, j10));
    }
}
