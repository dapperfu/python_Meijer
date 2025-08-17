package com.bumptech.glide.load.engine;

import b7.o;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.f;
import java.io.File;
import java.util.List;

/* loaded from: classes4.dex */
class s implements f, d.a<Object> {

    /* renamed from: a, reason: collision with root package name */
    private final f.a f63988a;

    /* renamed from: b, reason: collision with root package name */
    private final g<?> f63989b;

    /* renamed from: c, reason: collision with root package name */
    private int f63990c;

    /* renamed from: d, reason: collision with root package name */
    private int f63991d = -1;

    /* renamed from: e, reason: collision with root package name */
    private V6.e f63992e;

    /* renamed from: f, reason: collision with root package name */
    private List<b7.o<File, ?>> f63993f;

    /* renamed from: g, reason: collision with root package name */
    private int f63994g;

    /* renamed from: h, reason: collision with root package name */
    private volatile o.a<?> f63995h;

    /* renamed from: i, reason: collision with root package name */
    private File f63996i;

    /* renamed from: j, reason: collision with root package name */
    private t f63997j;

    private boolean a() {
        return this.f63994g < this.f63993f.size();
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void c(Exception exc) {
        this.f63988a.b(this.f63997j, exc, this.f63995h.f60010c, V6.a.RESOURCE_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.f
    public void cancel() {
        o.a<?> aVar = this.f63995h;
        if (aVar != null) {
            aVar.f60010c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.engine.f
    public boolean d() {
        q7.b.a("ResourceCacheGenerator.startNext");
        try {
            List<V6.e> listC = this.f63989b.c();
            boolean z10 = false;
            if (listC.isEmpty()) {
                q7.b.e();
                return false;
            }
            List<Class<?>> listM = this.f63989b.m();
            if (listM.isEmpty()) {
                if (File.class.equals(this.f63989b.r())) {
                    q7.b.e();
                    return false;
                }
                throw new IllegalStateException("Failed to find any load path from " + this.f63989b.i() + " to " + this.f63989b.r());
            }
            while (true) {
                if (this.f63993f != null && a()) {
                    this.f63995h = null;
                    while (!z10 && a()) {
                        List<b7.o<File, ?>> list = this.f63993f;
                        int i10 = this.f63994g;
                        this.f63994g = i10 + 1;
                        this.f63995h = list.get(i10).b(this.f63996i, this.f63989b.t(), this.f63989b.f(), this.f63989b.k());
                        if (this.f63995h != null && this.f63989b.u(this.f63995h.f60010c.a())) {
                            this.f63995h.f60010c.e(this.f63989b.l(), this);
                            z10 = true;
                        }
                    }
                    q7.b.e();
                    return z10;
                }
                int i11 = this.f63991d + 1;
                this.f63991d = i11;
                if (i11 >= listM.size()) {
                    int i12 = this.f63990c + 1;
                    this.f63990c = i12;
                    if (i12 >= listC.size()) {
                        q7.b.e();
                        return false;
                    }
                    this.f63991d = 0;
                }
                V6.e eVar = listC.get(this.f63990c);
                Class<?> cls = listM.get(this.f63991d);
                this.f63997j = new t(this.f63989b.b(), eVar, this.f63989b.p(), this.f63989b.t(), this.f63989b.f(), this.f63989b.s(cls), cls, this.f63989b.k());
                File fileB = this.f63989b.d().b(this.f63997j);
                this.f63996i = fileB;
                if (fileB != null) {
                    this.f63992e = eVar;
                    this.f63993f = this.f63989b.j(fileB);
                    this.f63994g = 0;
                }
            }
        } catch (Throwable th2) {
            q7.b.e();
            throw th2;
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void f(Object obj) {
        this.f63988a.a(this.f63992e, obj, this.f63995h.f60010c, V6.a.RESOURCE_DISK_CACHE, this.f63997j);
    }

    s(g<?> gVar, f.a aVar) {
        this.f63989b = gVar;
        this.f63988a = aVar;
    }
}
