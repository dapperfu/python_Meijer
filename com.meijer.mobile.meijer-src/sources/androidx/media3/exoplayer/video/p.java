package androidx.media3.exoplayer.video;

import a3.N;
import a3.t;
import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.exoplayer.video.p;
import d3.C13599a;
import d3.P;
import h3.C14446b;
import h3.C14447c;

/* loaded from: classes.dex */
public interface p {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f57409a;

        /* renamed from: b, reason: collision with root package name */
        private final p f57410b;

        public void k(final String str, final long j10, final long j11) {
            Handler handler = this.f57409a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: v3.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.video.p) P.h(this.f165506a.f57410b)).h(str, j10, j11);
                    }
                });
            }
        }

        public void l(final String str) {
            Handler handler = this.f57409a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: v3.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.video.p) P.h(this.f165517a.f57410b)).g(str);
                    }
                });
            }
        }

        public void n(final int i10, final long j10) {
            Handler handler = this.f57409a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: v3.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.video.p) P.h(this.f165519a.f57410b)).u(i10, j10);
                    }
                });
            }
        }

        public void o(final C14446b c14446b) {
            Handler handler = this.f57409a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: v3.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.video.p) P.h(this.f165525a.f57410b)).j(c14446b);
                    }
                });
            }
        }

        public void p(final t tVar, final C14447c c14447c) {
            Handler handler = this.f57409a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: v3.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.video.p) P.h(this.f165527a.f57410b)).y(tVar, c14447c);
                    }
                });
            }
        }

        public void q(final Object obj) {
            if (this.f57409a != null) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.f57409a.post(new Runnable() { // from class: v3.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.video.p) P.h(this.f165512a.f57410b)).v(obj, jElapsedRealtime);
                    }
                });
            }
        }

        public void r(final long j10, final int i10) {
            Handler handler = this.f57409a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: v3.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.video.p) P.h(this.f165522a.f57410b)).A(j10, i10);
                    }
                });
            }
        }

        public void s(final Exception exc) {
            Handler handler = this.f57409a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: v3.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.video.p) P.h(this.f165515a.f57410b)).p(exc);
                    }
                });
            }
        }

        public void t(final N n10) {
            Handler handler = this.f57409a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: v3.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.video.p) P.h(this.f165510a.f57410b)).e(n10);
                    }
                });
            }
        }

        public a(Handler handler, p pVar) {
            Handler handler2;
            if (pVar != null) {
                handler2 = (Handler) C13599a.e(handler);
            } else {
                handler2 = null;
            }
            this.f57409a = handler2;
            this.f57410b = pVar;
        }

        public static /* synthetic */ void d(a aVar, C14446b c14446b) {
            aVar.getClass();
            c14446b.c();
            ((p) P.h(aVar.f57410b)).x(c14446b);
        }

        public void m(final C14446b c14446b) {
            c14446b.c();
            Handler handler = this.f57409a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: v3.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        p.a.d(this.f165530a, c14446b);
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

    default void j(C14446b c14446b) {
    }

    default void p(Exception exc) {
    }

    default void u(int i10, long j10) {
    }

    default void v(Object obj, long j10) {
    }

    default void x(C14446b c14446b) {
    }

    default void y(t tVar, C14447c c14447c) {
    }
}
