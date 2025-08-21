package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.bf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7718bf {

    /* renamed from: a, reason: collision with root package name */
    private final int f73683a;

    /* renamed from: b, reason: collision with root package name */
    private final String f73684b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f73685c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f73686d;

    protected abstract Object a(JSONObject jSONObject);

    public abstract Object b(Bundle bundle);

    protected abstract Object c(SharedPreferences sharedPreferences);

    public abstract void d(SharedPreferences.Editor editor, Object obj);

    public final int e() {
        return this.f73683a;
    }

    public final String l() {
        return this.f73684b;
    }

    public static AbstractC7718bf f(int i10, String str, float f10, float f11) {
        return new C7488Ye(1, str, Float.valueOf(f10), Float.valueOf(f11));
    }

    public static AbstractC7718bf g(int i10, String str, int i11, int i12) {
        return new C7422We(1, str, Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static AbstractC7718bf h(int i10, String str, long j10, long j11) {
        return new C7455Xe(1, str, Long.valueOf(j10), Long.valueOf(j11));
    }

    public static AbstractC7718bf i(int i10, String str) {
        C7521Ze c7521Ze = new C7521Ze(1, "gads:sdk_core_constants:experiment_id", null, null);
        Oc.A.a().c(c7521Ze);
        return c7521Ze;
    }

    /* synthetic */ AbstractC7718bf(int i10, String str, Object obj, Object obj2, C7611af c7611af) {
        this.f73683a = i10;
        this.f73684b = str;
        this.f73685c = obj;
        this.f73686d = obj2;
        Oc.A.a().d(this);
    }

    public final Object j() {
        return Oc.A.c().a(this);
    }

    public final Object k() {
        if (Oc.A.c().f()) {
            return this.f73686d;
        }
        return this.f73685c;
    }
}
