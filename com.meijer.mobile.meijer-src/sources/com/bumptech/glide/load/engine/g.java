package com.bumptech.glide.load.engine;

import a7.InterfaceC5665b;
import b7.InterfaceC6336a;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.engine.h;
import d7.o;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
final class g<Transcode> {

    /* renamed from: a, reason: collision with root package name */
    private final List<o.a<?>> f64665a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List<X6.e> f64666b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private com.bumptech.glide.d f64667c;

    /* renamed from: d, reason: collision with root package name */
    private Object f64668d;

    /* renamed from: e, reason: collision with root package name */
    private int f64669e;

    /* renamed from: f, reason: collision with root package name */
    private int f64670f;

    /* renamed from: g, reason: collision with root package name */
    private Class<?> f64671g;

    /* renamed from: h, reason: collision with root package name */
    private h.e f64672h;

    /* renamed from: i, reason: collision with root package name */
    private X6.g f64673i;

    /* renamed from: j, reason: collision with root package name */
    private Map<Class<?>, X6.k<?>> f64674j;

    /* renamed from: k, reason: collision with root package name */
    private Class<Transcode> f64675k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f64676l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f64677m;

    /* renamed from: n, reason: collision with root package name */
    private X6.e f64678n;

    /* renamed from: o, reason: collision with root package name */
    private com.bumptech.glide.g f64679o;

    /* renamed from: p, reason: collision with root package name */
    private Z6.a f64680p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f64681q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f64682r;

    void a() {
        this.f64667c = null;
        this.f64668d = null;
        this.f64678n = null;
        this.f64671g = null;
        this.f64675k = null;
        this.f64673i = null;
        this.f64679o = null;
        this.f64674j = null;
        this.f64680p = null;
        this.f64665a.clear();
        this.f64676l = false;
        this.f64666b.clear();
        this.f64677m = false;
    }

    InterfaceC5665b b() {
        return this.f64667c.b();
    }

    List<X6.e> c() {
        if (!this.f64677m) {
            this.f64677m = true;
            this.f64666b.clear();
            List<o.a<?>> listG = g();
            int size = listG.size();
            for (int i10 = 0; i10 < size; i10++) {
                o.a<?> aVar = listG.get(i10);
                if (!this.f64666b.contains(aVar.f128243a)) {
                    this.f64666b.add(aVar.f128243a);
                }
                for (int i11 = 0; i11 < aVar.f128244b.size(); i11++) {
                    if (!this.f64666b.contains(aVar.f128244b.get(i11))) {
                        this.f64666b.add(aVar.f128244b.get(i11));
                    }
                }
            }
        }
        return this.f64666b;
    }

    InterfaceC6336a d() {
        return this.f64672h.a();
    }

    Z6.a e() {
        return this.f64680p;
    }

    int f() {
        return this.f64670f;
    }

    List<o.a<?>> g() {
        if (!this.f64676l) {
            this.f64676l = true;
            this.f64665a.clear();
            List listI = this.f64667c.i().i(this.f64668d);
            int size = listI.size();
            for (int i10 = 0; i10 < size; i10++) {
                o.a<?> aVarB = ((d7.o) listI.get(i10)).b(this.f64668d, this.f64669e, this.f64670f, this.f64673i);
                if (aVarB != null) {
                    this.f64665a.add(aVarB);
                }
            }
        }
        return this.f64665a;
    }

    <Data> q<Data, ?, Transcode> h(Class<Data> cls) {
        return this.f64667c.i().h(cls, this.f64671g, this.f64675k);
    }

    Class<?> i() {
        return this.f64668d.getClass();
    }

    List<d7.o<File, ?>> j(File file) throws Registry.NoModelLoaderAvailableException {
        return this.f64667c.i().i(file);
    }

    X6.g k() {
        return this.f64673i;
    }

    com.bumptech.glide.g l() {
        return this.f64679o;
    }

    List<Class<?>> m() {
        return this.f64667c.i().j(this.f64668d.getClass(), this.f64671g, this.f64675k);
    }

    <Z> X6.j<Z> n(Z6.c<Z> cVar) {
        return this.f64667c.i().k(cVar);
    }

    <T> com.bumptech.glide.load.data.e<T> o(T t10) {
        return this.f64667c.i().l(t10);
    }

    X6.e p() {
        return this.f64678n;
    }

    <X> X6.d<X> q(X x10) throws Registry.NoSourceEncoderAvailableException {
        return this.f64667c.i().m(x10);
    }

    Class<?> r() {
        return this.f64675k;
    }

    <Z> X6.k<Z> s(Class<Z> cls) {
        X6.k<Z> kVar = (X6.k) this.f64674j.get(cls);
        if (kVar == null) {
            Iterator<Map.Entry<Class<?>, X6.k<?>>> it = this.f64674j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, X6.k<?>> next = it.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    kVar = (X6.k) next.getValue();
                    break;
                }
            }
        }
        if (kVar != null) {
            return kVar;
        }
        if (!this.f64674j.isEmpty() || !this.f64681q) {
            return f7.k.a();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    int t() {
        return this.f64669e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    <R> void v(com.bumptech.glide.d dVar, Object obj, X6.e eVar, int i10, int i11, Z6.a aVar, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar, X6.g gVar2, Map<Class<?>, X6.k<?>> map, boolean z10, boolean z11, h.e eVar2) {
        this.f64667c = dVar;
        this.f64668d = obj;
        this.f64678n = eVar;
        this.f64669e = i10;
        this.f64670f = i11;
        this.f64680p = aVar;
        this.f64671g = cls;
        this.f64672h = eVar2;
        this.f64675k = cls2;
        this.f64679o = gVar;
        this.f64673i = gVar2;
        this.f64674j = map;
        this.f64681q = z10;
        this.f64682r = z11;
    }

    boolean w(Z6.c<?> cVar) {
        return this.f64667c.i().n(cVar);
    }

    boolean x() {
        return this.f64682r;
    }

    g() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    boolean u(Class<?> cls) {
        if (h(cls) != null) {
            return true;
        }
        return false;
    }

    boolean y(X6.e eVar) {
        List<o.a<?>> listG = g();
        int size = listG.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (listG.get(i10).f128243a.equals(eVar)) {
                return true;
            }
        }
        return false;
    }
}
