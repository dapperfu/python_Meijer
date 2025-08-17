package com.bugsnag.android;

import Q6.ImmutableConfig;
import com.bugsnag.android.T0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes4.dex */
class E extends C6475j {

    /* renamed from: g, reason: collision with root package name */
    static long f63063g = 3000;

    /* renamed from: a, reason: collision with root package name */
    final InterfaceC6495t0 f63064a;

    /* renamed from: b, reason: collision with root package name */
    private final C6458a0 f63065b;

    /* renamed from: c, reason: collision with root package name */
    private final ImmutableConfig f63066c;

    /* renamed from: d, reason: collision with root package name */
    private final B0 f63067d;

    /* renamed from: e, reason: collision with root package name */
    private final CallbackState f63068e;

    /* renamed from: f, reason: collision with root package name */
    final Q6.a f63069f;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y f63070a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ V f63071b;

        a(Y y10, V v10) {
            this.f63070a = y10;
            this.f63071b = v10;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            E.this.e(this.f63070a, this.f63071b);
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f63073a;

        static {
            int[] iArr = new int[H.values().length];
            f63073a = iArr;
            try {
                iArr[H.DELIVERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63073a[H.UNDELIVERED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f63073a[H.FAILURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private void b(V v10, boolean z10) throws Throwable {
        this.f63065b.h(v10);
        if (z10) {
            this.f63065b.l();
        }
    }

    private void d(V v10, Y y10) throws Throwable {
        try {
            this.f63069f.c(Q6.n.ERROR_REQUEST, new a(y10, v10));
        } catch (RejectedExecutionException unused) {
            b(v10, false);
            this.f63064a.g("Exceeded max queue count, saving to disk to send later");
        }
    }

    void c(V v10) {
        this.f63064a.d("DeliveryDelegate#deliver() - event being stored/delivered by Client");
        K0 k0G = v10.g();
        if (k0G != null) {
            if (v10.j()) {
                v10.r(k0G.h());
                updateState(T0.j.f63252a);
            } else {
                v10.r(k0G.g());
                updateState(T0.i.f63251a);
            }
        }
        if (!v10.f().j()) {
            if (this.f63068e.d(v10, this.f63064a)) {
                d(v10, new Y(v10.c(), v10, this.f63067d, this.f63066c));
                return;
            }
            return;
        }
        boolean zEquals = "unhandledPromiseRejection".equals(v10.f().l());
        if (v10.f().o(v10) || zEquals) {
            b(v10, true);
        } else if (this.f63066c.getAttemptDeliveryOnCrash()) {
            a(v10);
        } else {
            b(v10, false);
        }
    }

    H e(Y y10, V v10) throws Throwable {
        this.f63064a.d("DeliveryDelegate#deliverPayloadInternal() - attempting event delivery");
        H hB = this.f63066c.getDelivery().b(y10, this.f63066c.m(y10));
        int i10 = b.f63073a[hB.ordinal()];
        if (i10 == 1) {
            this.f63064a.f("Sent 1 new event to Bugsnag");
            return hB;
        }
        if (i10 == 2) {
            this.f63064a.g("Could not send event(s) to Bugsnag, saving to disk to send later");
            b(v10, false);
            return hB;
        }
        if (i10 != 3) {
            return hB;
        }
        this.f63064a.g("Problem sending event to Bugsnag");
        return hB;
    }

    E(InterfaceC6495t0 interfaceC6495t0, C6458a0 c6458a0, ImmutableConfig immutableConfig, CallbackState callbackState, B0 b02, Q6.a aVar) {
        this.f63064a = interfaceC6495t0;
        this.f63065b = c6458a0;
        this.f63066c = immutableConfig;
        this.f63068e = callbackState;
        this.f63067d = b02;
        this.f63069f = aVar;
    }

    private void a(V v10) throws ExecutionException, InterruptedException, TimeoutException {
        long jCurrentTimeMillis = System.currentTimeMillis() + f63063g;
        Future<String> futureV = this.f63065b.v(v10);
        long jCurrentTimeMillis2 = jCurrentTimeMillis - System.currentTimeMillis();
        if (futureV != null && jCurrentTimeMillis2 > 0) {
            try {
                futureV.get(jCurrentTimeMillis2, TimeUnit.MILLISECONDS);
            } catch (Exception e10) {
                this.f63064a.b("failed to immediately deliver event", e10);
            }
            if (!futureV.isDone()) {
                futureV.cancel(true);
            }
        }
    }
}
