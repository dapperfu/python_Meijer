package com.google.android.gms.internal.ads;

import Z.C5608f;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* loaded from: classes6.dex */
final class OD0 extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    private final HandlerThread f69872b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f69873c;

    /* renamed from: h, reason: collision with root package name */
    private MediaFormat f69878h;

    /* renamed from: i, reason: collision with root package name */
    private MediaFormat f69879i;

    /* renamed from: j, reason: collision with root package name */
    private MediaCodec.CodecException f69880j;

    /* renamed from: k, reason: collision with root package name */
    private MediaCodec.CryptoException f69881k;

    /* renamed from: l, reason: collision with root package name */
    private long f69882l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f69883m;

    /* renamed from: n, reason: collision with root package name */
    private IllegalStateException f69884n;

    /* renamed from: o, reason: collision with root package name */
    private YD0 f69885o;

    /* renamed from: a, reason: collision with root package name */
    private final Object f69871a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final C5608f f69874d = new C5608f();

    /* renamed from: e, reason: collision with root package name */
    private final C5608f f69875e = new C5608f();

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque f69876f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    private final ArrayDeque f69877g = new ArrayDeque();

    private final boolean l() {
        return this.f69882l > 0 || this.f69883m;
    }

    public static /* synthetic */ void d(OD0 od0) {
        synchronized (od0.f69871a) {
            try {
                if (od0.f69883m) {
                    return;
                }
                long j10 = od0.f69882l - 1;
                od0.f69882l = j10;
                if (j10 > 0) {
                    return;
                }
                if (j10 >= 0) {
                    od0.j();
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException();
                synchronized (od0.f69871a) {
                    od0.f69884n = illegalStateException;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void i(MediaFormat mediaFormat) {
        this.f69875e.a(-2);
        this.f69877g.add(mediaFormat);
    }

    private final void j() {
        if (!this.f69877g.isEmpty()) {
            this.f69879i = (MediaFormat) this.f69877g.getLast();
        }
        this.f69874d.b();
        this.f69875e.b();
        this.f69876f.clear();
        this.f69877g.clear();
    }

    private final void k() {
        IllegalStateException illegalStateException = this.f69884n;
        if (illegalStateException != null) {
            this.f69884n = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.f69880j;
        if (codecException != null) {
            this.f69880j = null;
            throw codecException;
        }
        MediaCodec.CryptoException cryptoException = this.f69881k;
        if (cryptoException == null) {
            return;
        }
        this.f69881k = null;
        throw cryptoException;
    }

    public final int a() {
        synchronized (this.f69871a) {
            try {
                k();
                int iE = -1;
                if (l()) {
                    return -1;
                }
                if (!this.f69874d.d()) {
                    iE = this.f69874d.e();
                }
                return iE;
            } finally {
            }
        }
    }

    public final int b(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f69871a) {
            try {
                k();
                if (l()) {
                    return -1;
                }
                if (this.f69875e.d()) {
                    return -1;
                }
                int iE = this.f69875e.e();
                if (iE >= 0) {
                    C8211gC.b(this.f69878h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f69876f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (iE == -2) {
                    this.f69878h = (MediaFormat) this.f69877g.remove();
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
        synchronized (this.f69871a) {
            try {
                mediaFormat = this.f69878h;
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
        synchronized (this.f69871a) {
            this.f69882l++;
            Handler handler = this.f69873c;
            int i10 = OV.f69931a;
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.ND0
                @Override // java.lang.Runnable
                public final void run() {
                    OD0.d(this.f69685a);
                }
            });
        }
    }

    public final void f(MediaCodec mediaCodec) {
        C8211gC.f(this.f69873c == null);
        this.f69872b.start();
        Handler handler = new Handler(this.f69872b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f69873c = handler;
    }

    public final void g(YD0 yd0) {
        synchronized (this.f69871a) {
            this.f69885o = yd0;
        }
    }

    public final void h() {
        synchronized (this.f69871a) {
            this.f69883m = true;
            this.f69872b.quit();
            j();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f69871a) {
            this.f69881k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f69871a) {
            this.f69880j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f69871a) {
            try {
                this.f69874d.a(i10);
                YD0 yd0 = this.f69885o;
                if (yd0 != null) {
                    AbstractC8323hE0 abstractC8323hE0 = ((C8002eE0) yd0).f74634a;
                    if (abstractC8323hE0.f75485D != null) {
                        abstractC8323hE0.f75485D.zza();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f69871a) {
            try {
                MediaFormat mediaFormat = this.f69879i;
                if (mediaFormat != null) {
                    i(mediaFormat);
                    this.f69879i = null;
                }
                this.f69875e.a(i10);
                this.f69876f.add(bufferInfo);
                YD0 yd0 = this.f69885o;
                if (yd0 != null) {
                    AbstractC8323hE0 abstractC8323hE0 = ((C8002eE0) yd0).f74634a;
                    if (abstractC8323hE0.f75485D != null) {
                        abstractC8323hE0.f75485D.zza();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f69871a) {
            i(mediaFormat);
            this.f69879i = null;
        }
    }

    OD0(HandlerThread handlerThread) {
        this.f69872b = handlerThread;
    }
}
