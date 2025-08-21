package com.bumptech.glide;

import Z.C5603a;
import a7.InterfaceC5665b;
import android.content.Context;
import b7.InterfaceC6336a;
import b7.i;
import c7.ExecutorServiceC6490a;
import com.bumptech.glide.b;
import com.bumptech.glide.e;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import l7.InterfaceC15472c;
import l7.o;
import m7.AbstractC15682a;
import m7.InterfaceC15683b;
import o7.C16082g;
import o7.InterfaceC16081f;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    private com.bumptech.glide.load.engine.j f64507c;

    /* renamed from: d, reason: collision with root package name */
    private a7.d f64508d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC5665b f64509e;

    /* renamed from: f, reason: collision with root package name */
    private b7.h f64510f;

    /* renamed from: g, reason: collision with root package name */
    private ExecutorServiceC6490a f64511g;

    /* renamed from: h, reason: collision with root package name */
    private ExecutorServiceC6490a f64512h;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC6336a.InterfaceC1192a f64513i;

    /* renamed from: j, reason: collision with root package name */
    private b7.i f64514j;

    /* renamed from: k, reason: collision with root package name */
    private InterfaceC15472c f64515k;

    /* renamed from: n, reason: collision with root package name */
    private o.b f64518n;

    /* renamed from: o, reason: collision with root package name */
    private ExecutorServiceC6490a f64519o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f64520p;

    /* renamed from: q, reason: collision with root package name */
    private List<InterfaceC16081f<Object>> f64521q;

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, l<?, ?>> f64505a = new C5603a();

    /* renamed from: b, reason: collision with root package name */
    private final e.a f64506b = new e.a();

    /* renamed from: l, reason: collision with root package name */
    private int f64516l = 4;

    /* renamed from: m, reason: collision with root package name */
    private b.a f64517m = new a();

    class a implements b.a {
        a() {
        }

        @Override // com.bumptech.glide.b.a
        public C16082g build() {
            return new C16082g();
        }
    }

    /* renamed from: com.bumptech.glide.c$c, reason: collision with other inner class name */
    public static final class C1252c {
    }

    static final class b {
        b() {
        }
    }

    com.bumptech.glide.b a(Context context, List<InterfaceC15683b> list, AbstractC15682a abstractC15682a) {
        if (this.f64511g == null) {
            this.f64511g = ExecutorServiceC6490a.h();
        }
        if (this.f64512h == null) {
            this.f64512h = ExecutorServiceC6490a.f();
        }
        if (this.f64519o == null) {
            this.f64519o = ExecutorServiceC6490a.d();
        }
        if (this.f64514j == null) {
            this.f64514j = new i.a(context).a();
        }
        if (this.f64515k == null) {
            this.f64515k = new l7.e();
        }
        if (this.f64508d == null) {
            int iB = this.f64514j.b();
            if (iB > 0) {
                this.f64508d = new a7.j(iB);
            } else {
                this.f64508d = new a7.e();
            }
        }
        if (this.f64509e == null) {
            this.f64509e = new a7.i(this.f64514j.a());
        }
        if (this.f64510f == null) {
            this.f64510f = new b7.g(this.f64514j.d());
        }
        if (this.f64513i == null) {
            this.f64513i = new b7.f(context);
        }
        if (this.f64507c == null) {
            this.f64507c = new com.bumptech.glide.load.engine.j(this.f64510f, this.f64513i, this.f64512h, this.f64511g, ExecutorServiceC6490a.i(), this.f64519o, this.f64520p);
        }
        List<InterfaceC16081f<Object>> list2 = this.f64521q;
        if (list2 == null) {
            this.f64521q = Collections.EMPTY_LIST;
        } else {
            this.f64521q = Collections.unmodifiableList(list2);
        }
        return new com.bumptech.glide.b(context, this.f64507c, this.f64510f, this.f64508d, this.f64509e, new o(this.f64518n), this.f64515k, this.f64516l, this.f64517m, this.f64505a, this.f64521q, list, abstractC15682a, this.f64506b.b());
    }

    void b(o.b bVar) {
        this.f64518n = bVar;
    }
}
