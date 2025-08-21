package androidx.media3.exoplayer.video;

import a3.N;
import a3.t;
import android.view.Surface;
import androidx.media3.exoplayer.H0;
import d3.F;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface VideoSink {

    public interface a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f57238a = new C1142a();

        void a(VideoSink videoSink, N n10);

        void b(VideoSink videoSink);

        void c(VideoSink videoSink);

        /* renamed from: androidx.media3.exoplayer.video.VideoSink$a$a, reason: collision with other inner class name */
        class C1142a implements a {
            @Override // androidx.media3.exoplayer.video.VideoSink.a
            public void a(VideoSink videoSink, N n10) {
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.a
            public void b(VideoSink videoSink) {
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.a
            public void c(VideoSink videoSink) {
            }

            C1142a() {
            }
        }
    }

    public interface b {
        void a(long j10);

        void skip();
    }

    void A(boolean z10);

    void B(a aVar, Executor executor);

    boolean a();

    Surface b();

    boolean c();

    void e();

    boolean f(long j10, boolean z10, b bVar);

    boolean g(t tVar) throws VideoSinkException;

    void h(long j10, long j11) throws VideoSinkException;

    void i();

    void j(long j10, long j11);

    void k();

    void l(H0.a aVar);

    void m(List<Object> list);

    boolean n(boolean z10);

    void o(v3.h hVar);

    void p(boolean z10);

    void q();

    void r(Surface surface, F f10);

    void release();

    void s();

    void t(int i10);

    void u(float f10);

    void v();

    void w(boolean z10);

    void y(int i10, t tVar, List<Object> list);

    public static final class VideoSinkException extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final t f57237a;

        public VideoSinkException(Throwable th2, t tVar) {
            super(th2);
            this.f57237a = tVar;
        }
    }
}
