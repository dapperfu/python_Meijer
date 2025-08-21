package androidx.camera.core.impl;

import C.P;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.concurrent.futures.c;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class DeferrableSurface {

    /* renamed from: k, reason: collision with root package name */
    public static final Size f47554k = new Size(0, 0);

    /* renamed from: l, reason: collision with root package name */
    private static final boolean f47555l = P.f("DeferrableSurface");

    /* renamed from: m, reason: collision with root package name */
    private static final AtomicInteger f47556m = new AtomicInteger(0);

    /* renamed from: n, reason: collision with root package name */
    private static final AtomicInteger f47557n = new AtomicInteger(0);

    /* renamed from: a, reason: collision with root package name */
    private final Object f47558a;

    /* renamed from: b, reason: collision with root package name */
    private int f47559b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f47560c;

    /* renamed from: d, reason: collision with root package name */
    private c.a<Void> f47561d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.common.util.concurrent.q<Void> f47562e;

    /* renamed from: f, reason: collision with root package name */
    private c.a<Void> f47563f;

    /* renamed from: g, reason: collision with root package name */
    private final com.google.common.util.concurrent.q<Void> f47564g;

    /* renamed from: h, reason: collision with root package name */
    private final Size f47565h;

    /* renamed from: i, reason: collision with root package name */
    private final int f47566i;

    /* renamed from: j, reason: collision with root package name */
    Class<?> f47567j;

    public static final class SurfaceClosedException extends Exception {

        /* renamed from: a, reason: collision with root package name */
        DeferrableSurface f47568a;

        public DeferrableSurface a() {
            return this.f47568a;
        }

        public SurfaceClosedException(String str, DeferrableSurface deferrableSurface) {
            super(str);
            this.f47568a = deferrableSurface;
        }
    }

    public DeferrableSurface() {
        this(f47554k, 0);
    }

    protected abstract com.google.common.util.concurrent.q<Surface> o();

    public static final class SurfaceUnavailableException extends Exception {
        public SurfaceUnavailableException(String str) {
            super(str);
        }
    }

    public DeferrableSurface(Size size, int i10) {
        this.f47558a = new Object();
        this.f47559b = 0;
        this.f47560c = false;
        this.f47565h = size;
        this.f47566i = i10;
        com.google.common.util.concurrent.q<Void> qVarA = androidx.concurrent.futures.c.a(new c.InterfaceC1101c() { // from class: F.I
            @Override // androidx.concurrent.futures.c.InterfaceC1101c
            public final Object a(c.a aVar) {
                return DeferrableSurface.a(this.f8671a, aVar);
            }
        });
        this.f47562e = qVarA;
        this.f47564g = androidx.concurrent.futures.c.a(new c.InterfaceC1101c() { // from class: F.J
            @Override // androidx.concurrent.futures.c.InterfaceC1101c
            public final Object a(c.a aVar) {
                return DeferrableSurface.b(this.f8672a, aVar);
            }
        });
        if (P.f("DeferrableSurface")) {
            n("Surface created", f47557n.incrementAndGet(), f47556m.get());
            final String stackTraceString = Log.getStackTraceString(new Exception());
            qVarA.addListener(new Runnable() { // from class: F.K
                @Override // java.lang.Runnable
                public final void run() throws ExecutionException, InterruptedException {
                    DeferrableSurface.c(this.f8673a, stackTraceString);
                }
            }, H.a.a());
        }
    }

    public static /* synthetic */ Object a(DeferrableSurface deferrableSurface, c.a aVar) {
        synchronized (deferrableSurface.f47558a) {
            deferrableSurface.f47561d = aVar;
        }
        return "DeferrableSurface-termination(" + deferrableSurface + ")";
    }

    public static /* synthetic */ Object b(DeferrableSurface deferrableSurface, c.a aVar) {
        synchronized (deferrableSurface.f47558a) {
            deferrableSurface.f47563f = aVar;
        }
        return "DeferrableSurface-close(" + deferrableSurface + ")";
    }

    private void n(String str, int i10, int i11) {
        if (!f47555l && P.f("DeferrableSurface")) {
            P.a("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        P.a("DeferrableSurface", str + "[total_surfaces=" + i10 + ", used_surfaces=" + i11 + "](" + this + "}");
    }

    public void d() {
        c.a<Void> aVar;
        synchronized (this.f47558a) {
            try {
                if (this.f47560c) {
                    aVar = null;
                } else {
                    this.f47560c = true;
                    this.f47563f.c(null);
                    if (this.f47559b == 0) {
                        aVar = this.f47561d;
                        this.f47561d = null;
                    } else {
                        aVar = null;
                    }
                    if (P.f("DeferrableSurface")) {
                        P.a("DeferrableSurface", "surface closed,  useCount=" + this.f47559b + " closed=true " + this);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (aVar != null) {
            aVar.c(null);
        }
    }

    public void e() {
        c.a<Void> aVar;
        synchronized (this.f47558a) {
            try {
                int i10 = this.f47559b;
                if (i10 == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                int i11 = i10 - 1;
                this.f47559b = i11;
                if (i11 == 0 && this.f47560c) {
                    aVar = this.f47561d;
                    this.f47561d = null;
                } else {
                    aVar = null;
                }
                if (P.f("DeferrableSurface")) {
                    P.a("DeferrableSurface", "use count-1,  useCount=" + this.f47559b + " closed=" + this.f47560c + " " + this);
                    if (this.f47559b == 0) {
                        n("Surface no longer in use", f47557n.get(), f47556m.decrementAndGet());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (aVar != null) {
            aVar.c(null);
        }
    }

    public com.google.common.util.concurrent.q<Void> f() {
        return I.n.s(this.f47564g);
    }

    public Class<?> g() {
        return this.f47567j;
    }

    public Size h() {
        return this.f47565h;
    }

    public int i() {
        return this.f47566i;
    }

    public final com.google.common.util.concurrent.q<Surface> j() {
        synchronized (this.f47558a) {
            try {
                if (this.f47560c) {
                    return I.n.n(new SurfaceClosedException("DeferrableSurface already closed.", this));
                }
                return o();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public com.google.common.util.concurrent.q<Void> k() {
        return I.n.s(this.f47562e);
    }

    public void l() throws SurfaceClosedException {
        synchronized (this.f47558a) {
            try {
                int i10 = this.f47559b;
                if (i10 == 0 && this.f47560c) {
                    throw new SurfaceClosedException("Cannot begin use on a closed surface.", this);
                }
                this.f47559b = i10 + 1;
                if (P.f("DeferrableSurface")) {
                    if (this.f47559b == 1) {
                        n("New surface in use", f47557n.get(), f47556m.incrementAndGet());
                    }
                    P.a("DeferrableSurface", "use count+1, useCount=" + this.f47559b + " " + this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean m() {
        boolean z10;
        synchronized (this.f47558a) {
            z10 = this.f47560c;
        }
        return z10;
    }

    public void p(Class<?> cls) {
        this.f47567j = cls;
    }

    public static /* synthetic */ void c(DeferrableSurface deferrableSurface, String str) throws ExecutionException, InterruptedException {
        deferrableSurface.getClass();
        try {
            deferrableSurface.f47562e.get();
            deferrableSurface.n("Surface terminated", f47557n.decrementAndGet(), f47556m.get());
        } catch (Exception e10) {
            P.c("DeferrableSurface", "Unexpected surface termination for " + deferrableSurface + "\nStack Trace:\n" + str);
            synchronized (deferrableSurface.f47558a) {
                throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", deferrableSurface, Boolean.valueOf(deferrableSurface.f47560c), Integer.valueOf(deferrableSurface.f47559b)), e10);
            }
        }
    }
}
