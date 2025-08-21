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
final class HandlerC8969nH0 extends Handler implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9076oH0 f77862a;

    /* renamed from: b, reason: collision with root package name */
    private final long f77863b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC8755lH0 f77864c;

    /* renamed from: d, reason: collision with root package name */
    private IOException f77865d;

    /* renamed from: e, reason: collision with root package name */
    private int f77866e;

    /* renamed from: f, reason: collision with root package name */
    private Thread f77867f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f77868g;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f77869h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ C9503sH0 f77870i;

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        try {
            synchronized (this) {
                z10 = this.f77868g;
                this.f77867f = Thread.currentThread();
            }
            if (!z10) {
                Trace.beginSection("load:" + this.f77862a.getClass().getSimpleName());
                try {
                    this.f77862a.zzh();
                    Trace.endSection();
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
            synchronized (this) {
                this.f77867f = null;
                Thread.interrupted();
            }
            if (this.f77869h) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e10) {
            if (this.f77869h) {
                return;
            }
            obtainMessage(3, e10).sendToTarget();
        } catch (Error e11) {
            if (!this.f77869h) {
                C10042xL.d("LoadTask", "Unexpected error loading stream", e11);
                obtainMessage(4, e11).sendToTarget();
            }
            throw e11;
        } catch (Exception e12) {
            if (this.f77869h) {
                return;
            }
            C10042xL.d("LoadTask", "Unexpected exception loading stream", e12);
            obtainMessage(3, new zzyw(e12)).sendToTarget();
        } catch (OutOfMemoryError e13) {
            if (this.f77869h) {
                return;
            }
            C10042xL.d("LoadTask", "OutOfMemory error loading stream", e13);
            obtainMessage(3, new zzyw(e13)).sendToTarget();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC8969nH0(C9503sH0 c9503sH0, Looper looper, InterfaceC9076oH0 interfaceC9076oH0, InterfaceC8755lH0 interfaceC8755lH0, int i10, long j10) {
        super(looper);
        this.f77870i = c9503sH0;
        this.f77862a = interfaceC9076oH0;
        this.f77864c = interfaceC8755lH0;
        this.f77863b = j10;
    }

    public final void a(boolean z10) {
        this.f77869h = z10;
        this.f77865d = null;
        if (hasMessages(1)) {
            this.f77868g = true;
            removeMessages(1);
            if (!z10) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f77868g = true;
                    this.f77862a.zzg();
                    Thread thread = this.f77867f;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (z10) {
            this.f77870i.f79033b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            InterfaceC8755lH0 interfaceC8755lH0 = this.f77864c;
            interfaceC8755lH0.getClass();
            interfaceC8755lH0.d(this.f77862a, jElapsedRealtime, jElapsedRealtime - this.f77863b, true);
            this.f77864c = null;
        }
    }

    public final void b(int i10) throws IOException {
        IOException iOException = this.f77865d;
        if (iOException != null && this.f77866e > i10) {
            throw iOException;
        }
    }

    public final void c(long j10) {
        C8211gC.f(this.f77870i.f79033b == null);
        this.f77870i.f79033b = this;
        if (j10 > 0) {
            sendEmptyMessageDelayed(1, j10);
        } else {
            e();
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f77869h) {
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
        this.f77870i.f79033b = null;
        long j10 = this.f77863b;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = jElapsedRealtime - j10;
        InterfaceC8755lH0 interfaceC8755lH0 = this.f77864c;
        interfaceC8755lH0.getClass();
        if (this.f77868g) {
            interfaceC8755lH0.d(this.f77862a, jElapsedRealtime, j11, false);
            return;
        }
        int i11 = message.what;
        if (i11 == 2) {
            try {
                interfaceC8755lH0.i(this.f77862a, jElapsedRealtime, j11);
                return;
            } catch (RuntimeException e10) {
                C10042xL.d("LoadTask", "Unexpected exception handling load completed", e10);
                this.f77870i.f79034c = new zzyw(e10);
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f77865d = iOException;
        int i12 = this.f77866e + 1;
        this.f77866e = i12;
        C8862mH0 c8862mH0H = interfaceC8755lH0.h(this.f77862a, jElapsedRealtime, j11, iOException, i12);
        if (c8862mH0H.f77612a == 3) {
            this.f77870i.f79034c = this.f77865d;
        } else if (c8862mH0H.f77612a != 2) {
            if (c8862mH0H.f77612a == 1) {
                this.f77866e = 1;
            }
            c(c8862mH0H.f77613b != -9223372036854775807L ? c8862mH0H.f77613b : Math.min((this.f77866e - 1) * 1000, 5000));
        }
    }

    private final void e() {
        SystemClock.elapsedRealtime();
        this.f77864c.getClass();
        this.f77865d = null;
        C9503sH0 c9503sH0 = this.f77870i;
        BH0 bh0 = c9503sH0.f79032a;
        HandlerC8969nH0 handlerC8969nH0 = c9503sH0.f79033b;
        handlerC8969nH0.getClass();
        bh0.execute(handlerC8969nH0);
    }
}
