package com.google.android.gms.internal.ads;

import Mc.InterfaceC4105c0;
import android.content.Context;
import android.net.ConnectivityManager;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;

/* renamed from: com.google.android.gms.internal.ads.la0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8650la0 {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentMap f75858a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f75859b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    private final C10147za0 f75860c;

    /* renamed from: d, reason: collision with root package name */
    private final C8010fa0 f75861d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f75862e;

    /* renamed from: f, reason: collision with root package name */
    private volatile ConnectivityManager f75863f;

    /* renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f75864g;

    /* renamed from: h, reason: collision with root package name */
    private AtomicInteger f75865h;

    private final synchronized AbstractC10040ya0 n(String str, Ec.b bVar) {
        return (AbstractC10040ya0) this.f75858a.get(d(str, bVar));
    }

    private final synchronized List o(List list) {
        ArrayList arrayList;
        try {
            HashSet hashSet = new HashSet();
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Mc.J1 j12 = (Mc.J1) it.next();
                String strD = d(j12.f19145a, Ec.b.a(j12.f19146b));
                hashSet.add(strD);
                AbstractC10040ya0 abstractC10040ya0 = (AbstractC10040ya0) this.f75858a.get(strD);
                if (abstractC10040ya0 != null) {
                    if (abstractC10040ya0.f80247e.equals(j12)) {
                        abstractC10040ya0.w(j12.f19148d);
                    } else {
                        this.f75859b.put(strD, abstractC10040ya0);
                        this.f75858a.remove(strD);
                    }
                } else if (this.f75859b.containsKey(strD)) {
                    AbstractC10040ya0 abstractC10040ya02 = (AbstractC10040ya0) this.f75859b.get(strD);
                    if (abstractC10040ya02.f80247e.equals(j12)) {
                        abstractC10040ya02.w(j12.f19148d);
                        abstractC10040ya02.t();
                        this.f75858a.put(strD, abstractC10040ya02);
                        this.f75859b.remove(strD);
                    }
                } else {
                    arrayList.add(j12);
                }
            }
            Iterator it2 = this.f75858a.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet.contains((String) entry.getKey())) {
                    this.f75859b.put((String) entry.getKey(), (AbstractC10040ya0) entry.getValue());
                    it2.remove();
                }
            }
            Iterator it3 = this.f75859b.entrySet().iterator();
            while (it3.hasNext()) {
                AbstractC10040ya0 abstractC10040ya03 = (AbstractC10040ya0) ((Map.Entry) it3.next()).getValue();
                abstractC10040ya03.v();
                if (!abstractC10040ya03.x()) {
                    it3.remove();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    private final synchronized Optional p(final Class cls, String str, final Ec.b bVar) {
        this.f75861d.d(bVar, this.f75864g.a());
        AbstractC10040ya0 abstractC10040ya0N = n(str, bVar);
        if (abstractC10040ya0N == null) {
            return Optional.empty();
        }
        try {
            final Optional optionalJ = abstractC10040ya0N.j();
            Optional optionalOfNullable = Optional.ofNullable(abstractC10040ya0N.i());
            Objects.requireNonNull(cls);
            Optional map = optionalOfNullable.map(new Function() { // from class: com.google.android.gms.internal.ads.ha0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return cls.cast(obj);
                }
            });
            map.ifPresent(new Consumer() { // from class: com.google.android.gms.internal.ads.ia0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.f74980a.g(bVar, optionalJ, obj);
                }
            });
            return map;
        } catch (ClassCastException e10) {
            Lc.v.s().x(e10, "PreloadAdManager.pollAd");
            Pc.p0.l("Unable to cast ad to the requested type:".concat(cls.getName()), e10);
            return Optional.empty();
        }
    }

    private final synchronized void q(String str, AbstractC10040ya0 abstractC10040ya0) {
        abstractC10040ya0.g();
        this.f75858a.put(str, abstractC10040ya0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void r(boolean z10) {
        try {
            if (z10) {
                Iterator it = this.f75858a.values().iterator();
                while (it.hasNext()) {
                    ((AbstractC10040ya0) it.next()).t();
                }
            } else {
                Iterator it2 = this.f75858a.values().iterator();
                while (it2.hasNext()) {
                    ((AbstractC10040ya0) it2.next()).f80248f.set(false);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void s(boolean z10) {
        if (((Boolean) Mc.A.c().a(C8659lf.f76515t)).booleanValue()) {
            r(z10);
        }
    }

    private final synchronized boolean t(String str, Ec.b bVar) {
        boolean z10;
        try {
            long jA = this.f75864g.a();
            AbstractC10040ya0 abstractC10040ya0N = n(str, bVar);
            z10 = false;
            if (abstractC10040ya0N != null && abstractC10040ya0N.x()) {
                z10 = true;
            }
            this.f75861d.a(bVar, jA, z10 ? Optional.of(Long.valueOf(this.f75864g.a())) : Optional.empty(), abstractC10040ya0N == null ? Optional.empty() : abstractC10040ya0N.j());
        } catch (Throwable th2) {
            throw th2;
        }
        return z10;
    }

    public final synchronized InterfaceC9401sc a(String str) {
        return (InterfaceC9401sc) p(InterfaceC9401sc.class, str, Ec.b.APP_OPEN_AD).orElse(null);
    }

    public final synchronized Mc.V b(String str) {
        return (Mc.V) p(Mc.V.class, str, Ec.b.INTERSTITIAL).orElse(null);
    }

    public final synchronized InterfaceC7719cp c(String str) {
        return (InterfaceC7719cp) p(InterfaceC7719cp.class, str, Ec.b.REWARDED).orElse(null);
    }

    public final synchronized void j(List list, InterfaceC4105c0 interfaceC4105c0) {
        try {
            List<Mc.J1> listO = o(list);
            EnumMap enumMap = new EnumMap(Ec.b.class);
            for (Mc.J1 j12 : listO) {
                String str = j12.f19145a;
                Ec.b bVarA = Ec.b.a(j12.f19146b);
                AbstractC10040ya0 abstractC10040ya0A = this.f75860c.a(j12, interfaceC4105c0);
                if (bVarA != null && abstractC10040ya0A != null) {
                    AtomicInteger atomicInteger = this.f75865h;
                    if (atomicInteger != null) {
                        abstractC10040ya0A.s(atomicInteger.get());
                    }
                    abstractC10040ya0A.u(this.f75861d);
                    q(d(str, bVarA), abstractC10040ya0A);
                    enumMap.put((EnumMap) bVarA, (Ec.b) Integer.valueOf(((Integer) enumMap.getOrDefault(bVarA, 0)).intValue() + 1));
                }
            }
            this.f75861d.f(enumMap, this.f75864g.a());
            Lc.v.e().c(new C8436ja0(this));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean k(String str) {
        return t(str, Ec.b.APP_OPEN_AD);
    }

    public final synchronized boolean l(String str) {
        return t(str, Ec.b.INTERSTITIAL);
    }

    public final synchronized boolean m(String str) {
        return t(str, Ec.b.REWARDED);
    }

    static String d(String str, Ec.b bVar) {
        return str + "#" + (bVar == null ? "NULL" : bVar.name());
    }

    final /* synthetic */ void g(Ec.b bVar, Optional optional, Object obj) {
        this.f75861d.e(bVar, this.f75864g.a(), optional);
    }

    public final void h() {
        if (this.f75863f == null) {
            synchronized (this) {
                if (this.f75863f == null) {
                    try {
                        this.f75863f = (ConnectivityManager) this.f75862e.getSystemService("connectivity");
                    } catch (ClassCastException e10) {
                        Qc.p.h("Failed to get connectivity manager", e10);
                    }
                }
            }
        }
        if (!com.google.android.gms.common.util.n.g() || this.f75863f == null) {
            this.f75865h = new AtomicInteger(((Integer) Mc.A.c().a(C8659lf.f76585y)).intValue());
            return;
        }
        try {
            this.f75863f.registerDefaultNetworkCallback(new C8543ka0(this));
        } catch (RuntimeException e11) {
            Qc.p.h("Failed to register network callback", e11);
            this.f75865h = new AtomicInteger(((Integer) Mc.A.c().a(C8659lf.f76585y)).intValue());
        }
    }

    public final void i(InterfaceC6631Cl interfaceC6631Cl) {
        this.f75860c.b(interfaceC6631Cl);
    }

    C8650la0(C10147za0 c10147za0, C8010fa0 c8010fa0, Context context, com.google.android.gms.common.util.f fVar) {
        this.f75860c = c10147za0;
        this.f75861d = c8010fa0;
        this.f75862e = context;
        this.f75864g = fVar;
    }
}
