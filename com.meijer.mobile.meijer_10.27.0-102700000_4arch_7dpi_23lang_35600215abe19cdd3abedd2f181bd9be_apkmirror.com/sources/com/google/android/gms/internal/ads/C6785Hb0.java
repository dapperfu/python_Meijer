package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Hb0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6785Hb0 {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f67471a;

    /* renamed from: b, reason: collision with root package name */
    private final C7090Qb0 f67472b;

    public C6785Hb0(C7090Qb0 c7090Qb0) {
        this.f67472b = c7090Qb0;
    }

    public final JSONObject a() {
        return this.f67471a;
    }

    public final void e(JSONObject jSONObject) {
        this.f67471a = jSONObject;
    }

    public final void b() {
        this.f67472b.b(new AsyncTaskC7124Rb0(this));
    }

    public final void c(JSONObject jSONObject, HashSet hashSet, long j10) {
        this.f67472b.b(new AsyncTaskC7158Sb0(this, hashSet, jSONObject, j10));
    }

    public final void d(JSONObject jSONObject, HashSet hashSet, long j10) {
        this.f67472b.b(new AsyncTaskC7226Ub0(this, hashSet, jSONObject, j10));
    }
}
