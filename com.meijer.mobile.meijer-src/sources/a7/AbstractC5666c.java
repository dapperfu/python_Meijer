package a7;

import a7.l;
import java.util.Queue;

/* renamed from: a7.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract class AbstractC5666c<T extends l> {

    /* renamed from: a, reason: collision with root package name */
    private final Queue<T> f45269a = r7.l.f(20);

    abstract T a();

    T b() {
        T tPoll = this.f45269a.poll();
        return tPoll == null ? (T) a() : tPoll;
    }

    public void c(T t10) {
        if (this.f45269a.size() < 20) {
            this.f45269a.offer(t10);
        }
    }

    AbstractC5666c() {
    }
}
