package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.f;
import d7.o;
import java.io.File;
import java.util.List;

/* loaded from: classes4.dex */
class c implements f, d.a<Object> {

    /* renamed from: a, reason: collision with root package name */
    private final List<X6.e> f64651a;

    /* renamed from: b, reason: collision with root package name */
    private final g<?> f64652b;

    /* renamed from: c, reason: collision with root package name */
    private final f.a f64653c;

    /* renamed from: d, reason: collision with root package name */
    private int f64654d;

    /* renamed from: e, reason: collision with root package name */
    private X6.e f64655e;

    /* renamed from: f, reason: collision with root package name */
    private List<d7.o<File, ?>> f64656f;

    /* renamed from: g, reason: collision with root package name */
    private int f64657g;

    /* renamed from: h, reason: collision with root package name */
    private volatile o.a<?> f64658h;

    /* renamed from: i, reason: collision with root package name */
    private File f64659i;

    c(g<?> gVar, f.a aVar) {
        this(gVar.c(), gVar, aVar);
    }

    c(List<X6.e> list, g<?> gVar, f.a aVar) {
        this.f64654d = -1;
        this.f64651a = list;
        this.f64652b = gVar;
        this.f64653c = aVar;
    }

    private boolean a() {
        return this.f64657g < this.f64656f.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (a() == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        r0 = r7.f64656f;
        r3 = r7.f64657g;
        r7.f64657g = r3 + 1;
        r7.f64658h = r0.get(r3).b(r7.f64659i, r7.f64652b.t(), r7.f64652b.f(), r7.f64652b.k());
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        if (r7.f64658h == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        if (r7.f64652b.u(r7.f64658h.f128245c.a()) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        r7.f64658h.f128245c.e(r7.f64652b.l(), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
    
        r7.f64658h = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
    
        if (r2 != false) goto L40;
     */
    @Override // com.bumptech.glide.load.engine.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b() {
        /*
            r7 = this;
            java.lang.String r0 = "DataCacheGenerator.startNext"
            s7.b.a(r0)
        L5:
            java.util.List<d7.o<java.io.File, ?>> r0 = r7.f64656f     // Catch: java.lang.Throwable -> L68
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L6e
            boolean r0 = r7.a()     // Catch: java.lang.Throwable -> L68
            if (r0 != 0) goto L12
            goto L6e
        L12:
            r0 = 0
            r7.f64658h = r0     // Catch: java.lang.Throwable -> L68
        L15:
            if (r2 != 0) goto L6a
            boolean r0 = r7.a()     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L6a
            java.util.List<d7.o<java.io.File, ?>> r0 = r7.f64656f     // Catch: java.lang.Throwable -> L68
            int r3 = r7.f64657g     // Catch: java.lang.Throwable -> L68
            int r4 = r3 + 1
            r7.f64657g = r4     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L68
            d7.o r0 = (d7.o) r0     // Catch: java.lang.Throwable -> L68
            java.io.File r3 = r7.f64659i     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.g<?> r4 = r7.f64652b     // Catch: java.lang.Throwable -> L68
            int r4 = r4.t()     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.g<?> r5 = r7.f64652b     // Catch: java.lang.Throwable -> L68
            int r5 = r5.f()     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.g<?> r6 = r7.f64652b     // Catch: java.lang.Throwable -> L68
            X6.g r6 = r6.k()     // Catch: java.lang.Throwable -> L68
            d7.o$a r0 = r0.b(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L68
            r7.f64658h = r0     // Catch: java.lang.Throwable -> L68
            d7.o$a<?> r0 = r7.f64658h     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L15
            com.bumptech.glide.load.engine.g<?> r0 = r7.f64652b     // Catch: java.lang.Throwable -> L68
            d7.o$a<?> r3 = r7.f64658h     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.data.d<Data> r3 = r3.f128245c     // Catch: java.lang.Throwable -> L68
            java.lang.Class r3 = r3.a()     // Catch: java.lang.Throwable -> L68
            boolean r0 = r0.u(r3)     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L15
            d7.o$a<?> r0 = r7.f64658h     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.data.d<Data> r0 = r0.f128245c     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.g<?> r2 = r7.f64652b     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.g r2 = r2.l()     // Catch: java.lang.Throwable -> L68
            r0.e(r2, r7)     // Catch: java.lang.Throwable -> L68
            r2 = r1
            goto L15
        L68:
            r0 = move-exception
            goto Lb0
        L6a:
            s7.b.e()
            return r2
        L6e:
            int r0 = r7.f64654d     // Catch: java.lang.Throwable -> L68
            int r0 = r0 + r1
            r7.f64654d = r0     // Catch: java.lang.Throwable -> L68
            java.util.List<X6.e> r1 = r7.f64651a     // Catch: java.lang.Throwable -> L68
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L68
            if (r0 < r1) goto L7f
            s7.b.e()
            return r2
        L7f:
            java.util.List<X6.e> r0 = r7.f64651a     // Catch: java.lang.Throwable -> L68
            int r1 = r7.f64654d     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L68
            X6.e r0 = (X6.e) r0     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.d r1 = new com.bumptech.glide.load.engine.d     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.g<?> r3 = r7.f64652b     // Catch: java.lang.Throwable -> L68
            X6.e r3 = r3.p()     // Catch: java.lang.Throwable -> L68
            r1.<init>(r0, r3)     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.g<?> r3 = r7.f64652b     // Catch: java.lang.Throwable -> L68
            b7.a r3 = r3.d()     // Catch: java.lang.Throwable -> L68
            java.io.File r1 = r3.b(r1)     // Catch: java.lang.Throwable -> L68
            r7.f64659i = r1     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L5
            r7.f64655e = r0     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.g<?> r0 = r7.f64652b     // Catch: java.lang.Throwable -> L68
            java.util.List r0 = r0.j(r1)     // Catch: java.lang.Throwable -> L68
            r7.f64656f = r0     // Catch: java.lang.Throwable -> L68
            r7.f64657g = r2     // Catch: java.lang.Throwable -> L68
            goto L5
        Lb0:
            s7.b.e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.c.b():boolean");
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void c(Exception exc) {
        this.f64653c.l(this.f64655e, exc, this.f64658h.f128245c, X6.a.DATA_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.f
    public void cancel() {
        o.a<?> aVar = this.f64658h;
        if (aVar != null) {
            aVar.f128245c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void f(Object obj) {
        this.f64653c.a(this.f64655e, obj, this.f64658h.f128245c, X6.a.DATA_DISK_CACHE, this.f64655e);
    }
}
