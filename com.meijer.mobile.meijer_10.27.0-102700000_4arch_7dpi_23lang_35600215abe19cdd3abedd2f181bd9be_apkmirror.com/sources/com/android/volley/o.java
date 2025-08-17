package com.android.volley;

import com.android.volley.a;
import com.android.volley.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes4.dex */
class o implements i.b {

    /* renamed from: b, reason: collision with root package name */
    private final l f62952b;

    /* renamed from: d, reason: collision with root package name */
    private final b f62954d;

    /* renamed from: e, reason: collision with root package name */
    private final BlockingQueue<i<?>> f62955e;

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, List<i<?>>> f62951a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final j f62953c = null;

    @Override // com.android.volley.i.b
    public synchronized void b(i<?> iVar) {
        BlockingQueue<i<?>> blockingQueue;
        try {
            String cacheKey = iVar.getCacheKey();
            List<i<?>> listRemove = this.f62951a.remove(cacheKey);
            if (listRemove != null && !listRemove.isEmpty()) {
                if (n.f62943b) {
                    n.e("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(listRemove.size()), cacheKey);
                }
                i<?> iVarRemove = listRemove.remove(0);
                this.f62951a.put(cacheKey, listRemove);
                iVarRemove.setNetworkRequestCompleteListener(this);
                j jVar = this.f62953c;
                if (jVar != null) {
                    jVar.f(iVarRemove);
                } else if (this.f62954d != null && (blockingQueue = this.f62955e) != null) {
                    try {
                        blockingQueue.put(iVarRemove);
                    } catch (InterruptedException e10) {
                        n.c("Couldn't add request to queue. %s", e10.toString());
                        Thread.currentThread().interrupt();
                        this.f62954d.e();
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    synchronized boolean c(i<?> iVar) {
        try {
            String cacheKey = iVar.getCacheKey();
            if (!this.f62951a.containsKey(cacheKey)) {
                this.f62951a.put(cacheKey, null);
                iVar.setNetworkRequestCompleteListener(this);
                if (n.f62943b) {
                    n.b("new request, sending to network %s", cacheKey);
                }
                return false;
            }
            List<i<?>> arrayList = this.f62951a.get(cacheKey);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            iVar.addMarker("waiting-for-response");
            arrayList.add(iVar);
            this.f62951a.put(cacheKey, arrayList);
            if (n.f62943b) {
                n.b("Request for cacheKey=%s is in flight, putting on hold.", cacheKey);
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.android.volley.i.b
    public void a(i<?> iVar, k<?> kVar) {
        List<i<?>> listRemove;
        a.C1240a c1240a = kVar.f62939b;
        if (c1240a == null || c1240a.a()) {
            b(iVar);
            return;
        }
        String cacheKey = iVar.getCacheKey();
        synchronized (this) {
            listRemove = this.f62951a.remove(cacheKey);
        }
        if (listRemove != null) {
            if (n.f62943b) {
                n.e("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(listRemove.size()), cacheKey);
            }
            Iterator<i<?>> it = listRemove.iterator();
            while (it.hasNext()) {
                this.f62952b.a(it.next(), kVar);
            }
        }
    }

    o(b bVar, BlockingQueue<i<?>> blockingQueue, l lVar) {
        this.f62952b = lVar;
        this.f62954d = bVar;
        this.f62955e = blockingQueue;
    }
}
