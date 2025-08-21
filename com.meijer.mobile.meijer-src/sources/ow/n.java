package ow;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes14.dex */
public class n implements mw.a {

    /* renamed from: a, reason: collision with root package name */
    volatile boolean f155927a = false;

    /* renamed from: b, reason: collision with root package name */
    final Map<String, m> f155928b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    final LinkedBlockingQueue<nw.d> f155929c = new LinkedBlockingQueue<>();

    @Override // mw.a
    public synchronized mw.c a(String str) {
        m mVar;
        mVar = this.f155928b.get(str);
        if (mVar == null) {
            mVar = new m(str, this.f155929c, this.f155927a);
            this.f155928b.put(str, mVar);
        }
        return mVar;
    }

    public void e() {
        this.f155927a = true;
    }

    public void b() {
        this.f155928b.clear();
        this.f155929c.clear();
    }

    public LinkedBlockingQueue<nw.d> c() {
        return this.f155929c;
    }

    public List<m> d() {
        return new ArrayList(this.f155928b.values());
    }
}
