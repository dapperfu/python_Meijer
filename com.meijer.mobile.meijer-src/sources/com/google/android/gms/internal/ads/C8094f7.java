package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.google.android.gms.internal.ads.f7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8094f7 implements U6 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f74889a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final J6 f74890b;

    /* renamed from: c, reason: collision with root package name */
    private final BlockingQueue f74891c;

    /* renamed from: d, reason: collision with root package name */
    private final O6 f74892d;

    @Override // com.google.android.gms.internal.ads.U6
    public final synchronized void a(V6 v62) {
        try {
            Map map = this.f74889a;
            String strT = v62.t();
            List list = (List) map.remove(strT);
            if (list == null || list.isEmpty()) {
                return;
            }
            if (C7987e7.f74612b) {
                C7987e7.d("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), strT);
            }
            V6 v63 = (V6) list.remove(0);
            this.f74889a.put(strT, list);
            v63.I(this);
            try {
                this.f74891c.put(v63);
            } catch (InterruptedException e10) {
                C7987e7.b("Couldn't add request to queue. %s", e10.toString());
                Thread.currentThread().interrupt();
                this.f74890b.b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    final synchronized boolean c(V6 v62) {
        try {
            Map map = this.f74889a;
            String strT = v62.t();
            if (!map.containsKey(strT)) {
                this.f74889a.put(strT, null);
                v62.I(this);
                if (C7987e7.f74612b) {
                    C7987e7.a("new request, sending to network %s", strT);
                }
                return false;
            }
            List arrayList = (List) this.f74889a.get(strT);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            v62.z("waiting-for-response");
            arrayList.add(v62);
            this.f74889a.put(strT, arrayList);
            if (C7987e7.f74612b) {
                C7987e7.a("Request for cacheKey=%s is in flight, putting on hold.", strT);
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.U6
    public final void b(V6 v62, C7668b7 c7668b7) {
        List list;
        G6 g62 = c7668b7.f73557b;
        if (g62 == null || g62.a(System.currentTimeMillis())) {
            a(v62);
            return;
        }
        String strT = v62.t();
        synchronized (this) {
            list = (List) this.f74889a.remove(strT);
        }
        if (list != null) {
            if (C7987e7.f74612b) {
                C7987e7.d("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), strT);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f74892d.b((V6) it.next(), c7668b7, null);
            }
        }
    }

    C8094f7(J6 j62, BlockingQueue blockingQueue, O6 o62) {
        this.f74892d = o62;
        this.f74890b = j62;
        this.f74891c = blockingQueue;
    }
}
