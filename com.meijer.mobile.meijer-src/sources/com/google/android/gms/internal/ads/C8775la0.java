package com.google.android.gms.internal.ads;

import Oc.InterfaceC4383c0;
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
public final class C8775la0 {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentMap f76698a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f76699b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    private final C10272za0 f76700c;

    /* renamed from: d, reason: collision with root package name */
    private final C8135fa0 f76701d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f76702e;

    /* renamed from: f, reason: collision with root package name */
    private volatile ConnectivityManager f76703f;

    /* renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f76704g;

    /* renamed from: h, reason: collision with root package name */
    private AtomicInteger f76705h;

    private final synchronized AbstractC10165ya0 n(String str, Gc.b bVar) {
        return (AbstractC10165ya0) this.f76698a.get(d(str, bVar));
    }

    private final synchronized List o(List list) {
        ArrayList arrayList;
        try {
            HashSet hashSet = new HashSet();
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Oc.J1 j12 = (Oc.J1) it.next();
                String strD = d(j12.f23332a, Gc.b.a(j12.f23333b));
                hashSet.add(strD);
                AbstractC10165ya0 abstractC10165ya0 = (AbstractC10165ya0) this.f76698a.get(strD);
                if (abstractC10165ya0 != null) {
                    if (abstractC10165ya0.f81087e.equals(j12)) {
                        abstractC10165ya0.w(j12.f23335d);
                    } else {
                        this.f76699b.put(strD, abstractC10165ya0);
                        this.f76698a.remove(strD);
                    }
                } else if (this.f76699b.containsKey(strD)) {
                    AbstractC10165ya0 abstractC10165ya02 = (AbstractC10165ya0) this.f76699b.get(strD);
                    if (abstractC10165ya02.f81087e.equals(j12)) {
                        abstractC10165ya02.w(j12.f23335d);
                        abstractC10165ya02.t();
                        this.f76698a.put(strD, abstractC10165ya02);
                        this.f76699b.remove(strD);
                    }
                } else {
                    arrayList.add(j12);
                }
            }
            Iterator it2 = this.f76698a.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet.contains((String) entry.getKey())) {
                    this.f76699b.put((String) entry.getKey(), (AbstractC10165ya0) entry.getValue());
                    it2.remove();
                }
            }
            Iterator it3 = this.f76699b.entrySet().iterator();
            while (it3.hasNext()) {
                AbstractC10165ya0 abstractC10165ya03 = (AbstractC10165ya0) ((Map.Entry) it3.next()).getValue();
                abstractC10165ya03.v();
                if (!abstractC10165ya03.x()) {
                    it3.remove();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    private final synchronized Optional p(final Class cls, String str, final Gc.b bVar) {
        this.f76701d.d(bVar, this.f76704g.a());
        AbstractC10165ya0 abstractC10165ya0N = n(str, bVar);
        if (abstractC10165ya0N == null) {
            return Optional.empty();
        }
        try {
            final Optional optionalJ = abstractC10165ya0N.j();
            Optional optionalOfNullable = Optional.ofNullable(abstractC10165ya0N.i());
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
                    this.f75820a.g(bVar, optionalJ, obj);
                }
            });
            return map;
        } catch (ClassCastException e10) {
            Nc.v.s().x(e10, "PreloadAdManager.pollAd");
            Rc.p0.l("Unable to cast ad to the requested type:".concat(cls.getName()), e10);
            return Optional.empty();
        }
    }

    private final synchronized void q(String str, AbstractC10165ya0 abstractC10165ya0) {
        abstractC10165ya0.g();
        this.f76698a.put(str, abstractC10165ya0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void r(boolean z10) {
        try {
            if (z10) {
                Iterator it = this.f76698a.values().iterator();
                while (it.hasNext()) {
                    ((AbstractC10165ya0) it.next()).t();
                }
            } else {
                Iterator it2 = this.f76698a.values().iterator();
                while (it2.hasNext()) {
                    ((AbstractC10165ya0) it2.next()).f81088f.set(false);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void s(boolean z10) {
        if (((Boolean) Oc.A.c().a(C8784lf.f77355t)).booleanValue()) {
            r(z10);
        }
    }

    private final synchronized boolean t(String str, Gc.b bVar) {
        boolean z10;
        try {
            long jA = this.f76704g.a();
            AbstractC10165ya0 abstractC10165ya0N = n(str, bVar);
            z10 = false;
            if (abstractC10165ya0N != null && abstractC10165ya0N.x()) {
                z10 = true;
            }
            this.f76701d.a(bVar, jA, z10 ? Optional.of(Long.valueOf(this.f76704g.a())) : Optional.empty(), abstractC10165ya0N == null ? Optional.empty() : abstractC10165ya0N.j());
        } catch (Throwable th2) {
            throw th2;
        }
        return z10;
    }

    public final synchronized InterfaceC9526sc a(String str) {
        return (InterfaceC9526sc) p(InterfaceC9526sc.class, str, Gc.b.APP_OPEN_AD).orElse(null);
    }

    public final synchronized Oc.V b(String str) {
        return (Oc.V) p(Oc.V.class, str, Gc.b.INTERSTITIAL).orElse(null);
    }

    public final synchronized InterfaceC7844cp c(String str) {
        return (InterfaceC7844cp) p(InterfaceC7844cp.class, str, Gc.b.REWARDED).orElse(null);
    }

    public final synchronized void j(List list, InterfaceC4383c0 interfaceC4383c0) {
        try {
            List<Oc.J1> listO = o(list);
            EnumMap enumMap = new EnumMap(Gc.b.class);
            for (Oc.J1 j12 : listO) {
                String str = j12.f23332a;
                Gc.b bVarA = Gc.b.a(j12.f23333b);
                AbstractC10165ya0 abstractC10165ya0A = this.f76700c.a(j12, interfaceC4383c0);
                if (bVarA != null && abstractC10165ya0A != null) {
                    AtomicInteger atomicInteger = this.f76705h;
                    if (atomicInteger != null) {
                        abstractC10165ya0A.s(atomicInteger.get());
                    }
                    abstractC10165ya0A.u(this.f76701d);
                    q(d(str, bVarA), abstractC10165ya0A);
                    enumMap.put((EnumMap) bVarA, (Gc.b) Integer.valueOf(((Integer) enumMap.getOrDefault(bVarA, 0)).intValue() + 1));
                }
            }
            this.f76701d.f(enumMap, this.f76704g.a());
            Nc.v.e().c(new C8561ja0(this));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean k(String str) {
        return t(str, Gc.b.APP_OPEN_AD);
    }

    public final synchronized boolean l(String str) {
        return t(str, Gc.b.INTERSTITIAL);
    }

    public final synchronized boolean m(String str) {
        return t(str, Gc.b.REWARDED);
    }

    static String d(String str, Gc.b bVar) {
        return str + "#" + (bVar == null ? "NULL" : bVar.name());
    }

    final /* synthetic */ void g(Gc.b bVar, Optional optional, Object obj) {
        this.f76701d.e(bVar, this.f76704g.a(), optional);
    }

    public final void h() {
        if (this.f76703f == null) {
            synchronized (this) {
                if (this.f76703f == null) {
                    try {
                        this.f76703f = (ConnectivityManager) this.f76702e.getSystemService("connectivity");
                    } catch (ClassCastException e10) {
                        Sc.p.h("Failed to get connectivity manager", e10);
                    }
                }
            }
        }
        if (!com.google.android.gms.common.util.n.g() || this.f76703f == null) {
            this.f76705h = new AtomicInteger(((Integer) Oc.A.c().a(C8784lf.f77425y)).intValue());
            return;
        }
        try {
            this.f76703f.registerDefaultNetworkCallback(new C8668ka0(this));
        } catch (RuntimeException e11) {
            Sc.p.h("Failed to register network callback", e11);
            this.f76705h = new AtomicInteger(((Integer) Oc.A.c().a(C8784lf.f77425y)).intValue());
        }
    }

    public final void i(InterfaceC6756Cl interfaceC6756Cl) {
        this.f76700c.b(interfaceC6756Cl);
    }

    C8775la0(C10272za0 c10272za0, C8135fa0 c8135fa0, Context context, com.google.android.gms.common.util.f fVar) {
        this.f76700c = c10272za0;
        this.f76701d = c8135fa0;
        this.f76702e = context;
        this.f76704g = fVar;
    }
}
