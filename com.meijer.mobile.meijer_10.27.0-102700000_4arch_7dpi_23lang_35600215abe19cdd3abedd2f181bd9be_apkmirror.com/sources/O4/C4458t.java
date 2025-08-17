package O4;

import N4.AbstractC4333v;
import N4.C4322j;
import O4.V;
import V4.WorkGenerationalId;
import android.content.Context;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: O4.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4458t implements U4.a {

    /* renamed from: l, reason: collision with root package name */
    private static final String f23230l = AbstractC4333v.i("Processor");

    /* renamed from: b, reason: collision with root package name */
    private Context f23232b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.work.a f23233c;

    /* renamed from: d, reason: collision with root package name */
    private X4.b f23234d;

    /* renamed from: e, reason: collision with root package name */
    private WorkDatabase f23235e;

    /* renamed from: g, reason: collision with root package name */
    private Map<String, V> f23237g = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private Map<String, V> f23236f = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    private Set<String> f23239i = new HashSet();

    /* renamed from: j, reason: collision with root package name */
    private final List<InterfaceC4445f> f23240j = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    private PowerManager.WakeLock f23231a = null;

    /* renamed from: k, reason: collision with root package name */
    private final Object f23241k = new Object();

    /* renamed from: h, reason: collision with root package name */
    private Map<String, Set<y>> f23238h = new HashMap();

    public boolean o(y yVar) {
        return p(yVar, null);
    }

    public static /* synthetic */ WorkSpec b(C4458t c4458t, ArrayList arrayList, String str) {
        arrayList.addAll(c4458t.f23235e.m().a(str));
        return c4458t.f23235e.l().k(str);
    }

    public static /* synthetic */ void c(C4458t c4458t, WorkGenerationalId workGenerationalId, boolean z10) {
        synchronized (c4458t.f23241k) {
            try {
                Iterator<InterfaceC4445f> it = c4458t.f23240j.iterator();
                while (it.hasNext()) {
                    it.next().b(workGenerationalId, z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private V f(String str) {
        V vRemove = this.f23236f.remove(str);
        boolean z10 = vRemove != null;
        if (!z10) {
            vRemove = this.f23237g.remove(str);
        }
        this.f23238h.remove(str);
        if (z10) {
            r();
        }
        return vRemove;
    }

    private V h(String str) {
        V v10 = this.f23236f.get(str);
        return v10 == null ? this.f23237g.get(str) : v10;
    }

    private static boolean i(String str, V v10, int i10) {
        if (v10 == null) {
            AbstractC4333v.e().a(f23230l, "WorkerWrapper could not be found for " + str);
            return false;
        }
        v10.o(i10);
        AbstractC4333v.e().a(f23230l, "WorkerWrapper interrupted for " + str);
        return true;
    }

    private void l(V v10, boolean z10) {
        synchronized (this.f23241k) {
            try {
                WorkGenerationalId workGenerationalIdL = v10.l();
                String workSpecId = workGenerationalIdL.getWorkSpecId();
                if (h(workSpecId) == v10) {
                    f(workSpecId);
                }
                AbstractC4333v.e().a(f23230l, getClass().getSimpleName() + " " + workSpecId + " executed; reschedule = " + z10);
                Iterator<InterfaceC4445f> it = this.f23240j.iterator();
                while (it.hasNext()) {
                    it.next().b(workGenerationalIdL, z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void n(final WorkGenerationalId workGenerationalId, final boolean z10) {
        this.f23234d.a().execute(new Runnable() { // from class: O4.s
            @Override // java.lang.Runnable
            public final void run() {
                C4458t.c(this.f23227a, workGenerationalId, z10);
            }
        });
    }

    private void r() {
        synchronized (this.f23241k) {
            try {
                if (this.f23236f.isEmpty()) {
                    try {
                        this.f23232b.startService(androidx.work.impl.foreground.a.g(this.f23232b));
                    } catch (Throwable th2) {
                        AbstractC4333v.e().d(f23230l, "Unable to stop foreground service", th2);
                    }
                    PowerManager.WakeLock wakeLock = this.f23231a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f23231a = null;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // U4.a
    public void a(String str, C4322j c4322j) {
        synchronized (this.f23241k) {
            try {
                AbstractC4333v.e().f(f23230l, "Moving WorkSpec (" + str + ") to the foreground");
                V vRemove = this.f23237g.remove(str);
                if (vRemove != null) {
                    if (this.f23231a == null) {
                        PowerManager.WakeLock wakeLockB = W4.G.b(this.f23232b, "ProcessorForegroundLck");
                        this.f23231a = wakeLockB;
                        wakeLockB.acquire();
                    }
                    this.f23236f.put(str, vRemove);
                    Z1.b.p(this.f23232b, androidx.work.impl.foreground.a.f(this.f23232b, vRemove.l(), c4322j));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e(InterfaceC4445f interfaceC4445f) {
        synchronized (this.f23241k) {
            this.f23240j.add(interfaceC4445f);
        }
    }

    public WorkSpec g(String str) {
        synchronized (this.f23241k) {
            try {
                V vH = h(str);
                if (vH == null) {
                    return null;
                }
                return vH.getWorkSpec();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean j(String str) {
        boolean zContains;
        synchronized (this.f23241k) {
            zContains = this.f23239i.contains(str);
        }
        return zContains;
    }

    public boolean k(String str) {
        boolean z10;
        synchronized (this.f23241k) {
            z10 = h(str) != null;
        }
        return z10;
    }

    public void m(InterfaceC4445f interfaceC4445f) {
        synchronized (this.f23241k) {
            this.f23240j.remove(interfaceC4445f);
        }
    }

    public boolean q(String str, int i10) {
        V vF;
        synchronized (this.f23241k) {
            AbstractC4333v.e().a(f23230l, "Processor cancelling " + str);
            this.f23239i.add(str);
            vF = f(str);
        }
        return i(str, vF, i10);
    }

    public C4458t(Context context, androidx.work.a aVar, X4.b bVar, WorkDatabase workDatabase) {
        this.f23232b = context;
        this.f23233c = aVar;
        this.f23234d = bVar;
        this.f23235e = workDatabase;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void d(C4458t c4458t, com.google.common.util.concurrent.q qVar, V v10) {
        boolean zBooleanValue;
        c4458t.getClass();
        try {
            zBooleanValue = ((Boolean) qVar.get()).booleanValue();
        } catch (InterruptedException | ExecutionException unused) {
            zBooleanValue = true;
        }
        c4458t.l(v10, zBooleanValue);
    }

    public boolean p(y yVar, WorkerParameters.a aVar) throws Throwable {
        Throwable th2;
        WorkGenerationalId workGenerationalId = yVar.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String();
        final String workSpecId = workGenerationalId.getWorkSpecId();
        final ArrayList arrayList = new ArrayList();
        WorkSpec workSpec = (WorkSpec) this.f23235e.runInTransaction(new Callable() { // from class: O4.q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4458t.b(this.f23221a, arrayList, workSpecId);
            }
        });
        if (workSpec == null) {
            AbstractC4333v.e().k(f23230l, "Didn't find WorkSpec for id " + workGenerationalId);
            n(workGenerationalId, false);
            return false;
        }
        synchronized (this.f23241k) {
            try {
                try {
                } catch (Throwable th3) {
                    th = th3;
                    th2 = th;
                    throw th2;
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
            try {
                if (k(workSpecId)) {
                    Set<y> set = this.f23238h.get(workSpecId);
                    if (set.iterator().next().getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String().getGeneration() == workGenerationalId.getGeneration()) {
                        set.add(yVar);
                        AbstractC4333v.e().a(f23230l, "Work " + workGenerationalId + " is already enqueued for processing");
                    } else {
                        n(workGenerationalId, false);
                    }
                    return false;
                }
                if (workSpec.getGeneration() != workGenerationalId.getGeneration()) {
                    n(workGenerationalId, false);
                    return false;
                }
                final V vA = new V.a(this.f23232b, this.f23233c, this.f23234d, this, this.f23235e, workSpec, arrayList).k(aVar).a();
                final com.google.common.util.concurrent.q<Boolean> qVarQ = vA.q();
                qVarQ.addListener(new Runnable() { // from class: O4.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4458t.d(this.f23224a, qVarQ, vA);
                    }
                }, this.f23234d.a());
                this.f23237g.put(workSpecId, vA);
                HashSet hashSet = new HashSet();
                hashSet.add(yVar);
                this.f23238h.put(workSpecId, hashSet);
                AbstractC4333v.e().a(f23230l, getClass().getSimpleName() + ": processing " + workGenerationalId);
                return true;
            } catch (Throwable th5) {
                th2 = th5;
                throw th2;
            }
        }
    }

    public boolean s(y yVar, int i10) {
        V vF;
        String workSpecId = yVar.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String().getWorkSpecId();
        synchronized (this.f23241k) {
            vF = f(workSpecId);
        }
        return i(workSpecId, vF, i10);
    }

    public boolean t(y yVar, int i10) {
        String workSpecId = yVar.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String().getWorkSpecId();
        synchronized (this.f23241k) {
            try {
                if (this.f23236f.get(workSpecId) != null) {
                    AbstractC4333v.e().a(f23230l, "Ignored stopWork. WorkerWrapper " + workSpecId + " is in foreground");
                    return false;
                }
                Set<y> set = this.f23238h.get(workSpecId);
                if (set != null && set.contains(yVar)) {
                    return i(workSpecId, f(workSpecId), i10);
                }
                return false;
            } finally {
            }
        }
    }
}
