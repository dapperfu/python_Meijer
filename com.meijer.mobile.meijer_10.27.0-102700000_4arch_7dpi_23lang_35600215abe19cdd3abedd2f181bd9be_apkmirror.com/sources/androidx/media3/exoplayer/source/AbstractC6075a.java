package androidx.media3.exoplayer.source;

import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.drm.h;
import androidx.media3.exoplayer.source.r;
import androidx.media3.exoplayer.source.s;
import d3.C13466a;
import i3.E1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: androidx.media3.exoplayer.source.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6075a implements r {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<r.c> f56791a = new ArrayList<>(1);

    /* renamed from: b, reason: collision with root package name */
    private final HashSet<r.c> f56792b = new HashSet<>(1);

    /* renamed from: c, reason: collision with root package name */
    private final s.a f56793c = new s.a();

    /* renamed from: d, reason: collision with root package name */
    private final h.a f56794d = new h.a();

    /* renamed from: e, reason: collision with root package name */
    private Looper f56795e;

    /* renamed from: f, reason: collision with root package name */
    private a3.F f56796f;

    /* renamed from: g, reason: collision with root package name */
    private E1 f56797g;

    protected abstract void A();

    protected void u() {
    }

    protected void v() {
    }

    protected abstract void y(f3.o oVar);

    @Override // androidx.media3.exoplayer.source.r
    public final void b(s sVar) {
        this.f56793c.t(sVar);
    }

    @Override // androidx.media3.exoplayer.source.r
    public final void g(androidx.media3.exoplayer.drm.h hVar) {
        this.f56794d.n(hVar);
    }

    @Override // androidx.media3.exoplayer.source.r
    public final void i(r.c cVar) {
        C13466a.e(this.f56795e);
        boolean zIsEmpty = this.f56792b.isEmpty();
        this.f56792b.add(cVar);
        if (zIsEmpty) {
            v();
        }
    }

    @Override // androidx.media3.exoplayer.source.r
    public final void k(r.c cVar) {
        this.f56791a.remove(cVar);
        if (!this.f56791a.isEmpty()) {
            l(cVar);
            return;
        }
        this.f56795e = null;
        this.f56796f = null;
        this.f56797g = null;
        this.f56792b.clear();
        A();
    }

    @Override // androidx.media3.exoplayer.source.r
    public final void l(r.c cVar) {
        boolean zIsEmpty = this.f56792b.isEmpty();
        this.f56792b.remove(cVar);
        if (zIsEmpty || !this.f56792b.isEmpty()) {
            return;
        }
        u();
    }

    protected final h.a q(int i10, r.b bVar) {
        return this.f56794d.o(i10, bVar);
    }

    protected final h.a r(r.b bVar) {
        return this.f56794d.o(0, bVar);
    }

    protected final s.a s(int i10, r.b bVar) {
        return this.f56793c.u(i10, bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final s.a t(r.b bVar) {
        return this.f56793c.u(0, bVar);
    }

    protected final E1 w() {
        return (E1) C13466a.i(this.f56797g);
    }

    protected final boolean x() {
        return !this.f56792b.isEmpty();
    }

    protected final void z(a3.F f10) {
        this.f56796f = f10;
        Iterator<r.c> it = this.f56791a.iterator();
        while (it.hasNext()) {
            it.next().a(this, f10);
        }
    }

    @Override // androidx.media3.exoplayer.source.r
    public final void a(Handler handler, s sVar) {
        C13466a.e(handler);
        C13466a.e(sVar);
        this.f56793c.g(handler, sVar);
    }

    @Override // androidx.media3.exoplayer.source.r
    public final void d(r.c cVar, f3.o oVar, E1 e12) {
        boolean z10;
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f56795e;
        if (looper != null && looper != looperMyLooper) {
            z10 = false;
        } else {
            z10 = true;
        }
        C13466a.a(z10);
        this.f56797g = e12;
        a3.F f10 = this.f56796f;
        this.f56791a.add(cVar);
        if (this.f56795e == null) {
            this.f56795e = looperMyLooper;
            this.f56792b.add(cVar);
            y(oVar);
        } else if (f10 != null) {
            i(cVar);
            cVar.a(this, f10);
        }
    }

    @Override // androidx.media3.exoplayer.source.r
    public final void f(Handler handler, androidx.media3.exoplayer.drm.h hVar) {
        C13466a.e(handler);
        C13466a.e(hVar);
        this.f56794d.g(handler, hVar);
    }
}
