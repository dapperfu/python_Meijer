package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.f;
import d7.o;
import java.io.File;
import java.util.List;

/* loaded from: classes4.dex */
class s implements f, d.a<Object> {

    /* renamed from: a, reason: collision with root package name */
    private final f.a f64828a;

    /* renamed from: b, reason: collision with root package name */
    private final g<?> f64829b;

    /* renamed from: c, reason: collision with root package name */
    private int f64830c;

    /* renamed from: d, reason: collision with root package name */
    private int f64831d = -1;

    /* renamed from: e, reason: collision with root package name */
    private X6.e f64832e;

    /* renamed from: f, reason: collision with root package name */
    private List<d7.o<File, ?>> f64833f;

    /* renamed from: g, reason: collision with root package name */
    private int f64834g;

    /* renamed from: h, reason: collision with root package name */
    private volatile o.a<?> f64835h;

    /* renamed from: i, reason: collision with root package name */
    private File f64836i;

    /* renamed from: j, reason: collision with root package name */
    private t f64837j;

    private boolean a() {
        return this.f64834g < this.f64833f.size();
    }

    @Override // com.bumptech.glide.load.engine.f
    public boolean b() {
        s7.b.a("ResourceCacheGenerator.startNext");
        try {
            List<X6.e> listC = this.f64829b.c();
            boolean z10 = false;
            if (listC.isEmpty()) {
                s7.b.e();
                return false;
            }
            List<Class<?>> listM = this.f64829b.m();
            if (listM.isEmpty()) {
                if (File.class.equals(this.f64829b.r())) {
                    s7.b.e();
                    return false;
                }
                throw new IllegalStateException("Failed to find any load path from " + this.f64829b.i() + " to " + this.f64829b.r());
            }
            while (true) {
                if (this.f64833f != null && a()) {
                    this.f64835h = null;
                    while (!z10 && a()) {
                        List<d7.o<File, ?>> list = this.f64833f;
                        int i10 = this.f64834g;
                        this.f64834g = i10 + 1;
                        this.f64835h = list.get(i10).b(this.f64836i, this.f64829b.t(), this.f64829b.f(), this.f64829b.k());
                        if (this.f64835h != null && this.f64829b.u(this.f64835h.f128245c.a())) {
                            this.f64835h.f128245c.e(this.f64829b.l(), this);
                            z10 = true;
                        }
                    }
                    s7.b.e();
                    return z10;
                }
                int i11 = this.f64831d + 1;
                this.f64831d = i11;
                if (i11 >= listM.size()) {
                    int i12 = this.f64830c + 1;
                    this.f64830c = i12;
                    if (i12 >= listC.size()) {
                        s7.b.e();
                        return false;
                    }
                    this.f64831d = 0;
                }
                X6.e eVar = listC.get(this.f64830c);
                Class<?> cls = listM.get(this.f64831d);
                this.f64837j = new t(this.f64829b.b(), eVar, this.f64829b.p(), this.f64829b.t(), this.f64829b.f(), this.f64829b.s(cls), cls, this.f64829b.k());
                File fileB = this.f64829b.d().b(this.f64837j);
                this.f64836i = fileB;
                if (fileB != null) {
                    this.f64832e = eVar;
                    this.f64833f = this.f64829b.j(fileB);
                    this.f64834g = 0;
                }
            }
        } catch (Throwable th2) {
            s7.b.e();
            throw th2;
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void c(Exception exc) {
        this.f64828a.l(this.f64837j, exc, this.f64835h.f128245c, X6.a.RESOURCE_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.f
    public void cancel() {
        o.a<?> aVar = this.f64835h;
        if (aVar != null) {
            aVar.f128245c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void f(Object obj) {
        this.f64828a.a(this.f64832e, obj, this.f64835h.f128245c, X6.a.RESOURCE_DISK_CACHE, this.f64837j);
    }

    s(g<?> gVar, f.a aVar) {
        this.f64829b = gVar;
        this.f64828a = aVar;
    }
}
