package com.squareup.picasso;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import ku.C15322b;
import ku.InterfaceC15321a;

/* loaded from: classes11.dex */
class t {

    /* renamed from: a, reason: collision with root package name */
    final HandlerThread f126589a;

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC15321a f126590b;

    /* renamed from: c, reason: collision with root package name */
    final Handler f126591c;

    /* renamed from: d, reason: collision with root package name */
    long f126592d;

    /* renamed from: e, reason: collision with root package name */
    long f126593e;

    /* renamed from: f, reason: collision with root package name */
    long f126594f;

    /* renamed from: g, reason: collision with root package name */
    long f126595g;

    /* renamed from: h, reason: collision with root package name */
    long f126596h;

    /* renamed from: i, reason: collision with root package name */
    long f126597i;

    /* renamed from: j, reason: collision with root package name */
    long f126598j;

    /* renamed from: k, reason: collision with root package name */
    long f126599k;

    /* renamed from: l, reason: collision with root package name */
    int f126600l;

    /* renamed from: m, reason: collision with root package name */
    int f126601m;

    /* renamed from: n, reason: collision with root package name */
    int f126602n;

    private static class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final t f126603a;

        /* renamed from: com.squareup.picasso.t$a$a, reason: collision with other inner class name */
        class RunnableC1985a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Message f126604a;

            RunnableC1985a(Message message) {
                this.f126604a = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new AssertionError("Unhandled stats message." + this.f126604a.what);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                this.f126603a.g();
                return;
            }
            if (i10 == 1) {
                this.f126603a.h();
                return;
            }
            if (i10 == 2) {
                this.f126603a.e(message.arg1);
                return;
            }
            if (i10 == 3) {
                this.f126603a.f(message.arg1);
            } else if (i10 != 4) {
                o.f126547o.post(new RunnableC1985a(message));
            } else {
                this.f126603a.i((Long) message.obj);
            }
        }

        public a(Looper looper, t tVar) {
            super(looper);
            this.f126603a = tVar;
        }
    }

    private static long d(int i10, long j10) {
        return j10 / i10;
    }

    C15322b a() {
        return new C15322b(this.f126590b.b(), this.f126590b.size(), this.f126592d, this.f126593e, this.f126594f, this.f126595g, this.f126596h, this.f126597i, this.f126598j, this.f126599k, this.f126600l, this.f126601m, this.f126602n, System.currentTimeMillis());
    }

    void b() {
        this.f126591c.sendEmptyMessage(0);
    }

    void c() {
        this.f126591c.sendEmptyMessage(1);
    }

    void e(long j10) {
        int i10 = this.f126601m + 1;
        this.f126601m = i10;
        long j11 = this.f126595g + j10;
        this.f126595g = j11;
        this.f126598j = d(i10, j11);
    }

    void f(long j10) {
        this.f126602n++;
        long j11 = this.f126596h + j10;
        this.f126596h = j11;
        this.f126599k = d(this.f126601m, j11);
    }

    void g() {
        this.f126592d++;
    }

    void h() {
        this.f126593e++;
    }

    void i(Long l10) {
        this.f126600l++;
        long jLongValue = this.f126594f + l10.longValue();
        this.f126594f = jLongValue;
        this.f126597i = d(this.f126600l, jLongValue);
    }

    t(InterfaceC15321a interfaceC15321a) {
        this.f126590b = interfaceC15321a;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        this.f126589a = handlerThread;
        handlerThread.start();
        v.f(handlerThread.getLooper());
        this.f126591c = new a(handlerThread.getLooper(), this);
    }
}
