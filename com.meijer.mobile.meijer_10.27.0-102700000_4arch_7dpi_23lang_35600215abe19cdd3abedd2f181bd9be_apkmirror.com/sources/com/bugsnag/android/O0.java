package com.bugsnag.android;

import Q6.ImmutableConfig;
import android.os.SystemClock;
import com.bugsnag.android.T0;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Date;
import java.util.Deque;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
class O0 extends C6475j {

    /* renamed from: a, reason: collision with root package name */
    private final Deque<String> f63167a;

    /* renamed from: b, reason: collision with root package name */
    private final long f63168b;

    /* renamed from: c, reason: collision with root package name */
    private final ImmutableConfig f63169c;

    /* renamed from: d, reason: collision with root package name */
    private final CallbackState f63170d;

    /* renamed from: e, reason: collision with root package name */
    private final C6487p f63171e;

    /* renamed from: f, reason: collision with root package name */
    final N0 f63172f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicLong f63173g;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicLong f63174h;

    /* renamed from: i, reason: collision with root package name */
    private volatile K0 f63175i;

    /* renamed from: j, reason: collision with root package name */
    private final C6470g0 f63176j;

    /* renamed from: k, reason: collision with root package name */
    final Q6.a f63177k;

    /* renamed from: l, reason: collision with root package name */
    final InterfaceC6495t0 f63178l;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            O0.this.f();
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ K0 f63180a;

        b(K0 k02) {
            this.f63180a = k02;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            O0.this.a(this.f63180a);
        }
    }

    O0(ImmutableConfig immutableConfig, CallbackState callbackState, C6487p c6487p, N0 n02, InterfaceC6495t0 interfaceC6495t0, Q6.a aVar) {
        this(immutableConfig, callbackState, c6487p, 30000L, n02, interfaceC6495t0, aVar);
    }

    void m(String str) {
        u(str, true, SystemClock.elapsedRealtime());
    }

    void n(String str) {
        u(str, false, SystemClock.elapsedRealtime());
    }

    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f63182a;

        static {
            int[] iArr = new int[H.values().length];
            f63182a = iArr;
            try {
                iArr[H.DELIVERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63182a[H.UNDELIVERED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f63182a[H.FAILURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    O0(ImmutableConfig immutableConfig, CallbackState callbackState, C6487p c6487p, long j10, N0 n02, InterfaceC6495t0 interfaceC6495t0, Q6.a aVar) {
        this.f63167a = new ArrayDeque();
        this.f63173g = new AtomicLong(0L);
        this.f63174h = new AtomicLong(0L);
        this.f63175i = null;
        this.f63169c = immutableConfig;
        this.f63170d = callbackState;
        this.f63171e = c6487p;
        this.f63168b = j10;
        this.f63172f = n02;
        this.f63176j = new C6470g0(c6487p.f());
        this.f63177k = aVar;
        this.f63178l = interfaceC6495t0;
        k();
    }

    private void d(K0 k02) throws Throwable {
        try {
            this.f63177k.c(Q6.n.SESSION_REQUEST, new b(k02));
        } catch (RejectedExecutionException unused) {
            this.f63172f.h(k02);
        }
    }

    private boolean t(K0 k02) throws Throwable {
        this.f63178l.d("SessionTracker#trackSessionIfNeeded() - session captured by Client");
        k02.p(this.f63171e.g().d());
        k02.q(this.f63171e.l().g());
        if (!this.f63170d.f(k02, this.f63178l) || !k02.j().compareAndSet(false, true)) {
            return false;
        }
        this.f63175i = k02;
        l(k02);
        d(k02);
        c();
        return true;
    }

    void a(K0 k02) throws Throwable {
        try {
            this.f63178l.d("SessionTracker#trackSessionIfNeeded() - attempting initial delivery");
            int i10 = c.f63182a[b(k02).ordinal()];
            if (i10 == 1) {
                this.f63178l.d("Sent 1 new session to Bugsnag");
                return;
            }
            if (i10 == 2) {
                this.f63178l.g("Storing session payload for future delivery");
                this.f63172f.h(k02);
            } else {
                if (i10 != 3) {
                    return;
                }
                this.f63178l.g("Dropping invalid session tracking payload");
            }
        } catch (Exception e10) {
            this.f63178l.b("Session tracking payload failed", e10);
        }
    }

    H b(K0 k02) {
        return this.f63169c.getDelivery().a(k02, this.f63169c.B(k02));
    }

    void c() {
        try {
            this.f63177k.c(Q6.n.SESSION_REQUEST, new a());
        } catch (RejectedExecutionException e10) {
            this.f63178l.b("Failed to flush session reports", e10);
        }
    }

    void e(File file) {
        this.f63178l.d("SessionTracker#flushStoredSession() - attempting delivery");
        K0 k02 = new K0(file, this.f63171e.s(), this.f63178l, this.f63169c.getApiKey());
        if (!k02.k()) {
            k02.p(this.f63171e.g().d());
            k02.q(this.f63171e.l().g());
        }
        int i10 = c.f63182a[b(k02).ordinal()];
        if (i10 == 1) {
            this.f63172f.b(Collections.singletonList(file));
            this.f63178l.d("Sent 1 new session to Bugsnag");
            return;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return;
            }
            this.f63178l.g("Deleting invalid session tracking payload");
            this.f63172f.b(Collections.singletonList(file));
            return;
        }
        if (!this.f63172f.j(file)) {
            this.f63172f.a(Collections.singletonList(file));
            this.f63178l.g("Leaving session payload for future delivery");
            return;
        }
        this.f63178l.g("Discarding historical session (from {" + this.f63172f.i(file) + "}) after failed delivery");
        this.f63172f.b(Collections.singletonList(file));
    }

    void f() {
        Iterator<File> it = this.f63172f.e().iterator();
        while (it.hasNext()) {
            e(it.next());
        }
    }

    String g() {
        String strPeekLast;
        synchronized (this.f63167a) {
            strPeekLast = this.f63167a.peekLast();
        }
        return strPeekLast;
    }

    K0 h() {
        K0 k02 = this.f63175i;
        if (k02 == null || k02.f63142m.get()) {
            return null;
        }
        return k02;
    }

    long i() {
        return this.f63174h.get();
    }

    Boolean j() {
        return this.f63176j.b();
    }

    void o() {
        K0 k02 = this.f63175i;
        if (k02 != null) {
            k02.f63142m.set(true);
            updateState(T0.k.f63253a);
        }
    }

    K0 p(Date date, String str, h1 h1Var, int i10, int i11) {
        K0 k02 = null;
        if (this.f63171e.i().K(false)) {
            return null;
        }
        if (date == null || str == null) {
            updateState(T0.k.f63253a);
        } else {
            K0 k03 = new K0(str, date, h1Var, i10, i11, this.f63171e.s(), this.f63178l, this.f63169c.getApiKey());
            l(k03);
            k02 = k03;
        }
        this.f63175i = k02;
        return k02;
    }

    boolean q() {
        K0 k0S = this.f63175i;
        boolean zCompareAndSet = false;
        if (k0S == null) {
            k0S = s(false);
        } else {
            zCompareAndSet = k0S.f63142m.compareAndSet(true, false);
        }
        if (k0S != null) {
            l(k0S);
        }
        return zCompareAndSet;
    }

    K0 r(Date date, h1 h1Var, boolean z10) {
        if (this.f63171e.i().K(z10)) {
            return null;
        }
        K0 k02 = new K0(UUID.randomUUID().toString(), date, h1Var, z10, this.f63171e.s(), this.f63178l, this.f63169c.getApiKey());
        if (t(k02)) {
            return k02;
        }
        return null;
    }

    K0 s(boolean z10) {
        if (this.f63171e.i().K(z10)) {
            return null;
        }
        return r(new Date(), this.f63171e.v(), z10);
    }

    void u(String str, boolean z10, long j10) {
        if (z10) {
            long j11 = j10 - this.f63173g.get();
            synchronized (this.f63167a) {
                try {
                    if (this.f63167a.isEmpty()) {
                        this.f63174h.set(j10);
                        if (j11 >= this.f63168b && this.f63169c.getAutoTrackSessions()) {
                            r(new Date(), this.f63171e.v(), true);
                        }
                    }
                    this.f63167a.add(str);
                } finally {
                }
            }
        } else {
            synchronized (this.f63167a) {
                try {
                    this.f63167a.removeLastOccurrence(str);
                    if (this.f63167a.isEmpty()) {
                        this.f63173g.set(j10);
                    }
                } finally {
                }
            }
        }
        this.f63171e.k().c(g());
        k();
    }

    private void k() {
        boolean zBooleanValue;
        Boolean boolJ = j();
        if (boolJ != null) {
            zBooleanValue = boolJ.booleanValue();
        } else {
            zBooleanValue = false;
        }
        updateState(new T0.n(zBooleanValue, g()));
    }

    private void l(K0 k02) {
        updateState(new T0.l(k02.d(), Q6.d.c(k02.e()), k02.c(), k02.f()));
    }
}
