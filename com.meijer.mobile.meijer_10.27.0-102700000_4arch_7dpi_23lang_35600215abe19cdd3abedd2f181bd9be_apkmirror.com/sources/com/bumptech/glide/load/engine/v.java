package com.bumptech.glide.load.engine;

import android.util.Log;
import b7.o;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.f;
import com.fullstory.FS;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
class v implements f, f.a {

    /* renamed from: a, reason: collision with root package name */
    private final g<?> f64009a;

    /* renamed from: b, reason: collision with root package name */
    private final f.a f64010b;

    /* renamed from: c, reason: collision with root package name */
    private volatile int f64011c;

    /* renamed from: d, reason: collision with root package name */
    private volatile c f64012d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Object f64013e;

    /* renamed from: f, reason: collision with root package name */
    private volatile o.a<?> f64014f;

    /* renamed from: g, reason: collision with root package name */
    private volatile d f64015g;

    class a implements d.a<Object> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ o.a f64016a;

        a(o.a aVar) {
            this.f64016a = aVar;
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void c(Exception exc) {
            if (v.this.f(this.f64016a)) {
                v.this.h(this.f64016a, exc);
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void f(Object obj) {
            if (v.this.f(this.f64016a)) {
                v.this.g(this.f64016a, obj);
            }
        }
    }

    private boolean c(Object obj) throws Throwable {
        Throwable th2;
        long jB = p7.g.b();
        boolean z10 = false;
        try {
            com.bumptech.glide.load.data.e<T> eVarO = this.f64009a.o(obj);
            Object objA = eVarO.a();
            V6.d<X> dVarQ = this.f64009a.q(objA);
            e eVar = new e(dVarQ, objA, this.f64009a.k());
            d dVar = new d(this.f64014f.f60008a, this.f64009a.p());
            Z6.a aVarD = this.f64009a.d();
            aVarD.a(dVar, eVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                FS.log_v("SourceGenerator", "Finished encoding source to cache, key: " + dVar + ", data: " + obj + ", encoder: " + dVarQ + ", duration: " + p7.g.a(jB));
            }
            if (aVarD.b(dVar) != null) {
                this.f64015g = dVar;
                this.f64012d = new c(Collections.singletonList(this.f64014f.f60008a), this.f64009a, this);
                this.f64014f.f60010c.b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                FS.log_d("SourceGenerator", "Attempt to write: " + this.f64015g + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f64010b.a(this.f64014f.f60008a, eVarO.a(), this.f64014f.f60010c, this.f64014f.f60010c.d(), this.f64014f.f60008a);
                return false;
            } catch (Throwable th3) {
                th2 = th3;
                z10 = true;
                if (z10) {
                    throw th2;
                }
                this.f64014f.f60010c.b();
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    private boolean e() {
        return this.f64011c < this.f64009a.g().size();
    }

    private void i(o.a<?> aVar) {
        this.f64014f.f60010c.e(this.f64009a.l(), new a(aVar));
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void a(V6.e eVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, V6.a aVar, V6.e eVar2) {
        this.f64010b.a(eVar, obj, dVar, this.f64014f.f60010c.d(), eVar);
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void b(V6.e eVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, V6.a aVar) {
        this.f64010b.b(eVar, exc, dVar, this.f64014f.f60010c.d());
    }

    @Override // com.bumptech.glide.load.engine.f
    public void cancel() {
        o.a<?> aVar = this.f64014f;
        if (aVar != null) {
            aVar.f60010c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.engine.f
    public boolean d() {
        if (this.f64013e != null) {
            Object obj = this.f64013e;
            this.f64013e = null;
            try {
                if (!c(obj)) {
                    return true;
                }
            } catch (IOException e10) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    FS.log_d("SourceGenerator", "Failed to properly rewind or write data to cache", e10);
                }
            }
        }
        if (this.f64012d != null && this.f64012d.d()) {
            return true;
        }
        this.f64012d = null;
        this.f64014f = null;
        boolean z10 = false;
        while (!z10 && e()) {
            List<o.a<?>> listG = this.f64009a.g();
            int i10 = this.f64011c;
            this.f64011c = i10 + 1;
            this.f64014f = listG.get(i10);
            if (this.f64014f != null && (this.f64009a.e().c(this.f64014f.f60010c.d()) || this.f64009a.u(this.f64014f.f60010c.a()))) {
                i(this.f64014f);
                z10 = true;
            }
        }
        return z10;
    }

    boolean f(o.a<?> aVar) {
        o.a<?> aVar2 = this.f64014f;
        return aVar2 != null && aVar2 == aVar;
    }

    void g(o.a<?> aVar, Object obj) {
        X6.a aVarE = this.f64009a.e();
        if (obj != null && aVarE.c(aVar.f60010c.d())) {
            this.f64013e = obj;
            this.f64010b.l();
        } else {
            f.a aVar2 = this.f64010b;
            V6.e eVar = aVar.f60008a;
            com.bumptech.glide.load.data.d<?> dVar = aVar.f60010c;
            aVar2.a(eVar, obj, dVar, dVar.d(), this.f64015g);
        }
    }

    void h(o.a<?> aVar, Exception exc) {
        f.a aVar2 = this.f64010b;
        d dVar = this.f64015g;
        com.bumptech.glide.load.data.d<?> dVar2 = aVar.f60010c;
        aVar2.b(dVar, exc, dVar2, dVar2.d());
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void l() {
        throw new UnsupportedOperationException();
    }

    v(g<?> gVar, f.a aVar) {
        this.f64009a = gVar;
        this.f64010b = aVar;
    }
}
