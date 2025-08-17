package com.bumptech.glide.load.engine;

import b7.o;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.engine.h;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
final class g<Transcode> {

    /* renamed from: a, reason: collision with root package name */
    private final List<o.a<?>> f63825a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List<V6.e> f63826b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private com.bumptech.glide.d f63827c;

    /* renamed from: d, reason: collision with root package name */
    private Object f63828d;

    /* renamed from: e, reason: collision with root package name */
    private int f63829e;

    /* renamed from: f, reason: collision with root package name */
    private int f63830f;

    /* renamed from: g, reason: collision with root package name */
    private Class<?> f63831g;

    /* renamed from: h, reason: collision with root package name */
    private h.e f63832h;

    /* renamed from: i, reason: collision with root package name */
    private V6.g f63833i;

    /* renamed from: j, reason: collision with root package name */
    private Map<Class<?>, V6.k<?>> f63834j;

    /* renamed from: k, reason: collision with root package name */
    private Class<Transcode> f63835k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f63836l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f63837m;

    /* renamed from: n, reason: collision with root package name */
    private V6.e f63838n;

    /* renamed from: o, reason: collision with root package name */
    private com.bumptech.glide.g f63839o;

    /* renamed from: p, reason: collision with root package name */
    private X6.a f63840p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f63841q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f63842r;

    void a() {
        this.f63827c = null;
        this.f63828d = null;
        this.f63838n = null;
        this.f63831g = null;
        this.f63835k = null;
        this.f63833i = null;
        this.f63839o = null;
        this.f63834j = null;
        this.f63840p = null;
        this.f63825a.clear();
        this.f63836l = false;
        this.f63826b.clear();
        this.f63837m = false;
    }

    Y6.b b() {
        return this.f63827c.b();
    }

    List<V6.e> c() {
        if (!this.f63837m) {
            this.f63837m = true;
            this.f63826b.clear();
            List<o.a<?>> listG = g();
            int size = listG.size();
            for (int i10 = 0; i10 < size; i10++) {
                o.a<?> aVar = listG.get(i10);
                if (!this.f63826b.contains(aVar.f60008a)) {
                    this.f63826b.add(aVar.f60008a);
                }
                for (int i11 = 0; i11 < aVar.f60009b.size(); i11++) {
                    if (!this.f63826b.contains(aVar.f60009b.get(i11))) {
                        this.f63826b.add(aVar.f60009b.get(i11));
                    }
                }
            }
        }
        return this.f63826b;
    }

    Z6.a d() {
        return this.f63832h.a();
    }

    X6.a e() {
        return this.f63840p;
    }

    int f() {
        return this.f63830f;
    }

    List<o.a<?>> g() {
        if (!this.f63836l) {
            this.f63836l = true;
            this.f63825a.clear();
            List listI = this.f63827c.i().i(this.f63828d);
            int size = listI.size();
            for (int i10 = 0; i10 < size; i10++) {
                o.a<?> aVarB = ((b7.o) listI.get(i10)).b(this.f63828d, this.f63829e, this.f63830f, this.f63833i);
                if (aVarB != null) {
                    this.f63825a.add(aVarB);
                }
            }
        }
        return this.f63825a;
    }

    <Data> q<Data, ?, Transcode> h(Class<Data> cls) {
        return this.f63827c.i().h(cls, this.f63831g, this.f63835k);
    }

    Class<?> i() {
        return this.f63828d.getClass();
    }

    List<b7.o<File, ?>> j(File file) throws Registry.NoModelLoaderAvailableException {
        return this.f63827c.i().i(file);
    }

    V6.g k() {
        return this.f63833i;
    }

    com.bumptech.glide.g l() {
        return this.f63839o;
    }

    List<Class<?>> m() {
        return this.f63827c.i().j(this.f63828d.getClass(), this.f63831g, this.f63835k);
    }

    <Z> V6.j<Z> n(X6.c<Z> cVar) {
        return this.f63827c.i().k(cVar);
    }

    <T> com.bumptech.glide.load.data.e<T> o(T t10) {
        return this.f63827c.i().l(t10);
    }

    V6.e p() {
        return this.f63838n;
    }

    <X> V6.d<X> q(X x10) throws Registry.NoSourceEncoderAvailableException {
        return this.f63827c.i().m(x10);
    }

    Class<?> r() {
        return this.f63835k;
    }

    <Z> V6.k<Z> s(Class<Z> cls) {
        V6.k<Z> kVar = (V6.k) this.f63834j.get(cls);
        if (kVar == null) {
            Iterator<Map.Entry<Class<?>, V6.k<?>>> it = this.f63834j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, V6.k<?>> next = it.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    kVar = (V6.k) next.getValue();
                    break;
                }
            }
        }
        if (kVar != null) {
            return kVar;
        }
        if (!this.f63834j.isEmpty() || !this.f63841q) {
            return d7.k.a();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    int t() {
        return this.f63829e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    <R> void v(com.bumptech.glide.d dVar, Object obj, V6.e eVar, int i10, int i11, X6.a aVar, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar, V6.g gVar2, Map<Class<?>, V6.k<?>> map, boolean z10, boolean z11, h.e eVar2) {
        this.f63827c = dVar;
        this.f63828d = obj;
        this.f63838n = eVar;
        this.f63829e = i10;
        this.f63830f = i11;
        this.f63840p = aVar;
        this.f63831g = cls;
        this.f63832h = eVar2;
        this.f63835k = cls2;
        this.f63839o = gVar;
        this.f63833i = gVar2;
        this.f63834j = map;
        this.f63841q = z10;
        this.f63842r = z11;
    }

    boolean w(X6.c<?> cVar) {
        return this.f63827c.i().n(cVar);
    }

    boolean x() {
        return this.f63842r;
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

    boolean y(V6.e eVar) {
        List<o.a<?>> listG = g();
        int size = listG.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (listG.get(i10).f60008a.equals(eVar)) {
                return true;
            }
        }
        return false;
    }
}
