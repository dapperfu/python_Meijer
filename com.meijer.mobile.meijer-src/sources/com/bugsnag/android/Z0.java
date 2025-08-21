package com.bugsnag.android;

import R6.ImmutableConfig;
import R6.j;
import android.app.Activity;
import com.bugsnag.android.e1;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Date;
import java.util.Deque;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes4.dex */
class Z0 extends C6606m implements j.a {

    /* renamed from: a, reason: collision with root package name */
    private final Deque<String> f64069a;

    /* renamed from: b, reason: collision with root package name */
    private final long f64070b;

    /* renamed from: c, reason: collision with root package name */
    private final ImmutableConfig f64071c;

    /* renamed from: d, reason: collision with root package name */
    private final CallbackState f64072d;

    /* renamed from: e, reason: collision with root package name */
    private final C6617s f64073e;

    /* renamed from: f, reason: collision with root package name */
    final Y0 f64074f;

    /* renamed from: g, reason: collision with root package name */
    private volatile V0 f64075g;

    /* renamed from: h, reason: collision with root package name */
    final R6.b f64076h;

    /* renamed from: i, reason: collision with root package name */
    final D0 f64077i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f64078j;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Z0.this.g();
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ V0 f64080a;

        b(V0 v02) {
            this.f64080a = v02;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            Z0.this.b(this.f64080a);
        }
    }

    Z0(ImmutableConfig immutableConfig, CallbackState callbackState, C6617s c6617s, Y0 y02, D0 d02, R6.b bVar) {
        this(immutableConfig, callbackState, c6617s, 30000L, y02, d02, bVar);
    }

    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f64082a;

        static {
            int[] iArr = new int[L.values().length];
            f64082a = iArr;
            try {
                iArr[L.DELIVERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f64082a[L.UNDELIVERED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f64082a[L.FAILURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    Z0(ImmutableConfig immutableConfig, CallbackState callbackState, C6617s c6617s, long j10, Y0 y02, D0 d02, R6.b bVar) {
        this.f64069a = new ArrayDeque();
        this.f64075g = null;
        this.f64078j = true;
        this.f64071c = immutableConfig;
        this.f64072d = callbackState;
        this.f64073e = c6617s;
        this.f64070b = j10;
        this.f64074f = y02;
        this.f64076h = bVar;
        this.f64077i = d02;
    }

    private void e(V0 v02) throws Throwable {
        try {
            this.f64076h.d(R6.t.SESSION_REQUEST, new b(v02));
        } catch (RejectedExecutionException unused) {
            this.f64074f.k(v02);
        }
    }

    private boolean p(boolean z10) {
        if (this.f64073e.h().N(z10)) {
            return true;
        }
        V0 v02 = this.f64075g;
        if (z10 && v02 != null && !v02.k() && this.f64078j) {
            this.f64078j = false;
            return true;
        }
        if (z10) {
            this.f64078j = false;
        }
        return false;
    }

    private boolean s(V0 v02) throws Throwable {
        this.f64077i.d("SessionTracker#trackSessionIfNeeded() - session captured by Client");
        v02.u(this.f64073e.f().d());
        v02.v(this.f64073e.k().h());
        if (!this.f64072d.j(v02, this.f64077i) || !v02.q()) {
            return false;
        }
        this.f64075g = v02;
        l(v02);
        e(v02);
        d();
        return true;
    }

    @Override // R6.j.a
    public void a(boolean z10, long j10) {
        if (z10 && j10 - R6.j.b() >= this.f64070b && this.f64071c.getAutoTrackSessions()) {
            q(new Date(), this.f64073e.u(), true);
        }
        updateState(new e1.n(z10, h()));
    }

    void b(V0 v02) throws Throwable {
        try {
            this.f64077i.d("SessionTracker#trackSessionIfNeeded() - attempting initial delivery");
            int i10 = c.f64082a[c(v02).ordinal()];
            if (i10 == 1) {
                this.f64077i.d("Sent 1 new session to Bugsnag");
                return;
            }
            if (i10 == 2) {
                this.f64077i.g("Storing session payload for future delivery");
                this.f64074f.k(v02);
            } else {
                if (i10 != 3) {
                    return;
                }
                this.f64077i.g("Dropping invalid session tracking payload");
            }
        } catch (Exception e10) {
            this.f64077i.b("Session tracking payload failed", e10);
        }
    }

    L c(V0 v02) {
        return this.f64071c.getDelivery().a(v02, this.f64071c.D(v02));
    }

    void d() {
        try {
            this.f64076h.d(R6.t.SESSION_REQUEST, new a());
        } catch (RejectedExecutionException e10) {
            this.f64077i.b("Failed to flush session reports", e10);
        }
    }

    void f(File file) {
        this.f64077i.d("SessionTracker#flushStoredSession() - attempting delivery");
        V0 v02 = new V0(file, this.f64073e.r(), this.f64077i, this.f64071c.getApiKey());
        if (v02.l()) {
            v02.u(this.f64073e.f().d());
            v02.v(this.f64073e.k().h());
        }
        int i10 = c.f64082a[c(v02).ordinal()];
        if (i10 == 1) {
            this.f64074f.b(Collections.singletonList(file));
            this.f64077i.d("Sent 1 new session to Bugsnag");
            return;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return;
            }
            this.f64077i.g("Deleting invalid session tracking payload");
            this.f64074f.b(Collections.singletonList(file));
            return;
        }
        if (!this.f64074f.o(file)) {
            this.f64074f.a(Collections.singletonList(file));
            this.f64077i.g("Leaving session payload for future delivery");
            return;
        }
        this.f64077i.g("Discarding historical session (from {" + this.f64074f.n(file) + "}) after failed delivery");
        this.f64074f.b(Collections.singletonList(file));
    }

    void g() {
        Iterator<File> it = this.f64074f.e().iterator();
        while (it.hasNext()) {
            f(it.next());
        }
    }

    String h() {
        String strPeekLast;
        synchronized (this.f64069a) {
            strPeekLast = this.f64069a.peekLast();
        }
        return strPeekLast;
    }

    V0 i() {
        V0 v02 = this.f64075g;
        if (v02 == null || v02.m()) {
            return null;
        }
        return v02;
    }

    void m() {
        V0 v02 = this.f64075g;
        if (v02 != null) {
            v02.o();
            updateState(e1.k.f64180a);
        }
    }

    V0 n(Date date, String str, s1 s1Var, int i10, int i11) {
        V0 v02 = null;
        if (this.f64073e.h().N(false)) {
            return null;
        }
        if (date == null || str == null) {
            updateState(e1.k.f64180a);
        } else {
            V0 v03 = new V0(str, date, s1Var, i10, i11, this.f64073e.r(), this.f64077i, this.f64071c.getApiKey());
            l(v03);
            v02 = v03;
        }
        this.f64075g = v02;
        return v02;
    }

    boolean o() {
        boolean zP;
        V0 v0R = this.f64075g;
        if (v0R == null) {
            zP = false;
            v0R = r(false);
        } else {
            zP = v0R.p();
        }
        if (v0R != null) {
            l(v0R);
        }
        return zP;
    }

    void t(String str, boolean z10) {
        if (z10) {
            synchronized (this.f64069a) {
                this.f64069a.add(str);
            }
        } else {
            synchronized (this.f64069a) {
                this.f64069a.removeLastOccurrence(str);
            }
        }
        this.f64073e.j().d(h());
    }

    private void l(V0 v02) {
        updateState(new e1.l(v02.e(), R6.g.c(v02.g()), v02.d(), v02.h()));
    }

    long j() {
        return R6.j.a();
    }

    boolean k() {
        return R6.j.e();
    }

    @Override // R6.j.a
    public void onActivityStarted(Activity activity) {
        t(activity.getClass().getSimpleName(), true);
    }

    @Override // R6.j.a
    public void onActivityStopped(Activity activity) {
        t(activity.getClass().getSimpleName(), false);
    }

    V0 q(Date date, s1 s1Var, boolean z10) {
        if (p(z10)) {
            return null;
        }
        V0 v02 = new V0(UUID.randomUUID().toString(), date, s1Var, z10, this.f64073e.r(), this.f64077i, this.f64071c.getApiKey());
        if (!s(v02)) {
            return null;
        }
        return v02;
    }

    V0 r(boolean z10) {
        if (p(z10)) {
            return null;
        }
        return q(new Date(), this.f64073e.u(), z10);
    }
}
