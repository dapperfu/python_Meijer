package androidx.media3.exoplayer.mediacodec;

import Z.C5608f;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.media3.exoplayer.mediacodec.h;
import d3.C13599a;
import d3.P;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
final class e extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    private final HandlerThread f56687b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f56688c;

    /* renamed from: h, reason: collision with root package name */
    private MediaFormat f56693h;

    /* renamed from: i, reason: collision with root package name */
    private MediaFormat f56694i;

    /* renamed from: j, reason: collision with root package name */
    private MediaCodec.CodecException f56695j;

    /* renamed from: k, reason: collision with root package name */
    private MediaCodec.CryptoException f56696k;

    /* renamed from: l, reason: collision with root package name */
    private long f56697l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f56698m;

    /* renamed from: n, reason: collision with root package name */
    private IllegalStateException f56699n;

    /* renamed from: o, reason: collision with root package name */
    private h.c f56700o;

    /* renamed from: a, reason: collision with root package name */
    private final Object f56686a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final C5608f f56689d = new C5608f();

    /* renamed from: e, reason: collision with root package name */
    private final C5608f f56690e = new C5608f();

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque<MediaCodec.BufferInfo> f56691f = new ArrayDeque<>();

    /* renamed from: g, reason: collision with root package name */
    private final ArrayDeque<MediaFormat> f56692g = new ArrayDeque<>();

    private void b(MediaFormat mediaFormat) {
        this.f56690e.a(-2);
        this.f56692g.add(mediaFormat);
    }

    private void f() {
        if (!this.f56692g.isEmpty()) {
            this.f56694i = this.f56692g.getLast();
        }
        this.f56689d.b();
        this.f56690e.b();
        this.f56691f.clear();
        this.f56692g.clear();
    }

    private boolean i() {
        return this.f56697l > 0 || this.f56698m;
    }

    private void k() {
        IllegalStateException illegalStateException = this.f56699n;
        if (illegalStateException == null) {
            return;
        }
        this.f56699n = null;
        throw illegalStateException;
    }

    private void l() {
        MediaCodec.CryptoException cryptoException = this.f56696k;
        if (cryptoException == null) {
            return;
        }
        this.f56696k = null;
        throw cryptoException;
    }

    private void m() {
        MediaCodec.CodecException codecException = this.f56695j;
        if (codecException == null) {
            return;
        }
        this.f56695j = null;
        throw codecException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        synchronized (this.f56686a) {
            try {
                if (this.f56698m) {
                    return;
                }
                long j10 = this.f56697l - 1;
                this.f56697l = j10;
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
        synchronized (this.f56686a) {
            this.f56699n = illegalStateException;
        }
    }

    public int c() {
        synchronized (this.f56686a) {
            try {
                j();
                int iE = -1;
                if (i()) {
                    return -1;
                }
                if (!this.f56689d.d()) {
                    iE = this.f56689d.e();
                }
                return iE;
            } finally {
            }
        }
    }

    public int d(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f56686a) {
            try {
                j();
                if (i()) {
                    return -1;
                }
                if (this.f56690e.d()) {
                    return -1;
                }
                int iE = this.f56690e.e();
                if (iE >= 0) {
                    C13599a.i(this.f56693h);
                    MediaCodec.BufferInfo bufferInfoRemove = this.f56691f.remove();
                    bufferInfo.set(bufferInfoRemove.offset, bufferInfoRemove.size, bufferInfoRemove.presentationTimeUs, bufferInfoRemove.flags);
                } else if (iE == -2) {
                    this.f56693h = this.f56692g.remove();
                }
                return iE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e() {
        synchronized (this.f56686a) {
            this.f56697l++;
            ((Handler) P.h(this.f56688c)).post(new Runnable() { // from class: androidx.media3.exoplayer.mediacodec.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f56685a.n();
                }
            });
        }
    }

    public MediaFormat g() {
        MediaFormat mediaFormat;
        synchronized (this.f56686a) {
            try {
                mediaFormat = this.f56693h;
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
        C13599a.g(this.f56688c == null);
        this.f56687b.start();
        Handler handler = new Handler(this.f56687b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f56688c = handler;
    }

    @Override // android.media.MediaCodec.Callback
    public void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f56686a) {
            this.f56696k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f56686a) {
            this.f56695j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f56686a) {
            try {
                this.f56689d.a(i10);
                h.c cVar = this.f56700o;
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
        synchronized (this.f56686a) {
            try {
                MediaFormat mediaFormat = this.f56694i;
                if (mediaFormat != null) {
                    b(mediaFormat);
                    this.f56694i = null;
                }
                this.f56690e.a(i10);
                this.f56691f.add(bufferInfo);
                h.c cVar = this.f56700o;
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
        synchronized (this.f56686a) {
            b(mediaFormat);
            this.f56694i = null;
        }
    }

    public void p(h.c cVar) {
        synchronized (this.f56686a) {
            this.f56700o = cVar;
        }
    }

    public void q() {
        synchronized (this.f56686a) {
            this.f56698m = true;
            this.f56687b.quit();
            f();
        }
    }

    e(HandlerThread handlerThread) {
        this.f56687b = handlerThread;
    }

    private void j() {
        k();
        m();
        l();
    }
}
