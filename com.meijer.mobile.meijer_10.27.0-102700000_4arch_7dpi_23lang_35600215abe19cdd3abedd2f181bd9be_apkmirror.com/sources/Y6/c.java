package Y6;

import Y6.l;
import java.util.Queue;

/* loaded from: classes4.dex */
abstract class c<T extends l> {

    /* renamed from: a, reason: collision with root package name */
    private final Queue<T> f40137a = p7.l.f(20);

    abstract T a();

    T b() {
        T tPoll = this.f40137a.poll();
        return tPoll == null ? (T) a() : tPoll;
    }

    public void c(T t10) {
        if (this.f40137a.size() < 20) {
            this.f40137a.offer(t10);
        }
    }

    c() {
    }
}
