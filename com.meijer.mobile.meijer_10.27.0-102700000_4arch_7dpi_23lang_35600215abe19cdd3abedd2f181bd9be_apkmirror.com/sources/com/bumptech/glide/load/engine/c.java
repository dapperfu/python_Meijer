package com.bumptech.glide.load.engine;

import b7.o;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.f;
import java.io.File;
import java.util.List;

/* loaded from: classes4.dex */
class c implements f, d.a<Object> {

    /* renamed from: a, reason: collision with root package name */
    private final List<V6.e> f63811a;

    /* renamed from: b, reason: collision with root package name */
    private final g<?> f63812b;

    /* renamed from: c, reason: collision with root package name */
    private final f.a f63813c;

    /* renamed from: d, reason: collision with root package name */
    private int f63814d;

    /* renamed from: e, reason: collision with root package name */
    private V6.e f63815e;

    /* renamed from: f, reason: collision with root package name */
    private List<b7.o<File, ?>> f63816f;

    /* renamed from: g, reason: collision with root package name */
    private int f63817g;

    /* renamed from: h, reason: collision with root package name */
    private volatile o.a<?> f63818h;

    /* renamed from: i, reason: collision with root package name */
    private File f63819i;

    c(g<?> gVar, f.a aVar) {
        this(gVar.c(), gVar, aVar);
    }

    c(List<V6.e> list, g<?> gVar, f.a aVar) {
        this.f63814d = -1;
        this.f63811a = list;
        this.f63812b = gVar;
        this.f63813c = aVar;
    }

    private boolean a() {
        return this.f63817g < this.f63816f.size();
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void c(Exception exc) {
        this.f63813c.b(this.f63815e, exc, this.f63818h.f60010c, V6.a.DATA_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.f
    public void cancel() {
        o.a<?> aVar = this.f63818h;
        if (aVar != null) {
            aVar.f60010c.cancel();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (a() == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        r0 = r7.f63816f;
        r3 = r7.f63817g;
        r7.f63817g = r3 + 1;
        r7.f63818h = r0.get(r3).b(r7.f63819i, r7.f63812b.t(), r7.f63812b.f(), r7.f63812b.k());
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        if (r7.f63818h == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        if (r7.f63812b.u(r7.f63818h.f60010c.a()) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        r7.f63818h.f60010c.e(r7.f63812b.l(), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
    
        r7.f63818h = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
    
        if (r2 != false) goto L40;
     */
    @Override // com.bumptech.glide.load.engine.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d() {
        /*
            r7 = this;
            java.lang.String r0 = "DataCacheGenerator.startNext"
            q7.b.a(r0)
        L5:
            java.util.List<b7.o<java.io.File, ?>> r0 = r7.f63816f     // Catch: java.lang.Throwable -> L68
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L6e
            boolean r0 = r7.a()     // Catch: java.lang.Throwable -> L68
            if (r0 != 0) goto L12
            goto L6e
        L12:
            r0 = 0
            r7.f63818h = r0     // Catch: java.lang.Throwable -> L68
        L15:
            if (r2 != 0) goto L6a
            boolean r0 = r7.a()     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L6a
            java.util.List<b7.o<java.io.File, ?>> r0 = r7.f63816f     // Catch: java.lang.Throwable -> L68
            int r3 = r7.f63817g     // Catch: java.lang.Throwable -> L68
            int r4 = r3 + 1
            r7.f63817g = r4     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L68
            b7.o r0 = (b7.o) r0     // Catch: java.lang.Throwable -> L68
            java.io.File r3 = r7.f63819i     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.g<?> r4 = r7.f63812b     // Catch: java.lang.Throwable -> L68
            int r4 = r4.t()     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.g<?> r5 = r7.f63812b     // Catch: java.lang.Throwable -> L68
            int r5 = r5.f()     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.g<?> r6 = r7.f63812b     // Catch: java.lang.Throwable -> L68
            V6.g r6 = r6.k()     // Catch: java.lang.Throwable -> L68
            b7.o$a r0 = r0.b(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L68
            r7.f63818h = r0     // Catch: java.lang.Throwable -> L68
            b7.o$a<?> r0 = r7.f63818h     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L15
            com.bumptech.glide.load.engine.g<?> r0 = r7.f63812b     // Catch: java.lang.Throwable -> L68
            b7.o$a<?> r3 = r7.f63818h     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.data.d<Data> r3 = r3.f60010c     // Catch: java.lang.Throwable -> L68
            java.lang.Class r3 = r3.a()     // Catch: java.lang.Throwable -> L68
            boolean r0 = r0.u(r3)     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L15
            b7.o$a<?> r0 = r7.f63818h     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.data.d<Data> r0 = r0.f60010c     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.g<?> r2 = r7.f63812b     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.g r2 = r2.l()     // Catch: java.lang.Throwable -> L68
            r0.e(r2, r7)     // Catch: java.lang.Throwable -> L68
            r2 = r1
            goto L15
        L68:
            r0 = move-exception
            goto Lb0
        L6a:
            q7.b.e()
            return r2
        L6e:
            int r0 = r7.f63814d     // Catch: java.lang.Throwable -> L68
            int r0 = r0 + r1
            r7.f63814d = r0     // Catch: java.lang.Throwable -> L68
            java.util.List<V6.e> r1 = r7.f63811a     // Catch: java.lang.Throwable -> L68
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L68
            if (r0 < r1) goto L7f
            q7.b.e()
            return r2
        L7f:
            java.util.List<V6.e> r0 = r7.f63811a     // Catch: java.lang.Throwable -> L68
            int r1 = r7.f63814d     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L68
            V6.e r0 = (V6.e) r0     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.d r1 = new com.bumptech.glide.load.engine.d     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.g<?> r3 = r7.f63812b     // Catch: java.lang.Throwable -> L68
            V6.e r3 = r3.p()     // Catch: java.lang.Throwable -> L68
            r1.<init>(r0, r3)     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.g<?> r3 = r7.f63812b     // Catch: java.lang.Throwable -> L68
            Z6.a r3 = r3.d()     // Catch: java.lang.Throwable -> L68
            java.io.File r1 = r3.b(r1)     // Catch: java.lang.Throwable -> L68
            r7.f63819i = r1     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L5
            r7.f63815e = r0     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.g<?> r0 = r7.f63812b     // Catch: java.lang.Throwable -> L68
            java.util.List r0 = r0.j(r1)     // Catch: java.lang.Throwable -> L68
            r7.f63816f = r0     // Catch: java.lang.Throwable -> L68
            r7.f63817g = r2     // Catch: java.lang.Throwable -> L68
            goto L5
        Lb0:
            q7.b.e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.c.d():boolean");
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void f(Object obj) {
        this.f63813c.a(this.f63815e, obj, this.f63818h.f60010c, V6.a.DATA_DISK_CACHE, this.f63815e);
    }
}
