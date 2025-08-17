package androidx.media3.exoplayer.drm;

import android.os.Handler;
import androidx.media3.exoplayer.drm.h;
import androidx.media3.exoplayer.source.r;
import d3.C13466a;
import d3.P;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public interface h {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f56113a;

        /* renamed from: b, reason: collision with root package name */
        public final r.b f56114b;

        /* renamed from: c, reason: collision with root package name */
        private final CopyOnWriteArrayList<C1125a> f56115c;

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        /* renamed from: androidx.media3.exoplayer.drm.h$a$a, reason: collision with other inner class name */
        private static final class C1125a {

            /* renamed from: a, reason: collision with root package name */
            public Handler f56116a;

            /* renamed from: b, reason: collision with root package name */
            public h f56117b;

            public C1125a(Handler handler, h hVar) {
                this.f56116a = handler;
                this.f56117b = hVar;
            }
        }

        private a(CopyOnWriteArrayList<C1125a> copyOnWriteArrayList, int i10, r.b bVar) {
            this.f56115c = copyOnWriteArrayList;
            this.f56113a = i10;
            this.f56114b = bVar;
        }

        public void h() {
            Iterator<C1125a> it = this.f56115c.iterator();
            while (it.hasNext()) {
                C1125a next = it.next();
                final h hVar = next.f56117b;
                P.T0(next.f56116a, new Runnable() { // from class: k3.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.a aVar = this.f141213a;
                        hVar.E(aVar.f56113a, aVar.f56114b);
                    }
                });
            }
        }

        public void i() {
            Iterator<C1125a> it = this.f56115c.iterator();
            while (it.hasNext()) {
                C1125a next = it.next();
                final h hVar = next.f56117b;
                P.T0(next.f56116a, new Runnable() { // from class: k3.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.a aVar = this.f141209a;
                        hVar.J(aVar.f56113a, aVar.f56114b);
                    }
                });
            }
        }

        public void j() {
            Iterator<C1125a> it = this.f56115c.iterator();
            while (it.hasNext()) {
                C1125a next = it.next();
                final h hVar = next.f56117b;
                P.T0(next.f56116a, new Runnable() { // from class: k3.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.a aVar = this.f141211a;
                        hVar.L(aVar.f56113a, aVar.f56114b);
                    }
                });
            }
        }

        public void k(final int i10) {
            Iterator<C1125a> it = this.f56115c.iterator();
            while (it.hasNext()) {
                C1125a next = it.next();
                final h hVar = next.f56117b;
                P.T0(next.f56116a, new Runnable() { // from class: k3.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.a aVar = this.f141218a;
                        hVar.I(aVar.f56113a, aVar.f56114b, i10);
                    }
                });
            }
        }

        public void l(final Exception exc) {
            Iterator<C1125a> it = this.f56115c.iterator();
            while (it.hasNext()) {
                C1125a next = it.next();
                final h hVar = next.f56117b;
                P.T0(next.f56116a, new Runnable() { // from class: k3.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.a aVar = this.f141215a;
                        hVar.K(aVar.f56113a, aVar.f56114b, exc);
                    }
                });
            }
        }

        public void m() {
            Iterator<C1125a> it = this.f56115c.iterator();
            while (it.hasNext()) {
                C1125a next = it.next();
                final h hVar = next.f56117b;
                P.T0(next.f56116a, new Runnable() { // from class: k3.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.a aVar = this.f141221a;
                        hVar.Q(aVar.f56113a, aVar.f56114b);
                    }
                });
            }
        }

        public void n(h hVar) {
            Iterator<C1125a> it = this.f56115c.iterator();
            while (it.hasNext()) {
                C1125a next = it.next();
                if (next.f56117b == hVar) {
                    this.f56115c.remove(next);
                }
            }
        }

        public a o(int i10, r.b bVar) {
            return new a(this.f56115c, i10, bVar);
        }

        public void g(Handler handler, h hVar) {
            C13466a.e(handler);
            C13466a.e(hVar);
            this.f56115c.add(new C1125a(handler, hVar));
        }
    }

    default void E(int i10, r.b bVar) {
    }

    default void I(int i10, r.b bVar, int i11) {
    }

    default void J(int i10, r.b bVar) {
    }

    default void K(int i10, r.b bVar, Exception exc) {
    }

    default void L(int i10, r.b bVar) {
    }

    default void Q(int i10, r.b bVar) {
    }
}
