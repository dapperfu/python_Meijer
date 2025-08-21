package b7;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import r7.k;

/* loaded from: classes4.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, a> f60065a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final b f60066b = new b();

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Queue<a> f60069a = new ArrayDeque();

        a a() {
            a aVarPoll;
            synchronized (this.f60069a) {
                aVarPoll = this.f60069a.poll();
            }
            return aVarPoll == null ? new a() : aVarPoll;
        }

        void b(a aVar) {
            synchronized (this.f60069a) {
                try {
                    if (this.f60069a.size() < 10) {
                        this.f60069a.offer(aVar);
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
                aVarA = this.f60065a.get(str);
                if (aVarA == null) {
                    aVarA = this.f60066b.a();
                    this.f60065a.put(str, aVarA);
                }
                aVarA.f60068b++;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        aVarA.f60067a.lock();
    }

    void b(String str) {
        a aVar;
        synchronized (this) {
            try {
                aVar = (a) k.d(this.f60065a.get(str));
                int i10 = aVar.f60068b;
                if (i10 < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f60068b);
                }
                int i11 = i10 - 1;
                aVar.f60068b = i11;
                if (i11 == 0) {
                    a aVarRemove = this.f60065a.remove(str);
                    if (!aVarRemove.equals(aVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVarRemove + ", safeKey: " + str);
                    }
                    this.f60066b.b(aVarRemove);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        aVar.f60067a.unlock();
    }

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        final Lock f60067a = new ReentrantLock();

        /* renamed from: b, reason: collision with root package name */
        int f60068b;

        a() {
        }
    }

    c() {
    }
}
