package androidx.media3.exoplayer.audio;

import a3.t;
import android.os.Handler;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.e;
import d3.C13466a;
import d3.P;
import h3.C14333b;
import h3.C14334c;

/* loaded from: classes.dex */
public interface e {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f55913a;

        /* renamed from: b, reason: collision with root package name */
        private final e f55914b;

        public void m(final Exception exc) {
            Handler handler = this.f55913a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: j3.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.audio.e) P.h(this.f139222a.f55914b)).w(exc);
                    }
                });
            }
        }

        public void n(final Exception exc) {
            Handler handler = this.f55913a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: j3.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.audio.e) P.h(this.f139232a.f55914b)).d(exc);
                    }
                });
            }
        }

        public void o(final AudioSink.a aVar) {
            Handler handler = this.f55913a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: j3.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.audio.e) P.h(this.f139220a.f55914b)).a(aVar);
                    }
                });
            }
        }

        public void p(final AudioSink.a aVar) {
            Handler handler = this.f55913a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: j3.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.audio.e) P.h(this.f139216a.f55914b)).b(aVar);
                    }
                });
            }
        }

        public void q(final String str, final long j10, final long j11) {
            Handler handler = this.f55913a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: j3.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.audio.e) P.h(this.f139224a.f55914b)).l(str, j10, j11);
                    }
                });
            }
        }

        public void r(final String str) {
            Handler handler = this.f55913a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: j3.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.audio.e) P.h(this.f139228a.f55914b)).k(str);
                    }
                });
            }
        }

        public void t(final C14333b c14333b) {
            Handler handler = this.f55913a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: j3.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.audio.e) P.h(this.f139230a.f55914b)).t(c14333b);
                    }
                });
            }
        }

        public void u(final t tVar, final C14334c c14334c) {
            Handler handler = this.f55913a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: j3.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.audio.e) P.h(this.f139234a.f55914b)).r(tVar, c14334c);
                    }
                });
            }
        }

        public void v(final long j10) {
            Handler handler = this.f55913a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: j3.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.audio.e) P.h(this.f139214a.f55914b)).o(j10);
                    }
                });
            }
        }

        public void w(final boolean z10) {
            Handler handler = this.f55913a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: j3.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.audio.e) P.h(this.f139218a.f55914b)).c(z10);
                    }
                });
            }
        }

        public void x(final int i10, final long j10, final long j11) {
            Handler handler = this.f55913a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: j3.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.audio.e) P.h(this.f139208a.f55914b)).z(i10, j10, j11);
                    }
                });
            }
        }

        public a(Handler handler, e eVar) {
            Handler handler2;
            if (eVar != null) {
                handler2 = (Handler) C13466a.e(handler);
            } else {
                handler2 = null;
            }
            this.f55913a = handler2;
            this.f55914b = eVar;
        }

        public static /* synthetic */ void d(a aVar, C14333b c14333b) {
            aVar.getClass();
            c14333b.c();
            ((e) P.h(aVar.f55914b)).f(c14333b);
        }

        public void s(final C14333b c14333b) {
            c14333b.c();
            Handler handler = this.f55913a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: j3.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.a.d(this.f139212a, c14333b);
                    }
                });
            }
        }
    }

    default void a(AudioSink.a aVar) {
    }

    default void b(AudioSink.a aVar) {
    }

    default void c(boolean z10) {
    }

    default void d(Exception exc) {
    }

    default void f(C14333b c14333b) {
    }

    default void k(String str) {
    }

    default void l(String str, long j10, long j11) {
    }

    default void o(long j10) {
    }

    default void r(t tVar, C14334c c14334c) {
    }

    default void t(C14333b c14333b) {
    }

    default void w(Exception exc) {
    }

    default void z(int i10, long j10, long j11) {
    }
}
