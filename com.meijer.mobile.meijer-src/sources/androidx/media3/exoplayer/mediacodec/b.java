package androidx.media3.exoplayer.mediacodec;

import De.w;
import a3.t;
import a3.z;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.media3.exoplayer.mediacodec.b;
import androidx.media3.exoplayer.mediacodec.h;
import d3.K;
import d3.P;
import g3.C14325c;
import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b implements h {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f56661a;

    /* renamed from: b, reason: collision with root package name */
    private final e f56662b;

    /* renamed from: c, reason: collision with root package name */
    private final i f56663c;

    /* renamed from: d, reason: collision with root package name */
    private final n3.h f56664d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f56665e;

    /* renamed from: f, reason: collision with root package name */
    private int f56666f;

    /* renamed from: androidx.media3.exoplayer.mediacodec.b$b, reason: collision with other inner class name */
    public static final class C1139b implements h.b {

        /* renamed from: b, reason: collision with root package name */
        private final w<HandlerThread> f56667b;

        /* renamed from: c, reason: collision with root package name */
        private final w<HandlerThread> f56668c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f56669d;

        public C1139b(final int i10) {
            this(new w() { // from class: n3.b
                @Override // De.w
                public final Object get() {
                    return b.C1139b.d(i10);
                }
            }, new w() { // from class: n3.c
                @Override // De.w
                public final Object get() {
                    return b.C1139b.c(i10);
                }
            });
        }

        public C1139b(w<HandlerThread> wVar, w<HandlerThread> wVar2) {
            this.f56667b = wVar;
            this.f56668c = wVar2;
            this.f56669d = false;
        }

        public static /* synthetic */ HandlerThread c(int i10) {
            return new HandlerThread(b.v(i10));
        }

        public static /* synthetic */ HandlerThread d(int i10) {
            return new HandlerThread(b.u(i10));
        }

        private static boolean g(t tVar) {
            int i10 = P.f127888a;
            if (i10 < 34) {
                return false;
            }
            return i10 >= 35 || z.q(tVar.f44767o);
        }

        @Override // androidx.media3.exoplayer.mediacodec.h.b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public b b(h.a aVar) throws Exception {
            Exception exc;
            MediaCodec mediaCodecCreateByCodecName;
            i cVar;
            int i10;
            String str = aVar.f56709a.f56716a;
            b bVar = null;
            try {
                K.a("createCodec:" + str);
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    if (this.f56669d && g(aVar.f56711c)) {
                        cVar = new r(mediaCodecCreateByCodecName);
                        i10 = 4;
                    } else {
                        cVar = new c(mediaCodecCreateByCodecName, this.f56668c.get());
                        i10 = 0;
                    }
                    b bVar2 = new b(mediaCodecCreateByCodecName, this.f56667b.get(), cVar, aVar.f56714f);
                    try {
                        K.b();
                        Surface surface = aVar.f56712d;
                        if (surface == null && aVar.f56709a.f56726k && P.f127888a >= 35) {
                            i10 |= 8;
                        }
                        bVar2.x(aVar.f56710b, surface, aVar.f56713e, i10);
                        return bVar2;
                    } catch (Exception e10) {
                        exc = e10;
                        bVar = bVar2;
                        if (bVar != null) {
                            bVar.release();
                            throw exc;
                        }
                        if (mediaCodecCreateByCodecName == null) {
                            throw exc;
                        }
                        mediaCodecCreateByCodecName.release();
                        throw exc;
                    }
                } catch (Exception e11) {
                    exc = e11;
                }
            } catch (Exception e12) {
                exc = e12;
                mediaCodecCreateByCodecName = null;
            }
        }

        public void f(boolean z10) {
            this.f56669d = z10;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public boolean k() {
        return false;
    }

    private b(MediaCodec mediaCodec, HandlerThread handlerThread, i iVar, n3.h hVar) {
        this.f56661a = mediaCodec;
        this.f56662b = new e(handlerThread);
        this.f56663c = iVar;
        this.f56664d = hVar;
        this.f56666f = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String u(int i10) {
        return w(i10, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String v(int i10) {
        return w(i10, "ExoPlayer:MediaCodecQueueingThread:");
    }

    private static String w(int i10, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 1) {
            sb2.append("Audio");
        } else if (i10 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            sb2.append(")");
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        n3.h hVar;
        this.f56662b.h(this.f56661a);
        K.a("configureCodec");
        this.f56661a.configure(mediaFormat, surface, mediaCrypto, i10);
        K.b();
        this.f56663c.start();
        K.a("startCodec");
        this.f56661a.start();
        K.b();
        if (P.f127888a >= 35 && (hVar = this.f56664d) != null) {
            hVar.b(this.f56661a);
        }
        this.f56666f = 1;
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void a(int i10, int i11, int i12, long j10, int i13) {
        this.f56663c.a(i10, i11, i12, j10, i13);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void b(Bundle bundle) {
        this.f56663c.b(bundle);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void c(int i10, int i11, C14325c c14325c, long j10, int i12) {
        this.f56663c.c(i10, i11, c14325c, j10, i12);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public boolean d(h.c cVar) {
        this.f56662b.p(cVar);
        return true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void e(final h.d dVar, Handler handler) {
        this.f56661a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: androidx.media3.exoplayer.mediacodec.a
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                b.q(this.f56659a, dVar, mediaCodec, j10, j11);
            }
        }, handler);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public MediaFormat f() {
        return this.f56662b.g();
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void flush() {
        this.f56663c.flush();
        this.f56661a.flush();
        this.f56662b.e();
        this.f56661a.start();
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void g() {
        this.f56661a.detachOutputSurface();
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void h(int i10) {
        this.f56661a.setVideoScalingMode(i10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public ByteBuffer i(int i10) {
        return this.f56661a.getInputBuffer(i10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void j(Surface surface) {
        this.f56661a.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void l(int i10, long j10) {
        this.f56661a.releaseOutputBuffer(i10, j10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public int m() {
        this.f56663c.d();
        return this.f56662b.c();
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public int n(MediaCodec.BufferInfo bufferInfo) {
        this.f56663c.d();
        return this.f56662b.d(bufferInfo);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void o(int i10, boolean z10) {
        this.f56661a.releaseOutputBuffer(i10, z10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public ByteBuffer p(int i10) {
        return this.f56661a.getOutputBuffer(i10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void release() {
        n3.h hVar;
        n3.h hVar2;
        try {
            if (this.f56666f == 1) {
                this.f56663c.shutdown();
                this.f56662b.q();
            }
            this.f56666f = 2;
            if (this.f56665e) {
                return;
            }
            try {
                int i10 = P.f127888a;
                if (i10 >= 30 && i10 < 33) {
                    this.f56661a.stop();
                }
                if (i10 >= 35 && (hVar2 = this.f56664d) != null) {
                    hVar2.d(this.f56661a);
                }
                this.f56661a.release();
                this.f56665e = true;
            } finally {
            }
        } catch (Throwable th2) {
            if (!this.f56665e) {
                try {
                    int i11 = P.f127888a;
                    if (i11 >= 30 && i11 < 33) {
                        this.f56661a.stop();
                    }
                    if (i11 >= 35 && (hVar = this.f56664d) != null) {
                        hVar.d(this.f56661a);
                    }
                    this.f56661a.release();
                    this.f56665e = true;
                } finally {
                }
            }
            throw th2;
        }
    }

    public static /* synthetic */ void q(b bVar, h.d dVar, MediaCodec mediaCodec, long j10, long j11) {
        bVar.getClass();
        dVar.a(bVar, j10, j11);
    }
}
