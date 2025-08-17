package com.adobe.marketing.mobile.assurance.internal;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.adobe.marketing.mobile.assurance.internal.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C6439v {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, ConcurrentLinkedQueue<r>> f62300a;

    /* renamed from: b, reason: collision with root package name */
    private final C6442y f62301b;

    C6439v(C6442y c6442y) {
        this(c6442y, new ConcurrentHashMap());
    }

    C6439v(C6442y c6442y, ConcurrentHashMap<String, ConcurrentLinkedQueue<r>> concurrentHashMap) {
        this.f62301b = c6442y;
        this.f62300a = concurrentHashMap;
    }

    void a(r rVar) {
        if (rVar == null) {
            return;
        }
        String strC = rVar.c();
        ConcurrentLinkedQueue<r> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        ConcurrentLinkedQueue<r> concurrentLinkedQueuePutIfAbsent = this.f62300a.putIfAbsent(strC, concurrentLinkedQueue);
        if (concurrentLinkedQueuePutIfAbsent == null) {
            concurrentLinkedQueue.add(rVar);
        } else {
            concurrentLinkedQueuePutIfAbsent.add(rVar);
        }
        rVar.g(this.f62301b);
    }

    void b(C6430l c6430l) {
        ConcurrentLinkedQueue<r> concurrentLinkedQueue = this.f62300a.get(c6430l.f());
        if (concurrentLinkedQueue == null) {
            Q5.t.a("Assurance", "AssurancePluginManager", String.format("There are no plugins registered to handle incoming Assurance event with vendor : %s", c6430l.f()), new Object[0]);
            return;
        }
        Iterator<r> it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            r next = it.next();
            String strD = next.d();
            if (strD != null && !strD.isEmpty() && !strD.equals("none") && (strD.equals("wildcard") || strD.equals(c6430l.b()))) {
                next.e(c6430l);
            }
        }
    }

    void c() {
        Iterator<ConcurrentLinkedQueue<r>> it = this.f62300a.values().iterator();
        while (it.hasNext()) {
            Iterator<r> it2 = it.next().iterator();
            while (it2.hasNext()) {
                it2.next().a();
            }
        }
    }

    void d(int i10) {
        Iterator<ConcurrentLinkedQueue<r>> it = this.f62300a.values().iterator();
        while (it.hasNext()) {
            Iterator<r> it2 = it.next().iterator();
            while (it2.hasNext()) {
                it2.next().f(i10);
            }
        }
    }

    void e() {
        Iterator<ConcurrentLinkedQueue<r>> it = this.f62300a.values().iterator();
        while (it.hasNext()) {
            Iterator<r> it2 = it.next().iterator();
            while (it2.hasNext()) {
                it2.next().b();
            }
        }
    }
}
