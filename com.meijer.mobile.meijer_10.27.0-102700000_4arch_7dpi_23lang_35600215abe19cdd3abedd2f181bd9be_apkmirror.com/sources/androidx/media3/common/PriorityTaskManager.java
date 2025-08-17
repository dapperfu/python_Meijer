package androidx.media3.common;

import d3.P;
import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public final class PriorityTaskManager {

    /* renamed from: a, reason: collision with root package name */
    private final Object f55337a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final PriorityQueue<Integer> f55338b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* renamed from: c, reason: collision with root package name */
    private int f55339c = Integer.MIN_VALUE;

    public static class PriorityTooLowException extends IOException {
    }

    public void a(int i10) {
        synchronized (this.f55337a) {
            this.f55338b.add(Integer.valueOf(i10));
            this.f55339c = Math.max(this.f55339c, i10);
        }
    }

    public void b(int i10) {
        synchronized (this.f55337a) {
            this.f55338b.remove(Integer.valueOf(i10));
            this.f55339c = this.f55338b.isEmpty() ? Integer.MIN_VALUE : ((Integer) P.h(this.f55338b.peek())).intValue();
            this.f55337a.notifyAll();
        }
    }
}
