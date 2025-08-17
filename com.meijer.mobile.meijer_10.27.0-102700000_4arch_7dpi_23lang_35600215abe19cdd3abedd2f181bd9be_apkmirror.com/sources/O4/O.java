package O4;

import N4.AbstractC4333v;
import N4.EnumC4320h;
import N4.EnumC4321i;
import V4.WorkGenerationalId;
import W4.C5402d;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import qv.InterfaceC16622O;

/* loaded from: classes4.dex */
public class O extends N4.O {

    /* renamed from: m, reason: collision with root package name */
    private static final String f23127m = AbstractC4333v.i("WorkManagerImpl");

    /* renamed from: n, reason: collision with root package name */
    private static O f23128n = null;

    /* renamed from: o, reason: collision with root package name */
    private static O f23129o = null;

    /* renamed from: p, reason: collision with root package name */
    private static final Object f23130p = new Object();

    /* renamed from: b, reason: collision with root package name */
    private Context f23131b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.work.a f23132c;

    /* renamed from: d, reason: collision with root package name */
    private WorkDatabase f23133d;

    /* renamed from: e, reason: collision with root package name */
    private X4.b f23134e;

    /* renamed from: f, reason: collision with root package name */
    private List<InterfaceC4460v> f23135f;

    /* renamed from: g, reason: collision with root package name */
    private C4458t f23136g;

    /* renamed from: h, reason: collision with root package name */
    private W4.B f23137h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f23138i = false;

    /* renamed from: j, reason: collision with root package name */
    private BroadcastReceiver.PendingResult f23139j;

    /* renamed from: k, reason: collision with root package name */
    private final T4.n f23140k;

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC16622O f23141l;

    static class a {
        static boolean a(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    public static void j(Context context, androidx.work.a aVar) {
        synchronized (f23130p) {
            try {
                O o10 = f23128n;
                if (o10 != null && f23129o != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (o10 == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f23129o == null) {
                        f23129o = androidx.work.impl.j.c(applicationContext, aVar);
                    }
                    f23128n = f23129o;
                }
            } finally {
            }
        }
    }

    @Deprecated
    public static O o() {
        synchronized (f23130p) {
            try {
                O o10 = f23128n;
                if (o10 != null) {
                    return o10;
                }
                return f23129o;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static O p(Context context) {
        O o10;
        synchronized (f23130p) {
            try {
                o10 = o();
                if (o10 == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (!(applicationContext instanceof a.c)) {
                        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                    }
                    j(applicationContext, ((a.c) applicationContext).a());
                    o10 = p(applicationContext);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return o10;
    }

    @Override // N4.O
    public N4.z e(String str, EnumC4320h enumC4320h, N4.F f10) {
        return enumC4320h == EnumC4320h.UPDATE ? S.c(this, str, f10) : l(str, enumC4320h, f10).b();
    }

    @Override // N4.O
    public N4.z g(String str, EnumC4321i enumC4321i, List<N4.y> list) {
        return new F(this, str, enumC4321i, list).b();
    }

    @Override // N4.O
    public com.google.common.util.concurrent.q<List<N4.N>> i(String str) {
        return W4.E.a(this.f23133d, this.f23134e, str);
    }

    public F l(String str, EnumC4320h enumC4320h, N4.F f10) {
        return new F(this, str, enumC4320h == EnumC4320h.KEEP ? EnumC4321i.KEEP : EnumC4321i.REPLACE, Collections.singletonList(f10));
    }

    public Context m() {
        return this.f23131b;
    }

    public androidx.work.a n() {
        return this.f23132c;
    }

    public W4.B q() {
        return this.f23137h;
    }

    public C4458t r() {
        return this.f23136g;
    }

    public List<InterfaceC4460v> s() {
        return this.f23135f;
    }

    public T4.n t() {
        return this.f23140k;
    }

    public WorkDatabase u() {
        return this.f23133d;
    }

    public X4.b v() {
        return this.f23134e;
    }

    public void w() {
        synchronized (f23130p) {
            try {
                this.f23138i = true;
                BroadcastReceiver.PendingResult pendingResult = this.f23139j;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f23139j = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void y(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f23130p) {
            try {
                BroadcastReceiver.PendingResult pendingResult2 = this.f23139j;
                if (pendingResult2 != null) {
                    pendingResult2.finish();
                }
                this.f23139j = pendingResult;
                if (this.f23138i) {
                    pendingResult.finish();
                    this.f23139j = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void z(WorkGenerationalId workGenerationalId, int i10) {
        this.f23134e.d(new W4.F(this.f23136g, new y(workGenerationalId), true, i10));
    }

    public O(Context context, androidx.work.a aVar, X4.b bVar, WorkDatabase workDatabase, List<InterfaceC4460v> list, C4458t c4458t, T4.n nVar) {
        Context applicationContext = context.getApplicationContext();
        if (!a.a(applicationContext)) {
            AbstractC4333v.h(new AbstractC4333v.a(aVar.getMinimumLoggingLevel()));
            this.f23131b = applicationContext;
            this.f23134e = bVar;
            this.f23133d = workDatabase;
            this.f23136g = c4458t;
            this.f23140k = nVar;
            this.f23132c = aVar;
            this.f23135f = list;
            InterfaceC16622O interfaceC16622OF = androidx.work.impl.j.f(bVar);
            this.f23141l = interfaceC16622OF;
            this.f23137h = new W4.B(this.f23133d);
            androidx.work.impl.a.e(list, this.f23136g, bVar.c(), this.f23133d, aVar);
            this.f23134e.d(new ForceStopRunnable(applicationContext, this));
            D.c(interfaceC16622OF, this.f23131b, aVar, workDatabase);
            return;
        }
        throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
    }

    public static /* synthetic */ Unit k(O o10) {
        Q4.m.b(o10.m());
        o10.u().l().p();
        androidx.work.impl.a.f(o10.n(), o10.u(), o10.s());
        return Unit.f142422a;
    }

    @Override // N4.O
    public N4.z a(String str) {
        return C5402d.h(str, this);
    }

    @Override // N4.O
    public N4.z b(UUID uuid) {
        return C5402d.e(uuid, this);
    }

    @Override // N4.O
    public N4.z d(List<? extends N4.P> list) {
        if (!list.isEmpty()) {
            return new F(this, list).b();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    public void x() {
        N4.L.a(n().getTracer(), "ReschedulingWork", new Function0() { // from class: O4.N
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return O.k(this.f23126a);
            }
        });
    }
}
