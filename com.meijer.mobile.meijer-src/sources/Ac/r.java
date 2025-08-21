package Ac;

import Bc.AbstractC2929k;
import Bc.InterfaceC2921c;
import Bc.InterfaceC2922d;
import Cc.a;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import rc.C16883c;
import uc.AbstractC17373f;
import uc.AbstractC17374g;
import uc.InterfaceC17372e;
import uc.InterfaceC17380m;
import wc.C17856a;
import wc.c;
import xc.C18156a;

/* loaded from: classes4.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private final Context f277a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC17372e f278b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC2922d f279c;

    /* renamed from: d, reason: collision with root package name */
    private final x f280d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f281e;

    /* renamed from: f, reason: collision with root package name */
    private final Cc.a f282f;

    /* renamed from: g, reason: collision with root package name */
    private final Dc.a f283g;

    /* renamed from: h, reason: collision with root package name */
    private final Dc.a f284h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC2921c f285i;

    public static /* synthetic */ Object b(r rVar, Iterable iterable, tc.p pVar, long j10) {
        rVar.f279c.x1(iterable);
        rVar.f279c.V0(pVar, rVar.f283g.a() + j10);
        return null;
    }

    public static /* synthetic */ Object c(r rVar) {
        rVar.f285i.a();
        return null;
    }

    public static /* synthetic */ Object e(r rVar, Iterable iterable) {
        rVar.f279c.M(iterable);
        return null;
    }

    public static /* synthetic */ Object f(r rVar, tc.p pVar, int i10) {
        rVar.f280d.b(pVar, i10 + 1);
        return null;
    }

    public static /* synthetic */ Object g(r rVar, tc.p pVar, long j10) {
        rVar.f279c.V0(pVar, rVar.f283g.a() + j10);
        return null;
    }

    public tc.i j(InterfaceC17380m interfaceC17380m) {
        Cc.a aVar = this.f282f;
        final InterfaceC2921c interfaceC2921c = this.f285i;
        Objects.requireNonNull(interfaceC2921c);
        return interfaceC17380m.a(tc.i.a().i(this.f283g.a()).o(this.f284h.a()).n("GDT_CLIENT_METRICS").h(new tc.h(C16883c.b("proto"), ((C17856a) aVar.c(new a.InterfaceC0086a() { // from class: Ac.h
            @Override // Cc.a.InterfaceC0086a
            public final Object execute() {
                return interfaceC2921c.d();
            }
        })).f())).d());
    }

    boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f277a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public AbstractC17374g l(final tc.p pVar, int i10) {
        AbstractC17374g abstractC17374gB;
        InterfaceC17380m interfaceC17380mA = this.f278b.a(pVar.b());
        AbstractC17374g abstractC17374gE = AbstractC17374g.e(0L);
        final long j10 = 0;
        while (((Boolean) this.f282f.c(new a.InterfaceC0086a() { // from class: Ac.k
            @Override // Cc.a.InterfaceC0086a
            public final Object execute() {
                return Boolean.valueOf(this.f261a.f279c.w1(pVar));
            }
        })).booleanValue()) {
            final Iterable iterable = (Iterable) this.f282f.c(new a.InterfaceC0086a() { // from class: Ac.l
                @Override // Cc.a.InterfaceC0086a
                public final Object execute() {
                    return this.f263a.f279c.b1(pVar);
                }
            });
            if (!iterable.iterator().hasNext()) {
                return abstractC17374gE;
            }
            if (interfaceC17380mA == null) {
                C18156a.b("Uploader", "Unknown backend for %s, deleting event batch for it...", pVar);
                abstractC17374gB = AbstractC17374g.a();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbstractC2929k) it.next()).b());
                }
                if (pVar.e()) {
                    arrayList.add(j(interfaceC17380mA));
                }
                abstractC17374gB = interfaceC17380mA.b(AbstractC17373f.a().b(arrayList).c(pVar.c()).a());
            }
            abstractC17374gE = abstractC17374gB;
            if (abstractC17374gE.c() == AbstractC17374g.a.TRANSIENT_ERROR) {
                final tc.p pVar2 = pVar;
                this.f282f.c(new a.InterfaceC0086a() { // from class: Ac.m
                    @Override // Cc.a.InterfaceC0086a
                    public final Object execute() {
                        return r.b(this.f265a, iterable, pVar2, j10);
                    }
                });
                this.f280d.a(pVar2, i10 + 1, true);
                return abstractC17374gE;
            }
            tc.p pVar3 = pVar;
            this.f282f.c(new a.InterfaceC0086a() { // from class: Ac.n
                @Override // Cc.a.InterfaceC0086a
                public final Object execute() {
                    return r.e(this.f269a, iterable);
                }
            });
            if (abstractC17374gE.c() == AbstractC17374g.a.OK) {
                long jMax = Math.max(j10, abstractC17374gE.b());
                if (pVar3.e()) {
                    this.f282f.c(new a.InterfaceC0086a() { // from class: Ac.o
                        @Override // Cc.a.InterfaceC0086a
                        public final Object execute() {
                            return r.c(this.f271a);
                        }
                    });
                }
                j10 = jMax;
            } else if (abstractC17374gE.c() == AbstractC17374g.a.INVALID_PAYLOAD) {
                final HashMap map = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String strN = ((AbstractC2929k) it2.next()).b().n();
                    if (map.containsKey(strN)) {
                        map.put(strN, Integer.valueOf(((Integer) map.get(strN)).intValue() + 1));
                    } else {
                        map.put(strN, 1);
                    }
                }
                this.f282f.c(new a.InterfaceC0086a() { // from class: Ac.p
                    @Override // Cc.a.InterfaceC0086a
                    public final Object execute() {
                        return r.h(this.f272a, map);
                    }
                });
            }
            pVar = pVar3;
        }
        final tc.p pVar4 = pVar;
        this.f282f.c(new a.InterfaceC0086a() { // from class: Ac.q
            @Override // Cc.a.InterfaceC0086a
            public final Object execute() {
                return r.g(this.f274a, pVar4, j10);
            }
        });
        return abstractC17374gE;
    }

    public void m(final tc.p pVar, final int i10, final Runnable runnable) {
        this.f281e.execute(new Runnable() { // from class: Ac.g
            @Override // java.lang.Runnable
            public final void run() {
                r.i(this.f252a, pVar, i10, runnable);
            }
        });
    }

    public r(Context context, InterfaceC17372e interfaceC17372e, InterfaceC2922d interfaceC2922d, x xVar, Executor executor, Cc.a aVar, Dc.a aVar2, Dc.a aVar3, InterfaceC2921c interfaceC2921c) {
        this.f277a = context;
        this.f278b = interfaceC17372e;
        this.f279c = interfaceC2922d;
        this.f280d = xVar;
        this.f281e = executor;
        this.f282f = aVar;
        this.f283g = aVar2;
        this.f284h = aVar3;
        this.f285i = interfaceC2921c;
    }

    public static /* synthetic */ Object h(r rVar, Map map) {
        rVar.getClass();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            rVar.f285i.b(((Integer) r0.getValue()).intValue(), c.b.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    public static /* synthetic */ void i(final r rVar, final tc.p pVar, final int i10, Runnable runnable) {
        rVar.getClass();
        try {
            try {
                Cc.a aVar = rVar.f282f;
                final InterfaceC2922d interfaceC2922d = rVar.f279c;
                Objects.requireNonNull(interfaceC2922d);
                aVar.c(new a.InterfaceC0086a() { // from class: Ac.i
                    @Override // Cc.a.InterfaceC0086a
                    public final Object execute() {
                        return Integer.valueOf(interfaceC2922d.L());
                    }
                });
                if (!rVar.k()) {
                    rVar.f282f.c(new a.InterfaceC0086a() { // from class: Ac.j
                        @Override // Cc.a.InterfaceC0086a
                        public final Object execute() {
                            return r.f(this.f258a, pVar, i10);
                        }
                    });
                } else {
                    rVar.l(pVar, i10);
                }
                runnable.run();
            } catch (SynchronizationException unused) {
                rVar.f280d.b(pVar, i10 + 1);
                runnable.run();
            }
        } catch (Throwable th2) {
            runnable.run();
            throw th2;
        }
    }
}
