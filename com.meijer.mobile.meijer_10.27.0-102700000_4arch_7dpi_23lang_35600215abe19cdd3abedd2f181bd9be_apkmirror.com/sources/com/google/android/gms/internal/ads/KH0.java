package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* loaded from: classes6.dex */
final class KH0 extends HandlerThread implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    private OF f68071a;

    /* renamed from: b, reason: collision with root package name */
    private Handler f68072b;

    /* renamed from: c, reason: collision with root package name */
    private Error f68073c;

    /* renamed from: d, reason: collision with root package name */
    private RuntimeException f68074d;

    /* renamed from: e, reason: collision with root package name */
    private MH0 f68075e;

    public KH0() {
        super("ExoPlayer:PlaceholderSurface");
    }

    public final void b() {
        Handler handler = this.f68072b;
        handler.getClass();
        handler.sendEmptyMessage(2);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        OF of2;
        int i10 = message.what;
        try {
            if (i10 == 1) {
                try {
                    int i11 = message.arg1;
                    OF of3 = this.f68071a;
                    if (of3 == null) {
                        throw null;
                    }
                    of3.b(i11);
                    this.f68075e = new MH0(this, this.f68071a.a(), i11 != 0, null);
                    synchronized (this) {
                        notify();
                    }
                } catch (zzde e10) {
                    C9917xL.d("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.f68074d = new IllegalStateException(e10);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e11) {
                    C9917xL.d("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.f68073c = e11;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e12) {
                    C9917xL.d("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                    this.f68074d = e12;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i10 == 2) {
                try {
                    of2 = this.f68071a;
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                if (of2 == null) {
                    throw null;
                }
                of2.e();
                return true;
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }

    public final MH0 a(int i10) {
        boolean z10;
        start();
        this.f68072b = new Handler(getLooper(), this);
        this.f68071a = new OF(this.f68072b, null);
        synchronized (this) {
            z10 = false;
            this.f68072b.obtainMessage(1, i10, 0).sendToTarget();
            while (this.f68075e == null && this.f68074d == null && this.f68073c == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.f68074d;
        if (runtimeException == null) {
            Error error = this.f68073c;
            if (error == null) {
                MH0 mh0 = this.f68075e;
                mh0.getClass();
                return mh0;
            }
            throw error;
        }
        throw runtimeException;
    }
}
