package com.android.volley;

import com.android.volley.a;

/* loaded from: classes4.dex */
public class k<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f62938a;

    /* renamed from: b, reason: collision with root package name */
    public final a.C1240a f62939b;

    /* renamed from: c, reason: collision with root package name */
    public final VolleyError f62940c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f62941d;

    public interface a {
        void onErrorResponse(VolleyError volleyError);
    }

    public interface b<T> {
        void onResponse(T t10);
    }

    private k(T t10, a.C1240a c1240a) {
        this.f62941d = false;
        this.f62938a = t10;
        this.f62939b = c1240a;
        this.f62940c = null;
    }

    public static <T> k<T> a(VolleyError volleyError) {
        return new k<>(volleyError);
    }

    public static <T> k<T> c(T t10, a.C1240a c1240a) {
        return new k<>(t10, c1240a);
    }

    public boolean b() {
        return this.f62940c == null;
    }

    private k(VolleyError volleyError) {
        this.f62941d = false;
        this.f62938a = null;
        this.f62939b = null;
        this.f62940c = volleyError;
    }
}
