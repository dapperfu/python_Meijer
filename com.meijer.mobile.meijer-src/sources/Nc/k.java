package Nc;

import Oc.A;
import Oc.C4447y;
import Rc.D0;
import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.C10235z9;
import com.google.android.gms.internal.ads.C6844Fc0;
import com.google.android.gms.internal.ads.C7033Kq;
import com.google.android.gms.internal.ads.C7485Yc0;
import com.google.android.gms.internal.ads.C7819cc0;
import com.google.android.gms.internal.ads.C8784lf;
import com.google.android.gms.internal.ads.D9;
import com.google.android.gms.internal.ads.G9;
import com.google.android.gms.internal.ads.I9;
import com.google.android.gms.internal.ads.K9;
import com.google.android.gms.internal.ads.M7;
import com.google.android.gms.internal.ads.Mj0;
import com.google.android.gms.internal.ads.O7;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class k implements Runnable, G9 {

    /* renamed from: d, reason: collision with root package name */
    protected boolean f20812d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f20813e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f20814f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f20815g;

    /* renamed from: h, reason: collision with root package name */
    private final C7819cc0 f20816h;

    /* renamed from: i, reason: collision with root package name */
    private Context f20817i;

    /* renamed from: j, reason: collision with root package name */
    private final Context f20818j;

    /* renamed from: k, reason: collision with root package name */
    private Sc.a f20819k;

    /* renamed from: l, reason: collision with root package name */
    private final Sc.a f20820l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f20821m;

    /* renamed from: o, reason: collision with root package name */
    private int f20823o;

    /* renamed from: a, reason: collision with root package name */
    private final List f20809a = new Vector();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference f20810b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicReference f20811c = new AtomicReference();

    /* renamed from: n, reason: collision with root package name */
    final CountDownLatch f20822n = new CountDownLatch(1);

    @Override // com.google.android.gms.internal.ads.G9
    public final String d(Context context, String str, View view) {
        return zze(context, str, view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (((Boolean) A.c().a(C8784lf.f76730A3)).booleanValue()) {
                this.f20812d = h();
            }
            boolean z10 = this.f20819k.f34482d;
            final boolean z11 = false;
            if (!((Boolean) A.c().a(C8784lf.f77161f1)).booleanValue() && z10) {
                z11 = true;
            }
            if (j() == 1) {
                n(z11);
                if (this.f20823o == 2) {
                    this.f20815g.execute(new Runnable() { // from class: Nc.i
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f20806a.g(z11);
                        }
                    });
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    D9 d9P = p(this.f20817i, this.f20819k, z11, this.f20821m);
                    this.f20811c.set(d9P);
                    if (this.f20814f && !d9P.m()) {
                        this.f20823o = 1;
                        n(z11);
                    }
                } catch (NullPointerException e10) {
                    this.f20823o = 1;
                    n(z11);
                    this.f20816h.c(2031, System.currentTimeMillis() - jCurrentTimeMillis, e10);
                }
            }
            this.f20822n.countDown();
            this.f20817i = null;
            this.f20819k = null;
        } catch (Throwable th2) {
            this.f20822n.countDown();
            this.f20817i = null;
            this.f20819k = null;
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.G9
    public final String zzf(Context context) {
        return f(context, null);
    }

    private final void m() {
        List list = this.f20809a;
        G9 g9L = l();
        if (list.isEmpty() || g9L == null) {
            return;
        }
        for (Object[] objArr : this.f20809a) {
            int length = objArr.length;
            if (length == 1) {
                g9L.zzk((MotionEvent) objArr[0]);
            } else if (length == 3) {
                g9L.zzl(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        this.f20809a.clear();
    }

    private final void n(boolean z10) {
        String str = this.f20819k.f34479a;
        Context contextO = o(this.f20817i);
        M7 m7B0 = O7.b0();
        m7B0.u(z10);
        m7B0.v(str);
        this.f20810b.set(K9.t(contextO, new I9((O7) m7B0.p())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.G9
    public final String b(final Context context) {
        try {
            return (String) Mj0.j(new Callable() { // from class: Nc.h
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f20804a.f(context, null);
                }
            }, this.f20815g).get(((Integer) A.c().a(C8784lf.f76939P2)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException unused) {
            return Integer.toString(17);
        } catch (TimeoutException unused2) {
            return C10235z9.a(context, this.f20820l.f34479a, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.G9
    public final void c(StackTraceElement[] stackTraceElementArr) {
        G9 g9L;
        G9 g9L2;
        if (((Boolean) A.c().a(C8784lf.f77009U2)).booleanValue()) {
            if (this.f20822n.getCount() != 0 || (g9L2 = l()) == null) {
                return;
            }
            g9L2.c(stackTraceElementArr);
            return;
        }
        if (!i() || (g9L = l()) == null) {
            return;
        }
        g9L.c(stackTraceElementArr);
    }

    protected final boolean h() {
        Context context = this.f20817i;
        j jVar = new j(this);
        C7819cc0 c7819cc0 = this.f20816h;
        return new C7485Yc0(this.f20817i, C6844Fc0.b(context, c7819cc0), jVar, ((Boolean) A.c().a(C8784lf.f77400w2)).booleanValue()).d(1);
    }

    public final boolean i() throws InterruptedException {
        try {
            this.f20822n.await();
            return true;
        } catch (InterruptedException e10) {
            Sc.p.h("Interrupted during GADSignals creation.", e10);
            return false;
        }
    }

    protected final int j() {
        if (!this.f20813e || this.f20812d) {
            return this.f20823o;
        }
        return 1;
    }

    public final int k() {
        return this.f20823o;
    }

    @Override // com.google.android.gms.internal.ads.G9
    public final String zzh(Context context, View view, Activity activity) {
        if (!((Boolean) A.c().a(C8784lf.f77450za)).booleanValue()) {
            G9 g9L = l();
            if (((Boolean) A.c().a(C8784lf.f76737Aa)).booleanValue()) {
                v.t();
                D0.k(view, 2, null);
            }
            return g9L != null ? g9L.zzh(context, view, activity) : "";
        }
        if (!i()) {
            return "";
        }
        G9 g9L2 = l();
        if (((Boolean) A.c().a(C8784lf.f76737Aa)).booleanValue()) {
            v.t();
            D0.k(view, 2, null);
        }
        return g9L2 != null ? g9L2.zzh(context, view, activity) : "";
    }

    public k(Context context, Sc.a aVar) {
        this.f20817i = context;
        this.f20818j = context;
        this.f20819k = aVar;
        this.f20820l = aVar;
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        this.f20815g = executorServiceNewCachedThreadPool;
        boolean zBooleanValue = ((Boolean) A.c().a(C8784lf.f77428y2)).booleanValue();
        this.f20821m = zBooleanValue;
        this.f20816h = C7819cc0.a(context, executorServiceNewCachedThreadPool, zBooleanValue);
        this.f20813e = ((Boolean) A.c().a(C8784lf.f77386v2)).booleanValue();
        this.f20814f = ((Boolean) A.c().a(C8784lf.f77442z2)).booleanValue();
        if (((Boolean) A.c().a(C8784lf.f77414x2)).booleanValue()) {
            this.f20823o = 2;
        } else {
            this.f20823o = 1;
        }
        if (!((Boolean) A.c().a(C8784lf.f76730A3)).booleanValue()) {
            this.f20812d = h();
        }
        if (((Boolean) A.c().a(C8784lf.f77373u3)).booleanValue()) {
            C7033Kq.f69014a.execute(this);
            return;
        }
        C4447y.b();
        if (Sc.g.w()) {
            C7033Kq.f69014a.execute(this);
        } else {
            run();
        }
    }

    private final G9 l() {
        if (j() == 2) {
            return (G9) this.f20811c.get();
        }
        return (G9) this.f20810b.get();
    }

    private static final Context o(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return context;
        }
        return applicationContext;
    }

    private static final D9 p(Context context, Sc.a aVar, boolean z10, boolean z11) {
        M7 m7B0 = O7.b0();
        m7B0.u(z10);
        m7B0.v(aVar.f34479a);
        return D9.e(o(context), (O7) m7B0.p(), z11);
    }

    @Override // com.google.android.gms.internal.ads.G9
    public final void a(View view) {
        G9 g9L = l();
        if (g9L != null) {
            g9L.a(view);
        }
    }

    public final String f(Context context, byte[] bArr) {
        G9 g9L;
        if (i() && (g9L = l()) != null) {
            m();
            return g9L.zzf(o(context));
        }
        return "";
    }

    final /* synthetic */ void g(boolean z10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            p(this.f20818j, this.f20820l, z10, this.f20821m).k();
        } catch (NullPointerException e10) {
            this.f20816h.c(2027, System.currentTimeMillis() - jCurrentTimeMillis, e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.G9
    public final String zze(Context context, String str, View view, Activity activity) {
        if (i()) {
            G9 g9L = l();
            if (((Boolean) A.c().a(C8784lf.f76737Aa)).booleanValue()) {
                v.t();
                D0.k(view, 4, null);
            }
            if (g9L != null) {
                m();
                return g9L.zze(o(context), str, view, activity);
            }
            return "";
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.G9
    public final void zzk(MotionEvent motionEvent) {
        G9 g9L = l();
        if (g9L != null) {
            m();
            g9L.zzk(motionEvent);
        } else {
            this.f20809a.add(new Object[]{motionEvent});
        }
    }

    @Override // com.google.android.gms.internal.ads.G9
    public final void zzl(int i10, int i11, int i12) {
        G9 g9L = l();
        if (g9L != null) {
            m();
            g9L.zzl(i10, i11, i12);
        } else {
            this.f20809a.add(new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)});
        }
    }
}
