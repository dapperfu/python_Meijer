package com.launchdarkly.sdk.android;

import com.launchdarkly.sdk.LDContext;
import com.launchdarkly.sdk.android.m0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import jh.C15034c;
import jh.EnumC15033b;
import nh.C15945c;

/* loaded from: classes8.dex */
final class I {

    /* renamed from: a, reason: collision with root package name */
    private final m0.a f91902a;

    /* renamed from: b, reason: collision with root package name */
    private final int f91903b;

    /* renamed from: c, reason: collision with root package name */
    private final v0 f91904c;

    /* renamed from: f, reason: collision with root package name */
    private final C15034c f91907f;

    /* renamed from: h, reason: collision with root package name */
    private volatile LDContext f91909h;

    /* renamed from: j, reason: collision with root package name */
    private volatile J f91911j;

    /* renamed from: d, reason: collision with root package name */
    private final ConcurrentHashMap<String, Set<N>> f91905d = new ConcurrentHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private final CopyOnWriteArrayList<U> f91906e = new CopyOnWriteArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    private final Object f91908g = new Object();

    /* renamed from: i, reason: collision with root package name */
    private volatile EnvironmentData f91910i = new EnvironmentData();

    public static /* synthetic */ void b(I i10, List list) {
        Iterator<U> it = i10.f91906e.iterator();
        while (it.hasNext()) {
            it.next().a(list);
        }
    }

    private void g(Collection<String> collection) {
        if (collection == null || collection.isEmpty() || this.f91906e.isEmpty()) {
            return;
        }
        final ArrayList arrayList = new ArrayList(collection);
        this.f91904c.s2(new Runnable() { // from class: com.launchdarkly.sdk.android.H
            @Override // java.lang.Runnable
            public final void run() {
                I.b(this.f91900a, arrayList);
            }
        });
    }

    private void h(Collection<String> collection) {
        Set<N> set;
        if (collection == null || collection.isEmpty()) {
            return;
        }
        final HashMap map = new HashMap();
        for (String str : collection) {
            if (str != null && (set = this.f91905d.get(str)) != null && !set.isEmpty()) {
                map.put(str, set);
            }
        }
        if (map.isEmpty()) {
            return;
        }
        this.f91904c.s2(new Runnable() { // from class: com.launchdarkly.sdk.android.G
            @Override // java.lang.Runnable
            public final void run() {
                I.a(map);
            }
        });
    }

    public DataModel$Flag c(String str) {
        DataModel$Flag dataModel$FlagC = this.f91910i.c(str);
        if (dataModel$FlagC == null || dataModel$FlagC.l()) {
            return null;
        }
        return dataModel$FlagC;
    }

    public EnvironmentData d(LDContext lDContext) {
        return this.f91902a.b(i0.k(lDContext));
    }

    public void e(LDContext lDContext, EnvironmentData environmentData) {
        this.f91907f.a("Initializing with new flag data for this context");
        f(lDContext, environmentData, true);
    }

    public void i(String str, N n10) {
        Set<N> setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        setNewSetFromMap.add(n10);
        Set<N> setPutIfAbsent = this.f91905d.putIfAbsent(str, setNewSetFromMap);
        if (setPutIfAbsent == null) {
            this.f91907f.a("Added listener. Total count: 1");
        } else {
            setPutIfAbsent.add(n10);
            this.f91907f.b("Added listener. Total count: [{}]", Integer.valueOf(setPutIfAbsent.size()));
        }
    }

    public void j(LDContext lDContext) {
        synchronized (this.f91908g) {
            try {
                if (lDContext.equals(this.f91909h)) {
                    return;
                }
                this.f91909h = lDContext;
                EnvironmentData environmentDataD = d(this.f91909h);
                if (environmentDataD == null) {
                    this.f91907f.a("No stored flag data is available for this context");
                } else {
                    this.f91907f.a("Using stored flag data for this context");
                    f(lDContext, environmentDataD, false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void k(String str, N n10) {
        Set<N> set = this.f91905d.get(str);
        if (set == null || !set.remove(n10)) {
            return;
        }
        this.f91907f.b("Removing listener for key: [{}]", str);
    }

    public boolean l(LDContext lDContext, DataModel$Flag dataModel$Flag) {
        synchronized (this.f91908g) {
            try {
                if (!lDContext.equals(this.f91909h)) {
                    return false;
                }
                DataModel$Flag dataModel$FlagC = this.f91910i.c(dataModel$Flag.e());
                if (dataModel$FlagC != null && dataModel$FlagC.j() >= dataModel$Flag.j()) {
                    return false;
                }
                EnvironmentData environmentDataG = this.f91910i.g(dataModel$Flag);
                this.f91910i = environmentDataG;
                String strK = i0.k(lDContext);
                this.f91902a.g(strK, i0.i(lDContext), environmentDataG);
                this.f91911j = this.f91911j.d(strK, System.currentTimeMillis());
                this.f91902a.h(this.f91911j);
                List listSingletonList = Collections.singletonList(dataModel$Flag.e());
                g(listSingletonList);
                h(listSingletonList);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    I(C15945c c15945c, m0.a aVar, int i10) {
        this.f91902a = aVar;
        this.f91911j = aVar.c();
        this.f91903b = i10;
        this.f91904c = C11682s.p(c15945c).u();
        this.f91907f = c15945c.a();
        j(c15945c.f());
    }

    public static /* synthetic */ void a(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            Iterator it = ((Set) entry.getValue()).iterator();
            while (it.hasNext()) {
                ((N) it.next()).a((String) entry.getKey());
            }
        }
    }

    private void f(LDContext lDContext, EnvironmentData environmentData, boolean z10) {
        String strK = i0.k(lDContext);
        String strI = i0.i(lDContext);
        synchronized (this.f91908g) {
            try {
                if (!lDContext.equals(this.f91909h)) {
                    return;
                }
                EnvironmentData environmentData2 = this.f91910i;
                this.f91910i = environmentData;
                if (z10) {
                    ArrayList<String> arrayList = new ArrayList();
                    J jB = this.f91911j.d(strK, System.currentTimeMillis()).b(this.f91903b, arrayList);
                    this.f91911j = jB;
                    for (String str : arrayList) {
                        this.f91902a.e(str);
                        this.f91907f.b("Removed flag data for context {} from persistent store", str);
                    }
                    this.f91902a.g(strK, strI, environmentData);
                    this.f91902a.h(jB);
                    if (this.f91907f.l(EnumC15033b.DEBUG)) {
                        this.f91907f.b("Stored context index is now: {}", jB.c());
                    }
                    this.f91907f.b("Updated flag data for context {} in persistent store", strK);
                }
                HashSet hashSet = new HashSet();
                for (DataModel$Flag dataModel$Flag : environmentData.f()) {
                    DataModel$Flag dataModel$FlagC = environmentData2.c(dataModel$Flag.e());
                    if (dataModel$FlagC == null || !dataModel$FlagC.h().equals(dataModel$Flag.h())) {
                        hashSet.add(dataModel$Flag.e());
                    }
                }
                for (DataModel$Flag dataModel$Flag2 : environmentData2.f()) {
                    if (environmentData.c(dataModel$Flag2.e()) == null) {
                        hashSet.add(dataModel$Flag2.e());
                    }
                }
                g(hashSet);
                h(hashSet);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
