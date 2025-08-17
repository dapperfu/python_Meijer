package sw;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes13.dex */
public class n implements qw.a {

    /* renamed from: a, reason: collision with root package name */
    volatile boolean f161343a = false;

    /* renamed from: b, reason: collision with root package name */
    final Map<String, m> f161344b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    final LinkedBlockingQueue<rw.d> f161345c = new LinkedBlockingQueue<>();

    @Override // qw.a
    public synchronized qw.c a(String str) {
        m mVar;
        mVar = this.f161344b.get(str);
        if (mVar == null) {
            mVar = new m(str, this.f161345c, this.f161343a);
            this.f161344b.put(str, mVar);
        }
        return mVar;
    }

    public void e() {
        this.f161343a = true;
    }

    public void b() {
        this.f161344b.clear();
        this.f161345c.clear();
    }

    public LinkedBlockingQueue<rw.d> c() {
        return this.f161345c;
    }

    public List<m> d() {
        return new ArrayList(this.f161344b.values());
    }
}
