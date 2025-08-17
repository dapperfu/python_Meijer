package Z6;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p7.k;

/* loaded from: classes4.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, a> f42398a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final b f42399b = new b();

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Queue<a> f42402a = new ArrayDeque();

        a a() {
            a aVarPoll;
            synchronized (this.f42402a) {
                aVarPoll = this.f42402a.poll();
            }
            return aVarPoll == null ? new a() : aVarPoll;
        }

        void b(a aVar) {
            synchronized (this.f42402a) {
                try {
                    if (this.f42402a.size() < 10) {
                        this.f42402a.offer(aVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        b() {
        }
    }

    void a(String str) {
        a aVarA;
        synchronized (this) {
            try {
                aVarA = this.f42398a.get(str);
                if (aVarA == null) {
                    aVarA = this.f42399b.a();
                    this.f42398a.put(str, aVarA);
                }
                aVarA.f42401b++;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        aVarA.f42400a.lock();
    }

    void b(String str) {
        a aVar;
        synchronized (this) {
            try {
                aVar = (a) k.d(this.f42398a.get(str));
                int i10 = aVar.f42401b;
                if (i10 < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f42401b);
                }
                int i11 = i10 - 1;
                aVar.f42401b = i11;
                if (i11 == 0) {
                    a aVarRemove = this.f42398a.remove(str);
                    if (!aVarRemove.equals(aVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVarRemove + ", safeKey: " + str);
                    }
                    this.f42399b.b(aVarRemove);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        aVar.f42400a.unlock();
    }

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        final Lock f42400a = new ReentrantLock();

        /* renamed from: b, reason: collision with root package name */
        int f42401b;

        a() {
        }
    }

    c() {
    }
}
