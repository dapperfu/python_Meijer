package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.NetworkInfo;
import com.squareup.picasso.Downloader;
import com.squareup.picasso.o;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import ku.InterfaceC15321a;

/* loaded from: classes11.dex */
class c implements Runnable {

    /* renamed from: r, reason: collision with root package name */
    private static final Object f126482r = new Object();

    /* renamed from: s, reason: collision with root package name */
    private static final ThreadLocal<StringBuilder> f126483s = new a();

    /* renamed from: t, reason: collision with root package name */
    private static final AtomicInteger f126484t = new AtomicInteger();

    /* renamed from: u, reason: collision with root package name */
    private static final r f126485u = new b();

    /* renamed from: a, reason: collision with root package name */
    final int f126486a = f126484t.incrementAndGet();

    /* renamed from: b, reason: collision with root package name */
    final o f126487b;

    /* renamed from: c, reason: collision with root package name */
    final g f126488c;

    /* renamed from: d, reason: collision with root package name */
    final InterfaceC15321a f126489d;

    /* renamed from: e, reason: collision with root package name */
    final t f126490e;

    /* renamed from: f, reason: collision with root package name */
    final String f126491f;

    /* renamed from: g, reason: collision with root package name */
    final int f126492g;

    /* renamed from: h, reason: collision with root package name */
    int f126493h;

    /* renamed from: i, reason: collision with root package name */
    final r f126494i;

    /* renamed from: j, reason: collision with root package name */
    com.squareup.picasso.a f126495j;

    /* renamed from: k, reason: collision with root package name */
    List<com.squareup.picasso.a> f126496k;

    /* renamed from: l, reason: collision with root package name */
    Bitmap f126497l;

    /* renamed from: m, reason: collision with root package name */
    Future<?> f126498m;

    /* renamed from: n, reason: collision with root package name */
    o.e f126499n;

    /* renamed from: o, reason: collision with root package name */
    Exception f126500o;

    /* renamed from: p, reason: collision with root package name */
    int f126501p;

    /* renamed from: q, reason: collision with root package name */
    o.f f126502q;

    static class a extends ThreadLocal<StringBuilder> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }

        a() {
        }
    }

    static void u(q qVar) {
        throw null;
    }

    q j() {
        return null;
    }

    static class b extends r {
        @Override // com.squareup.picasso.r
        public boolean a(q qVar) {
            return true;
        }

        b() {
        }
    }

    private o.f e() {
        o.f fVarH = o.f.LOW;
        List<com.squareup.picasso.a> list = this.f126496k;
        boolean z10 = (list == null || list.isEmpty()) ? false : true;
        com.squareup.picasso.a aVar = this.f126495j;
        if (aVar == null && !z10) {
            return fVarH;
        }
        if (aVar != null) {
            fVarH = aVar.h();
        }
        if (z10) {
            int size = this.f126496k.size();
            for (int i10 = 0; i10 < size; i10++) {
                o.f fVarH2 = this.f126496k.get(i10).h();
                if (fVarH2.ordinal() > fVarH.ordinal()) {
                    fVarH = fVarH2;
                }
            }
        }
        return fVarH;
    }

    void a(com.squareup.picasso.a aVar) {
        boolean z10 = this.f126487b.f126562n;
        aVar.getClass();
        if (this.f126495j == null) {
            this.f126495j = aVar;
            if (z10) {
                List<com.squareup.picasso.a> list = this.f126496k;
                if (list != null && !list.isEmpty()) {
                    throw null;
                }
                throw null;
            }
            return;
        }
        if (this.f126496k == null) {
            this.f126496k = new ArrayList(3);
        }
        this.f126496k.add(aVar);
        if (z10) {
            throw null;
        }
        o.f fVarH = aVar.h();
        if (fVarH.ordinal() > this.f126502q.ordinal()) {
            this.f126502q = fVarH;
        }
    }

    boolean b() {
        List<com.squareup.picasso.a> list;
        Future<?> future;
        return this.f126495j == null && ((list = this.f126496k) == null || list.isEmpty()) && (future = this.f126498m) != null && future.cancel(false);
    }

    void f(com.squareup.picasso.a aVar) {
        boolean zRemove;
        if (this.f126495j == aVar) {
            this.f126495j = null;
            zRemove = true;
        } else {
            List<com.squareup.picasso.a> list = this.f126496k;
            zRemove = list != null ? list.remove(aVar) : false;
        }
        if (zRemove && aVar.h() == this.f126502q) {
            this.f126502q = e();
        }
        if (this.f126487b.f126562n) {
            aVar.getClass();
            throw null;
        }
    }

    com.squareup.picasso.a h() {
        return this.f126495j;
    }

    List<com.squareup.picasso.a> i() {
        return this.f126496k;
    }

    Exception k() {
        return this.f126500o;
    }

    String l() {
        return this.f126491f;
    }

    int m() {
        return this.f126492g;
    }

    o n() {
        return this.f126487b;
    }

    o.f o() {
        return this.f126502q;
    }

    Bitmap p() {
        return this.f126497l;
    }

    Bitmap q() throws IOException {
        Bitmap bitmapA;
        if (!k.a(this.f126492g) || (bitmapA = this.f126489d.a(this.f126491f)) == null) {
            if (this.f126501p != 0) {
                throw null;
            }
            int i10 = l.OFFLINE.f126543a;
            throw null;
        }
        this.f126490e.b();
        this.f126499n = o.e.MEMORY;
        if (this.f126487b.f126562n) {
            throw null;
        }
        return bitmapA;
    }

    boolean r() {
        Future<?> future = this.f126498m;
        return future != null && future.isCancelled();
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                try {
                    try {
                        u(null);
                        if (this.f126487b.f126562n) {
                            v.n("Hunter", "executing", v.h(this));
                        }
                        Bitmap bitmapQ = q();
                        this.f126497l = bitmapQ;
                        if (bitmapQ == null) {
                            this.f126488c.e(this);
                        } else {
                            this.f126488c.d(this);
                        }
                        Thread.currentThread().setName("Picasso-Idle");
                    } catch (IOException e10) {
                        this.f126500o = e10;
                        this.f126488c.g(this);
                        Thread.currentThread().setName("Picasso-Idle");
                    }
                } catch (Downloader.ResponseException e11) {
                    if (!e11.f126470a || e11.f126471b != 504) {
                        this.f126500o = e11;
                    }
                    this.f126488c.e(this);
                    Thread.currentThread().setName("Picasso-Idle");
                }
            } catch (Exception e12) {
                this.f126500o = e12;
                this.f126488c.e(this);
                Thread.currentThread().setName("Picasso-Idle");
            } catch (OutOfMemoryError e13) {
                StringWriter stringWriter = new StringWriter();
                this.f126490e.a().a(new PrintWriter(stringWriter));
                this.f126500o = new RuntimeException(stringWriter.toString(), e13);
                this.f126488c.e(this);
                Thread.currentThread().setName("Picasso-Idle");
            }
        } catch (Throwable th2) {
            Thread.currentThread().setName("Picasso-Idle");
            throw th2;
        }
    }

    boolean s(boolean z10, NetworkInfo networkInfo) {
        int i10 = this.f126501p;
        if (i10 <= 0) {
            return false;
        }
        this.f126501p = i10 - 1;
        return this.f126494i.c(z10, networkInfo);
    }

    boolean t() {
        return this.f126494i.d();
    }

    c(o oVar, g gVar, InterfaceC15321a interfaceC15321a, t tVar, com.squareup.picasso.a aVar, r rVar) {
        this.f126487b = oVar;
        this.f126488c = gVar;
        this.f126489d = interfaceC15321a;
        this.f126490e = tVar;
        this.f126495j = aVar;
        this.f126491f = aVar.d();
        aVar.i();
        this.f126502q = aVar.h();
        this.f126492g = aVar.e();
        this.f126493h = aVar.f();
        this.f126494i = rVar;
        this.f126501p = rVar.b();
    }

    static c g(o oVar, g gVar, InterfaceC15321a interfaceC15321a, t tVar, com.squareup.picasso.a aVar) {
        aVar.i();
        List<r> listF = oVar.f();
        int size = listF.size();
        for (int i10 = 0; i10 < size; i10++) {
            r rVar = listF.get(i10);
            if (rVar.a(null)) {
                return new c(oVar, gVar, interfaceC15321a, tVar, aVar, rVar);
            }
        }
        return new c(oVar, gVar, interfaceC15321a, tVar, aVar, f126485u);
    }
}
