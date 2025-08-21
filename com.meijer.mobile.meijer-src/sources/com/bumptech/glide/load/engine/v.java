package com.bumptech.glide.load.engine;

import android.util.Log;
import b7.InterfaceC6336a;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.f;
import com.fullstory.FS;
import d7.o;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
class v implements f, f.a {

    /* renamed from: a, reason: collision with root package name */
    private final g<?> f64849a;

    /* renamed from: b, reason: collision with root package name */
    private final f.a f64850b;

    /* renamed from: c, reason: collision with root package name */
    private volatile int f64851c;

    /* renamed from: d, reason: collision with root package name */
    private volatile c f64852d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Object f64853e;

    /* renamed from: f, reason: collision with root package name */
    private volatile o.a<?> f64854f;

    /* renamed from: g, reason: collision with root package name */
    private volatile d f64855g;

    class a implements d.a<Object> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ o.a f64856a;

        a(o.a aVar) {
            this.f64856a = aVar;
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void c(Exception exc) {
            if (v.this.e(this.f64856a)) {
                v.this.g(this.f64856a, exc);
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void f(Object obj) {
            if (v.this.e(this.f64856a)) {
                v.this.f(this.f64856a, obj);
            }
        }
    }

    private boolean c(Object obj) throws Throwable {
        Throwable th2;
        long jB = r7.g.b();
        boolean z10 = false;
        try {
            com.bumptech.glide.load.data.e<T> eVarO = this.f64849a.o(obj);
            Object objA = eVarO.a();
            X6.d<X> dVarQ = this.f64849a.q(objA);
            e eVar = new e(dVarQ, objA, this.f64849a.k());
            d dVar = new d(this.f64854f.f128243a, this.f64849a.p());
            InterfaceC6336a interfaceC6336aD = this.f64849a.d();
            interfaceC6336aD.a(dVar, eVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                FS.log_v("SourceGenerator", "Finished encoding source to cache, key: " + dVar + ", data: " + obj + ", encoder: " + dVarQ + ", duration: " + r7.g.a(jB));
            }
            if (interfaceC6336aD.b(dVar) != null) {
                this.f64855g = dVar;
                this.f64852d = new c(Collections.singletonList(this.f64854f.f128243a), this.f64849a, this);
                this.f64854f.f128245c.b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                FS.log_d("SourceGenerator", "Attempt to write: " + this.f64855g + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f64850b.a(this.f64854f.f128243a, eVarO.a(), this.f64854f.f128245c, this.f64854f.f128245c.d(), this.f64854f.f128243a);
                return false;
            } catch (Throwable th3) {
                th2 = th3;
                z10 = true;
                if (z10) {
                    throw th2;
                }
                this.f64854f.f128245c.b();
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    private boolean d() {
        return this.f64851c < this.f64849a.g().size();
    }

    private void h(o.a<?> aVar) {
        this.f64854f.f128245c.e(this.f64849a.l(), new a(aVar));
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void a(X6.e eVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, X6.a aVar, X6.e eVar2) {
        this.f64850b.a(eVar, obj, dVar, this.f64854f.f128245c.d(), eVar);
    }

    @Override // com.bumptech.glide.load.engine.f
    public boolean b() {
        if (this.f64853e != null) {
            Object obj = this.f64853e;
            this.f64853e = null;
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
        if (this.f64852d != null && this.f64852d.b()) {
            return true;
        }
        this.f64852d = null;
        this.f64854f = null;
        boolean z10 = false;
        while (!z10 && d()) {
            List<o.a<?>> listG = this.f64849a.g();
            int i10 = this.f64851c;
            this.f64851c = i10 + 1;
            this.f64854f = listG.get(i10);
            if (this.f64854f != null && (this.f64849a.e().c(this.f64854f.f128245c.d()) || this.f64849a.u(this.f64854f.f128245c.a()))) {
                h(this.f64854f);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.load.engine.f
    public void cancel() {
        o.a<?> aVar = this.f64854f;
        if (aVar != null) {
            aVar.f128245c.cancel();
        }
    }

    boolean e(o.a<?> aVar) {
        o.a<?> aVar2 = this.f64854f;
        return aVar2 != null && aVar2 == aVar;
    }

    void f(o.a<?> aVar, Object obj) {
        Z6.a aVarE = this.f64849a.e();
        if (obj != null && aVarE.c(aVar.f128245c.d())) {
            this.f64853e = obj;
            this.f64850b.m();
        } else {
            f.a aVar2 = this.f64850b;
            X6.e eVar = aVar.f128243a;
            com.bumptech.glide.load.data.d<?> dVar = aVar.f128245c;
            aVar2.a(eVar, obj, dVar, dVar.d(), this.f64855g);
        }
    }

    void g(o.a<?> aVar, Exception exc) {
        f.a aVar2 = this.f64850b;
        d dVar = this.f64855g;
        com.bumptech.glide.load.data.d<?> dVar2 = aVar.f128245c;
        aVar2.l(dVar, exc, dVar2, dVar2.d());
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void l(X6.e eVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, X6.a aVar) {
        this.f64850b.l(eVar, exc, dVar, this.f64854f.f128245c.d());
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void m() {
        throw new UnsupportedOperationException();
    }

    v(g<?> gVar, f.a aVar) {
        this.f64849a = gVar;
        this.f64850b = aVar;
    }
}
