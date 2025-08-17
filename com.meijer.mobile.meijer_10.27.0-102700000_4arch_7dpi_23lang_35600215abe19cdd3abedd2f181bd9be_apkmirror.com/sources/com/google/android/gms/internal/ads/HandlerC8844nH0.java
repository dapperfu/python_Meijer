package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;

@SuppressLint({"HandlerLeak"})
/* renamed from: com.google.android.gms.internal.ads.nH0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class HandlerC8844nH0 extends Handler implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8951oH0 f77022a;

    /* renamed from: b, reason: collision with root package name */
    private final long f77023b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC8630lH0 f77024c;

    /* renamed from: d, reason: collision with root package name */
    private IOException f77025d;

    /* renamed from: e, reason: collision with root package name */
    private int f77026e;

    /* renamed from: f, reason: collision with root package name */
    private Thread f77027f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f77028g;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f77029h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ C9378sH0 f77030i;

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        try {
            synchronized (this) {
                z10 = this.f77028g;
                this.f77027f = Thread.currentThread();
            }
            if (!z10) {
                Trace.beginSection("load:" + this.f77022a.getClass().getSimpleName());
                try {
                    this.f77022a.zzh();
                    Trace.endSection();
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
            synchronized (this) {
                this.f77027f = null;
                Thread.interrupted();
            }
            if (this.f77029h) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e10) {
            if (this.f77029h) {
                return;
            }
            obtainMessage(3, e10).sendToTarget();
        } catch (Error e11) {
            if (!this.f77029h) {
                C9917xL.d("LoadTask", "Unexpected error loading stream", e11);
                obtainMessage(4, e11).sendToTarget();
            }
            throw e11;
        } catch (Exception e12) {
            if (this.f77029h) {
                return;
            }
            C9917xL.d("LoadTask", "Unexpected exception loading stream", e12);
            obtainMessage(3, new zzyw(e12)).sendToTarget();
        } catch (OutOfMemoryError e13) {
            if (this.f77029h) {
                return;
            }
            C9917xL.d("LoadTask", "OutOfMemory error loading stream", e13);
            obtainMessage(3, new zzyw(e13)).sendToTarget();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC8844nH0(C9378sH0 c9378sH0, Looper looper, InterfaceC8951oH0 interfaceC8951oH0, InterfaceC8630lH0 interfaceC8630lH0, int i10, long j10) {
        super(looper);
        this.f77030i = c9378sH0;
        this.f77022a = interfaceC8951oH0;
        this.f77024c = interfaceC8630lH0;
        this.f77023b = j10;
    }

    public final void a(boolean z10) {
        this.f77029h = z10;
        this.f77025d = null;
        if (hasMessages(1)) {
            this.f77028g = true;
            removeMessages(1);
            if (!z10) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f77028g = true;
                    this.f77022a.zzg();
                    Thread thread = this.f77027f;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (z10) {
            this.f77030i.f78193b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            InterfaceC8630lH0 interfaceC8630lH0 = this.f77024c;
            interfaceC8630lH0.getClass();
            interfaceC8630lH0.d(this.f77022a, jElapsedRealtime, jElapsedRealtime - this.f77023b, true);
            this.f77024c = null;
        }
    }

    public final void b(int i10) throws IOException {
        IOException iOException = this.f77025d;
        if (iOException != null && this.f77026e > i10) {
            throw iOException;
        }
    }

    public final void c(long j10) {
        C8086gC.f(this.f77030i.f78193b == null);
        this.f77030i.f78193b = this;
        if (j10 > 0) {
            sendEmptyMessageDelayed(1, j10);
        } else {
            e();
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f77029h) {
            return;
        }
        int i10 = message.what;
        if (i10 == 1) {
            e();
            return;
        }
        if (i10 == 4) {
            throw ((Error) message.obj);
        }
        this.f77030i.f78193b = null;
        long j10 = this.f77023b;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = jElapsedRealtime - j10;
        InterfaceC8630lH0 interfaceC8630lH0 = this.f77024c;
        interfaceC8630lH0.getClass();
        if (this.f77028g) {
            interfaceC8630lH0.d(this.f77022a, jElapsedRealtime, j11, false);
            return;
        }
        int i11 = message.what;
        if (i11 == 2) {
            try {
                interfaceC8630lH0.i(this.f77022a, jElapsedRealtime, j11);
                return;
            } catch (RuntimeException e10) {
                C9917xL.d("LoadTask", "Unexpected exception handling load completed", e10);
                this.f77030i.f78194c = new zzyw(e10);
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f77025d = iOException;
        int i12 = this.f77026e + 1;
        this.f77026e = i12;
        C8737mH0 c8737mH0H = interfaceC8630lH0.h(this.f77022a, jElapsedRealtime, j11, iOException, i12);
        if (c8737mH0H.f76772a == 3) {
            this.f77030i.f78194c = this.f77025d;
        } else if (c8737mH0H.f76772a != 2) {
            if (c8737mH0H.f76772a == 1) {
                this.f77026e = 1;
            }
            c(c8737mH0H.f76773b != -9223372036854775807L ? c8737mH0H.f76773b : Math.min((this.f77026e - 1) * 1000, 5000));
        }
    }

    private final void e() {
        SystemClock.elapsedRealtime();
        this.f77024c.getClass();
        this.f77025d = null;
        C9378sH0 c9378sH0 = this.f77030i;
        BH0 bh0 = c9378sH0.f78192a;
        HandlerC8844nH0 handlerC8844nH0 = c9378sH0.f78193b;
        handlerC8844nH0.getClass();
        bh0.execute(handlerC8844nH0);
    }
}
