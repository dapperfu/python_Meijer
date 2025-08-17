package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.google.android.gms.internal.ads.f7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7969f7 implements U6 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f74049a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final J6 f74050b;

    /* renamed from: c, reason: collision with root package name */
    private final BlockingQueue f74051c;

    /* renamed from: d, reason: collision with root package name */
    private final O6 f74052d;

    @Override // com.google.android.gms.internal.ads.U6
    public final synchronized void a(V6 v62) {
        try {
            Map map = this.f74049a;
            String strT = v62.t();
            List list = (List) map.remove(strT);
            if (list == null || list.isEmpty()) {
                return;
            }
            if (C7862e7.f73772b) {
                C7862e7.d("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), strT);
            }
            V6 v63 = (V6) list.remove(0);
            this.f74049a.put(strT, list);
            v63.I(this);
            try {
                this.f74051c.put(v63);
            } catch (InterruptedException e10) {
                C7862e7.b("Couldn't add request to queue. %s", e10.toString());
                Thread.currentThread().interrupt();
                this.f74050b.b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    final synchronized boolean c(V6 v62) {
        try {
            Map map = this.f74049a;
            String strT = v62.t();
            if (!map.containsKey(strT)) {
                this.f74049a.put(strT, null);
                v62.I(this);
                if (C7862e7.f73772b) {
                    C7862e7.a("new request, sending to network %s", strT);
                }
                return false;
            }
            List arrayList = (List) this.f74049a.get(strT);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            v62.z("waiting-for-response");
            arrayList.add(v62);
            this.f74049a.put(strT, arrayList);
            if (C7862e7.f73772b) {
                C7862e7.a("Request for cacheKey=%s is in flight, putting on hold.", strT);
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.U6
    public final void b(V6 v62, C7543b7 c7543b7) {
        List list;
        G6 g62 = c7543b7.f72717b;
        if (g62 == null || g62.a(System.currentTimeMillis())) {
            a(v62);
            return;
        }
        String strT = v62.t();
        synchronized (this) {
            list = (List) this.f74049a.remove(strT);
        }
        if (list != null) {
            if (C7862e7.f73772b) {
                C7862e7.d("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), strT);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f74052d.b((V6) it.next(), c7543b7, null);
            }
        }
    }

    C7969f7(J6 j62, BlockingQueue blockingQueue, O6 o62) {
        this.f74052d = o62;
        this.f74050b = j62;
        this.f74051c = blockingQueue;
    }
}
