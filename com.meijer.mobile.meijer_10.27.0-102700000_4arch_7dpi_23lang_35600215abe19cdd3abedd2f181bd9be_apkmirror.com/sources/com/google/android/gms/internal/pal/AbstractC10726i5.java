package com.google.android.gms.internal.pal;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.pal.i5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10726i5 {

    /* renamed from: a, reason: collision with root package name */
    private final int f83166a;

    /* renamed from: b, reason: collision with root package name */
    private final String f83167b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f83168c;

    protected abstract Object a(JSONObject jSONObject);

    public abstract Object b(Bundle bundle);

    protected abstract Object c(SharedPreferences sharedPreferences);

    public final int d() {
        return this.f83166a;
    }

    public final Object k() {
        return this.f83168c;
    }

    public final String l() {
        return this.f83167b;
    }

    public static AbstractC10726i5 e(int i10, String str, float f10) {
        return new C10661e5(1, str, Float.valueOf(f10));
    }

    public static AbstractC10726i5 f(int i10, String str, int i11) {
        return new C10627c5(1, str, Integer.valueOf(i11));
    }

    public static AbstractC10726i5 g(int i10, String str, long j10) {
        return new C10644d5(1, str, Long.valueOf(j10));
    }

    public static AbstractC10726i5 h(int i10, String str, Boolean bool) {
        return new C10610b5(i10, str, bool);
    }

    public static AbstractC10726i5 i(int i10, String str, String str2) {
        return new C10694g5(1, str, str2);
    }

    public static AbstractC10726i5 j(int i10, String str) {
        AbstractC10726i5 abstractC10726i5I = i(1, "gads:sdk_core_constants:experiment_id", null);
        C10593a5.a().a(abstractC10726i5I);
        return abstractC10726i5I;
    }

    /* synthetic */ AbstractC10726i5(int i10, String str, Object obj, C10710h5 c10710h5) {
        this.f83166a = i10;
        this.f83167b = str;
        this.f83168c = obj;
        C10593a5.a().b(this);
    }
}
