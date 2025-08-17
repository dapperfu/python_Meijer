package androidx.media3.exoplayer.mediacodec;

import Z.C5508f;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.media3.exoplayer.mediacodec.h;
import d3.C13466a;
import d3.P;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
final class e extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    private final HandlerThread f56463b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f56464c;

    /* renamed from: h, reason: collision with root package name */
    private MediaFormat f56469h;

    /* renamed from: i, reason: collision with root package name */
    private MediaFormat f56470i;

    /* renamed from: j, reason: collision with root package name */
    private MediaCodec.CodecException f56471j;

    /* renamed from: k, reason: collision with root package name */
    private MediaCodec.CryptoException f56472k;

    /* renamed from: l, reason: collision with root package name */
    private long f56473l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f56474m;

    /* renamed from: n, reason: collision with root package name */
    private IllegalStateException f56475n;

    /* renamed from: o, reason: collision with root package name */
    private h.c f56476o;

    /* renamed from: a, reason: collision with root package name */
    private final Object f56462a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final C5508f f56465d = new C5508f();

    /* renamed from: e, reason: collision with root package name */
    private final C5508f f56466e = new C5508f();

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque<MediaCodec.BufferInfo> f56467f = new ArrayDeque<>();

    /* renamed from: g, reason: collision with root package name */
    private final ArrayDeque<MediaFormat> f56468g = new ArrayDeque<>();

    private void b(MediaFormat mediaFormat) {
        this.f56466e.a(-2);
        this.f56468g.add(mediaFormat);
    }

    private void f() {
        if (!this.f56468g.isEmpty()) {
            this.f56470i = this.f56468g.getLast();
        }
        this.f56465d.b();
        this.f56466e.b();
        this.f56467f.clear();
        this.f56468g.clear();
    }

    private boolean i() {
        return this.f56473l > 0 || this.f56474m;
    }

    private void k() {
        IllegalStateException illegalStateException = this.f56475n;
        if (illegalStateException == null) {
            return;
        }
        this.f56475n = null;
        throw illegalStateException;
    }

    private void l() {
        MediaCodec.CryptoException cryptoException = this.f56472k;
        if (cryptoException == null) {
            return;
        }
        this.f56472k = null;
        throw cryptoException;
    }

    private void m() {
        MediaCodec.CodecException codecException = this.f56471j;
        if (codecException == null) {
            return;
        }
        this.f56471j = null;
        throw codecException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        synchronized (this.f56462a) {
            try {
                if (this.f56474m) {
                    return;
                }
                long j10 = this.f56473l - 1;
                this.f56473l = j10;
                if (j10 > 0) {
                    return;
                }
                if (j10 < 0) {
                    o(new IllegalStateException());
                } else {
                    f();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void o(IllegalStateException illegalStateException) {
        synchronized (this.f56462a) {
            this.f56475n = illegalStateException;
        }
    }

    public int c() {
        synchronized (this.f56462a) {
            try {
                j();
                int iE = -1;
                if (i()) {
                    return -1;
                }
                if (!this.f56465d.d()) {
                    iE = this.f56465d.e();
                }
                return iE;
            } finally {
            }
        }
    }

    public int d(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f56462a) {
            try {
                j();
                if (i()) {
                    return -1;
                }
                if (this.f56466e.d()) {
                    return -1;
                }
                int iE = this.f56466e.e();
                if (iE >= 0) {
                    C13466a.i(this.f56469h);
                    MediaCodec.BufferInfo bufferInfoRemove = this.f56467f.remove();
                    bufferInfo.set(bufferInfoRemove.offset, bufferInfoRemove.size, bufferInfoRemove.presentationTimeUs, bufferInfoRemove.flags);
                } else if (iE == -2) {
                    this.f56469h = this.f56468g.remove();
                }
                return iE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e() {
        synchronized (this.f56462a) {
            this.f56473l++;
            ((Handler) P.h(this.f56464c)).post(new Runnable() { // from class: androidx.media3.exoplayer.mediacodec.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f56461a.n();
                }
            });
        }
    }

    public MediaFormat g() {
        MediaFormat mediaFormat;
        synchronized (this.f56462a) {
            try {
                mediaFormat = this.f56469h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mediaFormat;
    }

    public void h(MediaCodec mediaCodec) {
        C13466a.g(this.f56464c == null);
        this.f56463b.start();
        Handler handler = new Handler(this.f56463b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f56464c = handler;
    }

    @Override // android.media.MediaCodec.Callback
    public void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f56462a) {
            this.f56472k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f56462a) {
            this.f56471j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f56462a) {
            try {
                this.f56465d.a(i10);
                h.c cVar = this.f56476o;
                if (cVar != null) {
                    cVar.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f56462a) {
            try {
                MediaFormat mediaFormat = this.f56470i;
                if (mediaFormat != null) {
                    b(mediaFormat);
                    this.f56470i = null;
                }
                this.f56466e.a(i10);
                this.f56467f.add(bufferInfo);
                h.c cVar = this.f56476o;
                if (cVar != null) {
                    cVar.b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f56462a) {
            b(mediaFormat);
            this.f56470i = null;
        }
    }

    public void p(h.c cVar) {
        synchronized (this.f56462a) {
            this.f56476o = cVar;
        }
    }

    public void q() {
        synchronized (this.f56462a) {
            this.f56474m = true;
            this.f56463b.quit();
            f();
        }
    }

    e(HandlerThread handlerThread) {
        this.f56463b = handlerThread;
    }

    private void j() {
        k();
        m();
        l();
    }
}
