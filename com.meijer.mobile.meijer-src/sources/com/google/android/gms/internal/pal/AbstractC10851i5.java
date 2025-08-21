package com.google.android.gms.internal.pal;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.pal.i5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10851i5 {

    /* renamed from: a, reason: collision with root package name */
    private final int f84006a;

    /* renamed from: b, reason: collision with root package name */
    private final String f84007b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f84008c;

    protected abstract Object a(JSONObject jSONObject);

    public abstract Object b(Bundle bundle);

    protected abstract Object c(SharedPreferences sharedPreferences);

    public final int d() {
        return this.f84006a;
    }

    public final Object k() {
        return this.f84008c;
    }

    public final String l() {
        return this.f84007b;
    }

    public static AbstractC10851i5 e(int i10, String str, float f10) {
        return new C10786e5(1, str, Float.valueOf(f10));
    }

    public static AbstractC10851i5 f(int i10, String str, int i11) {
        return new C10752c5(1, str, Integer.valueOf(i11));
    }

    public static AbstractC10851i5 g(int i10, String str, long j10) {
        return new C10769d5(1, str, Long.valueOf(j10));
    }

    public static AbstractC10851i5 h(int i10, String str, Boolean bool) {
        return new C10735b5(i10, str, bool);
    }

    public static AbstractC10851i5 i(int i10, String str, String str2) {
        return new C10819g5(1, str, str2);
    }

    public static AbstractC10851i5 j(int i10, String str) {
        AbstractC10851i5 abstractC10851i5I = i(1, "gads:sdk_core_constants:experiment_id", null);
        C10718a5.a().a(abstractC10851i5I);
        return abstractC10851i5I;
    }

    /* synthetic */ AbstractC10851i5(int i10, String str, Object obj, C10835h5 c10835h5) {
        this.f84006a = i10;
        this.f84007b = str;
        this.f84008c = obj;
        C10718a5.a().b(this);
    }
}
