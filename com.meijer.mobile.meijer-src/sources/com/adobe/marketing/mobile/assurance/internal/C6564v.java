package com.adobe.marketing.mobile.assurance.internal;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.adobe.marketing.mobile.assurance.internal.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C6564v {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, ConcurrentLinkedQueue<r>> f63139a;

    /* renamed from: b, reason: collision with root package name */
    private final C6567y f63140b;

    C6564v(C6567y c6567y) {
        this(c6567y, new ConcurrentHashMap());
    }

    C6564v(C6567y c6567y, ConcurrentHashMap<String, ConcurrentLinkedQueue<r>> concurrentHashMap) {
        this.f63140b = c6567y;
        this.f63139a = concurrentHashMap;
    }

    void a(r rVar) {
        if (rVar == null) {
            return;
        }
        String strC = rVar.c();
        ConcurrentLinkedQueue<r> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        ConcurrentLinkedQueue<r> concurrentLinkedQueuePutIfAbsent = this.f63139a.putIfAbsent(strC, concurrentLinkedQueue);
        if (concurrentLinkedQueuePutIfAbsent == null) {
            concurrentLinkedQueue.add(rVar);
        } else {
            concurrentLinkedQueuePutIfAbsent.add(rVar);
        }
        rVar.g(this.f63140b);
    }

    void b(C6555l c6555l) {
        ConcurrentLinkedQueue<r> concurrentLinkedQueue = this.f63139a.get(c6555l.f());
        if (concurrentLinkedQueue == null) {
            R5.t.a("Assurance", "AssurancePluginManager", String.format("There are no plugins registered to handle incoming Assurance event with vendor : %s", c6555l.f()), new Object[0]);
            return;
        }
        Iterator<r> it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            r next = it.next();
            String strD = next.d();
            if (strD != null && !strD.isEmpty() && !strD.equals("none") && (strD.equals("wildcard") || strD.equals(c6555l.b()))) {
                next.e(c6555l);
            }
        }
    }

    void c() {
        Iterator<ConcurrentLinkedQueue<r>> it = this.f63139a.values().iterator();
        while (it.hasNext()) {
            Iterator<r> it2 = it.next().iterator();
            while (it2.hasNext()) {
                it2.next().a();
            }
        }
    }

    void d(int i10) {
        Iterator<ConcurrentLinkedQueue<r>> it = this.f63139a.values().iterator();
        while (it.hasNext()) {
            Iterator<r> it2 = it.next().iterator();
            while (it2.hasNext()) {
                it2.next().f(i10);
            }
        }
    }

    void e() {
        Iterator<ConcurrentLinkedQueue<r>> it = this.f63139a.values().iterator();
        while (it.hasNext()) {
            Iterator<r> it2 = it.next().iterator();
            while (it2.hasNext()) {
                it2.next().b();
            }
        }
    }
}
