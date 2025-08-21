package androidx.media3.exoplayer.source;

import android.os.Handler;
import androidx.media3.exoplayer.source.r;
import androidx.media3.exoplayer.source.s;
import d3.C13599a;
import d3.InterfaceC13610l;
import d3.P;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public interface s {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f57162a;

        /* renamed from: b, reason: collision with root package name */
        public final r.b f57163b;

        /* renamed from: c, reason: collision with root package name */
        private final CopyOnWriteArrayList<C1141a> f57164c;

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        /* renamed from: androidx.media3.exoplayer.source.s$a$a, reason: collision with other inner class name */
        private static final class C1141a {

            /* renamed from: a, reason: collision with root package name */
            public Handler f57165a;

            /* renamed from: b, reason: collision with root package name */
            public s f57166b;

            public C1141a(Handler handler, s sVar) {
                this.f57165a = handler;
                this.f57166b = sVar;
            }
        }

        private a(CopyOnWriteArrayList<C1141a> copyOnWriteArrayList, int i10, r.b bVar) {
            this.f57164c = copyOnWriteArrayList;
            this.f57162a = i10;
            this.f57163b = bVar;
        }

        public void h(final InterfaceC13610l<s> interfaceC13610l) {
            Iterator<C1141a> it = this.f57164c.iterator();
            while (it.hasNext()) {
                C1141a next = it.next();
                final s sVar = next.f57166b;
                P.T0(next.f57165a, new Runnable() { // from class: p3.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC13610l.accept(sVar);
                    }
                });
            }
        }

        public void i(int i10, a3.t tVar, int i11, Object obj, long j10) {
            j(new p3.j(1, i10, tVar, i11, obj, P.j1(j10), -9223372036854775807L));
        }

        public void j(final p3.j jVar) {
            h(new InterfaceC13610l() { // from class: p3.l
                @Override // d3.InterfaceC13610l
                public final void accept(Object obj) {
                    s.a aVar = this.f156110a;
                    ((androidx.media3.exoplayer.source.s) obj).P(aVar.f57162a, aVar.f57163b, jVar);
                }
            });
        }

        public void k(p3.i iVar, int i10, int i11, a3.t tVar, int i12, Object obj, long j10, long j11) {
            l(iVar, new p3.j(i10, i11, tVar, i12, obj, P.j1(j10), P.j1(j11)));
        }

        public void l(final p3.i iVar, final p3.j jVar) {
            h(new InterfaceC13610l() { // from class: p3.p
                @Override // d3.InterfaceC13610l
                public final void accept(Object obj) {
                    s.a aVar = this.f156124a;
                    ((androidx.media3.exoplayer.source.s) obj).B(aVar.f57162a, aVar.f57163b, iVar, jVar);
                }
            });
        }

        public void m(p3.i iVar, int i10, int i11, a3.t tVar, int i12, Object obj, long j10, long j11) {
            n(iVar, new p3.j(i10, i11, tVar, i12, obj, P.j1(j10), P.j1(j11)));
        }

        public void n(final p3.i iVar, final p3.j jVar) {
            h(new InterfaceC13610l() { // from class: p3.n
                @Override // d3.InterfaceC13610l
                public final void accept(Object obj) {
                    s.a aVar = this.f156116a;
                    ((androidx.media3.exoplayer.source.s) obj).H(aVar.f57162a, aVar.f57163b, iVar, jVar);
                }
            });
        }

        public void o(p3.i iVar, int i10, int i11, a3.t tVar, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
            q(iVar, new p3.j(i10, i11, tVar, i12, obj, P.j1(j10), P.j1(j11)), iOException, z10);
        }

        public void q(final p3.i iVar, final p3.j jVar, final IOException iOException, final boolean z10) {
            h(new InterfaceC13610l() { // from class: p3.o
                @Override // d3.InterfaceC13610l
                public final void accept(Object obj) {
                    s.a aVar = this.f156119a;
                    ((androidx.media3.exoplayer.source.s) obj).G(aVar.f57162a, aVar.f57163b, iVar, jVar, iOException, z10);
                }
            });
        }

        public void r(p3.i iVar, int i10, int i11, a3.t tVar, int i12, Object obj, long j10, long j11, int i13) {
            s(iVar, new p3.j(i10, i11, tVar, i12, obj, P.j1(j10), P.j1(j11)), i13);
        }

        public void s(final p3.i iVar, final p3.j jVar, final int i10) {
            h(new InterfaceC13610l() { // from class: p3.m
                @Override // d3.InterfaceC13610l
                public final void accept(Object obj) {
                    s.a aVar = this.f156112a;
                    ((androidx.media3.exoplayer.source.s) obj).M(aVar.f57162a, aVar.f57163b, iVar, jVar, i10);
                }
            });
        }

        public void t(s sVar) {
            Iterator<C1141a> it = this.f57164c.iterator();
            while (it.hasNext()) {
                C1141a next = it.next();
                if (next.f57166b == sVar) {
                    this.f57164c.remove(next);
                }
            }
        }

        public a u(int i10, r.b bVar) {
            return new a(this.f57164c, i10, bVar);
        }

        public void g(Handler handler, s sVar) {
            C13599a.e(handler);
            C13599a.e(sVar);
            this.f57164c.add(new C1141a(handler, sVar));
        }

        public void p(p3.i iVar, int i10, IOException iOException, boolean z10) {
            o(iVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z10);
        }
    }

    default void B(int i10, r.b bVar, p3.i iVar, p3.j jVar) {
    }

    default void G(int i10, r.b bVar, p3.i iVar, p3.j jVar, IOException iOException, boolean z10) {
    }

    default void H(int i10, r.b bVar, p3.i iVar, p3.j jVar) {
    }

    default void M(int i10, r.b bVar, p3.i iVar, p3.j jVar, int i11) {
    }

    default void P(int i10, r.b bVar, p3.j jVar) {
    }
}
