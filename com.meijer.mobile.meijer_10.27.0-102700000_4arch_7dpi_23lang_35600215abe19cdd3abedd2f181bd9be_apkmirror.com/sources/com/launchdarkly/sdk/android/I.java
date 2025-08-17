package com.launchdarkly.sdk.android;

import com.launchdarkly.sdk.LDContext;
import com.launchdarkly.sdk.android.m0;
import ih.C14724c;
import ih.EnumC14723b;
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
import mh.C15622c;

/* loaded from: classes7.dex */
final class I {

    /* renamed from: a, reason: collision with root package name */
    private final m0.a f91063a;

    /* renamed from: b, reason: collision with root package name */
    private final int f91064b;

    /* renamed from: c, reason: collision with root package name */
    private final v0 f91065c;

    /* renamed from: f, reason: collision with root package name */
    private final C14724c f91068f;

    /* renamed from: h, reason: collision with root package name */
    private volatile LDContext f91070h;

    /* renamed from: j, reason: collision with root package name */
    private volatile J f91072j;

    /* renamed from: d, reason: collision with root package name */
    private final ConcurrentHashMap<String, Set<N>> f91066d = new ConcurrentHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private final CopyOnWriteArrayList<U> f91067e = new CopyOnWriteArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    private final Object f91069g = new Object();

    /* renamed from: i, reason: collision with root package name */
    private volatile EnvironmentData f91071i = new EnvironmentData();

    public static /* synthetic */ void b(I i10, List list) {
        Iterator<U> it = i10.f91067e.iterator();
        while (it.hasNext()) {
            it.next().a(list);
        }
    }

    private void g(Collection<String> collection) {
        if (collection == null || collection.isEmpty() || this.f91067e.isEmpty()) {
            return;
        }
        final ArrayList arrayList = new ArrayList(collection);
        this.f91065c.u2(new Runnable() { // from class: com.launchdarkly.sdk.android.H
            @Override // java.lang.Runnable
            public final void run() {
                I.b(this.f91061a, arrayList);
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
            if (str != null && (set = this.f91066d.get(str)) != null && !set.isEmpty()) {
                map.put(str, set);
            }
        }
        if (map.isEmpty()) {
            return;
        }
        this.f91065c.u2(new Runnable() { // from class: com.launchdarkly.sdk.android.G
            @Override // java.lang.Runnable
            public final void run() {
                I.a(map);
            }
        });
    }

    public DataModel$Flag c(String str) {
        DataModel$Flag dataModel$FlagC = this.f91071i.c(str);
        if (dataModel$FlagC == null || dataModel$FlagC.l()) {
            return null;
        }
        return dataModel$FlagC;
    }

    public EnvironmentData d(LDContext lDContext) {
        return this.f91063a.b(i0.k(lDContext));
    }

    public void e(LDContext lDContext, EnvironmentData environmentData) {
        this.f91068f.a("Initializing with new flag data for this context");
        f(lDContext, environmentData, true);
    }

    public void i(String str, N n10) {
        Set<N> setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        setNewSetFromMap.add(n10);
        Set<N> setPutIfAbsent = this.f91066d.putIfAbsent(str, setNewSetFromMap);
        if (setPutIfAbsent == null) {
            this.f91068f.a("Added listener. Total count: 1");
        } else {
            setPutIfAbsent.add(n10);
            this.f91068f.b("Added listener. Total count: [{}]", Integer.valueOf(setPutIfAbsent.size()));
        }
    }

    public void j(LDContext lDContext) {
        synchronized (this.f91069g) {
            try {
                if (lDContext.equals(this.f91070h)) {
                    return;
                }
                this.f91070h = lDContext;
                EnvironmentData environmentDataD = d(this.f91070h);
                if (environmentDataD == null) {
                    this.f91068f.a("No stored flag data is available for this context");
                } else {
                    this.f91068f.a("Using stored flag data for this context");
                    f(lDContext, environmentDataD, false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void k(String str, N n10) {
        Set<N> set = this.f91066d.get(str);
        if (set == null || !set.remove(n10)) {
            return;
        }
        this.f91068f.b("Removing listener for key: [{}]", str);
    }

    public boolean l(LDContext lDContext, DataModel$Flag dataModel$Flag) {
        synchronized (this.f91069g) {
            try {
                if (!lDContext.equals(this.f91070h)) {
                    return false;
                }
                DataModel$Flag dataModel$FlagC = this.f91071i.c(dataModel$Flag.e());
                if (dataModel$FlagC != null && dataModel$FlagC.j() >= dataModel$Flag.j()) {
                    return false;
                }
                EnvironmentData environmentDataG = this.f91071i.g(dataModel$Flag);
                this.f91071i = environmentDataG;
                String strK = i0.k(lDContext);
                this.f91063a.g(strK, i0.i(lDContext), environmentDataG);
                this.f91072j = this.f91072j.d(strK, System.currentTimeMillis());
                this.f91063a.h(this.f91072j);
                List listSingletonList = Collections.singletonList(dataModel$Flag.e());
                g(listSingletonList);
                h(listSingletonList);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    I(C15622c c15622c, m0.a aVar, int i10) {
        this.f91063a = aVar;
        this.f91072j = aVar.c();
        this.f91064b = i10;
        this.f91065c = C11557s.p(c15622c).u();
        this.f91068f = c15622c.a();
        j(c15622c.f());
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
        synchronized (this.f91069g) {
            try {
                if (!lDContext.equals(this.f91070h)) {
                    return;
                }
                EnvironmentData environmentData2 = this.f91071i;
                this.f91071i = environmentData;
                if (z10) {
                    ArrayList<String> arrayList = new ArrayList();
                    J jB = this.f91072j.d(strK, System.currentTimeMillis()).b(this.f91064b, arrayList);
                    this.f91072j = jB;
                    for (String str : arrayList) {
                        this.f91063a.e(str);
                        this.f91068f.b("Removed flag data for context {} from persistent store", str);
                    }
                    this.f91063a.g(strK, strI, environmentData);
                    this.f91063a.h(jB);
                    if (this.f91068f.l(EnumC14723b.DEBUG)) {
                        this.f91068f.b("Stored context index is now: {}", jB.c());
                    }
                    this.f91068f.b("Updated flag data for context {} in persistent store", strK);
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
