package androidx.media3.exoplayer.audio;

import a3.t;
import android.os.Handler;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.e;
import d3.C13599a;
import d3.P;
import h3.C14446b;
import h3.C14447c;

/* loaded from: classes.dex */
public interface e {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f56137a;

        /* renamed from: b, reason: collision with root package name */
        private final e f56138b;

        public void m(final Exception exc) {
            Handler handler = this.f56137a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: j3.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.audio.e) P.h(this.f139812a.f56138b)).w(exc);
                    }
                });
            }
        }

        public void n(final Exception exc) {
            Handler handler = this.f56137a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: j3.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.audio.e) P.h(this.f139822a.f56138b)).d(exc);
                    }
                });
            }
        }

        public void o(final AudioSink.a aVar) {
            Handler handler = this.f56137a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: j3.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.audio.e) P.h(this.f139810a.f56138b)).a(aVar);
                    }
                });
            }
        }

        public void p(final AudioSink.a aVar) {
            Handler handler = this.f56137a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: j3.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.audio.e) P.h(this.f139806a.f56138b)).b(aVar);
                    }
                });
            }
        }

        public void q(final String str, final long j10, final long j11) {
            Handler handler = this.f56137a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: j3.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.audio.e) P.h(this.f139814a.f56138b)).l(str, j10, j11);
                    }
                });
            }
        }

        public void r(final String str) {
            Handler handler = this.f56137a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: j3.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.audio.e) P.h(this.f139818a.f56138b)).k(str);
                    }
                });
            }
        }

        public void t(final C14446b c14446b) {
            Handler handler = this.f56137a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: j3.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.audio.e) P.h(this.f139820a.f56138b)).t(c14446b);
                    }
                });
            }
        }

        public void u(final t tVar, final C14447c c14447c) {
            Handler handler = this.f56137a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: j3.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.audio.e) P.h(this.f139824a.f56138b)).r(tVar, c14447c);
                    }
                });
            }
        }

        public void v(final long j10) {
            Handler handler = this.f56137a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: j3.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.audio.e) P.h(this.f139804a.f56138b)).o(j10);
                    }
                });
            }
        }

        public void w(final boolean z10) {
            Handler handler = this.f56137a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: j3.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.audio.e) P.h(this.f139808a.f56138b)).c(z10);
                    }
                });
            }
        }

        public void x(final int i10, final long j10, final long j11) {
            Handler handler = this.f56137a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: j3.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.media3.exoplayer.audio.e) P.h(this.f139798a.f56138b)).z(i10, j10, j11);
                    }
                });
            }
        }

        public a(Handler handler, e eVar) {
            Handler handler2;
            if (eVar != null) {
                handler2 = (Handler) C13599a.e(handler);
            } else {
                handler2 = null;
            }
            this.f56137a = handler2;
            this.f56138b = eVar;
        }

        public static /* synthetic */ void d(a aVar, C14446b c14446b) {
            aVar.getClass();
            c14446b.c();
            ((e) P.h(aVar.f56138b)).f(c14446b);
        }

        public void s(final C14446b c14446b) {
            c14446b.c();
            Handler handler = this.f56137a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: j3.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.a.d(this.f139802a, c14446b);
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

    default void f(C14446b c14446b) {
    }

    default void k(String str) {
    }

    default void l(String str, long j10, long j11) {
    }

    default void o(long j10) {
    }

    default void r(t tVar, C14447c c14447c) {
    }

    default void t(C14446b c14446b) {
    }

    default void w(Exception exc) {
    }

    default void z(int i10, long j10, long j11) {
    }
}
