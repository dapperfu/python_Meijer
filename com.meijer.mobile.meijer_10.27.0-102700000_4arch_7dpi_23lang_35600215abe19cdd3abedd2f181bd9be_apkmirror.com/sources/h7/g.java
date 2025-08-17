package h7;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.k;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import m7.C15572g;
import p7.l;

/* loaded from: classes4.dex */
class g {

    /* renamed from: a, reason: collision with root package name */
    private final U6.a f134471a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f134472b;

    /* renamed from: c, reason: collision with root package name */
    private final List<b> f134473c;

    /* renamed from: d, reason: collision with root package name */
    final k f134474d;

    /* renamed from: e, reason: collision with root package name */
    private final Y6.d f134475e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f134476f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f134477g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f134478h;

    /* renamed from: i, reason: collision with root package name */
    private com.bumptech.glide.j<Bitmap> f134479i;

    /* renamed from: j, reason: collision with root package name */
    private a f134480j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f134481k;

    /* renamed from: l, reason: collision with root package name */
    private a f134482l;

    /* renamed from: m, reason: collision with root package name */
    private Bitmap f134483m;

    /* renamed from: n, reason: collision with root package name */
    private V6.k<Bitmap> f134484n;

    /* renamed from: o, reason: collision with root package name */
    private a f134485o;

    /* renamed from: p, reason: collision with root package name */
    private int f134486p;

    /* renamed from: q, reason: collision with root package name */
    private int f134487q;

    /* renamed from: r, reason: collision with root package name */
    private int f134488r;

    static class a extends com.bumptech.glide.request.target.c<Bitmap> {

        /* renamed from: d, reason: collision with root package name */
        private final Handler f134489d;

        /* renamed from: e, reason: collision with root package name */
        final int f134490e;

        /* renamed from: f, reason: collision with root package name */
        private final long f134491f;

        /* renamed from: g, reason: collision with root package name */
        private Bitmap f134492g;

        @Override // com.bumptech.glide.request.target.j
        public void onLoadCleared(Drawable drawable) {
            this.f134492g = null;
        }

        Bitmap a() {
            return this.f134492g;
        }

        @Override // com.bumptech.glide.request.target.j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResourceReady(Bitmap bitmap, n7.b<? super Bitmap> bVar) {
            this.f134492g = bitmap;
            this.f134489d.sendMessageAtTime(this.f134489d.obtainMessage(1, this), this.f134491f);
        }

        a(Handler handler, int i10, long j10) {
            this.f134489d = handler;
            this.f134490e = i10;
            this.f134491f = j10;
        }
    }

    public interface b {
        void a();
    }

    private class c implements Handler.Callback {
        c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                g.this.m((a) message.obj);
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            g.this.f134474d.d((a) message.obj);
            return false;
        }
    }

    g(com.bumptech.glide.b bVar, U6.a aVar, int i10, int i11, V6.k<Bitmap> kVar, Bitmap bitmap) {
        this(bVar.f(), com.bumptech.glide.b.t(bVar.h()), aVar, null, i(com.bumptech.glide.b.t(bVar.h()), i10, i11), kVar, bitmap);
    }

    private void q() {
        this.f134476f = false;
    }

    void m(a aVar) {
        this.f134477g = false;
        if (this.f134481k) {
            this.f134472b.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f134476f) {
            if (this.f134478h) {
                this.f134472b.obtainMessage(2, aVar).sendToTarget();
                return;
            } else {
                this.f134485o = aVar;
                return;
            }
        }
        if (aVar.a() != null) {
            n();
            a aVar2 = this.f134480j;
            this.f134480j = aVar;
            for (int size = this.f134473c.size() - 1; size >= 0; size--) {
                this.f134473c.get(size).a();
            }
            if (aVar2 != null) {
                this.f134472b.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        l();
    }

    private static V6.e g() {
        return new o7.d(Double.valueOf(Math.random()));
    }

    private void l() {
        if (!this.f134476f || this.f134477g) {
            return;
        }
        if (this.f134478h) {
            p7.k.a(this.f134485o == null, "Pending target must be null when starting from the first frame");
            this.f134471a.f();
            this.f134478h = false;
        }
        a aVar = this.f134485o;
        if (aVar != null) {
            this.f134485o = null;
            m(aVar);
            return;
        }
        this.f134477g = true;
        long jUptimeMillis = SystemClock.uptimeMillis() + this.f134471a.e();
        this.f134471a.b();
        this.f134482l = new a(this.f134472b, this.f134471a.g(), jUptimeMillis);
        this.f134479i.a(C15572g.t0(g())).F0(this.f134471a).z0(this.f134482l);
    }

    private void n() {
        Bitmap bitmap = this.f134483m;
        if (bitmap != null) {
            this.f134475e.c(bitmap);
            this.f134483m = null;
        }
    }

    private void p() {
        if (this.f134476f) {
            return;
        }
        this.f134476f = true;
        this.f134481k = false;
        l();
    }

    void a() {
        this.f134473c.clear();
        n();
        q();
        a aVar = this.f134480j;
        if (aVar != null) {
            this.f134474d.d(aVar);
            this.f134480j = null;
        }
        a aVar2 = this.f134482l;
        if (aVar2 != null) {
            this.f134474d.d(aVar2);
            this.f134482l = null;
        }
        a aVar3 = this.f134485o;
        if (aVar3 != null) {
            this.f134474d.d(aVar3);
            this.f134485o = null;
        }
        this.f134471a.clear();
        this.f134481k = true;
    }

    ByteBuffer b() {
        return this.f134471a.getData().asReadOnlyBuffer();
    }

    Bitmap c() {
        a aVar = this.f134480j;
        return aVar != null ? aVar.a() : this.f134483m;
    }

    int d() {
        a aVar = this.f134480j;
        if (aVar != null) {
            return aVar.f134490e;
        }
        return -1;
    }

    Bitmap e() {
        return this.f134483m;
    }

    int f() {
        return this.f134471a.c();
    }

    int h() {
        return this.f134488r;
    }

    int j() {
        return this.f134471a.h() + this.f134486p;
    }

    int k() {
        return this.f134487q;
    }

    void r(b bVar) {
        if (this.f134481k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (this.f134473c.contains(bVar)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = this.f134473c.isEmpty();
        this.f134473c.add(bVar);
        if (zIsEmpty) {
            p();
        }
    }

    void s(b bVar) {
        this.f134473c.remove(bVar);
        if (this.f134473c.isEmpty()) {
            q();
        }
    }

    private static com.bumptech.glide.j<Bitmap> i(k kVar, int i10, int i11) {
        return kVar.b().a(C15572g.s0(X6.a.f39158b).o0(true).i0(true).W(i10, i11));
    }

    void o(V6.k<Bitmap> kVar, Bitmap bitmap) {
        this.f134484n = (V6.k) p7.k.d(kVar);
        this.f134483m = (Bitmap) p7.k.d(bitmap);
        this.f134479i = this.f134479i.a(new C15572g().k0(kVar));
        this.f134486p = l.h(bitmap);
        this.f134487q = bitmap.getWidth();
        this.f134488r = bitmap.getHeight();
    }

    g(Y6.d dVar, k kVar, U6.a aVar, Handler handler, com.bumptech.glide.j<Bitmap> jVar, V6.k<Bitmap> kVar2, Bitmap bitmap) {
        this.f134473c = new ArrayList();
        this.f134474d = kVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.f134475e = dVar;
        this.f134472b = handler;
        this.f134479i = jVar;
        this.f134471a = aVar;
        o(kVar2, bitmap);
    }
}
