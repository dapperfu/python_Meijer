package com.squareup.picasso;

import android.graphics.Bitmap;
import com.squareup.picasso.o;
import java.lang.ref.WeakReference;

/* loaded from: classes11.dex */
abstract class a<T> {

    /* renamed from: a, reason: collision with root package name */
    final o f126472a;

    /* renamed from: b, reason: collision with root package name */
    final WeakReference<T> f126473b;

    /* renamed from: c, reason: collision with root package name */
    final int f126474c;

    /* renamed from: d, reason: collision with root package name */
    final int f126475d;

    /* renamed from: e, reason: collision with root package name */
    final String f126476e;

    /* renamed from: f, reason: collision with root package name */
    final Object f126477f;

    /* renamed from: g, reason: collision with root package name */
    boolean f126478g;

    /* renamed from: h, reason: collision with root package name */
    boolean f126479h;

    /* renamed from: com.squareup.picasso.a$a, reason: collision with other inner class name */
    static class C1983a<M> extends WeakReference<M> {

        /* renamed from: a, reason: collision with root package name */
        final a f126480a;
    }

    void a() {
        this.f126479h = true;
    }

    abstract void b(Bitmap bitmap, o.e eVar);

    abstract void c();

    o.f h() {
        throw null;
    }

    q i() {
        return null;
    }

    String d() {
        return this.f126476e;
    }

    int e() {
        return this.f126474c;
    }

    int f() {
        return this.f126475d;
    }

    o g() {
        return this.f126472a;
    }

    Object j() {
        return this.f126477f;
    }

    T k() {
        WeakReference<T> weakReference = this.f126473b;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    boolean l() {
        return this.f126479h;
    }

    boolean m() {
        return this.f126478g;
    }
}
