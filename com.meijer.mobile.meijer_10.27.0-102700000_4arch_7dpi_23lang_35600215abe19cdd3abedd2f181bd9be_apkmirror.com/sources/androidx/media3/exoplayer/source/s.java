package androidx.media3.exoplayer.source;

import android.os.Handler;
import androidx.media3.exoplayer.source.r;
import androidx.media3.exoplayer.source.s;
import d3.C13466a;
import d3.InterfaceC13477l;
import d3.P;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public interface s {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f56938a;

        /* renamed from: b, reason: collision with root package name */
        public final r.b f56939b;

        /* renamed from: c, reason: collision with root package name */
        private final CopyOnWriteArrayList<C1128a> f56940c;

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        /* renamed from: androidx.media3.exoplayer.source.s$a$a, reason: collision with other inner class name */
        private static final class C1128a {

            /* renamed from: a, reason: collision with root package name */
            public Handler f56941a;

            /* renamed from: b, reason: collision with root package name */
            public s f56942b;

            public C1128a(Handler handler, s sVar) {
                this.f56941a = handler;
                this.f56942b = sVar;
            }
        }

        private a(CopyOnWriteArrayList<C1128a> copyOnWriteArrayList, int i10, r.b bVar) {
            this.f56940c = copyOnWriteArrayList;
            this.f56938a = i10;
            this.f56939b = bVar;
        }

        public void h(final InterfaceC13477l<s> interfaceC13477l) {
            Iterator<C1128a> it = this.f56940c.iterator();
            while (it.hasNext()) {
                C1128a next = it.next();
                final s sVar = next.f56942b;
                P.T0(next.f56941a, new Runnable() { // from class: p3.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC13477l.accept(sVar);
                    }
                });
            }
        }

        public void i(int i10, a3.t tVar, int i11, Object obj, long j10) {
            j(new p3.j(1, i10, tVar, i11, obj, P.j1(j10), -9223372036854775807L));
        }

        public void j(final p3.j jVar) {
            h(new InterfaceC13477l() { // from class: p3.l
                @Override // d3.InterfaceC13477l
                public final void accept(Object obj) {
                    s.a aVar = this.f155436a;
                    ((androidx.media3.exoplayer.source.s) obj).P(aVar.f56938a, aVar.f56939b, jVar);
                }
            });
        }

        public void k(p3.i iVar, int i10, int i11, a3.t tVar, int i12, Object obj, long j10, long j11) {
            l(iVar, new p3.j(i10, i11, tVar, i12, obj, P.j1(j10), P.j1(j11)));
        }

        public void l(final p3.i iVar, final p3.j jVar) {
            h(new InterfaceC13477l() { // from class: p3.p
                @Override // d3.InterfaceC13477l
                public final void accept(Object obj) {
                    s.a aVar = this.f155450a;
                    ((androidx.media3.exoplayer.source.s) obj).B(aVar.f56938a, aVar.f56939b, iVar, jVar);
                }
            });
        }

        public void m(p3.i iVar, int i10, int i11, a3.t tVar, int i12, Object obj, long j10, long j11) {
            n(iVar, new p3.j(i10, i11, tVar, i12, obj, P.j1(j10), P.j1(j11)));
        }

        public void n(final p3.i iVar, final p3.j jVar) {
            h(new InterfaceC13477l() { // from class: p3.n
                @Override // d3.InterfaceC13477l
                public final void accept(Object obj) {
                    s.a aVar = this.f155442a;
                    ((androidx.media3.exoplayer.source.s) obj).H(aVar.f56938a, aVar.f56939b, iVar, jVar);
                }
            });
        }

        public void o(p3.i iVar, int i10, int i11, a3.t tVar, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
            q(iVar, new p3.j(i10, i11, tVar, i12, obj, P.j1(j10), P.j1(j11)), iOException, z10);
        }

        public void q(final p3.i iVar, final p3.j jVar, final IOException iOException, final boolean z10) {
            h(new InterfaceC13477l() { // from class: p3.o
                @Override // d3.InterfaceC13477l
                public final void accept(Object obj) {
                    s.a aVar = this.f155445a;
                    ((androidx.media3.exoplayer.source.s) obj).G(aVar.f56938a, aVar.f56939b, iVar, jVar, iOException, z10);
                }
            });
        }

        public void r(p3.i iVar, int i10, int i11, a3.t tVar, int i12, Object obj, long j10, long j11, int i13) {
            s(iVar, new p3.j(i10, i11, tVar, i12, obj, P.j1(j10), P.j1(j11)), i13);
        }

        public void s(final p3.i iVar, final p3.j jVar, final int i10) {
            h(new InterfaceC13477l() { // from class: p3.m
                @Override // d3.InterfaceC13477l
                public final void accept(Object obj) {
                    s.a aVar = this.f155438a;
                    ((androidx.media3.exoplayer.source.s) obj).M(aVar.f56938a, aVar.f56939b, iVar, jVar, i10);
                }
            });
        }

        public void t(s sVar) {
            Iterator<C1128a> it = this.f56940c.iterator();
            while (it.hasNext()) {
                C1128a next = it.next();
                if (next.f56942b == sVar) {
                    this.f56940c.remove(next);
                }
            }
        }

        public a u(int i10, r.b bVar) {
            return new a(this.f56940c, i10, bVar);
        }

        public void g(Handler handler, s sVar) {
            C13466a.e(handler);
            C13466a.e(sVar);
            this.f56940c.add(new C1128a(handler, sVar));
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
