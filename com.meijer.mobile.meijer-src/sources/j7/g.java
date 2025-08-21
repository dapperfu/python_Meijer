package j7;

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
import o7.C16082g;
import r7.l;

/* loaded from: classes4.dex */
class g {

    /* renamed from: a, reason: collision with root package name */
    private final W6.a f140158a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f140159b;

    /* renamed from: c, reason: collision with root package name */
    private final List<b> f140160c;

    /* renamed from: d, reason: collision with root package name */
    final k f140161d;

    /* renamed from: e, reason: collision with root package name */
    private final a7.d f140162e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f140163f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f140164g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f140165h;

    /* renamed from: i, reason: collision with root package name */
    private com.bumptech.glide.j<Bitmap> f140166i;

    /* renamed from: j, reason: collision with root package name */
    private a f140167j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f140168k;

    /* renamed from: l, reason: collision with root package name */
    private a f140169l;

    /* renamed from: m, reason: collision with root package name */
    private Bitmap f140170m;

    /* renamed from: n, reason: collision with root package name */
    private X6.k<Bitmap> f140171n;

    /* renamed from: o, reason: collision with root package name */
    private a f140172o;

    /* renamed from: p, reason: collision with root package name */
    private int f140173p;

    /* renamed from: q, reason: collision with root package name */
    private int f140174q;

    /* renamed from: r, reason: collision with root package name */
    private int f140175r;

    static class a extends com.bumptech.glide.request.target.c<Bitmap> {

        /* renamed from: d, reason: collision with root package name */
        private final Handler f140176d;

        /* renamed from: e, reason: collision with root package name */
        final int f140177e;

        /* renamed from: f, reason: collision with root package name */
        private final long f140178f;

        /* renamed from: g, reason: collision with root package name */
        private Bitmap f140179g;

        @Override // com.bumptech.glide.request.target.j
        public void onLoadCleared(Drawable drawable) {
            this.f140179g = null;
        }

        Bitmap a() {
            return this.f140179g;
        }

        @Override // com.bumptech.glide.request.target.j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResourceReady(Bitmap bitmap, p7.b<? super Bitmap> bVar) {
            this.f140179g = bitmap;
            this.f140176d.sendMessageAtTime(this.f140176d.obtainMessage(1, this), this.f140178f);
        }

        a(Handler handler, int i10, long j10) {
            this.f140176d = handler;
            this.f140177e = i10;
            this.f140178f = j10;
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
            g.this.f140161d.d((a) message.obj);
            return false;
        }
    }

    g(com.bumptech.glide.b bVar, W6.a aVar, int i10, int i11, X6.k<Bitmap> kVar, Bitmap bitmap) {
        this(bVar.f(), com.bumptech.glide.b.t(bVar.h()), aVar, null, i(com.bumptech.glide.b.t(bVar.h()), i10, i11), kVar, bitmap);
    }

    private void q() {
        this.f140163f = false;
    }

    void m(a aVar) {
        this.f140164g = false;
        if (this.f140168k) {
            this.f140159b.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f140163f) {
            if (this.f140165h) {
                this.f140159b.obtainMessage(2, aVar).sendToTarget();
                return;
            } else {
                this.f140172o = aVar;
                return;
            }
        }
        if (aVar.a() != null) {
            n();
            a aVar2 = this.f140167j;
            this.f140167j = aVar;
            for (int size = this.f140160c.size() - 1; size >= 0; size--) {
                this.f140160c.get(size).a();
            }
            if (aVar2 != null) {
                this.f140159b.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        l();
    }

    private static X6.e g() {
        return new q7.d(Double.valueOf(Math.random()));
    }

    private void l() {
        if (!this.f140163f || this.f140164g) {
            return;
        }
        if (this.f140165h) {
            r7.k.a(this.f140172o == null, "Pending target must be null when starting from the first frame");
            this.f140158a.f();
            this.f140165h = false;
        }
        a aVar = this.f140172o;
        if (aVar != null) {
            this.f140172o = null;
            m(aVar);
            return;
        }
        this.f140164g = true;
        long jUptimeMillis = SystemClock.uptimeMillis() + this.f140158a.e();
        this.f140158a.b();
        this.f140169l = new a(this.f140159b, this.f140158a.g(), jUptimeMillis);
        this.f140166i.a(C16082g.t0(g())).F0(this.f140158a).z0(this.f140169l);
    }

    private void n() {
        Bitmap bitmap = this.f140170m;
        if (bitmap != null) {
            this.f140162e.c(bitmap);
            this.f140170m = null;
        }
    }

    private void p() {
        if (this.f140163f) {
            return;
        }
        this.f140163f = true;
        this.f140168k = false;
        l();
    }

    void a() {
        this.f140160c.clear();
        n();
        q();
        a aVar = this.f140167j;
        if (aVar != null) {
            this.f140161d.d(aVar);
            this.f140167j = null;
        }
        a aVar2 = this.f140169l;
        if (aVar2 != null) {
            this.f140161d.d(aVar2);
            this.f140169l = null;
        }
        a aVar3 = this.f140172o;
        if (aVar3 != null) {
            this.f140161d.d(aVar3);
            this.f140172o = null;
        }
        this.f140158a.clear();
        this.f140168k = true;
    }

    ByteBuffer b() {
        return this.f140158a.getData().asReadOnlyBuffer();
    }

    Bitmap c() {
        a aVar = this.f140167j;
        return aVar != null ? aVar.a() : this.f140170m;
    }

    int d() {
        a aVar = this.f140167j;
        if (aVar != null) {
            return aVar.f140177e;
        }
        return -1;
    }

    Bitmap e() {
        return this.f140170m;
    }

    int f() {
        return this.f140158a.c();
    }

    int h() {
        return this.f140175r;
    }

    int j() {
        return this.f140158a.h() + this.f140173p;
    }

    int k() {
        return this.f140174q;
    }

    void r(b bVar) {
        if (this.f140168k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (this.f140160c.contains(bVar)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = this.f140160c.isEmpty();
        this.f140160c.add(bVar);
        if (zIsEmpty) {
            p();
        }
    }

    void s(b bVar) {
        this.f140160c.remove(bVar);
        if (this.f140160c.isEmpty()) {
            q();
        }
    }

    private static com.bumptech.glide.j<Bitmap> i(k kVar, int i10, int i11) {
        return kVar.b().a(C16082g.s0(Z6.a.f43636b).o0(true).i0(true).W(i10, i11));
    }

    void o(X6.k<Bitmap> kVar, Bitmap bitmap) {
        this.f140171n = (X6.k) r7.k.d(kVar);
        this.f140170m = (Bitmap) r7.k.d(bitmap);
        this.f140166i = this.f140166i.a(new C16082g().k0(kVar));
        this.f140173p = l.h(bitmap);
        this.f140174q = bitmap.getWidth();
        this.f140175r = bitmap.getHeight();
    }

    g(a7.d dVar, k kVar, W6.a aVar, Handler handler, com.bumptech.glide.j<Bitmap> jVar, X6.k<Bitmap> kVar2, Bitmap bitmap) {
        this.f140160c = new ArrayList();
        this.f140161d = kVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.f140162e = dVar;
        this.f140159b = handler;
        this.f140166i = jVar;
        this.f140158a = aVar;
        o(kVar2, bitmap);
    }
}
