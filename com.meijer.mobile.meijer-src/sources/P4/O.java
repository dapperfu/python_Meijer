package P4;

import O4.AbstractC4373v;
import O4.EnumC4360h;
import O4.EnumC4361i;
import W4.WorkGenerationalId;
import X4.C5555d;
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
import mv.InterfaceC15783O;

/* loaded from: classes4.dex */
public class O extends O4.O {

    /* renamed from: m, reason: collision with root package name */
    private static final String f25467m = AbstractC4373v.i("WorkManagerImpl");

    /* renamed from: n, reason: collision with root package name */
    private static O f25468n = null;

    /* renamed from: o, reason: collision with root package name */
    private static O f25469o = null;

    /* renamed from: p, reason: collision with root package name */
    private static final Object f25470p = new Object();

    /* renamed from: b, reason: collision with root package name */
    private Context f25471b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.work.a f25472c;

    /* renamed from: d, reason: collision with root package name */
    private WorkDatabase f25473d;

    /* renamed from: e, reason: collision with root package name */
    private Y4.b f25474e;

    /* renamed from: f, reason: collision with root package name */
    private List<InterfaceC4586v> f25475f;

    /* renamed from: g, reason: collision with root package name */
    private C4584t f25476g;

    /* renamed from: h, reason: collision with root package name */
    private X4.B f25477h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f25478i = false;

    /* renamed from: j, reason: collision with root package name */
    private BroadcastReceiver.PendingResult f25479j;

    /* renamed from: k, reason: collision with root package name */
    private final U4.n f25480k;

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC15783O f25481l;

    static class a {
        static boolean a(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    public static void j(Context context, androidx.work.a aVar) {
        synchronized (f25470p) {
            try {
                O o10 = f25468n;
                if (o10 != null && f25469o != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (o10 == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f25469o == null) {
                        f25469o = androidx.work.impl.j.c(applicationContext, aVar);
                    }
                    f25468n = f25469o;
                }
            } finally {
            }
        }
    }

    @Deprecated
    public static O o() {
        synchronized (f25470p) {
            try {
                O o10 = f25468n;
                if (o10 != null) {
                    return o10;
                }
                return f25469o;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static O p(Context context) {
        O o10;
        synchronized (f25470p) {
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

    @Override // O4.O
    public O4.z e(String str, EnumC4360h enumC4360h, O4.F f10) {
        return enumC4360h == EnumC4360h.UPDATE ? S.c(this, str, f10) : l(str, enumC4360h, f10).b();
    }

    @Override // O4.O
    public O4.z g(String str, EnumC4361i enumC4361i, List<O4.y> list) {
        return new F(this, str, enumC4361i, list).b();
    }

    @Override // O4.O
    public com.google.common.util.concurrent.q<List<O4.N>> i(String str) {
        return X4.E.a(this.f25473d, this.f25474e, str);
    }

    public F l(String str, EnumC4360h enumC4360h, O4.F f10) {
        return new F(this, str, enumC4360h == EnumC4360h.KEEP ? EnumC4361i.KEEP : EnumC4361i.REPLACE, Collections.singletonList(f10));
    }

    public Context m() {
        return this.f25471b;
    }

    public androidx.work.a n() {
        return this.f25472c;
    }

    public X4.B q() {
        return this.f25477h;
    }

    public C4584t r() {
        return this.f25476g;
    }

    public List<InterfaceC4586v> s() {
        return this.f25475f;
    }

    public U4.n t() {
        return this.f25480k;
    }

    public WorkDatabase u() {
        return this.f25473d;
    }

    public Y4.b v() {
        return this.f25474e;
    }

    public void w() {
        synchronized (f25470p) {
            try {
                this.f25478i = true;
                BroadcastReceiver.PendingResult pendingResult = this.f25479j;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f25479j = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void y(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f25470p) {
            try {
                BroadcastReceiver.PendingResult pendingResult2 = this.f25479j;
                if (pendingResult2 != null) {
                    pendingResult2.finish();
                }
                this.f25479j = pendingResult;
                if (this.f25478i) {
                    pendingResult.finish();
                    this.f25479j = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void z(WorkGenerationalId workGenerationalId, int i10) {
        this.f25474e.d(new X4.F(this.f25476g, new y(workGenerationalId), true, i10));
    }

    public O(Context context, androidx.work.a aVar, Y4.b bVar, WorkDatabase workDatabase, List<InterfaceC4586v> list, C4584t c4584t, U4.n nVar) {
        Context applicationContext = context.getApplicationContext();
        if (!a.a(applicationContext)) {
            AbstractC4373v.h(new AbstractC4373v.a(aVar.getMinimumLoggingLevel()));
            this.f25471b = applicationContext;
            this.f25474e = bVar;
            this.f25473d = workDatabase;
            this.f25476g = c4584t;
            this.f25480k = nVar;
            this.f25472c = aVar;
            this.f25475f = list;
            InterfaceC15783O interfaceC15783OF = androidx.work.impl.j.f(bVar);
            this.f25481l = interfaceC15783OF;
            this.f25477h = new X4.B(this.f25473d);
            androidx.work.impl.a.e(list, this.f25476g, bVar.c(), this.f25473d, aVar);
            this.f25474e.d(new ForceStopRunnable(applicationContext, this));
            D.c(interfaceC15783OF, this.f25471b, aVar, workDatabase);
            return;
        }
        throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
    }

    public static /* synthetic */ Unit k(O o10) {
        R4.m.d(o10.m());
        o10.u().l().o();
        androidx.work.impl.a.f(o10.n(), o10.u(), o10.s());
        return Unit.f143329a;
    }

    @Override // O4.O
    public O4.z a(String str) {
        return C5555d.h(str, this);
    }

    @Override // O4.O
    public O4.z b(UUID uuid) {
        return C5555d.e(uuid, this);
    }

    @Override // O4.O
    public O4.z d(List<? extends O4.P> list) {
        if (!list.isEmpty()) {
            return new F(this, list).b();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    public void x() {
        O4.L.a(n().getTracer(), "ReschedulingWork", new Function0() { // from class: P4.N
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return O.k(this.f25466a);
            }
        });
    }
}
