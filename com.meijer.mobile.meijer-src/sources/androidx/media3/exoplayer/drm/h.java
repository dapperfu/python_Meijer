package androidx.media3.exoplayer.drm;

import android.os.Handler;
import androidx.media3.exoplayer.drm.h;
import androidx.media3.exoplayer.source.r;
import d3.C13599a;
import d3.P;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public interface h {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f56337a;

        /* renamed from: b, reason: collision with root package name */
        public final r.b f56338b;

        /* renamed from: c, reason: collision with root package name */
        private final CopyOnWriteArrayList<C1138a> f56339c;

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        /* renamed from: androidx.media3.exoplayer.drm.h$a$a, reason: collision with other inner class name */
        private static final class C1138a {

            /* renamed from: a, reason: collision with root package name */
            public Handler f56340a;

            /* renamed from: b, reason: collision with root package name */
            public h f56341b;

            public C1138a(Handler handler, h hVar) {
                this.f56340a = handler;
                this.f56341b = hVar;
            }
        }

        private a(CopyOnWriteArrayList<C1138a> copyOnWriteArrayList, int i10, r.b bVar) {
            this.f56339c = copyOnWriteArrayList;
            this.f56337a = i10;
            this.f56338b = bVar;
        }

        public void h() {
            Iterator<C1138a> it = this.f56339c.iterator();
            while (it.hasNext()) {
                C1138a next = it.next();
                final h hVar = next.f56341b;
                P.T0(next.f56340a, new Runnable() { // from class: k3.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.a aVar = this.f141406a;
                        hVar.E(aVar.f56337a, aVar.f56338b);
                    }
                });
            }
        }

        public void i() {
            Iterator<C1138a> it = this.f56339c.iterator();
            while (it.hasNext()) {
                C1138a next = it.next();
                final h hVar = next.f56341b;
                P.T0(next.f56340a, new Runnable() { // from class: k3.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.a aVar = this.f141402a;
                        hVar.J(aVar.f56337a, aVar.f56338b);
                    }
                });
            }
        }

        public void j() {
            Iterator<C1138a> it = this.f56339c.iterator();
            while (it.hasNext()) {
                C1138a next = it.next();
                final h hVar = next.f56341b;
                P.T0(next.f56340a, new Runnable() { // from class: k3.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.a aVar = this.f141404a;
                        hVar.L(aVar.f56337a, aVar.f56338b);
                    }
                });
            }
        }

        public void k(final int i10) {
            Iterator<C1138a> it = this.f56339c.iterator();
            while (it.hasNext()) {
                C1138a next = it.next();
                final h hVar = next.f56341b;
                P.T0(next.f56340a, new Runnable() { // from class: k3.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.a aVar = this.f141411a;
                        hVar.I(aVar.f56337a, aVar.f56338b, i10);
                    }
                });
            }
        }

        public void l(final Exception exc) {
            Iterator<C1138a> it = this.f56339c.iterator();
            while (it.hasNext()) {
                C1138a next = it.next();
                final h hVar = next.f56341b;
                P.T0(next.f56340a, new Runnable() { // from class: k3.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.a aVar = this.f141408a;
                        hVar.K(aVar.f56337a, aVar.f56338b, exc);
                    }
                });
            }
        }

        public void m() {
            Iterator<C1138a> it = this.f56339c.iterator();
            while (it.hasNext()) {
                C1138a next = it.next();
                final h hVar = next.f56341b;
                P.T0(next.f56340a, new Runnable() { // from class: k3.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.a aVar = this.f141414a;
                        hVar.Q(aVar.f56337a, aVar.f56338b);
                    }
                });
            }
        }

        public void n(h hVar) {
            Iterator<C1138a> it = this.f56339c.iterator();
            while (it.hasNext()) {
                C1138a next = it.next();
                if (next.f56341b == hVar) {
                    this.f56339c.remove(next);
                }
            }
        }

        public a o(int i10, r.b bVar) {
            return new a(this.f56339c, i10, bVar);
        }

        public void g(Handler handler, h hVar) {
            C13599a.e(handler);
            C13599a.e(hVar);
            this.f56339c.add(new C1138a(handler, hVar));
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
