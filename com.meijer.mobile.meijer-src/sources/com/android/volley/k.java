package com.android.volley;

import com.android.volley.a;

/* loaded from: classes4.dex */
public class k<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f63777a;

    /* renamed from: b, reason: collision with root package name */
    public final a.C1250a f63778b;

    /* renamed from: c, reason: collision with root package name */
    public final VolleyError f63779c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f63780d;

    public interface a {
        void onErrorResponse(VolleyError volleyError);
    }

    public interface b<T> {
        void onResponse(T t10);
    }

    private k(T t10, a.C1250a c1250a) {
        this.f63780d = false;
        this.f63777a = t10;
        this.f63778b = c1250a;
        this.f63779c = null;
    }

    public static <T> k<T> a(VolleyError volleyError) {
        return new k<>(volleyError);
    }

    public static <T> k<T> c(T t10, a.C1250a c1250a) {
        return new k<>(t10, c1250a);
    }

    public boolean b() {
        return this.f63779c == null;
    }

    private k(VolleyError volleyError) {
        this.f63780d = false;
        this.f63777a = null;
        this.f63778b = null;
        this.f63779c = volleyError;
    }
}
