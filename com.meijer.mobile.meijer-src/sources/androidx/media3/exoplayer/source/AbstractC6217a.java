package androidx.media3.exoplayer.source;

import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.drm.h;
import androidx.media3.exoplayer.source.r;
import androidx.media3.exoplayer.source.s;
import d3.C13599a;
import i3.E1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: androidx.media3.exoplayer.source.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6217a implements r {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<r.c> f57015a = new ArrayList<>(1);

    /* renamed from: b, reason: collision with root package name */
    private final HashSet<r.c> f57016b = new HashSet<>(1);

    /* renamed from: c, reason: collision with root package name */
    private final s.a f57017c = new s.a();

    /* renamed from: d, reason: collision with root package name */
    private final h.a f57018d = new h.a();

    /* renamed from: e, reason: collision with root package name */
    private Looper f57019e;

    /* renamed from: f, reason: collision with root package name */
    private a3.F f57020f;

    /* renamed from: g, reason: collision with root package name */
    private E1 f57021g;

    protected abstract void A();

    protected void u() {
    }

    protected void v() {
    }

    protected abstract void y(f3.o oVar);

    @Override // androidx.media3.exoplayer.source.r
    public final void b(s sVar) {
        this.f57017c.t(sVar);
    }

    @Override // androidx.media3.exoplayer.source.r
    public final void g(androidx.media3.exoplayer.drm.h hVar) {
        this.f57018d.n(hVar);
    }

    @Override // androidx.media3.exoplayer.source.r
    public final void i(r.c cVar) {
        C13599a.e(this.f57019e);
        boolean zIsEmpty = this.f57016b.isEmpty();
        this.f57016b.add(cVar);
        if (zIsEmpty) {
            v();
        }
    }

    @Override // androidx.media3.exoplayer.source.r
    public final void k(r.c cVar) {
        this.f57015a.remove(cVar);
        if (!this.f57015a.isEmpty()) {
            l(cVar);
            return;
        }
        this.f57019e = null;
        this.f57020f = null;
        this.f57021g = null;
        this.f57016b.clear();
        A();
    }

    @Override // androidx.media3.exoplayer.source.r
    public final void l(r.c cVar) {
        boolean zIsEmpty = this.f57016b.isEmpty();
        this.f57016b.remove(cVar);
        if (zIsEmpty || !this.f57016b.isEmpty()) {
            return;
        }
        u();
    }

    protected final h.a q(int i10, r.b bVar) {
        return this.f57018d.o(i10, bVar);
    }

    protected final h.a r(r.b bVar) {
        return this.f57018d.o(0, bVar);
    }

    protected final s.a s(int i10, r.b bVar) {
        return this.f57017c.u(i10, bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final s.a t(r.b bVar) {
        return this.f57017c.u(0, bVar);
    }

    protected final E1 w() {
        return (E1) C13599a.i(this.f57021g);
    }

    protected final boolean x() {
        return !this.f57016b.isEmpty();
    }

    protected final void z(a3.F f10) {
        this.f57020f = f10;
        Iterator<r.c> it = this.f57015a.iterator();
        while (it.hasNext()) {
            it.next().a(this, f10);
        }
    }

    @Override // androidx.media3.exoplayer.source.r
    public final void a(Handler handler, s sVar) {
        C13599a.e(handler);
        C13599a.e(sVar);
        this.f57017c.g(handler, sVar);
    }

    @Override // androidx.media3.exoplayer.source.r
    public final void d(r.c cVar, f3.o oVar, E1 e12) {
        boolean z10;
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f57019e;
        if (looper != null && looper != looperMyLooper) {
            z10 = false;
        } else {
            z10 = true;
        }
        C13599a.a(z10);
        this.f57021g = e12;
        a3.F f10 = this.f57020f;
        this.f57015a.add(cVar);
        if (this.f57019e == null) {
            this.f57019e = looperMyLooper;
            this.f57016b.add(cVar);
            y(oVar);
        } else if (f10 != null) {
            i(cVar);
            cVar.a(this, f10);
        }
    }

    @Override // androidx.media3.exoplayer.source.r
    public final void f(Handler handler, androidx.media3.exoplayer.drm.h hVar) {
        C13599a.e(handler);
        C13599a.e(hVar);
        this.f57018d.g(handler, hVar);
    }
}
