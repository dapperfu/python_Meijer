package Lc;

import Mc.A;
import Mc.C4169y;
import Pc.D0;
import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.C10110z9;
import com.google.android.gms.internal.ads.C6719Fc0;
import com.google.android.gms.internal.ads.C6908Kq;
import com.google.android.gms.internal.ads.C7360Yc0;
import com.google.android.gms.internal.ads.C7694cc0;
import com.google.android.gms.internal.ads.C8659lf;
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
    protected boolean f17992d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f17993e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f17994f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f17995g;

    /* renamed from: h, reason: collision with root package name */
    private final C7694cc0 f17996h;

    /* renamed from: i, reason: collision with root package name */
    private Context f17997i;

    /* renamed from: j, reason: collision with root package name */
    private final Context f17998j;

    /* renamed from: k, reason: collision with root package name */
    private Qc.a f17999k;

    /* renamed from: l, reason: collision with root package name */
    private final Qc.a f18000l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f18001m;

    /* renamed from: o, reason: collision with root package name */
    private int f18003o;

    /* renamed from: a, reason: collision with root package name */
    private final List f17989a = new Vector();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference f17990b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicReference f17991c = new AtomicReference();

    /* renamed from: n, reason: collision with root package name */
    final CountDownLatch f18002n = new CountDownLatch(1);

    @Override // com.google.android.gms.internal.ads.G9
    public final String d(Context context, String str, View view) {
        return zze(context, str, view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (((Boolean) A.c().a(C8659lf.f75890A3)).booleanValue()) {
                this.f17992d = h();
            }
            boolean z10 = this.f17999k.f29932d;
            final boolean z11 = false;
            if (!((Boolean) A.c().a(C8659lf.f76321f1)).booleanValue() && z10) {
                z11 = true;
            }
            if (j() == 1) {
                n(z11);
                if (this.f18003o == 2) {
                    this.f17995g.execute(new Runnable() { // from class: Lc.i
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f17986a.g(z11);
                        }
                    });
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    D9 d9P = p(this.f17997i, this.f17999k, z11, this.f18001m);
                    this.f17991c.set(d9P);
                    if (this.f17994f && !d9P.m()) {
                        this.f18003o = 1;
                        n(z11);
                    }
                } catch (NullPointerException e10) {
                    this.f18003o = 1;
                    n(z11);
                    this.f17996h.c(2031, System.currentTimeMillis() - jCurrentTimeMillis, e10);
                }
            }
            this.f18002n.countDown();
            this.f17997i = null;
            this.f17999k = null;
        } catch (Throwable th2) {
            this.f18002n.countDown();
            this.f17997i = null;
            this.f17999k = null;
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.G9
    public final String zzf(Context context) {
        return f(context, null);
    }

    private final void m() {
        List list = this.f17989a;
        G9 g9L = l();
        if (list.isEmpty() || g9L == null) {
            return;
        }
        for (Object[] objArr : this.f17989a) {
            int length = objArr.length;
            if (length == 1) {
                g9L.zzk((MotionEvent) objArr[0]);
            } else if (length == 3) {
                g9L.zzl(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        this.f17989a.clear();
    }

    private final void n(boolean z10) {
        String str = this.f17999k.f29929a;
        Context contextO = o(this.f17997i);
        M7 m7B0 = O7.b0();
        m7B0.u(z10);
        m7B0.v(str);
        this.f17990b.set(K9.t(contextO, new I9((O7) m7B0.p())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.G9
    public final String b(final Context context) {
        try {
            return (String) Mj0.j(new Callable() { // from class: Lc.h
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f17984a.f(context, null);
                }
            }, this.f17995g).get(((Integer) A.c().a(C8659lf.f76099P2)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException unused) {
            return Integer.toString(17);
        } catch (TimeoutException unused2) {
            return C10110z9.a(context, this.f18000l.f29929a, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.G9
    public final void c(StackTraceElement[] stackTraceElementArr) {
        G9 g9L;
        G9 g9L2;
        if (((Boolean) A.c().a(C8659lf.f76169U2)).booleanValue()) {
            if (this.f18002n.getCount() != 0 || (g9L2 = l()) == null) {
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
        Context context = this.f17997i;
        j jVar = new j(this);
        C7694cc0 c7694cc0 = this.f17996h;
        return new C7360Yc0(this.f17997i, C6719Fc0.b(context, c7694cc0), jVar, ((Boolean) A.c().a(C8659lf.f76560w2)).booleanValue()).d(1);
    }

    public final boolean i() throws InterruptedException {
        try {
            this.f18002n.await();
            return true;
        } catch (InterruptedException e10) {
            Qc.p.h("Interrupted during GADSignals creation.", e10);
            return false;
        }
    }

    protected final int j() {
        if (!this.f17993e || this.f17992d) {
            return this.f18003o;
        }
        return 1;
    }

    public final int k() {
        return this.f18003o;
    }

    @Override // com.google.android.gms.internal.ads.G9
    public final String zzh(Context context, View view, Activity activity) {
        if (!((Boolean) A.c().a(C8659lf.f76610za)).booleanValue()) {
            G9 g9L = l();
            if (((Boolean) A.c().a(C8659lf.f75897Aa)).booleanValue()) {
                v.t();
                D0.k(view, 2, null);
            }
            return g9L != null ? g9L.zzh(context, view, activity) : "";
        }
        if (!i()) {
            return "";
        }
        G9 g9L2 = l();
        if (((Boolean) A.c().a(C8659lf.f75897Aa)).booleanValue()) {
            v.t();
            D0.k(view, 2, null);
        }
        return g9L2 != null ? g9L2.zzh(context, view, activity) : "";
    }

    public k(Context context, Qc.a aVar) {
        this.f17997i = context;
        this.f17998j = context;
        this.f17999k = aVar;
        this.f18000l = aVar;
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        this.f17995g = executorServiceNewCachedThreadPool;
        boolean zBooleanValue = ((Boolean) A.c().a(C8659lf.f76588y2)).booleanValue();
        this.f18001m = zBooleanValue;
        this.f17996h = C7694cc0.a(context, executorServiceNewCachedThreadPool, zBooleanValue);
        this.f17993e = ((Boolean) A.c().a(C8659lf.f76546v2)).booleanValue();
        this.f17994f = ((Boolean) A.c().a(C8659lf.f76602z2)).booleanValue();
        if (((Boolean) A.c().a(C8659lf.f76574x2)).booleanValue()) {
            this.f18003o = 2;
        } else {
            this.f18003o = 1;
        }
        if (!((Boolean) A.c().a(C8659lf.f75890A3)).booleanValue()) {
            this.f17992d = h();
        }
        if (((Boolean) A.c().a(C8659lf.f76533u3)).booleanValue()) {
            C6908Kq.f68174a.execute(this);
            return;
        }
        C4169y.b();
        if (Qc.g.w()) {
            C6908Kq.f68174a.execute(this);
        } else {
            run();
        }
    }

    private final G9 l() {
        if (j() == 2) {
            return (G9) this.f17991c.get();
        }
        return (G9) this.f17990b.get();
    }

    private static final Context o(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return context;
        }
        return applicationContext;
    }

    private static final D9 p(Context context, Qc.a aVar, boolean z10, boolean z11) {
        M7 m7B0 = O7.b0();
        m7B0.u(z10);
        m7B0.v(aVar.f29929a);
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
            p(this.f17998j, this.f18000l, z10, this.f18001m).k();
        } catch (NullPointerException e10) {
            this.f17996h.c(2027, System.currentTimeMillis() - jCurrentTimeMillis, e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.G9
    public final String zze(Context context, String str, View view, Activity activity) {
        if (i()) {
            G9 g9L = l();
            if (((Boolean) A.c().a(C8659lf.f75897Aa)).booleanValue()) {
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
            this.f17989a.add(new Object[]{motionEvent});
        }
    }

    @Override // com.google.android.gms.internal.ads.G9
    public final void zzl(int i10, int i11, int i12) {
        G9 g9L = l();
        if (g9L != null) {
            m();
            g9L.zzl(i10, i11, i12);
        } else {
            this.f17989a.add(new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)});
        }
    }
}
