package Q4;

import O4.AbstractC4373v;
import O4.C4356d;
import O4.I;
import O4.N;
import P4.C4584t;
import P4.InterfaceC4571f;
import P4.InterfaceC4586v;
import P4.K;
import P4.y;
import P4.z;
import S4.b;
import S4.f;
import S4.i;
import S4.j;
import U4.n;
import W4.WorkGenerationalId;
import W4.p;
import X4.C;
import android.content.Context;
import android.text.TextUtils;
import androidx.work.impl.model.WorkSpec;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import mv.C0;

/* loaded from: classes4.dex */
public class b implements InterfaceC4586v, f, InterfaceC4571f {

    /* renamed from: o, reason: collision with root package name */
    private static final String f27771o = AbstractC4373v.i("GreedyScheduler");

    /* renamed from: a, reason: collision with root package name */
    private final Context f27772a;

    /* renamed from: c, reason: collision with root package name */
    private Q4.a f27774c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f27775d;

    /* renamed from: g, reason: collision with root package name */
    private final C4584t f27778g;

    /* renamed from: h, reason: collision with root package name */
    private final K f27779h;

    /* renamed from: i, reason: collision with root package name */
    private final androidx.work.a f27780i;

    /* renamed from: k, reason: collision with root package name */
    Boolean f27782k;

    /* renamed from: l, reason: collision with root package name */
    private final i f27783l;

    /* renamed from: m, reason: collision with root package name */
    private final Y4.b f27784m;

    /* renamed from: n, reason: collision with root package name */
    private final d f27785n;

    /* renamed from: b, reason: collision with root package name */
    private final Map<WorkGenerationalId, C0> f27773b = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Object f27776e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final z f27777f = z.a();

    /* renamed from: j, reason: collision with root package name */
    private final Map<WorkGenerationalId, C0507b> f27781j = new HashMap();

    /* renamed from: Q4.b$b, reason: collision with other inner class name */
    private static class C0507b {

        /* renamed from: a, reason: collision with root package name */
        final int f27786a;

        /* renamed from: b, reason: collision with root package name */
        final long f27787b;

        private C0507b(int i10, long j10) {
            this.f27786a = i10;
            this.f27787b = j10;
        }
    }

    @Override // P4.InterfaceC4586v
    public boolean c() {
        return false;
    }

    private void f() {
        this.f27782k = Boolean.valueOf(C.b(this.f27772a, this.f27780i));
    }

    private void g() {
        if (this.f27775d) {
            return;
        }
        this.f27778g.e(this);
        this.f27775d = true;
    }

    private void h(WorkGenerationalId workGenerationalId) {
        C0 c0Remove;
        synchronized (this.f27776e) {
            c0Remove = this.f27773b.remove(workGenerationalId);
        }
        if (c0Remove != null) {
            AbstractC4373v.e().a(f27771o, "Stopping tracking for " + workGenerationalId);
            c0Remove.d(null);
        }
    }

    private long i(WorkSpec workSpec) {
        long jMax;
        synchronized (this.f27776e) {
            try {
                WorkGenerationalId workGenerationalIdA = p.a(workSpec);
                C0507b c0507b = this.f27781j.get(workGenerationalIdA);
                if (c0507b == null) {
                    c0507b = new C0507b(workSpec.runAttemptCount, this.f27780i.getClock().a());
                    this.f27781j.put(workGenerationalIdA, c0507b);
                }
                jMax = c0507b.f27787b + (Math.max((workSpec.runAttemptCount - c0507b.f27786a) - 5, 0) * 30000);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jMax;
    }

    @Override // P4.InterfaceC4586v
    public void a(String str) {
        if (this.f27782k == null) {
            f();
        }
        if (!this.f27782k.booleanValue()) {
            AbstractC4373v.e().f(f27771o, "Ignoring schedule request in non-main process");
            return;
        }
        g();
        AbstractC4373v.e().a(f27771o, "Cancelling work ID " + str);
        Q4.a aVar = this.f27774c;
        if (aVar != null) {
            aVar.b(str);
        }
        for (y yVar : this.f27777f.remove(str)) {
            this.f27785n.b(yVar);
            this.f27779h.b(yVar);
        }
    }

    @Override // P4.InterfaceC4586v
    public void b(WorkSpec... workSpecArr) {
        if (this.f27782k == null) {
            f();
        }
        if (!this.f27782k.booleanValue()) {
            AbstractC4373v.e().f(f27771o, "Ignoring schedule request in a secondary process");
            return;
        }
        g();
        HashSet<WorkSpec> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (WorkSpec workSpec : workSpecArr) {
            if (!this.f27777f.c(p.a(workSpec))) {
                long jMax = Math.max(workSpec.c(), i(workSpec));
                long jA = this.f27780i.getClock().a();
                if (workSpec.state == N.c.ENQUEUED) {
                    if (jA < jMax) {
                        Q4.a aVar = this.f27774c;
                        if (aVar != null) {
                            aVar.a(workSpec, jMax);
                        }
                    } else if (workSpec.l()) {
                        C4356d c4356d = workSpec.constraints;
                        if (c4356d.getRequiresDeviceIdle()) {
                            AbstractC4373v.e().a(f27771o, "Ignoring " + workSpec + ". Requires device idle.");
                        } else if (c4356d.g()) {
                            AbstractC4373v.e().a(f27771o, "Ignoring " + workSpec + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(workSpec);
                            hashSet2.add(workSpec.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String);
                        }
                    } else if (!this.f27777f.c(p.a(workSpec))) {
                        AbstractC4373v.e().a(f27771o, "Starting work for " + workSpec.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String);
                        y yVarD = this.f27777f.d(workSpec);
                        this.f27785n.c(yVarD);
                        this.f27779h.a(yVarD);
                    }
                }
            }
        }
        synchronized (this.f27776e) {
            try {
                if (!hashSet.isEmpty()) {
                    AbstractC4373v.e().a(f27771o, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    for (WorkSpec workSpec2 : hashSet) {
                        WorkGenerationalId workGenerationalIdA = p.a(workSpec2);
                        if (!this.f27773b.containsKey(workGenerationalIdA)) {
                            this.f27773b.put(workGenerationalIdA, j.c(this.f27783l, workSpec2, this.f27784m.b(), this));
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // P4.InterfaceC4571f
    public void e(WorkGenerationalId workGenerationalId, boolean z10) {
        y yVarF = this.f27777f.f(workGenerationalId);
        if (yVarF != null) {
            this.f27785n.b(yVarF);
        }
        h(workGenerationalId);
        if (z10) {
            return;
        }
        synchronized (this.f27776e) {
            this.f27781j.remove(workGenerationalId);
        }
    }

    public b(Context context, androidx.work.a aVar, n nVar, C4584t c4584t, K k10, Y4.b bVar) {
        this.f27772a = context;
        I runnableScheduler = aVar.getRunnableScheduler();
        this.f27774c = new Q4.a(this, runnableScheduler, aVar.getClock());
        this.f27785n = new d(runnableScheduler, k10);
        this.f27784m = bVar;
        this.f27783l = new i(nVar);
        this.f27780i = aVar;
        this.f27778g = c4584t;
        this.f27779h = k10;
    }

    @Override // S4.f
    public void d(WorkSpec workSpec, S4.b bVar) {
        WorkGenerationalId workGenerationalIdA = p.a(workSpec);
        if (bVar instanceof b.a) {
            if (!this.f27777f.c(workGenerationalIdA)) {
                AbstractC4373v.e().a(f27771o, "Constraints met: Scheduling work ID " + workGenerationalIdA);
                y yVarE = this.f27777f.e(workGenerationalIdA);
                this.f27785n.c(yVarE);
                this.f27779h.a(yVarE);
                return;
            }
            return;
        }
        AbstractC4373v.e().a(f27771o, "Constraints not met: Cancelling work ID " + workGenerationalIdA);
        y yVarF = this.f27777f.f(workGenerationalIdA);
        if (yVarF != null) {
            this.f27785n.b(yVarF);
            this.f27779h.e(yVarF, ((b.ConstraintsNotMet) bVar).getReason());
        }
    }
}
