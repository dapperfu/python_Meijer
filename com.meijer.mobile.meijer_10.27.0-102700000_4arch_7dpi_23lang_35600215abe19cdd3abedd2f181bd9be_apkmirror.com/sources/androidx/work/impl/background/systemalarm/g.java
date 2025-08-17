package androidx.work.impl.background.systemalarm;

import N4.AbstractC4333v;
import O4.C4458t;
import O4.InterfaceC4445f;
import O4.K;
import O4.M;
import O4.O;
import O4.z;
import V4.WorkGenerationalId;
import W4.G;
import W4.N;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public class g implements InterfaceC4445f {

    /* renamed from: l, reason: collision with root package name */
    static final String f59210l = AbstractC4333v.i("SystemAlarmDispatcher");

    /* renamed from: a, reason: collision with root package name */
    final Context f59211a;

    /* renamed from: b, reason: collision with root package name */
    final X4.b f59212b;

    /* renamed from: c, reason: collision with root package name */
    private final N f59213c;

    /* renamed from: d, reason: collision with root package name */
    private final C4458t f59214d;

    /* renamed from: e, reason: collision with root package name */
    private final O f59215e;

    /* renamed from: f, reason: collision with root package name */
    final androidx.work.impl.background.systemalarm.b f59216f;

    /* renamed from: g, reason: collision with root package name */
    final List<Intent> f59217g;

    /* renamed from: h, reason: collision with root package name */
    Intent f59218h;

    /* renamed from: i, reason: collision with root package name */
    private c f59219i;

    /* renamed from: j, reason: collision with root package name */
    private z f59220j;

    /* renamed from: k, reason: collision with root package name */
    private final K f59221k;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Executor executorA;
            d dVar;
            synchronized (g.this.f59217g) {
                g gVar = g.this;
                gVar.f59218h = gVar.f59217g.get(0);
            }
            Intent intent = g.this.f59218h;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = g.this.f59218h.getIntExtra("KEY_START_ID", 0);
                AbstractC4333v abstractC4333vE = AbstractC4333v.e();
                String str = g.f59210l;
                abstractC4333vE.a(str, "Processing command " + g.this.f59218h + ", " + intExtra);
                PowerManager.WakeLock wakeLockB = G.b(g.this.f59211a, action + " (" + intExtra + ")");
                try {
                    AbstractC4333v.e().a(str, "Acquiring operation wake lock (" + action + ") " + wakeLockB);
                    wakeLockB.acquire();
                    g gVar2 = g.this;
                    gVar2.f59216f.o(gVar2.f59218h, intExtra, gVar2);
                    AbstractC4333v.e().a(str, "Releasing operation wake lock (" + action + ") " + wakeLockB);
                    wakeLockB.release();
                    executorA = g.this.f59212b.a();
                    dVar = new d(g.this);
                } catch (Throwable th2) {
                    try {
                        AbstractC4333v abstractC4333vE2 = AbstractC4333v.e();
                        String str2 = g.f59210l;
                        abstractC4333vE2.d(str2, "Unexpected error in onHandleIntent", th2);
                        AbstractC4333v.e().a(str2, "Releasing operation wake lock (" + action + ") " + wakeLockB);
                        wakeLockB.release();
                        executorA = g.this.f59212b.a();
                        dVar = new d(g.this);
                    } catch (Throwable th3) {
                        AbstractC4333v.e().a(g.f59210l, "Releasing operation wake lock (" + action + ") " + wakeLockB);
                        wakeLockB.release();
                        g.this.f59212b.a().execute(new d(g.this));
                        throw th3;
                    }
                }
                executorA.execute(dVar);
            }
        }
    }

    static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final g f59223a;

        /* renamed from: b, reason: collision with root package name */
        private final Intent f59224b;

        /* renamed from: c, reason: collision with root package name */
        private final int f59225c;

        @Override // java.lang.Runnable
        public void run() {
            this.f59223a.a(this.f59224b, this.f59225c);
        }

        b(g gVar, Intent intent, int i10) {
            this.f59223a = gVar;
            this.f59224b = intent;
            this.f59225c = i10;
        }
    }

    interface c {
        void b();
    }

    static class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final g f59226a;

        @Override // java.lang.Runnable
        public void run() {
            this.f59226a.d();
        }

        d(g gVar) {
            this.f59226a = gVar;
        }
    }

    g(Context context) {
        this(context, null, null, null);
    }

    g(Context context, C4458t c4458t, O o10, K k10) {
        Context applicationContext = context.getApplicationContext();
        this.f59211a = applicationContext;
        this.f59220j = z.a();
        o10 = o10 == null ? O.p(context) : o10;
        this.f59215e = o10;
        this.f59216f = new androidx.work.impl.background.systemalarm.b(applicationContext, o10.n().getClock(), this.f59220j);
        this.f59213c = new N(o10.n().getRunnableScheduler());
        c4458t = c4458t == null ? o10.r() : c4458t;
        this.f59214d = c4458t;
        X4.b bVarV = o10.v();
        this.f59212b = bVarV;
        this.f59221k = k10 == null ? new M(c4458t, bVarV) : k10;
        c4458t.e(this);
        this.f59217g = new ArrayList();
        this.f59218h = null;
    }

    @Override // O4.InterfaceC4445f
    public void b(WorkGenerationalId workGenerationalId, boolean z10) {
        this.f59212b.a().execute(new b(this, androidx.work.impl.background.systemalarm.b.d(this.f59211a, workGenerationalId, z10), 0));
    }

    C4458t e() {
        return this.f59214d;
    }

    X4.b f() {
        return this.f59212b;
    }

    O g() {
        return this.f59215e;
    }

    N h() {
        return this.f59213c;
    }

    K i() {
        return this.f59221k;
    }

    void m(c cVar) {
        if (this.f59219i != null) {
            AbstractC4333v.e().c(f59210l, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            this.f59219i = cVar;
        }
    }

    private void c() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
        } else {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    private boolean j(String str) {
        c();
        synchronized (this.f59217g) {
            try {
                Iterator<Intent> it = this.f59217g.iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void l() {
        c();
        PowerManager.WakeLock wakeLockB = G.b(this.f59211a, "ProcessCommand");
        try {
            wakeLockB.acquire();
            this.f59215e.v().d(new a());
        } finally {
            wakeLockB.release();
        }
    }

    public boolean a(Intent intent, int i10) {
        AbstractC4333v abstractC4333vE = AbstractC4333v.e();
        String str = f59210l;
        abstractC4333vE.a(str, "Adding command " + intent + " (" + i10 + ")");
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            AbstractC4333v.e().k(str, "Unknown command. Ignoring");
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && j("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra("KEY_START_ID", i10);
        synchronized (this.f59217g) {
            try {
                boolean zIsEmpty = this.f59217g.isEmpty();
                this.f59217g.add(intent);
                if (zIsEmpty) {
                    l();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }

    void d() {
        AbstractC4333v abstractC4333vE = AbstractC4333v.e();
        String str = f59210l;
        abstractC4333vE.a(str, "Checking if commands are complete.");
        c();
        synchronized (this.f59217g) {
            try {
                if (this.f59218h != null) {
                    AbstractC4333v.e().a(str, "Removing command " + this.f59218h);
                    if (this.f59217g.remove(0).equals(this.f59218h)) {
                        this.f59218h = null;
                    } else {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                }
                X4.a aVarC = this.f59212b.c();
                if (!this.f59216f.n() && this.f59217g.isEmpty() && !aVarC.z0()) {
                    AbstractC4333v.e().a(str, "No more commands & intents.");
                    c cVar = this.f59219i;
                    if (cVar != null) {
                        cVar.b();
                    }
                } else if (!this.f59217g.isEmpty()) {
                    l();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void k() {
        AbstractC4333v.e().a(f59210l, "Destroying SystemAlarmDispatcher");
        this.f59214d.m(this);
        this.f59219i = null;
    }
}
