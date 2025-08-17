package com.bumptech.glide;

import Z.C5503a;
import Z6.a;
import Z6.i;
import a7.ExecutorServiceC5584a;
import android.content.Context;
import com.bumptech.glide.b;
import com.bumptech.glide.e;
import j7.InterfaceC14873c;
import j7.o;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import k7.AbstractC15111a;
import k7.InterfaceC15112b;
import m7.C15572g;
import m7.InterfaceC15571f;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    private com.bumptech.glide.load.engine.j f63667c;

    /* renamed from: d, reason: collision with root package name */
    private Y6.d f63668d;

    /* renamed from: e, reason: collision with root package name */
    private Y6.b f63669e;

    /* renamed from: f, reason: collision with root package name */
    private Z6.h f63670f;

    /* renamed from: g, reason: collision with root package name */
    private ExecutorServiceC5584a f63671g;

    /* renamed from: h, reason: collision with root package name */
    private ExecutorServiceC5584a f63672h;

    /* renamed from: i, reason: collision with root package name */
    private a.InterfaceC0903a f63673i;

    /* renamed from: j, reason: collision with root package name */
    private Z6.i f63674j;

    /* renamed from: k, reason: collision with root package name */
    private InterfaceC14873c f63675k;

    /* renamed from: n, reason: collision with root package name */
    private o.b f63678n;

    /* renamed from: o, reason: collision with root package name */
    private ExecutorServiceC5584a f63679o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f63680p;

    /* renamed from: q, reason: collision with root package name */
    private List<InterfaceC15571f<Object>> f63681q;

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, l<?, ?>> f63665a = new C5503a();

    /* renamed from: b, reason: collision with root package name */
    private final e.a f63666b = new e.a();

    /* renamed from: l, reason: collision with root package name */
    private int f63676l = 4;

    /* renamed from: m, reason: collision with root package name */
    private b.a f63677m = new a();

    class a implements b.a {
        a() {
        }

        @Override // com.bumptech.glide.b.a
        public C15572g build() {
            return new C15572g();
        }
    }

    /* renamed from: com.bumptech.glide.c$c, reason: collision with other inner class name */
    public static final class C1243c {
    }

    static final class b {
        b() {
        }
    }

    com.bumptech.glide.b a(Context context, List<InterfaceC15112b> list, AbstractC15111a abstractC15111a) {
        if (this.f63671g == null) {
            this.f63671g = ExecutorServiceC5584a.h();
        }
        if (this.f63672h == null) {
            this.f63672h = ExecutorServiceC5584a.f();
        }
        if (this.f63679o == null) {
            this.f63679o = ExecutorServiceC5584a.d();
        }
        if (this.f63674j == null) {
            this.f63674j = new i.a(context).a();
        }
        if (this.f63675k == null) {
            this.f63675k = new j7.e();
        }
        if (this.f63668d == null) {
            int iB = this.f63674j.b();
            if (iB > 0) {
                this.f63668d = new Y6.j(iB);
            } else {
                this.f63668d = new Y6.e();
            }
        }
        if (this.f63669e == null) {
            this.f63669e = new Y6.i(this.f63674j.a());
        }
        if (this.f63670f == null) {
            this.f63670f = new Z6.g(this.f63674j.d());
        }
        if (this.f63673i == null) {
            this.f63673i = new Z6.f(context);
        }
        if (this.f63667c == null) {
            this.f63667c = new com.bumptech.glide.load.engine.j(this.f63670f, this.f63673i, this.f63672h, this.f63671g, ExecutorServiceC5584a.i(), this.f63679o, this.f63680p);
        }
        List<InterfaceC15571f<Object>> list2 = this.f63681q;
        if (list2 == null) {
            this.f63681q = Collections.EMPTY_LIST;
        } else {
            this.f63681q = Collections.unmodifiableList(list2);
        }
        return new com.bumptech.glide.b(context, this.f63667c, this.f63670f, this.f63668d, this.f63669e, new o(this.f63678n), this.f63675k, this.f63676l, this.f63677m, this.f63665a, this.f63681q, list, abstractC15111a, this.f63666b.b());
    }

    void b(o.b bVar) {
        this.f63678n = bVar;
    }
}
