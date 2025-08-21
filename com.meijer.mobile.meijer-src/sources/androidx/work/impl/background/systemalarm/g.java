package androidx.work.impl.background.systemalarm;

import O4.AbstractC4373v;
import P4.C4584t;
import P4.InterfaceC4571f;
import P4.K;
import P4.M;
import P4.O;
import P4.z;
import W4.WorkGenerationalId;
import X4.G;
import X4.N;
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
public class g implements InterfaceC4571f {

    /* renamed from: l, reason: collision with root package name */
    static final String f59396l = AbstractC4373v.i("SystemAlarmDispatcher");

    /* renamed from: a, reason: collision with root package name */
    final Context f59397a;

    /* renamed from: b, reason: collision with root package name */
    final Y4.b f59398b;

    /* renamed from: c, reason: collision with root package name */
    private final N f59399c;

    /* renamed from: d, reason: collision with root package name */
    private final C4584t f59400d;

    /* renamed from: e, reason: collision with root package name */
    private final O f59401e;

    /* renamed from: f, reason: collision with root package name */
    final androidx.work.impl.background.systemalarm.b f59402f;

    /* renamed from: g, reason: collision with root package name */
    final List<Intent> f59403g;

    /* renamed from: h, reason: collision with root package name */
    Intent f59404h;

    /* renamed from: i, reason: collision with root package name */
    private c f59405i;

    /* renamed from: j, reason: collision with root package name */
    private z f59406j;

    /* renamed from: k, reason: collision with root package name */
    private final K f59407k;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Executor executorA;
            d dVar;
            synchronized (g.this.f59403g) {
                g gVar = g.this;
                gVar.f59404h = gVar.f59403g.get(0);
            }
            Intent intent = g.this.f59404h;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = g.this.f59404h.getIntExtra("KEY_START_ID", 0);
                AbstractC4373v abstractC4373vE = AbstractC4373v.e();
                String str = g.f59396l;
                abstractC4373vE.a(str, "Processing command " + g.this.f59404h + ", " + intExtra);
                PowerManager.WakeLock wakeLockB = G.b(g.this.f59397a, action + " (" + intExtra + ")");
                try {
                    AbstractC4373v.e().a(str, "Acquiring operation wake lock (" + action + ") " + wakeLockB);
                    wakeLockB.acquire();
                    g gVar2 = g.this;
                    gVar2.f59402f.o(gVar2.f59404h, intExtra, gVar2);
                    AbstractC4373v.e().a(str, "Releasing operation wake lock (" + action + ") " + wakeLockB);
                    wakeLockB.release();
                    executorA = g.this.f59398b.a();
                    dVar = new d(g.this);
                } catch (Throwable th2) {
                    try {
                        AbstractC4373v abstractC4373vE2 = AbstractC4373v.e();
                        String str2 = g.f59396l;
                        abstractC4373vE2.d(str2, "Unexpected error in onHandleIntent", th2);
                        AbstractC4373v.e().a(str2, "Releasing operation wake lock (" + action + ") " + wakeLockB);
                        wakeLockB.release();
                        executorA = g.this.f59398b.a();
                        dVar = new d(g.this);
                    } catch (Throwable th3) {
                        AbstractC4373v.e().a(g.f59396l, "Releasing operation wake lock (" + action + ") " + wakeLockB);
                        wakeLockB.release();
                        g.this.f59398b.a().execute(new d(g.this));
                        throw th3;
                    }
                }
                executorA.execute(dVar);
            }
        }
    }

    static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final g f59409a;

        /* renamed from: b, reason: collision with root package name */
        private final Intent f59410b;

        /* renamed from: c, reason: collision with root package name */
        private final int f59411c;

        @Override // java.lang.Runnable
        public void run() {
            this.f59409a.a(this.f59410b, this.f59411c);
        }

        b(g gVar, Intent intent, int i10) {
            this.f59409a = gVar;
            this.f59410b = intent;
            this.f59411c = i10;
        }
    }

    interface c {
        void b();
    }

    static class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final g f59412a;

        @Override // java.lang.Runnable
        public void run() {
            this.f59412a.c();
        }

        d(g gVar) {
            this.f59412a = gVar;
        }
    }

    g(Context context) {
        this(context, null, null, null);
    }

    g(Context context, C4584t c4584t, O o10, K k10) {
        Context applicationContext = context.getApplicationContext();
        this.f59397a = applicationContext;
        this.f59406j = z.a();
        o10 = o10 == null ? O.p(context) : o10;
        this.f59401e = o10;
        this.f59402f = new androidx.work.impl.background.systemalarm.b(applicationContext, o10.n().getClock(), this.f59406j);
        this.f59399c = new N(o10.n().getRunnableScheduler());
        c4584t = c4584t == null ? o10.r() : c4584t;
        this.f59400d = c4584t;
        Y4.b bVarV = o10.v();
        this.f59398b = bVarV;
        this.f59407k = k10 == null ? new M(c4584t, bVarV) : k10;
        c4584t.e(this);
        this.f59403g = new ArrayList();
        this.f59404h = null;
    }

    C4584t d() {
        return this.f59400d;
    }

    @Override // P4.InterfaceC4571f
    public void e(WorkGenerationalId workGenerationalId, boolean z10) {
        this.f59398b.a().execute(new b(this, androidx.work.impl.background.systemalarm.b.c(this.f59397a, workGenerationalId, z10), 0));
    }

    Y4.b f() {
        return this.f59398b;
    }

    O g() {
        return this.f59401e;
    }

    N h() {
        return this.f59399c;
    }

    K i() {
        return this.f59407k;
    }

    void m(c cVar) {
        if (this.f59405i != null) {
            AbstractC4373v.e().c(f59396l, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            this.f59405i = cVar;
        }
    }

    private void b() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
        } else {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    private boolean j(String str) {
        b();
        synchronized (this.f59403g) {
            try {
                Iterator<Intent> it = this.f59403g.iterator();
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
        b();
        PowerManager.WakeLock wakeLockB = G.b(this.f59397a, "ProcessCommand");
        try {
            wakeLockB.acquire();
            this.f59401e.v().d(new a());
        } finally {
            wakeLockB.release();
        }
    }

    public boolean a(Intent intent, int i10) {
        AbstractC4373v abstractC4373vE = AbstractC4373v.e();
        String str = f59396l;
        abstractC4373vE.a(str, "Adding command " + intent + " (" + i10 + ")");
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            AbstractC4373v.e().k(str, "Unknown command. Ignoring");
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && j("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra("KEY_START_ID", i10);
        synchronized (this.f59403g) {
            try {
                boolean zIsEmpty = this.f59403g.isEmpty();
                this.f59403g.add(intent);
                if (zIsEmpty) {
                    l();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }

    void c() {
        AbstractC4373v abstractC4373vE = AbstractC4373v.e();
        String str = f59396l;
        abstractC4373vE.a(str, "Checking if commands are complete.");
        b();
        synchronized (this.f59403g) {
            try {
                if (this.f59404h != null) {
                    AbstractC4373v.e().a(str, "Removing command " + this.f59404h);
                    if (this.f59403g.remove(0).equals(this.f59404h)) {
                        this.f59404h = null;
                    } else {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                }
                Y4.a aVarC = this.f59398b.c();
                if (!this.f59402f.n() && this.f59403g.isEmpty() && !aVarC.v0()) {
                    AbstractC4373v.e().a(str, "No more commands & intents.");
                    c cVar = this.f59405i;
                    if (cVar != null) {
                        cVar.b();
                    }
                } else if (!this.f59403g.isEmpty()) {
                    l();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void k() {
        AbstractC4373v.e().a(f59396l, "Destroying SystemAlarmDispatcher");
        this.f59400d.m(this);
        this.f59405i = null;
    }
}
