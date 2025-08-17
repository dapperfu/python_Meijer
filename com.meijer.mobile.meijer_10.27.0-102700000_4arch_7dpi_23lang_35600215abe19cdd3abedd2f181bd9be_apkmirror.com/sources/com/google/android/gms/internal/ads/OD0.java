package com.google.android.gms.internal.ads;

import Z.C5508f;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* loaded from: classes6.dex */
final class OD0 extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    private final HandlerThread f69032b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f69033c;

    /* renamed from: h, reason: collision with root package name */
    private MediaFormat f69038h;

    /* renamed from: i, reason: collision with root package name */
    private MediaFormat f69039i;

    /* renamed from: j, reason: collision with root package name */
    private MediaCodec.CodecException f69040j;

    /* renamed from: k, reason: collision with root package name */
    private MediaCodec.CryptoException f69041k;

    /* renamed from: l, reason: collision with root package name */
    private long f69042l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f69043m;

    /* renamed from: n, reason: collision with root package name */
    private IllegalStateException f69044n;

    /* renamed from: o, reason: collision with root package name */
    private YD0 f69045o;

    /* renamed from: a, reason: collision with root package name */
    private final Object f69031a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final C5508f f69034d = new C5508f();

    /* renamed from: e, reason: collision with root package name */
    private final C5508f f69035e = new C5508f();

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque f69036f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    private final ArrayDeque f69037g = new ArrayDeque();

    private final boolean l() {
        return this.f69042l > 0 || this.f69043m;
    }

    public static /* synthetic */ void d(OD0 od0) {
        synchronized (od0.f69031a) {
            try {
                if (od0.f69043m) {
                    return;
                }
                long j10 = od0.f69042l - 1;
                od0.f69042l = j10;
                if (j10 > 0) {
                    return;
                }
                if (j10 >= 0) {
                    od0.j();
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException();
                synchronized (od0.f69031a) {
                    od0.f69044n = illegalStateException;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void i(MediaFormat mediaFormat) {
        this.f69035e.a(-2);
        this.f69037g.add(mediaFormat);
    }

    private final void j() {
        if (!this.f69037g.isEmpty()) {
            this.f69039i = (MediaFormat) this.f69037g.getLast();
        }
        this.f69034d.b();
        this.f69035e.b();
        this.f69036f.clear();
        this.f69037g.clear();
    }

    private final void k() {
        IllegalStateException illegalStateException = this.f69044n;
        if (illegalStateException != null) {
            this.f69044n = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.f69040j;
        if (codecException != null) {
            this.f69040j = null;
            throw codecException;
        }
        MediaCodec.CryptoException cryptoException = this.f69041k;
        if (cryptoException == null) {
            return;
        }
        this.f69041k = null;
        throw cryptoException;
    }

    public final int a() {
        synchronized (this.f69031a) {
            try {
                k();
                int iE = -1;
                if (l()) {
                    return -1;
                }
                if (!this.f69034d.d()) {
                    iE = this.f69034d.e();
                }
                return iE;
            } finally {
            }
        }
    }

    public final int b(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f69031a) {
            try {
                k();
                if (l()) {
                    return -1;
                }
                if (this.f69035e.d()) {
                    return -1;
                }
                int iE = this.f69035e.e();
                if (iE >= 0) {
                    C8086gC.b(this.f69038h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f69036f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (iE == -2) {
                    this.f69038h = (MediaFormat) this.f69037g.remove();
                    iE = -2;
                }
                return iE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final MediaFormat c() {
        MediaFormat mediaFormat;
        synchronized (this.f69031a) {
            try {
                mediaFormat = this.f69038h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mediaFormat;
    }

    public final void e() {
        synchronized (this.f69031a) {
            this.f69042l++;
            Handler handler = this.f69033c;
            int i10 = OV.f69091a;
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.ND0
                @Override // java.lang.Runnable
                public final void run() {
                    OD0.d(this.f68845a);
                }
            });
        }
    }

    public final void f(MediaCodec mediaCodec) {
        C8086gC.f(this.f69033c == null);
        this.f69032b.start();
        Handler handler = new Handler(this.f69032b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f69033c = handler;
    }

    public final void g(YD0 yd0) {
        synchronized (this.f69031a) {
            this.f69045o = yd0;
        }
    }

    public final void h() {
        synchronized (this.f69031a) {
            this.f69043m = true;
            this.f69032b.quit();
            j();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f69031a) {
            this.f69041k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f69031a) {
            this.f69040j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f69031a) {
            try {
                this.f69034d.a(i10);
                YD0 yd0 = this.f69045o;
                if (yd0 != null) {
                    AbstractC8198hE0 abstractC8198hE0 = ((C7877eE0) yd0).f73794a;
                    if (abstractC8198hE0.f74645D != null) {
                        abstractC8198hE0.f74645D.zza();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f69031a) {
            try {
                MediaFormat mediaFormat = this.f69039i;
                if (mediaFormat != null) {
                    i(mediaFormat);
                    this.f69039i = null;
                }
                this.f69035e.a(i10);
                this.f69036f.add(bufferInfo);
                YD0 yd0 = this.f69045o;
                if (yd0 != null) {
                    AbstractC8198hE0 abstractC8198hE0 = ((C7877eE0) yd0).f73794a;
                    if (abstractC8198hE0.f74645D != null) {
                        abstractC8198hE0.f74645D.zza();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f69031a) {
            i(mediaFormat);
            this.f69039i = null;
        }
    }

    OD0(HandlerThread handlerThread) {
        this.f69032b = handlerThread;
    }
}
