package P4;

import O4.AbstractC4373v;
import O4.C4362j;
import P4.V;
import W4.WorkGenerationalId;
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

/* renamed from: P4.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4584t implements V4.a {

    /* renamed from: l, reason: collision with root package name */
    private static final String f25570l = AbstractC4373v.i("Processor");

    /* renamed from: b, reason: collision with root package name */
    private Context f25572b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.work.a f25573c;

    /* renamed from: d, reason: collision with root package name */
    private Y4.b f25574d;

    /* renamed from: e, reason: collision with root package name */
    private WorkDatabase f25575e;

    /* renamed from: g, reason: collision with root package name */
    private Map<String, V> f25577g = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private Map<String, V> f25576f = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    private Set<String> f25579i = new HashSet();

    /* renamed from: j, reason: collision with root package name */
    private final List<InterfaceC4571f> f25580j = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    private PowerManager.WakeLock f25571a = null;

    /* renamed from: k, reason: collision with root package name */
    private final Object f25581k = new Object();

    /* renamed from: h, reason: collision with root package name */
    private Map<String, Set<y>> f25578h = new HashMap();

    public boolean o(y yVar) {
        return p(yVar, null);
    }

    public static /* synthetic */ WorkSpec b(C4584t c4584t, ArrayList arrayList, String str) {
        arrayList.addAll(c4584t.f25575e.m().a(str));
        return c4584t.f25575e.l().j(str);
    }

    public static /* synthetic */ void c(C4584t c4584t, WorkGenerationalId workGenerationalId, boolean z10) {
        synchronized (c4584t.f25581k) {
            try {
                Iterator<InterfaceC4571f> it = c4584t.f25580j.iterator();
                while (it.hasNext()) {
                    it.next().e(workGenerationalId, z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private V f(String str) {
        V vRemove = this.f25576f.remove(str);
        boolean z10 = vRemove != null;
        if (!z10) {
            vRemove = this.f25577g.remove(str);
        }
        this.f25578h.remove(str);
        if (z10) {
            r();
        }
        return vRemove;
    }

    private V h(String str) {
        V v10 = this.f25576f.get(str);
        return v10 == null ? this.f25577g.get(str) : v10;
    }

    private static boolean i(String str, V v10, int i10) {
        if (v10 == null) {
            AbstractC4373v.e().a(f25570l, "WorkerWrapper could not be found for " + str);
            return false;
        }
        v10.o(i10);
        AbstractC4373v.e().a(f25570l, "WorkerWrapper interrupted for " + str);
        return true;
    }

    private void l(V v10, boolean z10) {
        synchronized (this.f25581k) {
            try {
                WorkGenerationalId workGenerationalIdL = v10.l();
                String workSpecId = workGenerationalIdL.getWorkSpecId();
                if (h(workSpecId) == v10) {
                    f(workSpecId);
                }
                AbstractC4373v.e().a(f25570l, getClass().getSimpleName() + " " + workSpecId + " executed; reschedule = " + z10);
                Iterator<InterfaceC4571f> it = this.f25580j.iterator();
                while (it.hasNext()) {
                    it.next().e(workGenerationalIdL, z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void n(final WorkGenerationalId workGenerationalId, final boolean z10) {
        this.f25574d.a().execute(new Runnable() { // from class: P4.s
            @Override // java.lang.Runnable
            public final void run() {
                C4584t.c(this.f25567a, workGenerationalId, z10);
            }
        });
    }

    private void r() {
        synchronized (this.f25581k) {
            try {
                if (this.f25576f.isEmpty()) {
                    try {
                        this.f25572b.startService(androidx.work.impl.foreground.a.g(this.f25572b));
                    } catch (Throwable th2) {
                        AbstractC4373v.e().d(f25570l, "Unable to stop foreground service", th2);
                    }
                    PowerManager.WakeLock wakeLock = this.f25571a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f25571a = null;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // V4.a
    public void a(String str, C4362j c4362j) {
        synchronized (this.f25581k) {
            try {
                AbstractC4373v.e().f(f25570l, "Moving WorkSpec (" + str + ") to the foreground");
                V vRemove = this.f25577g.remove(str);
                if (vRemove != null) {
                    if (this.f25571a == null) {
                        PowerManager.WakeLock wakeLockB = X4.G.b(this.f25572b, "ProcessorForegroundLck");
                        this.f25571a = wakeLockB;
                        wakeLockB.acquire();
                    }
                    this.f25576f.put(str, vRemove);
                    Z1.b.p(this.f25572b, androidx.work.impl.foreground.a.f(this.f25572b, vRemove.l(), c4362j));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e(InterfaceC4571f interfaceC4571f) {
        synchronized (this.f25581k) {
            this.f25580j.add(interfaceC4571f);
        }
    }

    public WorkSpec g(String str) {
        synchronized (this.f25581k) {
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
        synchronized (this.f25581k) {
            zContains = this.f25579i.contains(str);
        }
        return zContains;
    }

    public boolean k(String str) {
        boolean z10;
        synchronized (this.f25581k) {
            z10 = h(str) != null;
        }
        return z10;
    }

    public void m(InterfaceC4571f interfaceC4571f) {
        synchronized (this.f25581k) {
            this.f25580j.remove(interfaceC4571f);
        }
    }

    public boolean q(String str, int i10) {
        V vF;
        synchronized (this.f25581k) {
            AbstractC4373v.e().a(f25570l, "Processor cancelling " + str);
            this.f25579i.add(str);
            vF = f(str);
        }
        return i(str, vF, i10);
    }

    public C4584t(Context context, androidx.work.a aVar, Y4.b bVar, WorkDatabase workDatabase) {
        this.f25572b = context;
        this.f25573c = aVar;
        this.f25574d = bVar;
        this.f25575e = workDatabase;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void d(C4584t c4584t, com.google.common.util.concurrent.q qVar, V v10) {
        boolean zBooleanValue;
        c4584t.getClass();
        try {
            zBooleanValue = ((Boolean) qVar.get()).booleanValue();
        } catch (InterruptedException | ExecutionException unused) {
            zBooleanValue = true;
        }
        c4584t.l(v10, zBooleanValue);
    }

    public boolean p(y yVar, WorkerParameters.a aVar) throws Throwable {
        Throwable th2;
        WorkGenerationalId workGenerationalId = yVar.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String();
        final String workSpecId = workGenerationalId.getWorkSpecId();
        final ArrayList arrayList = new ArrayList();
        WorkSpec workSpec = (WorkSpec) this.f25575e.runInTransaction(new Callable() { // from class: P4.q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4584t.b(this.f25561a, arrayList, workSpecId);
            }
        });
        if (workSpec == null) {
            AbstractC4373v.e().k(f25570l, "Didn't find WorkSpec for id " + workGenerationalId);
            n(workGenerationalId, false);
            return false;
        }
        synchronized (this.f25581k) {
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
                    Set<y> set = this.f25578h.get(workSpecId);
                    if (set.iterator().next().getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String().getGeneration() == workGenerationalId.getGeneration()) {
                        set.add(yVar);
                        AbstractC4373v.e().a(f25570l, "Work " + workGenerationalId + " is already enqueued for processing");
                    } else {
                        n(workGenerationalId, false);
                    }
                    return false;
                }
                if (workSpec.getGeneration() != workGenerationalId.getGeneration()) {
                    n(workGenerationalId, false);
                    return false;
                }
                final V vA = new V.a(this.f25572b, this.f25573c, this.f25574d, this, this.f25575e, workSpec, arrayList).k(aVar).a();
                final com.google.common.util.concurrent.q<Boolean> qVarQ = vA.q();
                qVarQ.addListener(new Runnable() { // from class: P4.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4584t.d(this.f25564a, qVarQ, vA);
                    }
                }, this.f25574d.a());
                this.f25577g.put(workSpecId, vA);
                HashSet hashSet = new HashSet();
                hashSet.add(yVar);
                this.f25578h.put(workSpecId, hashSet);
                AbstractC4373v.e().a(f25570l, getClass().getSimpleName() + ": processing " + workGenerationalId);
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
        synchronized (this.f25581k) {
            vF = f(workSpecId);
        }
        return i(workSpecId, vF, i10);
    }

    public boolean t(y yVar, int i10) {
        String workSpecId = yVar.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String().getWorkSpecId();
        synchronized (this.f25581k) {
            try {
                if (this.f25576f.get(workSpecId) != null) {
                    AbstractC4373v.e().a(f25570l, "Ignored stopWork. WorkerWrapper " + workSpecId + " is in foreground");
                    return false;
                }
                Set<y> set = this.f25578h.get(workSpecId);
                if (set != null && set.contains(yVar)) {
                    return i(workSpecId, f(workSpecId), i10);
                }
                return false;
            } finally {
            }
        }
    }
}
