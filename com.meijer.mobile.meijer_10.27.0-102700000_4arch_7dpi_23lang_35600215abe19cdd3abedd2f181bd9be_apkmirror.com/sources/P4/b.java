package P4;

import N4.AbstractC4333v;
import N4.C4316d;
import N4.I;
import N4.N;
import O4.C4458t;
import O4.InterfaceC4445f;
import O4.InterfaceC4460v;
import O4.K;
import O4.y;
import O4.z;
import R4.b;
import R4.f;
import R4.i;
import R4.j;
import T4.n;
import V4.WorkGenerationalId;
import V4.p;
import W4.C;
import android.content.Context;
import android.text.TextUtils;
import androidx.work.impl.model.WorkSpec;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import qv.C0;

/* loaded from: classes4.dex */
public class b implements InterfaceC4460v, f, InterfaceC4445f {

    /* renamed from: o, reason: collision with root package name */
    private static final String f24741o = AbstractC4333v.i("GreedyScheduler");

    /* renamed from: a, reason: collision with root package name */
    private final Context f24742a;

    /* renamed from: c, reason: collision with root package name */
    private P4.a f24744c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f24745d;

    /* renamed from: g, reason: collision with root package name */
    private final C4458t f24748g;

    /* renamed from: h, reason: collision with root package name */
    private final K f24749h;

    /* renamed from: i, reason: collision with root package name */
    private final androidx.work.a f24750i;

    /* renamed from: k, reason: collision with root package name */
    Boolean f24752k;

    /* renamed from: l, reason: collision with root package name */
    private final i f24753l;

    /* renamed from: m, reason: collision with root package name */
    private final X4.b f24754m;

    /* renamed from: n, reason: collision with root package name */
    private final d f24755n;

    /* renamed from: b, reason: collision with root package name */
    private final Map<WorkGenerationalId, C0> f24743b = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Object f24746e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final z f24747f = z.a();

    /* renamed from: j, reason: collision with root package name */
    private final Map<WorkGenerationalId, C0443b> f24751j = new HashMap();

    /* renamed from: P4.b$b, reason: collision with other inner class name */
    private static class C0443b {

        /* renamed from: a, reason: collision with root package name */
        final int f24756a;

        /* renamed from: b, reason: collision with root package name */
        final long f24757b;

        private C0443b(int i10, long j10) {
            this.f24756a = i10;
            this.f24757b = j10;
        }
    }

    @Override // O4.InterfaceC4460v
    public boolean d() {
        return false;
    }

    private void f() {
        this.f24752k = Boolean.valueOf(C.b(this.f24742a, this.f24750i));
    }

    private void g() {
        if (this.f24745d) {
            return;
        }
        this.f24748g.e(this);
        this.f24745d = true;
    }

    private void h(WorkGenerationalId workGenerationalId) {
        C0 c0Remove;
        synchronized (this.f24746e) {
            c0Remove = this.f24743b.remove(workGenerationalId);
        }
        if (c0Remove != null) {
            AbstractC4333v.e().a(f24741o, "Stopping tracking for " + workGenerationalId);
            c0Remove.d(null);
        }
    }

    private long i(WorkSpec workSpec) {
        long jMax;
        synchronized (this.f24746e) {
            try {
                WorkGenerationalId workGenerationalIdA = p.a(workSpec);
                C0443b c0443b = this.f24751j.get(workGenerationalIdA);
                if (c0443b == null) {
                    c0443b = new C0443b(workSpec.runAttemptCount, this.f24750i.getClock().a());
                    this.f24751j.put(workGenerationalIdA, c0443b);
                }
                jMax = c0443b.f24757b + (Math.max((workSpec.runAttemptCount - c0443b.f24756a) - 5, 0) * 30000);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jMax;
    }

    @Override // O4.InterfaceC4460v
    public void a(String str) {
        if (this.f24752k == null) {
            f();
        }
        if (!this.f24752k.booleanValue()) {
            AbstractC4333v.e().f(f24741o, "Ignoring schedule request in non-main process");
            return;
        }
        g();
        AbstractC4333v.e().a(f24741o, "Cancelling work ID " + str);
        P4.a aVar = this.f24744c;
        if (aVar != null) {
            aVar.b(str);
        }
        for (y yVar : this.f24747f.remove(str)) {
            this.f24755n.b(yVar);
            this.f24749h.b(yVar);
        }
    }

    @Override // O4.InterfaceC4445f
    public void b(WorkGenerationalId workGenerationalId, boolean z10) {
        y yVarC = this.f24747f.c(workGenerationalId);
        if (yVarC != null) {
            this.f24755n.b(yVarC);
        }
        h(workGenerationalId);
        if (z10) {
            return;
        }
        synchronized (this.f24746e) {
            this.f24751j.remove(workGenerationalId);
        }
    }

    @Override // O4.InterfaceC4460v
    public void c(WorkSpec... workSpecArr) {
        if (this.f24752k == null) {
            f();
        }
        if (!this.f24752k.booleanValue()) {
            AbstractC4333v.e().f(f24741o, "Ignoring schedule request in a secondary process");
            return;
        }
        g();
        HashSet<WorkSpec> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (WorkSpec workSpec : workSpecArr) {
            if (!this.f24747f.e(p.a(workSpec))) {
                long jMax = Math.max(workSpec.c(), i(workSpec));
                long jA = this.f24750i.getClock().a();
                if (workSpec.state == N.c.ENQUEUED) {
                    if (jA < jMax) {
                        P4.a aVar = this.f24744c;
                        if (aVar != null) {
                            aVar.a(workSpec, jMax);
                        }
                    } else if (workSpec.l()) {
                        C4316d c4316d = workSpec.constraints;
                        if (c4316d.getRequiresDeviceIdle()) {
                            AbstractC4333v.e().a(f24741o, "Ignoring " + workSpec + ". Requires device idle.");
                        } else if (c4316d.g()) {
                            AbstractC4333v.e().a(f24741o, "Ignoring " + workSpec + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(workSpec);
                            hashSet2.add(workSpec.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String);
                        }
                    } else if (!this.f24747f.e(p.a(workSpec))) {
                        AbstractC4333v.e().a(f24741o, "Starting work for " + workSpec.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String);
                        y yVarF = this.f24747f.f(workSpec);
                        this.f24755n.c(yVarF);
                        this.f24749h.a(yVarF);
                    }
                }
            }
        }
        synchronized (this.f24746e) {
            try {
                if (!hashSet.isEmpty()) {
                    AbstractC4333v.e().a(f24741o, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    for (WorkSpec workSpec2 : hashSet) {
                        WorkGenerationalId workGenerationalIdA = p.a(workSpec2);
                        if (!this.f24743b.containsKey(workGenerationalIdA)) {
                            this.f24743b.put(workGenerationalIdA, j.c(this.f24753l, workSpec2, this.f24754m.b(), this));
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public b(Context context, androidx.work.a aVar, n nVar, C4458t c4458t, K k10, X4.b bVar) {
        this.f24742a = context;
        I runnableScheduler = aVar.getRunnableScheduler();
        this.f24744c = new P4.a(this, runnableScheduler, aVar.getClock());
        this.f24755n = new d(runnableScheduler, k10);
        this.f24754m = bVar;
        this.f24753l = new i(nVar);
        this.f24750i = aVar;
        this.f24748g = c4458t;
        this.f24749h = k10;
    }

    @Override // R4.f
    public void e(WorkSpec workSpec, R4.b bVar) {
        WorkGenerationalId workGenerationalIdA = p.a(workSpec);
        if (bVar instanceof b.a) {
            if (!this.f24747f.e(workGenerationalIdA)) {
                AbstractC4333v.e().a(f24741o, "Constraints met: Scheduling work ID " + workGenerationalIdA);
                y yVarD = this.f24747f.d(workGenerationalIdA);
                this.f24755n.c(yVarD);
                this.f24749h.a(yVarD);
                return;
            }
            return;
        }
        AbstractC4333v.e().a(f24741o, "Constraints not met: Cancelling work ID " + workGenerationalIdA);
        y yVarC = this.f24747f.c(workGenerationalIdA);
        if (yVarC != null) {
            this.f24755n.b(yVarC);
            this.f24749h.e(yVarC, ((b.ConstraintsNotMet) bVar).getReason());
        }
    }
}
