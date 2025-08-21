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
    private final l f63791b;

    /* renamed from: d, reason: collision with root package name */
    private final b f63793d;

    /* renamed from: e, reason: collision with root package name */
    private final BlockingQueue<i<?>> f63794e;

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, List<i<?>>> f63790a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final j f63792c = null;

    @Override // com.android.volley.i.b
    public synchronized void b(i<?> iVar) {
        BlockingQueue<i<?>> blockingQueue;
        try {
            String cacheKey = iVar.getCacheKey();
            List<i<?>> listRemove = this.f63790a.remove(cacheKey);
            if (listRemove != null && !listRemove.isEmpty()) {
                if (n.f63782b) {
                    n.e("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(listRemove.size()), cacheKey);
                }
                i<?> iVarRemove = listRemove.remove(0);
                this.f63790a.put(cacheKey, listRemove);
                iVarRemove.setNetworkRequestCompleteListener(this);
                j jVar = this.f63792c;
                if (jVar != null) {
                    jVar.f(iVarRemove);
                } else if (this.f63793d != null && (blockingQueue = this.f63794e) != null) {
                    try {
                        blockingQueue.put(iVarRemove);
                    } catch (InterruptedException e10) {
                        n.c("Couldn't add request to queue. %s", e10.toString());
                        Thread.currentThread().interrupt();
                        this.f63793d.e();
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
            if (!this.f63790a.containsKey(cacheKey)) {
                this.f63790a.put(cacheKey, null);
                iVar.setNetworkRequestCompleteListener(this);
                if (n.f63782b) {
                    n.b("new request, sending to network %s", cacheKey);
                }
                return false;
            }
            List<i<?>> arrayList = this.f63790a.get(cacheKey);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            iVar.addMarker("waiting-for-response");
            arrayList.add(iVar);
            this.f63790a.put(cacheKey, arrayList);
            if (n.f63782b) {
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
        a.C1250a c1250a = kVar.f63778b;
        if (c1250a == null || c1250a.a()) {
            b(iVar);
            return;
        }
        String cacheKey = iVar.getCacheKey();
        synchronized (this) {
            listRemove = this.f63790a.remove(cacheKey);
        }
        if (listRemove != null) {
            if (n.f63782b) {
                n.e("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(listRemove.size()), cacheKey);
            }
            Iterator<i<?>> it = listRemove.iterator();
            while (it.hasNext()) {
                this.f63791b.a(it.next(), kVar);
            }
        }
    }

    o(b bVar, BlockingQueue<i<?>> blockingQueue, l lVar) {
        this.f63791b = lVar;
        this.f63793d = bVar;
        this.f63794e = blockingQueue;
    }
}
