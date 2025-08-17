package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.bf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7593bf {

    /* renamed from: a, reason: collision with root package name */
    private final int f72843a;

    /* renamed from: b, reason: collision with root package name */
    private final String f72844b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f72845c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f72846d;

    protected abstract Object a(JSONObject jSONObject);

    public abstract Object b(Bundle bundle);

    protected abstract Object c(SharedPreferences sharedPreferences);

    public abstract void d(SharedPreferences.Editor editor, Object obj);

    public final int e() {
        return this.f72843a;
    }

    public final String l() {
        return this.f72844b;
    }

    public static AbstractC7593bf f(int i10, String str, float f10, float f11) {
        return new C7363Ye(1, str, Float.valueOf(f10), Float.valueOf(f11));
    }

    public static AbstractC7593bf g(int i10, String str, int i11, int i12) {
        return new C7297We(1, str, Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static AbstractC7593bf h(int i10, String str, long j10, long j11) {
        return new C7330Xe(1, str, Long.valueOf(j10), Long.valueOf(j11));
    }

    public static AbstractC7593bf i(int i10, String str) {
        C7396Ze c7396Ze = new C7396Ze(1, "gads:sdk_core_constants:experiment_id", null, null);
        Mc.A.a().c(c7396Ze);
        return c7396Ze;
    }

    /* synthetic */ AbstractC7593bf(int i10, String str, Object obj, Object obj2, C7486af c7486af) {
        this.f72843a = i10;
        this.f72844b = str;
        this.f72845c = obj;
        this.f72846d = obj2;
        Mc.A.a().d(this);
    }

    public final Object j() {
        return Mc.A.c().a(this);
    }

    public final Object k() {
        if (Mc.A.c().f()) {
            return this.f72846d;
        }
        return this.f72845c;
    }
}
