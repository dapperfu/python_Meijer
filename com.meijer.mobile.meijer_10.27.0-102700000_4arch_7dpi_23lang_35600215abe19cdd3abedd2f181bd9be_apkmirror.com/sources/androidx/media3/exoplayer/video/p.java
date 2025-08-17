package androidx.media3.exoplayer.video;

import a3.N;
import a3.t;
import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.exoplayer.video.p;
import d3.C13466a;
import d3.P;
import h3.C14333b;
import h3.C14334c;

/* loaded from: classes.dex */
public interface p {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f57185a;

        /* renamed from: b, reason: collision with root package name */
        private final p f57186b;

        public void k(final String str, final long j10, final long j11) {
            Handler handler = this.f57185a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: v3.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.video.p) P.h(this.f164472a.f57186b)).h(str, j10, j11);
                    }
                });
            }
        }

        public void l(final String str) {
            Handler handler = this.f57185a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: v3.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.video.p) P.h(this.f164483a.f57186b)).g(str);
                    }
                });
            }
        }

        public void n(final int i10, final long j10) {
            Handler handler = this.f57185a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: v3.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.video.p) P.h(this.f164485a.f57186b)).u(i10, j10);
                    }
                });
            }
        }

        public void o(final C14333b c14333b) {
            Handler handler = this.f57185a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: v3.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.video.p) P.h(this.f164491a.f57186b)).j(c14333b);
                    }
                });
            }
        }

        public void p(final t tVar, final C14334c c14334c) {
            Handler handler = this.f57185a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: v3.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.video.p) P.h(this.f164493a.f57186b)).y(tVar, c14334c);
                    }
                });
            }
        }

        public void q(final Object obj) {
            if (this.f57185a != null) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.f57185a.post(new Runnable() { // from class: v3.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.video.p) P.h(this.f164478a.f57186b)).v(obj, jElapsedRealtime);
                    }
                });
            }
        }

        public void r(final long j10, final int i10) {
            Handler handler = this.f57185a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: v3.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.video.p) P.h(this.f164488a.f57186b)).A(j10, i10);
                    }
                });
            }
        }

        public void s(final Exception exc) {
            Handler handler = this.f57185a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: v3.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.video.p) P.h(this.f164481a.f57186b)).p(exc);
                    }
                });
            }
        }

        public void t(final N n10) {
            Handler handler = this.f57185a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: v3.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.video.p) P.h(this.f164476a.f57186b)).e(n10);
                    }
                });
            }
        }

        public a(Handler handler, p pVar) {
            Handler handler2;
            if (pVar != null) {
                handler2 = (Handler) C13466a.e(handler);
            } else {
                handler2 = null;
            }
            this.f57185a = handler2;
            this.f57186b = pVar;
        }

        public static /* synthetic */ void d(a aVar, C14333b c14333b) {
            aVar.getClass();
            c14333b.c();
            ((p) P.h(aVar.f57186b)).x(c14333b);
        }

        public void m(final C14333b c14333b) {
            c14333b.c();
            Handler handler = this.f57185a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: v3.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        p.a.d(this.f164496a, c14333b);
                    }
                });
            }
        }
    }

    default void A(long j10, int i10) {
    }

    default void e(N n10) {
    }

    default void g(String str) {
    }

    default void h(String str, long j10, long j11) {
    }

    default void j(C14333b c14333b) {
    }

    default void p(Exception exc) {
    }

    default void u(int i10, long j10) {
    }

    default void v(Object obj, long j10) {
    }

    default void x(C14333b c14333b) {
    }

    default void y(t tVar, C14334c c14334c) {
    }
}
