package com.bugsnag.android;

import R6.ImmutableConfig;
import com.bugsnag.android.e1;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes4.dex */
class I extends C6606m {

    /* renamed from: g, reason: collision with root package name */
    static long f63917g = 3000;

    /* renamed from: a, reason: collision with root package name */
    final D0 f63918a;

    /* renamed from: b, reason: collision with root package name */
    private final S6.d<C6603k0> f63919b;

    /* renamed from: c, reason: collision with root package name */
    private final ImmutableConfig f63920c;

    /* renamed from: d, reason: collision with root package name */
    private final M0 f63921d;

    /* renamed from: e, reason: collision with root package name */
    private final CallbackState f63922e;

    /* renamed from: f, reason: collision with root package name */
    final R6.b f63923f;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C6591e0 f63924a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C6585b0 f63925b;

        a(C6591e0 c6591e0, C6585b0 c6585b0) {
            this.f63924a = c6591e0;
            this.f63925b = c6585b0;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            I.this.f(this.f63924a, this.f63925b);
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f63927a;

        static {
            int[] iArr = new int[L.values().length];
            f63927a = iArr;
            try {
                iArr[L.DELIVERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63927a[L.UNDELIVERED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f63927a[L.FAILURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private void e(C6585b0 c6585b0, C6591e0 c6591e0) throws Throwable {
        try {
            this.f63923f.d(R6.t.ERROR_REQUEST, new a(c6591e0, c6585b0));
        } catch (RejectedExecutionException unused) {
            c(c6585b0, false);
            this.f63918a.g("Exceeded max queue count, saving to disk to send later");
        }
    }

    private C6603k0 g() {
        return this.f63919b.get();
    }

    void d(C6585b0 c6585b0) {
        this.f63918a.d("DeliveryDelegate#deliver() - event being stored/delivered by Client");
        V0 v0G = c6585b0.g();
        if (v0G != null) {
            if (c6585b0.j()) {
                c6585b0.r(v0G.j());
                updateState(e1.j.f64179a);
            } else {
                c6585b0.r(v0G.i());
                updateState(e1.i.f64178a);
            }
        }
        if (!c6585b0.f().k()) {
            if (this.f63922e.h(c6585b0, this.f63918a)) {
                e(c6585b0, new C6591e0(c6585b0.c(), c6585b0, this.f63921d, this.f63920c));
                return;
            }
            return;
        }
        boolean zEquals = "unhandledPromiseRejection".equals(c6585b0.f().m());
        if (c6585b0.f().p(c6585b0) || zEquals) {
            c(c6585b0, true);
        } else if (this.f63920c.getAttemptDeliveryOnCrash()) {
            b(c6585b0);
        } else {
            c(c6585b0, false);
        }
    }

    L f(C6591e0 c6591e0, C6585b0 c6585b0) throws Throwable {
        this.f63918a.d("DeliveryDelegate#deliverPayloadInternal() - attempting event delivery");
        L lB = this.f63920c.getDelivery().b(c6591e0, this.f63920c.m(c6591e0));
        int i10 = b.f63927a[lB.ordinal()];
        if (i10 == 1) {
            this.f63918a.f("Sent 1 new event to Bugsnag");
            return lB;
        }
        if (i10 == 2) {
            this.f63918a.g("Could not send event(s) to Bugsnag, saving to disk to send later");
            c(c6585b0, false);
            return lB;
        }
        if (i10 != 3) {
            return lB;
        }
        this.f63918a.g("Problem sending event to Bugsnag");
        return lB;
    }

    I(D0 d02, S6.d<C6603k0> dVar, ImmutableConfig immutableConfig, CallbackState callbackState, M0 m02, R6.b bVar) {
        this.f63918a = d02;
        this.f63919b = dVar;
        this.f63920c = immutableConfig;
        this.f63922e = callbackState;
        this.f63921d = m02;
        this.f63923f = bVar;
    }

    private void b(C6585b0 c6585b0) throws ExecutionException, InterruptedException, TimeoutException {
        long jCurrentTimeMillis = System.currentTimeMillis() + f63917g;
        Future<String> futureJ = g().J(c6585b0);
        long jCurrentTimeMillis2 = jCurrentTimeMillis - System.currentTimeMillis();
        if (futureJ != null && jCurrentTimeMillis2 > 0) {
            try {
                futureJ.get(jCurrentTimeMillis2, TimeUnit.MILLISECONDS);
            } catch (Exception e10) {
                this.f63918a.b("failed to immediately deliver event", e10);
            }
            if (!futureJ.isDone()) {
                futureJ.cancel(true);
            }
        }
    }

    private void c(C6585b0 c6585b0, boolean z10) throws Throwable {
        g().k(c6585b0);
        if (z10) {
            g().v();
        }
    }
}
