package yc;

import Ac.a;
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
import pc.C16279c;
import sc.AbstractC16926f;
import sc.AbstractC16927g;
import sc.InterfaceC16925e;
import sc.InterfaceC16933m;
import uc.C17239a;
import uc.c;
import vc.C17544a;
import zc.AbstractC18429k;
import zc.InterfaceC18421c;
import zc.InterfaceC18422d;

/* loaded from: classes4.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private final Context f170428a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC16925e f170429b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC18422d f170430c;

    /* renamed from: d, reason: collision with root package name */
    private final x f170431d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f170432e;

    /* renamed from: f, reason: collision with root package name */
    private final Ac.a f170433f;

    /* renamed from: g, reason: collision with root package name */
    private final Bc.a f170434g;

    /* renamed from: h, reason: collision with root package name */
    private final Bc.a f170435h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC18421c f170436i;

    public static /* synthetic */ Object b(r rVar, Iterable iterable, rc.p pVar, long j10) {
        rVar.f170430c.y1(iterable);
        rVar.f170430c.H1(pVar, rVar.f170434g.a() + j10);
        return null;
    }

    public static /* synthetic */ Object c(r rVar) {
        rVar.f170436i.a();
        return null;
    }

    public static /* synthetic */ Object e(r rVar, Iterable iterable) {
        rVar.f170430c.M(iterable);
        return null;
    }

    public static /* synthetic */ Object f(r rVar, rc.p pVar, int i10) {
        rVar.f170431d.a(pVar, i10 + 1);
        return null;
    }

    public static /* synthetic */ Object g(r rVar, rc.p pVar, long j10) {
        rVar.f170430c.H1(pVar, rVar.f170434g.a() + j10);
        return null;
    }

    public rc.i j(InterfaceC16933m interfaceC16933m) {
        Ac.a aVar = this.f170433f;
        final InterfaceC18421c interfaceC18421c = this.f170436i;
        Objects.requireNonNull(interfaceC18421c);
        return interfaceC16933m.b(rc.i.a().i(this.f170434g.a()).o(this.f170435h.a()).n("GDT_CLIENT_METRICS").h(new rc.h(C16279c.b("proto"), ((C17239a) aVar.c(new a.InterfaceC0009a() { // from class: yc.h
            @Override // Ac.a.InterfaceC0009a
            public final Object execute() {
                return interfaceC18421c.d();
            }
        })).f())).d());
    }

    boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f170428a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public AbstractC16927g l(final rc.p pVar, int i10) {
        AbstractC16927g abstractC16927gA;
        InterfaceC16933m interfaceC16933mA = this.f170429b.a(pVar.b());
        AbstractC16927g abstractC16927gE = AbstractC16927g.e(0L);
        final long j10 = 0;
        while (((Boolean) this.f170433f.c(new a.InterfaceC0009a() { // from class: yc.k
            @Override // Ac.a.InterfaceC0009a
            public final Object execute() {
                return Boolean.valueOf(this.f170412a.f170430c.p1(pVar));
            }
        })).booleanValue()) {
            final Iterable iterable = (Iterable) this.f170433f.c(new a.InterfaceC0009a() { // from class: yc.l
                @Override // Ac.a.InterfaceC0009a
                public final Object execute() {
                    return this.f170414a.f170430c.t1(pVar);
                }
            });
            if (!iterable.iterator().hasNext()) {
                return abstractC16927gE;
            }
            if (interfaceC16933mA == null) {
                C17544a.b("Uploader", "Unknown backend for %s, deleting event batch for it...", pVar);
                abstractC16927gA = AbstractC16927g.a();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbstractC18429k) it.next()).b());
                }
                if (pVar.e()) {
                    arrayList.add(j(interfaceC16933mA));
                }
                abstractC16927gA = interfaceC16933mA.a(AbstractC16926f.a().b(arrayList).c(pVar.c()).a());
            }
            abstractC16927gE = abstractC16927gA;
            if (abstractC16927gE.c() == AbstractC16927g.a.TRANSIENT_ERROR) {
                final rc.p pVar2 = pVar;
                this.f170433f.c(new a.InterfaceC0009a() { // from class: yc.m
                    @Override // Ac.a.InterfaceC0009a
                    public final Object execute() {
                        return r.b(this.f170416a, iterable, pVar2, j10);
                    }
                });
                this.f170431d.b(pVar2, i10 + 1, true);
                return abstractC16927gE;
            }
            rc.p pVar3 = pVar;
            this.f170433f.c(new a.InterfaceC0009a() { // from class: yc.n
                @Override // Ac.a.InterfaceC0009a
                public final Object execute() {
                    return r.e(this.f170420a, iterable);
                }
            });
            if (abstractC16927gE.c() == AbstractC16927g.a.OK) {
                long jMax = Math.max(j10, abstractC16927gE.b());
                if (pVar3.e()) {
                    this.f170433f.c(new a.InterfaceC0009a() { // from class: yc.o
                        @Override // Ac.a.InterfaceC0009a
                        public final Object execute() {
                            return r.c(this.f170422a);
                        }
                    });
                }
                j10 = jMax;
            } else if (abstractC16927gE.c() == AbstractC16927g.a.INVALID_PAYLOAD) {
                final HashMap map = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String strN = ((AbstractC18429k) it2.next()).b().n();
                    if (map.containsKey(strN)) {
                        map.put(strN, Integer.valueOf(((Integer) map.get(strN)).intValue() + 1));
                    } else {
                        map.put(strN, 1);
                    }
                }
                this.f170433f.c(new a.InterfaceC0009a() { // from class: yc.p
                    @Override // Ac.a.InterfaceC0009a
                    public final Object execute() {
                        return r.h(this.f170423a, map);
                    }
                });
            }
            pVar = pVar3;
        }
        final rc.p pVar4 = pVar;
        this.f170433f.c(new a.InterfaceC0009a() { // from class: yc.q
            @Override // Ac.a.InterfaceC0009a
            public final Object execute() {
                return r.g(this.f170425a, pVar4, j10);
            }
        });
        return abstractC16927gE;
    }

    public void m(final rc.p pVar, final int i10, final Runnable runnable) {
        this.f170432e.execute(new Runnable() { // from class: yc.g
            @Override // java.lang.Runnable
            public final void run() {
                r.i(this.f170403a, pVar, i10, runnable);
            }
        });
    }

    public r(Context context, InterfaceC16925e interfaceC16925e, InterfaceC18422d interfaceC18422d, x xVar, Executor executor, Ac.a aVar, Bc.a aVar2, Bc.a aVar3, InterfaceC18421c interfaceC18421c) {
        this.f170428a = context;
        this.f170429b = interfaceC16925e;
        this.f170430c = interfaceC18422d;
        this.f170431d = xVar;
        this.f170432e = executor;
        this.f170433f = aVar;
        this.f170434g = aVar2;
        this.f170435h = aVar3;
        this.f170436i = interfaceC18421c;
    }

    public static /* synthetic */ Object h(r rVar, Map map) {
        rVar.getClass();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            rVar.f170436i.b(((Integer) r0.getValue()).intValue(), c.b.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    public static /* synthetic */ void i(final r rVar, final rc.p pVar, final int i10, Runnable runnable) {
        rVar.getClass();
        try {
            try {
                Ac.a aVar = rVar.f170433f;
                final InterfaceC18422d interfaceC18422d = rVar.f170430c;
                Objects.requireNonNull(interfaceC18422d);
                aVar.c(new a.InterfaceC0009a() { // from class: yc.i
                    @Override // Ac.a.InterfaceC0009a
                    public final Object execute() {
                        return Integer.valueOf(interfaceC18422d.L());
                    }
                });
                if (!rVar.k()) {
                    rVar.f170433f.c(new a.InterfaceC0009a() { // from class: yc.j
                        @Override // Ac.a.InterfaceC0009a
                        public final Object execute() {
                            return r.f(this.f170409a, pVar, i10);
                        }
                    });
                } else {
                    rVar.l(pVar, i10);
                }
                runnable.run();
            } catch (SynchronizationException unused) {
                rVar.f170431d.a(pVar, i10 + 1);
                runnable.run();
            }
        } catch (Throwable th2) {
            runnable.run();
            throw th2;
        }
    }
}
